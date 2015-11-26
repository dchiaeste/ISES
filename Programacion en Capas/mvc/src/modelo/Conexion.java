package modelo;

import java.sql.*;


/**
 * Clase que permite conectar con la base de datos
 * @author chenao
 *
 */
public class Conexion {
	
   public String login;
   public String password;
   public String url;

   Connection conn = null;

   /** Constructor de DbConnection */
   public Conexion(String login , String password , String url) {
      this.login = login;
      this.password = password;
      this.url = url;
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
	   try{
	         //obtenemos el driver de para mysql
	         Class.forName("com.mysql.jdbc.Driver");
	         //obtenemos la conexión
	         conn = DriverManager.getConnection(url,login,password);

	         if (conn!=null){
	            System.out.println("Conección a base de datos OK");
	         }
	      }
	      catch(SQLException e){
	         System.out.println(e);
	      }catch(ClassNotFoundException e){
	         System.out.println(e);
	      }catch(Exception e){
	         System.out.println(e);
	      } 
      return conn;
   }

   public void desconectar(){
      conn = null;
   }

}