import java.util.Scanner;

public class Estudiante extends Persona{

	protected String codigo, carrera;

	public Estudiante() {
		super();
		codigo=null; carrera=null;
	}

	public Estudiante(String vci, String vnom, String vco, String vcar) {
		super(vci, vnom);
		codigo=vco; carrera= vcar;
	}

	public void leer() {
		Scanner x = new Scanner(System.in);
		super.leer();
		System.out.println("Código = ");
		codigo=x.nextLine();
		System.out.println("carrera = ");
		carrera=x.nextLine();
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("Código="+codigo+" carrera = " +carrera);
	}
}
