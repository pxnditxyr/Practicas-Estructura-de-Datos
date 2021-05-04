public class Nodo {

	Nodo hizq, hder;
	int clave;
	double dato;

	public Nodo() {
		hizq = null;
		hder = null;
		dato = 0;
		clave = 0;
	}
	public Nodo(int clave, double dato) {
		hizq = null;
		hder = null;
		this.dato = dato;
		this.clave = clave;
	}
}
