package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.ILogin;
import util.HibernateUtil;
import vo.Login;

public class LoginDAO implements ILogin {

	@Override
	public Login buscaLogin(Login login) {

		return null;
	}

	@Override
	public void createUser(Login login) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();

		session.saveOrUpdate(login);

		session.flush();

		transaction.commit();

	}

	@Override
	public boolean createLogin(Login login) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();

		session.saveOrUpdate(login);

		session.flush();

		transaction.commit();
		
		return false;
	}

}
