public class Principal {

	public static void main (String[] args) {

		Cola cola = new Cola();
		Operaciones operaciones = new Operaciones();
		cola = operaciones.insertarN(cola);
		cola = operaciones.mostrar(cola);
		cola = operaciones.cantidadPositivos(cola);
		System.out.println("Eliminando nodos negativos");
		cola = operaciones.eliminaNegativos(cola);
		cola = operaciones.mostrar( cola );
		cola = operaciones.insertarAlFrente(cola);
		cola = operaciones.mostrar( cola );
	}
}
