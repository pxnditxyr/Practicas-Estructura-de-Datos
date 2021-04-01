public class Principal {

	public static void main(String[] args) {
		Operaciones op = new Operaciones();
		Lista lista = new Lista();
		op.insertarN(lista);
		op.mostrar(lista);
		System.out.println("Eliminando ultimo nodo");
		op.eliminarUltimoNodo(lista);
		op.mostrar(lista);
		System.out.println("Introduzca el dato del nodo a buscar: ");
		String x = Leer.dato();
		System.out.println("Introduzca el dato del nodo a introducir: ");
		String dato = Leer.dato();
		op.insertarPos(lista, x, dato);
		op.mostrar(lista);
	}
}
