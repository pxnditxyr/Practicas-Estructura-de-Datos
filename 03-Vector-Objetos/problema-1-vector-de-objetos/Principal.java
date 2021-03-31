public class Principal {

	public static void main (String[] args) {
		Operaciones op = new Operaciones();
		System.out.println("Nro Elementos");
		int nel = Leer.datoInt();
		Estudiante[] estudiantes = new Estudiante[nel];
		op.leer(estudiantes);
		op.mostrar(estudiantes);
		op.cuentaEstudiantes(estudiantes);
		op.cuentaMayores(estudiantes);
	}
}
