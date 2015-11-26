package modelo;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ProductoDao {
	
	public void registrarProducto(Producto producto){
		Conexion conex= new Conexion("root","","jdbc:mysql://localhost/encapas");
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO productos VALUES("+producto.getCodigo()+",'"+producto.getNombre()+"',"+producto.getPrecio()+")");
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		    JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}

}
