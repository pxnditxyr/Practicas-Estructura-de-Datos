public class Racional {

	int n, d;

	public Racional () {
		n = 0;
		d = 1;
	}

	public Racional (int n, int d) {
		this.n = n;
		this.d = d;
	}
	public void leer () {
		System.out.println("Ingrese el Numerador");
		n = Leer.datoInt();
		d = 0;
		System.out.println("Ingrese el Denominador");
		while (d == 0) {
			System.out.println("Recuerda que debe de ser diferente de cero");
			d = Leer.datoInt();
		}
	}
	public void mostrar () {
		System.out.println("\nCampos");
		System.out.println("El numerador es: " + n);
		System.out.println("El denominador es: " + d);
		System.out.println("");
	}
	public void mostrar (Racional r) {
		System.out.println("\nNumero Racional");
		System.out.println("El racional es: " + r.n + "/" + r.d);
		System.out.println("");
	}

	public Racional sumar (Racional r1, Racional r2) {
		int denominador = r1.d * r2.d;
		int numerador = r1.n * r2.d;
		int numerador2 = r2.n * r1.d;
		int num = numerador + numerador2;
		Racional r3 = new Racional(num, denominador);
		cambio(r3);
		System.out.println("La suma de los racionales es: " + r3.n + "/" + r3.d);
		return r3;
	}

	public Racional restar (Racional r1, Racional r2) {
		int denominador = r1.d * r2.d;
		int numerador = r1.n * r2.d;
		int numerador2 = r2.n * r1.d;
		int num = numerador - numerador2;
		Racional r3 = new Racional(num, denominador);
		cambio(r3);
		System.out.println("La resta de los racionales es: " + r3.n + "/" + r3.d);
		return r3;
	}

	public Racional multiplicar (Racional r1, Racional r2) {
		int denominador = r1.d * r2.d;
		int num = r1.n * r2.n;
		Racional r3 = new Racional(num, denominador);
		System.out.println("La multiplicacion de los racionales es: " + r3.n + "/" + r3.d);
		cambio(r3);
		return r3;
	}

	public Racional dividir (Racional r1, Racional r2) {
		int denominador = r1.d * r2.n;
		int num = r1.n * r2.d;
		Racional r3 = new Racional(num, denominador);
		cambio(r3);
		System.out.println("La division de los racionales es: " + r3.n + "/" + r3.d);
		return r3;
	}
	public void cambio (Racional rx) {
		if (rx.n < 0 && rx.d < 0) {
			rx.n = Math.abs(n);
			rx.d = Math.abs(d);
		}
	}
}
