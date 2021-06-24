public class Persona {

    long ci;
    String nombre;
    int edad;

	public Persona () {
		nombre = null;
        ci = 0;
        edad = 0;
	}
	public void leer() {
		System.out.print("Nombre  = ");
		nombre = Leer.dato();
		System.out.print("Ci  = ");
		ci = Leer.datoLong();
		System.out.print("Edad = ");
		edad = Leer.datoInt();
	}
	public void mostrar() {
		System.out.println("Nombre  = " + nombre );
		System.out.println("Ci  = " + ci );
		System.out.println("Edad = " + edad);
	}
}
