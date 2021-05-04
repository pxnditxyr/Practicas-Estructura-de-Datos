public class Arbol
{
	Nodo raiz;

	public Arbol() {
		raiz = null;
	}
	public void inicializar() {
		raiz = null;
	}

	public boolean arbolVacio() {
		return raiz == null;
	}

	public void insertar(int clave, double dato) {

		Nodo nuevo = new Nodo(clave, dato);

		if( arbolVacio() ) {
			raiz=nuevo;
		} else {
			Nodo p = raiz, q = null;
			while( p != null ) {
				q = p;
				if( p.clave > clave )
					p = p.hizq;
				else
					p = p.hder;
			}
			if ( q.clave > clave )
				q.hizq = nuevo;
			else
				q.hder = nuevo;
		}
	}
}
