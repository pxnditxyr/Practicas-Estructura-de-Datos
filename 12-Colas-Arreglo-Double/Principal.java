public class Principal {

	public static void main (String[] args) {

		Cola cola = new Cola();
		Operaciones operaciones = new Operaciones();
		cola = operaciones.insertarN(cola);
		cola = operaciones.mostrar(cola);
		cola = operaciones.calculaPromedioPositivo(cola);
		cola = operaciones.eliminaMenoresAlPromedio(cola);
		cola = operaciones.mostrar(cola);
	}
}
