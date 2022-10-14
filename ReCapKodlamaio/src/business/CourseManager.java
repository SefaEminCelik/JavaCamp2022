package business;

import core.logging.Logger;
import dataAccess.ICourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private ICourseDao courseDao;
    private Logger[] loggers;
    private List<Course> cList;

    public CourseManager(ICourseDao courseDao, Logger[] loggers, List<Course> cList) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.cList = cList;
    }

    public void add(Course course) throws Exception {
        if(course.getPrice()<0){
            throw new Exception("Kurs fiyatı 0 dan küçük olamaz.");
        }
        for(Course kurs: cList){
            if(kurs.getName()==course.getName()){
                throw new Exception("Kurs ismi aynı olamaz.");
            }
        }

        courseDao.add(course);
        for (Logger logger: loggers){
            logger.log(course.getName() + "Kurs Eklenmiştir.");
        }
    }
}
