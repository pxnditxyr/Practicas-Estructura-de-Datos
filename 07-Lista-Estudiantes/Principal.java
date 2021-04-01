public class Principal {

	public static void main(String[] args) {
		Operaciones op = new Operaciones();
		Lista lista = new Lista();
		op.insertarN(lista);
		op.mostrar(lista);
		op.mostrarCi(lista);
		System.out.println("Introduzca la carrera a eliminar");
		String carrera = Leer.dato();
		op.eliminarCarrera(lista, carrera);
		op.mostrar(lista);
	}
}
