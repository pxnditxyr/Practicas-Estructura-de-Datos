public class Lista
{
	Nodo primero;

	public Lista () {
		primero = null;
	}

	public void inicializar () {
		primero = null;
	}

	public boolean listaVacia() {
		return primero == null;
	}

	public void insertar(Estudiante x) {
		Nodo nuevo = new Nodo(x);
		nuevo.sig = primero;
		primero = nuevo;
	}

	public void eliminar() {
		if(!listaVacia()) {
			primero=primero.sig;
		}
	}

	public void insertar2(Estudiante x, Nodo pos) {
		Nodo nuevo=new Nodo(x);
		nuevo.sig=pos.sig;
		pos.sig=nuevo;
	}

	public void eliminar2(Nodo pos) {
		pos.sig=pos.sig.sig;
	}
}
