
public class Pila {

	int cima;
	Vehiculo[] elem;
	final int MAX = 50;

	public Pila () {
		cima = 0;
		elem = new Vehiculo[MAX + 1];
	}

	public boolean pilaVacia() {
		return cima == 0;
	}

	public boolean pilaLlena() {
		return cima == MAX;
	}

	public Vehiculo ver () {
		return elem[cima];
	}

	public void eliminar() {
		if (!pilaVacia() )
			cima -= 1;
	}

	public void insertar (Vehiculo x) {
		if (!pilaLlena() ) {
			cima = cima + 1;
			elem[cima] = x;
		}
	}
}
