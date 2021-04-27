public class Principal {

	public static void main (String[] args) {
		Cola cola = new Cola();
		String placa;
		Operaciones op = new Operaciones();
		cola = op.insertarN( cola );
		cola = op.mostrar( cola );
		System.out.println("Insertar placa para insertar despues de esta un nuevo Vehiculo");
		placa = Leer.dato();
		cola = op.insertarPlacaDada( cola, placa );
		cola = op.mostrar( cola );
		op.contarMayoresAlPromedio( cola );
		cola = op.mostrar( cola );
	}
}
