package rectangulo;

public class Rectangulo {

	  public double largo;

	  public double ancho;

	  public Rectangulo(double largo, double ancho) {
		  this.largo = largo;
		  this.ancho = ancho;
	  }

	  public double obtenerArea() {
	  return largo * ancho;
	  }
	  
	  public double obtenerPerimetro() {
	  return (largo * 2)+(ancho * 2);
	  }

	}
