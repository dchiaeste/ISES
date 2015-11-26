package inventario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class Conexion {

	public static Connection getConexion(){
		
		Connection conexion = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String servidor = "jdbc:mysql://localhost/encapas";
			String usuarioDB="root";
	        String passwordDB="";
	        conexion= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
		}catch(ClassCastException ex){
			JOptionPane.showMessageDialog(null, ex, "Error en el driver "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
		}catch(SQLException ex){
			JOptionPane.showMessageDialog(null, ex, "Error en la conexion a la bd "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
		}catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexion a la bd "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
		
			return conexion;
		
			
	}

}
