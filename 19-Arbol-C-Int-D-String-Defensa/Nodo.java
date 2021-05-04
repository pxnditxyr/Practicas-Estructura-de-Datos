public class Nodo {

	Nodo hizq, hder;
	int clave;
	String dato;

	public Nodo() {
		hizq = null;
		hder = null;
		dato = null;
		clave = 0;
	}
	public Nodo(int clave, String dato) {
		hizq = null;
		hder = null;
		this.dato = dato;
		this.clave = clave;
	}
}
