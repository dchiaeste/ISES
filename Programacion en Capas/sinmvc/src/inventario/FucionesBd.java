package inventario;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class FucionesBd {
	
	Connection conexion;
	Statement statement;
	
	public FucionesBd(){
		conexion = Conexion.getConexion();
		try {
			statement = conexion.createStatement();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "Error en la operacion de la bd"+e.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
		}
	}
	
	public void insertarDatos(int codigo , String nombre , int precio){
		try {
			statement.executeUpdate("INSERT INTO productos VALUES("+codigo+",'"+nombre+"',"+precio+")");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "Error al insertar datos "+e.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
		}
	}

}
