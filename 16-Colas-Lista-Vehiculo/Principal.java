public class Principal {

	public static void main (String[] args) {
		Cola cola = new Cola();
		String marca;
		int modelo;
		Operaciones op = new Operaciones();
		cola = op.insertarN( cola );
		cola = op.mostrar( cola );
		System.out.println("Insertar marca para contar");
		marca = Leer.dato();
		cola = op.contarMarcaDada( cola, marca );
		System.out.println("Insertar marca para eliminar");
		marca = Leer.dato();
		System.out.println("Insertar modelo para eliminar");
		modelo = Leer.datoInt();
		cola = op.eliminarModeloMarca( cola, marca, modelo );
		cola = op.mostrar( cola );
	}
}
