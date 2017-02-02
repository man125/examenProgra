package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.AuthorContact;
import ac.cr.una.backend.model.Book;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class BookDAOImpl implements BookDao {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    
    @Override
    public Book save(Book b) {
        session.beginTransaction();
        session.save(b);
        session.getTransaction().commit();

        return b;
    }

    @Override
    public List<Book> findAll() {
        List<Book> aList = new ArrayList<>();

        aList = session.createCriteria(Book.class).list();

        return aList;
    }

    @Override
    public boolean deleteAll() {
           boolean isDeleted = false;
        List<Book> book = new ArrayList<>();
        book=session.createCriteria(Book.class).list();
        session.beginTransaction();
        //autor = (AuthorContact) session.get(AuthorContact.class);//dao
        session.delete(book);
        isDeleted = true;
        session.getTransaction().commit();

        return isDeleted;
    }
    
}

