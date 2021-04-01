import java.util.Scanner;
public class Persona {

	protected String ci, nombre;

	public Persona()
	{
		ci=null; nombre=null;
	}

	public Persona(String vci, String nom) 
	{
		ci=vci; nombre=nom;
	}

	public void leer()
	{
		Scanner x = new Scanner(System.in);
		System.out.println("ci = ");
		ci = x.nextLine();
		System.out.println("nombre = ");
		nombre = x.nextLine();
	}
	public void mostrar()
	{
		System.out.println("ci = "+ci +" nombre = " +nombre);
	}
}

