
public class Principal {

	public static void main (String[] args) {
		Operaciones op = new Operaciones();
		Pila pila = new Pila();
		String carrera;
		int agno;
		op.insertarN(pila);
		op.mostrar(pila);

		System.out.println("Inserte la carrera a contar");
		carrera = Leer.dato();
		op.cantidadEstudiantesCarrera( pila, carrera );
		op.mostrar(pila);

		System.out.println("Inserte el año de ingreso");
		agno = Leer.datoInt();
		op.eliminarAgnoAnterior( pila, agno );
		op.mostrar(pila);
	}
}
