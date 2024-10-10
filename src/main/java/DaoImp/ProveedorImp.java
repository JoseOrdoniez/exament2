package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;


public class ProveedorImp implements IProveedor{

	public void RegistrarUsuario(TblProveedorcl2 prov) {
		//Nos conectamos con la unidad de persistencia
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ordoniezHuarahuaraJoseAntonio");
				//Para administrar las transacciones
				EntityManager em = emf.createEntityManager();
				
				try {
					em.getTransaction().begin();
					em.persist(prov);
					em.getTransaction().commit();
					
				} catch (RuntimeException e) {
					e.getMessage();
				} finally {
					em.close();
				}
		
	}

	public void ActualizarUsuario(TblProveedorcl2 prov) {
		//Nos conectamos con la unidad de persistencia
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ordoniezHuarahuaraJoseAntonio");
				//Para administrar las transacciones
				EntityManager em = emf.createEntityManager();	
				
				try {
					em.getTransaction().begin();
					em.merge(prov);
					em.getTransaction().commit();
				} catch (RuntimeException e) {
					e.getMessage();
				} finally {
					em.close();
				}
		
	}

	public void EliminarUsuario(TblProveedorcl2 prov) {
		//Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ordoniezHuarahuaraJoseAntonio");
		//Para administrar las transacciones
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			TblProveedorcl2 tbproveli = em.find(TblProveedorcl2.class, prov.getIdprooveedorcl2());
			if(tbproveli != null) {
				em.remove(tbproveli);
				em.getTransaction().commit();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			em.close();
		}
		
	}

	public List<TblProveedorcl2> listarProveedor() {
		//Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ordoniezHuarahuaraJoseAntonio");
		//Para administrar las transacciones
		EntityManager em = emf.createEntityManager();
		List<TblProveedorcl2> lisprv=null;
		
		try {
			em.getTransaction().begin();
			lisprv = em.createQuery("select u from TblProveedorcl2 u", TblProveedorcl2.class).getResultList();
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			ex.getMessage();
		} finally {
			em.close();
		}
		
		return lisprv ;
	}

	public TblProveedorcl2 buscarProveedor(TblProveedorcl2 prov) {
		//Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_ordoniezHuarahuaraJoseAntonio");
		//Para administrar las transacciones
		EntityManager em = emf.createEntityManager();
		TblProveedorcl2 buscprv = null;
		
		try {
			em.getTransaction().begin();
			buscprv = em.find(TblProveedorcl2.class, prov.getIdprooveedorcl2());
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return buscprv;
	}

	

	

}
