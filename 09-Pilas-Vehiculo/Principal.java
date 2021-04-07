
public class Principal {

	public static void main (String[] args) {
		Operaciones op = new Operaciones();
		Pila pila = new Pila();
		String marca, placa;
		op.insertarN(pila);
		op.mostrar(pila);
		//op.contarMarca(pila);
		System.out.println("Se contaran los vehiculos mas antiguos");
		op.cantidadVehiculosAntuguos(pila);
		op.mostrar(pila);
		System.out.println("Se eliminara una marca dada con modelo < a 1990");
		System.out.println("Inserte la marca");
		marca = Leer.dato();
		op.eliminarMarca(pila, marca);
		op.mostrar(pila);
		System.out.println("Se Insertara nuevo vehiculo despues de la placa dada");
		System.out.println("Inserte la placa");
		placa = Leer.dato();
		op.insertarNuevo(pila, placa);
		op.mostrar(pila);
	}
}
