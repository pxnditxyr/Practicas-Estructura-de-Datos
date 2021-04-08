class Pila {

	Nodo cima;

	public Pila () {
		cima = null;
	}
	public void inicializar () {
		cima = null;
	}
	public boolean pilaVacia () {
		return cima == null;
	}

	public String ver () {
		return cima.dato;
	}

	public void eliminar () {
		if ( !pilaVacia() )
			cima = cima.sig;
	}

	public void insertar (String dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.sig  = cima;
		cima = nuevo;
	}
}
