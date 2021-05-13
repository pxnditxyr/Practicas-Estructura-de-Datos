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

	public void insertar(String clave, double dato) {

		Nodo nuevo = new Nodo(clave, dato);

		if( arbolVacio() ) {
			raiz=nuevo;
		} else {
			Nodo p = raiz, q = null;
			while( p != null ) {
				q = p;
				if( p.clave.compareTo( clave ) > 0 )
					p = p.hizq;
				else
					p = p.hder;
			}
			if ( q.clave.compareTo( clave ) > 0 )
				q.hizq = nuevo;
			else
				q.hder = nuevo;
		}
	}
}
