
package ac.cr.una.backend.service;


import ac.cr.una.backend.dao.AuthorContactDAO;
import ac.cr.una.backend.dao.AuthorDAO;
import ac.cr.una.backend.dao.BookDao;
import ac.cr.una.backend.model.Author;
import ac.cr.una.backend.model.AuthorContact;
import ac.cr.una.backend.model.Book;
import java.util.List;

/**
 *
 * @author mguzmana
 */
public class BookServiceImpl implements BookService {

    private BookDao aDAO;
   

    public BookServiceImpl() {
    }

    public BookServiceImpl(BookDao aDAO) {
        this.aDAO = aDAO;
    }

    
   

   

    @Override
    public List<Book> findAll() {
        return aDAO.findAll();
    }

    @Override
    public Book save(Book a) {
        return aDAO.save(a);
    }

    @Override
    public boolean deleteAll() {
        return aDAO.deleteAll();
    }
    
    public float totalPriceAll(){
        List <Book> book= aDAO.findAll();
        int aux= book.size();
        float sum;
        for(int i=0;i<aux;i++){
            aux+=book.get(aux).getPrice();
        }
        return aux;
    }
    
    public BookDao getaDAO() {
        return aDAO;
    }

    public void setaDAO(BookDao aDAO) {
        this.aDAO = aDAO;
    }

   

   

   

}
