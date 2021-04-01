import java.util.Scanner;
public class Docente extends Persona {

	protected int horas, antiguedad;

	public Docente() {
		super();
		horas=0; antiguedad=0;
	}
	public Docente(String vci, String vnom, int vh, int va) {
		super(vci,vnom);
		horas=vh; antiguedad=va;
	}
	public void leer() {
		super.leer();
		Scanner x = new Scanner(System.in);
		System.out.println("Número de horas = ");
		horas = x.nextInt();
		System.out.println("Antiguedad = ");
		antiguedad = x.nextInt();
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Número horas= "+horas+"antiguedad= "+ antiguedad);
	}
}
