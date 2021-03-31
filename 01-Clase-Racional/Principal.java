public class Principal {

	public static void main (String[] args) {
		Racional r1 = new Racional();
		Racional r2 = new Racional();
		Racional r3 = new Racional();
		
		System.out.println("Ingrese el numero racional 1");
		r1.leer();
		r1.mostrar();
		r1.mostrar(r1);

		System.out.println("Ingrese el numero racional 2");
		r2.leer();
		r2.mostrar();
		r2.mostrar(r2);

		r3.sumar(r1, r2);
		r3.restar(r1, r2);
		r3.multiplicar(r1, r2);
		r3.dividir(r1, r2);

	}
}
