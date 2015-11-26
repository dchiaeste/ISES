package vista;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui extends JFrame{
	

	public JLabel l_codigo , l_nombre , l_precio;
	public JTextField t_codigo , t_nombre , t_precio;
	public JButton bt_insertar;
	
	public Gui(){ 
		setLayout(new FlowLayout());
		setResizable(false);
		setSize(200, 300);
		getContentPane().setBackground(Color.decode("#009688"));
	
		
		l_codigo = new JLabel("Codigo");
		l_codigo.setForeground(Color.WHITE);
		l_nombre = new JLabel("Nombre");
		l_nombre.setForeground(Color.WHITE);
		l_precio = new JLabel("Precio");
		l_precio.setForeground(Color.WHITE);
		t_codigo = new JTextField(15);
		t_nombre = new JTextField(15);
		t_precio = new JTextField(15);
		bt_insertar = new JButton("Insertar");
		
		add(l_codigo);
		add(t_codigo);
		add(l_nombre);
		add(t_nombre);
		add(l_precio);
		add(t_precio);
		add(bt_insertar);
		
		setLocationRelativeTo(null);
		setVisible(true);
	
		
	}
	
	public void vaciarCampos(){
		t_codigo.setText("");
		t_nombre.setText("");
		t_precio.setText("");
	}


}
