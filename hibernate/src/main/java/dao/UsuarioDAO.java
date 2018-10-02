package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.IUsuario;
import util.HibernateUtil;
import vo.Usuario;

public class UsuarioDAO implements IUsuario {

	@Override
	public Usuario buscaLogin(Usuario login) {

		return null;
	}

	@Override
	public void createUser(Usuario login) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();

		session.saveOrUpdate(login);

		session.flush();

		transaction.commit();

	}

	@Override
	public boolean createLogin(Usuario login) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();

		session.saveOrUpdate(login);

		session.flush();

		transaction.commit();
		
		return false;
	}

}
