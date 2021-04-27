class Nodo {

	Vehiculo dato;
	Nodo sig;

	public Nodo () {
		dato = null;
		sig = null;
	}

	public Nodo (Vehiculo dato) {
		this.dato = dato;
		sig = null;
	}
}
