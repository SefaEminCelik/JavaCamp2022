import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateEducatorDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Educator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {


        Educator educator =new Educator("100","Engin","Demiroğ",30);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};


        List<Category> categories = new ArrayList<>();
        Category category1= new Category("1","Proglamlama");


        List<Course> cList = new ArrayList<Course>();

        Course course = new Course("10","Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",1000,45);
        cList.add(course);

        course= new Course("11","Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)",2000,75);
        cList.add(course);

        course = new Course("12","(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA",3000,52);
        cList.add(course);

        course = new Course("13","Yazılım Geliştirici Yetiştirme Kampı (JavaScript)",2500,37);
        cList.add(course);

        course = new Course("14","Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",5000,28);
        cList.add(course);

        course = new Course("15","Programlamaya Giriş için Temel Kurs", 7000,78);
        cList.add(course);

     /*   for(int i = 0;i< cList.size();i++)
        {
            System.out.println(cList.get(i).getName());
        }*/

        EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(), loggers);
        educatorManager.add(educator);

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers,cList);
        courseManager.add(new Course("15","Yeni Kurs", 7000,78));

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), categories, loggers);
        categoryManager.add(new Category("2", "Yeni Kategory"));


    }
}