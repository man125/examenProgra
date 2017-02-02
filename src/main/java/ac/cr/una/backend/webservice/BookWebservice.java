
package ac.cr.una.backend.webservice;


import ac.cr.una.backend.dao.BookDAOImpl;
import ac.cr.una.backend.dao.BookDao;
import ac.cr.una.backend.model.Book;
import ac.cr.una.backend.service.BookService;
import ac.cr.una.backend.service.BookServiceImpl;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;


@Path("books")
public class BookWebservice {

    private BookDao bookDAO;
    private BookService bService;

    @Context
    private UriInfo context;

    
    public BookWebservice() {
    }
@GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllAuthors() {
         List<Book> contactList = null;
        bookDAO = new BookDAOImpl();
        bService = new BookServiceImpl(bookDAO);

        contactList = bService.findAll();

        return contactList;
    }

 
    
    
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Book createAuthor(Book book) {

        bookDAO = new BookDAOImpl();
         bService = new BookServiceImpl( bookDAO);

       book =bService.save(book);

        return book;
    }

 
    @DELETE
   // @Path("/{id}")
    public boolean deleteAll() {
        boolean result;
        bookDAO = new BookDAOImpl();
        bService = new BookServiceImpl(bookDAO);

        result = bService.deleteAll();

        return result;
    }
    
    


}
