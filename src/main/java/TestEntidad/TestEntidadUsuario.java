package TestEntidad;

import dao.ClassUsuarioImp;
import model.TblUsuariocl3;

public class TestEntidadUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TblUsuariocl3 usuario = new TblUsuariocl3();
		ClassUsuarioImp crud = new ClassUsuarioImp();
		
		usuario.setUsuariocl3("maria");
		usuario.setPasswordcl3("arevalo");
		crud.RegistrarUsuario(usuario);
	}

}
