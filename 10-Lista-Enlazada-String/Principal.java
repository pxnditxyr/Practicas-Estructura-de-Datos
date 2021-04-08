public class Principal {

	public static void main (String[] args) {
		Operaciones op = new Operaciones();
		Pila pila = new Pila () ;
		pila = op.insertarN(pila);
		op.mostrar(pila);
		//op.mayor( pil);
		System.out.println("Se eliminara la base de la pila");
		op.eliminaBase(pila);
		op.mostrar(pila);
		System.out.println("Introduzca el dato a buscar");
		String dato = Leer.dato();
		op.buscaDato(pila, dato);
	}
}
