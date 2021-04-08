public class Nodo {
	String dato;
	Nodo sig;

	public Nodo() {
		dato = null;
		sig  = null;
	}

	public Nodo (String dato) {
		sig = null;
		this.dato = dato;
	}
}
