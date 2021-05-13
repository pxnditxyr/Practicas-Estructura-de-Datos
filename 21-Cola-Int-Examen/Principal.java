public class Principal {

	public static void main (String[] args) {
		Cola cola = new Cola();
		Operaciones op = new Operaciones();
		cola = op.insertarN( cola );
		cola = op.mostrar( cola );
		System.out.println("Encuentra mayor negativo");
		cola = op.encontrarMayNeg( cola );
		cola = op.mostrar( cola );
		System.out.println("Elimina el ultimo valor de la cola");
		cola = op.eliminarUltimo( cola );
		cola = op.mostrar( cola );
	}
}
