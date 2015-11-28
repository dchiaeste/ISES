package circuferencia;

public class Main {

	public static void main(String[] args) {
		Circunferencia c = new Circunferencia();
		c.cambiarRadio(10.5);
		System.out.println("Area: "+c.calcularArea());
		System.out.println("Perimetro: "+c.calcularPerimetro());
	}

}
