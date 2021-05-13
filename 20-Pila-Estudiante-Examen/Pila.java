
public class Pila {

	int cima;
	Estudiante[] elem;
	final int MAX = 50;

	public Pila () {
		cima = 0;
		elem = new Estudiante[MAX + 1];
	}

	public boolean pilaVacia() {
		return cima == 0;
	}

	public boolean pilaLlena() {
		return cima == MAX;
	}

	public Estudiante ver () {
		return elem[cima];
	}

	public void eliminar() {
		if (!pilaVacia() )
			cima -= 1;
	}

	public void insertar (Estudiante x) {
		if (!pilaLlena() ) {
			cima = cima + 1;
			elem[cima] = x;
		}
	}
}
