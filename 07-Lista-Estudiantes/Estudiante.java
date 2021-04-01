public class Estudiante {

	long ci;
	String nombre;
	String carrera;
	int agnoIngreso;

	public Estudiante() {
		ci = 0;
		nombre = null;
		carrera = null;
		agnoIngreso = 0;
	}

	public void leer() {
		System.out.println("Introduzca su C.I.: ");
		ci = Leer.datoLong();
		System.out.println("Introduzca su Nombre: ");
		nombre = Leer.dato();
		System.out.println("Introduzca su Carrera: ");
		carrera = Leer.dato();
		System.out.println("Introduzca su Agno de Ingreso: ");
		agnoIngreso = Leer.datoInt();
	}
	
	public void mostrar() {
		System.out.println("Su C.I. es: " + ci);
		System.out.println("Su nombre es: " + nombre);
		System.out.println("Su carrera es: " + carrera);
		System.out.println("Su Agno de ingreso es: " + agnoIngreso);
	}
}
