package controlador;

import modelo.ProductoDao;
import vista.Gui;

public class Main {

	public static void main(String[] args) {
		Gui g = new Gui();
		ProductoDao p = new ProductoDao();
		Eventos e = new Eventos(p, g);
	}

}
