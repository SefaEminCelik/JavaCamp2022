package dataAccess;

import entities.Educator;

public class HibernateEducatorDao implements  IEducatorDao{
    @Override
    public void add(Educator educator) {
        System.out.println("Eğitmen Hibernate ile veritabanına eklendi");
    }
}
