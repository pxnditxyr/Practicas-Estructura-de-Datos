import java.util.Scanner;
public class Becario extends Estudiante{
	protected String tipoBeca;
	public Becario() {
		super();
		tipoBeca=null;
	}

	public Becario(String vci, String vnom, String vco, String vcar, String vtb) {
		super(vci,vnom,vco,vcar);
		tipoBeca=vtb;
	}
	public void leer() {
		super.leer();
		Scanner x = new Scanner(System.in);
		System.out.println("Tipo de Beca = ");
		tipoBeca=x.nextLine();
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Tipode Beca = "+tipoBeca);
	}
}
