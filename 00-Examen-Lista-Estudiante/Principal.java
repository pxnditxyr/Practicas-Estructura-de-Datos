public class Principal {
	public static void main(String[] args ) {
		Operaciones op=new Operaciones();
		Lista lis=new Lista();
		op.insertarN(lis);
		op.mostrar(lis);
		op.mayorNeg(lis);
		System.out.print("Dato del nodo que se insertará:");
		int dt=Leer.datoInt();
		op.insertarcasiFin(lis,dt);
		op.mostrar(lis);
	}
}

