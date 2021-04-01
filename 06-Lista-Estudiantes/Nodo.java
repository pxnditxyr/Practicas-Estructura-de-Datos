public class Nodo {

	Estudiante dato;
	Nodo sig;

	public Nodo () {
		dato = null;
		sig = null;
	}

	public Nodo (Estudiante vd) {
		dato = vd;
		sig = null;
	}
}
