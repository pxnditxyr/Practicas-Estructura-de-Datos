import java.util.Scanner;

public class Principal {
	public static void main (String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("CI= ");
		String c=x.nextLine();
		System.out.println("Nombre= ");
		String n=x.nextLine();
		System.out.println("No. Horas =");
		int h=x.nextInt();
		System.out.println("Antiguedad (meses) =");
		int a=x.nextInt();
		Docente dco=new Docente(c,n,h,a);
		dco.mostrar();
		Becario be=new Becario();
		be.leer();
		be.mostrar();
	}
}
