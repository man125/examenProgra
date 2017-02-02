
package ac.cr.una.backend.dao;


import ac.cr.una.backend.model.Booktype;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

 
public class BookTypeDAOImpl implements BooktypeDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    
    @Override
    public Booktype save(Booktype book) {
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();

        return book;
    }
    
    
      @Override
    public Booktype findByName(String name) {
        Booktype autor = null;
        Query query = session.createQuery("from Booktype where tipo = :tipo ");//name
        query.setParameter("tipo", name);

        if (query.list().size() > 0) {
           autor = (Booktype) query.list().get(0);
        }

        return autor;
    }

    
    @Override
    public boolean deleteAll() {
        boolean isDeleted = false;
        List<Booktype> autor = new ArrayList<>();
        autor=session.createCriteria(Booktype.class).list();
        session.beginTransaction();
        //autor = (AuthorContact) session.get(AuthorContact.class);//dao
        session.delete(autor);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }
    
}

