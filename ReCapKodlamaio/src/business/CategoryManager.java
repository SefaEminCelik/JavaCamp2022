package business;


import core.logging.Logger;
import dataAccess.ICategoryDao;
import entities.Category;


import java.util.List;

public class CategoryManager {

    private ICategoryDao categoryDao;
    private List<Category> categories;
    private Logger[] loggers;

    public CategoryManager(ICategoryDao categoryDao, List<Category> categories, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.categories = categories;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for(Category ctgry: categories) {
            if (ctgry.getName() == category.getName()) {
                throw new Exception("Kategori ismi aynı olamaz.");
            }
        }
            categoryDao.add(category);
            for (Logger logger: loggers) {
                logger.log(category.getName() + "Kategory Eklenmiştir.");
            }
    }

}
