package Interfaces;

import java.util.List;

import model.TblProveedorcl2;

public interface IProveedor {
	void RegistrarUsuario(TblProveedorcl2 prov);
	void ActualizarUsuario(TblProveedorcl2 prov);
	void EliminarUsuario(TblProveedorcl2 prov);
	List<TblProveedorcl2>listarProveedor();
	TblProveedorcl2 buscarProveedor(TblProveedorcl2 prov);
}
