public class Nodo {

	Nodo hizq, hder;
	String clave;
	double dato;

	public Nodo() {
		hizq = null;
		hder = null;
		dato = 0;
		clave = null;
	}
	public Nodo(String clave, double dato) {
		hizq = null;
		hder = null;
		this.dato = dato;
		this.clave = clave;
	}
}
