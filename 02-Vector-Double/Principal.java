public class Principal {

	public static void main (String[] args) {
		Operaciones op = new Operaciones();
		System.out.println("Nro Elementos");
		int nel = Leer.datoInt();
		double[] vector = new double[nel];
		op.leer(vector);
		op.mostrar(vector);
		op.promNegativos(vector);
		op.menorPositivo(vector);
	}
}
