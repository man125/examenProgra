package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.BooktypeDAO;
import ac.cr.una.backend.model.Booktype;
import java.util.List;

/**
 *
 * @author mguzmana
 */
public class BookTypeServiceImpl implements BookTypeService {

    private BooktypeDAO booktypeDAO;

    public BookTypeServiceImpl() {
    }

    public BookTypeServiceImpl(BooktypeDAO bDAO) {
        this.booktypeDAO = bDAO;
    }

    @Override
    public Booktype findByName(String name) {
        return booktypeDAO.findByName(name);
    }

   

    @Override
    public Booktype save(Booktype book) {
        return booktypeDAO.save(book);
    }

    @Override
    public boolean deleteAll() {
        return booktypeDAO.deleteAll();
    }

   

}
