/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.BookTypeDAOImpl;
import ac.cr.una.backend.dao.BooktypeDAO;
import ac.cr.una.backend.model.Booktype;
import ac.cr.una.backend.service.BookTypeService;
import ac.cr.una.backend.service.BookTypeServiceImpl;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;


@Path("booktypes")
public class BookTypeWebservice {

    private BooktypeDAO btDAO;
    private BookTypeService btService;

    @Context
    private UriInfo context;

    public BookTypeWebservice() {

    }

   
    @GET
    @Path("/{tipo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Booktype getbyName(@PathParam("tipo") String nombre) {
        Booktype book = null;
        btDAO = new BookTypeDAOImpl();
        btService = new BookTypeServiceImpl(btDAO);

        book = btService.findByName(nombre);

        return book;
    }

    /**
     * Create a new Student
     *
     * @param student
     * @return student
     */
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Booktype createBookType(Booktype bookt) {

        btDAO = new BookTypeDAOImpl();
        btService = new BookTypeServiceImpl(btDAO);

        bookt = btService.save(bookt);

        return bookt;
    }

    /**
     * Delete a new Student
     *
     * @param id
     * @return student
     */
    @DELETE
    @Path("/{id}")
    public boolean deleteAll() {
        boolean result;
        btDAO = new BookTypeDAOImpl();
        btService = new BookTypeServiceImpl(btDAO);

        result = btService.deleteAll();

        return result;
    }

    
}
