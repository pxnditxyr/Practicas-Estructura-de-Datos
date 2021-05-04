public class Principal {

	public static void main(String[] args) {
		Operaciones op = new Operaciones();
		Arbol arbol = new Arbol();
		int clave;
		arbol = op.insertarN( arbol );
		System.out.println("\nPRE-ORDEN(Todos)\n");
		op.preorden( arbol.raiz );
		System.out.println("\nSIMETRICO(Con clave impar)\n");
		op.simetrico( arbol.raiz );
		System.out.println("\nPOS-ORDEN(Con clave par)\n");
		op.posorden( arbol.raiz );
		System.out.println("\nBUSCAR CLAVE");
		System.out.print("Ingrese clave: ");
		clave = Leer.datoInt();
		op.buscar( arbol, clave );
	}
}
