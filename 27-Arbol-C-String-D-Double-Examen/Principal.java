public class Principal {

	public static void main(String[] args) {
		Operaciones op = new Operaciones();
		Arbol arbol = new Arbol();
		String clave;
		arbol = op.insertarN( arbol );

        System.out.println("\nSe mostrara promedio negativos");
        op.obtenerPromedioNegativo( arbol.raiz );

		System.out.println("\nPOS-ORDEN(Todos)\n");
		op.posorden( arbol.raiz );
		
	}
}
