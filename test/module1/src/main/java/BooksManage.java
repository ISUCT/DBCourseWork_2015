/**
 * Created by h on 05.12.15.
 */

import java.util.Iterator;
import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class BooksManage {
    private static SessionFactory factory;

    public static void main(String[] args) {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        BooksManage BM = new BooksManage();

        Integer empID1 = BM.addBook(5, "Book5", "Author5");
        Integer empID2 = BM.addBook(6, "Book6", "Author6");
        Integer empID3 = BM.addBook(7, "Book7", "Author7");

      /* List down all the employees */
        BM.listBooks();

      /* Update employee's records */
        BM.updateBooks(empID1, 8);

      /* Delete an employee from the database */
        BM.deleteBooks(empID2);

      /* List down new list of the employees */
        BM.listBooks();

    }

    /* Method to CREATE an employee in the database */
    public Integer addBook(int id, String name, String author){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer bookID = null;
        try{
            tx = session.beginTransaction();
            Book Book  = new Book(id, name, author);
            bookID = (Integer) session.save(Book);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        return bookID;
    }

    public void listBooks( ){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            List book =  session.createQuery("FROM books").list();
            for (Iterator iterator =
                 book.iterator(); iterator.hasNext();){
                Book books = (Book) iterator.next();
                System.out.println("ID: " + books.getId());
                System.out.println("   Name: " + books.getName());
                System.out.println("  Author: " + books.getAuthor());
            }
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    /* Method to UPDATE salary for an employee */
    public void updateBooks(Integer bookID , int id ){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Book Book  =
                    (Book)session.get(Book.class, bookID);
            Book.setId(id);
            session.update(Book);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public void deleteBooks(Integer bookId){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Book Book  =
                    (Book)session.get(Book.class, bookId);
            session.delete(Book);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}