
package ac.cr.una.backend.dao;


import ac.cr.una.backend.model.AuthorContact;
import ac.cr.una.backend.model.Book;
import java.util.List;

/**
 *fvssvsf
 * @author mguzmana
 */
public interface BookDao {

   
    public Book save(Book autor);
    public List<Book> findAll ();
    public boolean deleteAll(); 
}
