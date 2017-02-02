
package ac.cr.una.backend.dao;


import ac.cr.una.backend.model.AuthorContact;
import java.util.List;

/**
 *fvssvsf
 * @author mguzmana
 */
public interface AuthorContactDAO {

   
    public AuthorContact save(AuthorContact autor);
    public List<AuthorContact> findAll ();
    public boolean deleteAll(); 
}
