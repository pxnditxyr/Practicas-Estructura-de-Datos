public class Vehiculo {

	String placa, marca;
	int modelo;

	public Vehiculo() {
		placa  = null;
		marca  = null;
		modelo = 0;
	}
	public void leer() {
		System.out.print("Placa  = ");
		placa = Leer.dato();
		System.out.print("Marca  = ");
		marca = Leer.dato();
		System.out.print("Modelo = ");
		modelo = Leer.datoInt();
	}
	public void mostrar() {
		System.out.println("-------------------------");
		System.out.println("Placa  = " + placa );
		System.out.println("Marca  = " + marca );
		System.out.println("Modelo = " + modelo);
		System.out.println("-------------------------");
	}
}
