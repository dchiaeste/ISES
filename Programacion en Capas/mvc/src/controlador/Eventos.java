package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Producto;
import modelo.ProductoDao;
import vista.Gui;

public class Eventos implements ActionListener {
	
	public ProductoDao dao;
	public Gui gui;
	
	public Eventos(ProductoDao dao , Gui gui){
		this.dao = dao;
		this.gui = gui;
		gui.bt_insertar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String action = arg0.getActionCommand();
		if(action.equals("Insertar")){
			int cod = Integer.parseInt(gui.t_codigo.getText().toString());
			int pre = Integer.parseInt(gui.t_precio.getText().toString());
			Producto producto = new Producto();
			producto.setCodigo(cod);
			producto.setNombre(gui.t_nombre.getText().toString());
			producto.setPrecio(pre);
			dao.registrarProducto(producto);
			gui.vaciarCampos();
		}
	}

}
