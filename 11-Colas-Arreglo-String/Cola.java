public class Cola {

	int frente, fin;
	String[] elem;
	final int MAX = 50;

	public Cola () {
		frente = fin = MAX;
		elem = new String[MAX + 1];
	}

	public boolean colaVacia () {
		return frente == fin;
	}

	public boolean colaLlena () {
		int sigfin;
		if (fin == MAX)
			sigfin = 1;
		else
			sigfin = fin + 1;
		return sigfin == frente ;
	}

	public String ver () {
		if (frente == MAX)
			return elem[1];
		else
			return elem[frente + 1];
	}

	public void eliminar () {
		if ( !colaVacia() ) {
			if (frente == MAX)
				frente = 1;
			else
				frente = frente + 1;
		}
	}

	public void insertar (String dato) {
		if ( !colaLlena() ) {
			if (fin == MAX)
				fin = 1 ;
			else
				fin = fin + 1;
			elem[fin] = dato;
		}
	}
}
