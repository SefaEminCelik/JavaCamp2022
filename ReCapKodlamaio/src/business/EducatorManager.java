package business;

import core.logging.Logger;
import dataAccess.IEducatorDao;
import entities.Educator;

import java.util.List;

public class EducatorManager {

    private IEducatorDao educatorDao;
    private Logger[] loggers;

    public EducatorManager(IEducatorDao educatorDao,Logger [] loggers) {
        this.educatorDao = educatorDao;
        this.loggers = loggers;
    }

    public void add(Educator educator) {
        educatorDao.add(educator);
        for (Logger logger: loggers){
            logger.log(educator.getFirstName()+" " + educator.getLastName());
        }
    }
}
