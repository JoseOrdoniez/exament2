package Interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuario {
	void RegistrarUsuario(TblUsuariocl2 tbusu);
	void ActualizarUsuario(TblUsuariocl2 tbusu);
	void EliminarUsuario(TblUsuariocl2 tbusu);
	List<TblUsuariocl2>ListarUsuario();
	TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tbusu);

}
