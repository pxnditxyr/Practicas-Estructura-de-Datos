public class Principal {

	public static void main(String[] args) {
		Operaciones op = new Operaciones();
		Arbol arbol = new Arbol();
		String clave;
		arbol = op.insertarN( arbol );
		System.out.println("\nPRE-ORDEN(Todos)\n");
		op.preorden( arbol.raiz );
		System.out.println("\nSIMETRICO(Todos)\n");
		op.simetrico( arbol.raiz );
		System.out.println("\nPOS-ORDEN(Todos)\n");
		op.posorden( arbol.raiz );
		System.out.println("\nBUSCAR CLAVE");
		System.out.print("\nIngrese clave a buscar: ");
		clave = Leer.dato();
		op.buscar( arbol, clave );
		System.out.println("\nSe mostrara los datos iguales al menor negativo");
		op.hacerMenNeg( arbol.raiz );
	}
}
