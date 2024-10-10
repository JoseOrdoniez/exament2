package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import DaoImp.ProveedorImp;
import model.TblProveedorcl2;

public class TestProveedor {

	public static void main(String[] args) throws ParseException {
		
		TblProveedorcl2 tbprov = new  TblProveedorcl2();
		ProveedorImp	iprov = new ProveedorImp();
		
		SimpleDateFormat fechaing = new SimpleDateFormat("dd/MM/yyyy");
		
		//----------------REGISTRAR-----------------//
		
			/*
			tbprov.setNomproveecl2("juan carlos");
			tbprov.setRucproveecl2("1545412");
			tbprov.setRsocialproveecl2("joselito");
			tbprov.setEmailproveecl2("jose@gmail.com");
			tbprov.setFeingproveecl2(fechaing.parse("10/10/2009"));
				
			iprov.RegistrarUsuario(tbprov);
				
			System.out.println("Usuario Registrado Correctamente en la Base de Datos");
			*/
		
		
		//----------------ACTULIZAR-----------------//
		/*
		tbprov.setIdprooveedorcl2(1);
		tbprov.setNomproveecl2("jose fulgencio");
		tbprov.setRucproveecl2("1545412");
		tbprov.setRsocialproveecl2("joselito");
		tbprov.setEmailproveecl2("jose@gmail.com");
		tbprov.setFeingproveecl2(fechaing.parse("10/10/2009"));
			
		iprov.ActualizarUsuario(tbprov);
			
		System.out.println("Usuario Actualizado Correctamente en la Base de Datos");
		*/
		
		
		//----------------ELIMINAR-----------------//
		/*
		tbprov.setIdprooveedorcl2(2);
		iprov.EliminarUsuario(tbprov);
		
		System.out.println("Proveedro eliminado correctamente en la base de datos");
		*/
		
		//----------------LISTAR-----------------//
		/*
		List<TblProveedorcl2> listado = iprov.listarProveedor();
		for(TblProveedorcl2 lis:listado) {
				System.out.println("Id Proveedor: "+lis.getIdprooveedorcl2()+"\n"+
				"Nombre: "+lis.getNomproveecl2()+"\n"+
				"RUC : "+lis.getRucproveecl2()+"\n"+
				"Razon social : "+lis.getRsocialproveecl2()+"\n"+
				"Email: "+lis.getEmailproveecl2()+"\n"+
				"Fecha Ingreso: "+ lis.getFeingproveecl2());
				}
		*/
		
		//----------------BUSCAR-----------------//
		
		/*
		tbprov.setIdprooveedorcl2(1);
		TblProveedorcl2 busprv = iprov.buscarProveedor(tbprov);
		
		System.out.println("Id Proveedor: "+busprv.getIdprooveedorcl2()+"\n"+
				"Nombre: "+busprv.getNomproveecl2()+"\n"+
				"RUC : "+busprv.getRucproveecl2()+"\n"+
				"Razon social : "+busprv.getRsocialproveecl2()+"\n"+
				"Email: "+busprv.getEmailproveecl2()+"\n"+
				"Fecha Ingreso: "+ busprv.getFeingproveecl2());
		
		*/
		
	}

}
