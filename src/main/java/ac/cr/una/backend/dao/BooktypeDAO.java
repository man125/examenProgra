
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Booktype;
import java.util.List;

public interface BooktypeDAO {

    public Booktype findByName(String name);
    public Booktype save(Booktype book);
    public boolean deleteAll(); 
}
