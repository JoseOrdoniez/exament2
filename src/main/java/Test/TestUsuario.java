package Test;

import java.util.List;

import DaoImp.UsuarioImp;
import model.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {
		
		TblUsuariocl2 tbu = new TblUsuariocl2();
		UsuarioImp uimp = new UsuarioImp();
		
		//----------------REGISTRAR-----------------//
		
		/*
		tbu.setUsuariocl2("pepe");
		tbu.setPasswordcl2("1245");
		
		uimp.RegistrarUsuario(tbu);
		
		System.out.println("Usuario Registrado Correctamente en la Base de Datos");
		*/
		
		
		//----------------ACTUALIZAR-----------------//
		/*
		tbu.setIdusuariocl2(1);
		tbu.setUsuariocl2("pedrinho");
		tbu.setPasswordcl2("1245");
		
		uimp.ActualizarUsuario(tbu);
		
		System.out.println("Usuario Actualizado Correctamente en la Base de Datos");
		*/
		
		//----------------ELIMINAR-----------------//
		/*
		tbu.setIdusuariocl2(2);
		uimp.EliminarUsuario(tbu);
		System.out.println("Usuario Eliminado Correctamente de la Base de Datos");
		*/
		
		//----------------Listar----------------------//
		/*
		List<TblUsuariocl2> listado = uimp.ListarUsuario();
		for(TblUsuariocl2 lis:listado) {
			System.out.println("Id Usuario: "+lis.getIdusuariocl2()+"\n"+
								"Usuario: "+lis.getUsuariocl2()+"\n"+
								"Contraseña: "+lis.getPasswordcl2());
		}
		*/
		//----------------Buscar----------------------//
		/*
		tbu.setIdusuariocl2(1);
		TblUsuariocl2 buscU = uimp.BuscarUsuario(tbu);
		System.out.println("Id Usuario: "+buscU.getIdusuariocl2()+"\n"+
							"Usuario: "+buscU.getUsuariocl2()+"\n"+
							"Contraseña: "+buscU.getPasswordcl2());
		*/
		
	}

}
