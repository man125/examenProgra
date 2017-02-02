
package ac.cr.una.backend.service;


import ac.cr.una.backend.model.Booktype;
import java.util.List;


public interface BookTypeService {

    public Booktype findByName(String name);
    public Booktype save(Booktype autor);
    public boolean deleteAll();
}
