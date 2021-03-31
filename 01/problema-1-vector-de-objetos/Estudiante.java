public class Estudiante {

	long ci;
	String nombre;
	int edad;

	public Estudiante() {
		ci = 0;
		edad = 0;
		nombre = null;
	}

	public void leer() {
		System.out.println("Introduzca su C.I.: ");
		ci = Leer.datoLong();
		System.out.println("Introduzca su Nombre: ");
		nombre = Leer.dato();
		System.out.println("Introduzca su Edad: ");
		edad = Leer.datoInt();
	}
	
	public void mostrar() {
		System.out.println("Su C.I. es: " + ci);
		System.out.println("Su nombre es: " + nombre);
		System.out.println("Su edad es: " + edad);
	}
}
