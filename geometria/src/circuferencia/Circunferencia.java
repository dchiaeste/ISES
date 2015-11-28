package circuferencia;

public class Circunferencia {

	  public double radio;

	  public double calcularArea() {
	  return Math.PI * Math.pow(obtenerRadio(), 2);
	  }
	  
	  public double calcularPerimetro() {
	  return 2 * Math.PI * obtenerRadio();
	  }

	  public double obtenerRadio() {
	  return radio;
	  }

	  public void cambiarRadio(double radio) {
		  this.radio = radio;	  
	  }

	}