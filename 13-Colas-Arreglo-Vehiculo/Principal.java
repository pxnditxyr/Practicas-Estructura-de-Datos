public class Principal {

	public static void main (String[] args) {
		int modelo;
		String marca;
		Cola cola = new Cola();
		Operaciones operaciones = new Operaciones();
		cola = operaciones.insertarN(cola);
		cola = operaciones.mostrar(cola);

		System.out.println("Ingrese el modelo a contar");
		modelo = Leer.datoInt();
		cola = operaciones.cuentaModeloDado(cola, modelo);

		System.out.println("Ingrese la marca a eliminar");
		marca = Leer.dato();
		cola = operaciones.eliminaMarcaDada(cola, marca);
		cola = operaciones.mostrar(cola);

		System.out.println("Se insertara un nuevo vehiculo al frente");
		cola = operaciones.insertaVehiculoAlfrente(cola);
		cola = operaciones.mostrar(cola);
	}
}
