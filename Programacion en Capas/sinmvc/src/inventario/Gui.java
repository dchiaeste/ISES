package inventario;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener{
	

	JLabel l_codigo , l_nombre , l_precio;
	JTextField t_codigo , t_nombre , t_precio;
	JButton bt_insertar;
	FucionesBd funciones;
	
	public Gui(){ 
		setLayout(new FlowLayout());
		setResizable(false);
		setSize(200, 300);
		getContentPane().setBackground(Color.decode("#009688"));
		
		funciones = new FucionesBd();
		
		l_codigo = new JLabel("Codigo");
		l_codigo.setForeground(Color.WHITE);
		l_nombre = new JLabel("Nombre");
		l_nombre.setForeground(Color.WHITE);
		l_precio = new JLabel("Precio");
		l_precio.setForeground(Color.WHITE);
		t_codigo = new JTextField(15);
		t_nombre = new JTextField(15);
		t_precio = new JTextField(15);
		bt_insertar = new JButton("Insertar datos");
		bt_insertar.addActionListener(this);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		switch(action){
		
		case "Insertar datos":
			int cod = Integer.parseInt(t_codigo.getText().toString());
			String nom = t_nombre.getText().toString();
			int pre = Integer.parseInt(t_precio.getText().toString());
			funciones.insertarDatos(cod, nom, pre);
			vaciarCampos();
			break;
		
		}
		
	}
	
	public void vaciarCampos(){
		t_codigo.setText("");
		t_nombre.setText("");
		t_precio.setText("");
	}

}
