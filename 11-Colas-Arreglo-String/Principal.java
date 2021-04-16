public class Principal {

	public static void main (String[] args) {

		Cola cola = new Cola();
		Operaciones op = new Operaciones();
		cola = op.insertarN(cola);
		cola = op.mostrar(cola);
	}
}
