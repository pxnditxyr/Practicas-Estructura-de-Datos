class Cola {

	Nodo frente, fin;

	public Cola () {
		frente = fin = null;
	}

	public boolean colaVacia () {
		return (frente == null) && (fin == null);
	}

	public int ver () {
		return frente.dato;
	}

	public void eliminar () {

		if (!colaVacia()) {
			if(frente== fin) {
				frente = fin = null;
			} else {
				frente = frente.sig;
			}
		}
	}

	public void insertar (int dato) {

		Nodo nuevo = new Nodo(dato);
		if (colaVacia()) {
			frente = nuevo;
			fin = nuevo;
		} else {
			fin.sig = nuevo;
			fin = nuevo;
		}
	}
}
