package com.olmo.hibernate;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    

	public static void main( String[] args )
    {
    	 
    	
    	//Obtenemos el SessionFactory
    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();

    	//Abrimos la sesión mediante el SessionFactory
    	Session session =sessionFactory.openSession();
    	
    	
    	//Creamos el objeto
    	AlumnoId miId=new AlumnoId("Andrés","Fernández");
    	Alumno al=new Alumno(miId,25);

    	Transaction tx=(Transaction) session.beginTransaction();

    	session.save(al);

    	try {
			tx.commit();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
