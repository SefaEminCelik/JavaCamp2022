package dataAccess;

import entities.Educator;

public class JdbcEducatorDao implements IEducatorDao{
    @Override
    public void add(Educator educator) {
        System.out.println("Eğitmen JDBC ile veritabanına eklendi");
    }
}
