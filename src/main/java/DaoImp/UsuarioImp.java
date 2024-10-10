package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class UsuarioImp implements IUsuario{

	public void RegistrarUsuario(TblUsuariocl2 tbusu) {
		//Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ordoniezHuarahuaraJoseAntonio");
		//Para administrar las transacciones
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(tbusu);
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		} finally {
			em.close();
		}
		
		
	}

	public void ActualizarUsuario(TblUsuariocl2 tbusu) {
		//Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ordoniezHuarahuaraJoseAntonio");
		//Para administrar las transacciones
		EntityManager em = emf.createEntityManager();	
		
		try {
			em.getTransaction().begin();
			em.merge(tbusu);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
		} finally {
			em.close();
		}
		
		
		
	}

	public void EliminarUsuario(TblUsuariocl2 tbusu) {
		//Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ordoniezHuarahuaraJoseAntonio");
		//Para administrar las transacciones
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			TblUsuariocl2 tbusueli = em.find(TblUsuariocl2.class, tbusu.getIdusuariocl2());
			if(tbusueli != null) {
				em.remove(tbusueli);
				em.getTransaction().commit();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			em.close();
		}
		
	}

	public List<TblUsuariocl2> ListarUsuario() {
		//Nos conectamos con la unidad de persistencia
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ordoniezHuarahuaraJoseAntonio");
				//Para administrar las transacciones
				EntityManager em = emf.createEntityManager();
				List<TblUsuariocl2> lista=null;
				
				try {
					em.getTransaction().begin();
					lista = em.createQuery("select u from TblUsuariocl2 u", TblUsuariocl2.class).getResultList();
					em.getTransaction().commit();
				} catch (RuntimeException ex) {
					if(em.getTransaction().isActive()) em.getTransaction().rollback();
					ex.getMessage();
				} finally {
					em.close();
				}
				
				
		return lista;
	}

	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tbusu) {
		//Nos conectamos con la unidad de persistencia
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ordoniezHuarahuaraJoseAntonio");
				//Para administrar las transacciones
				EntityManager em = emf.createEntityManager();
				TblUsuariocl2 buscausu = null;
				
				try {
					em.getTransaction().begin();
					buscausu = em.find(TblUsuariocl2.class, tbusu.getIdusuariocl2());
					em.getTransaction().commit();
				} catch (RuntimeException ex) {
					if(em.getTransaction().isActive()) em.getTransaction().rollback();
				} finally {
					em.close();
				}
				
		return buscausu;
	}
	

}
