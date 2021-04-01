public class Operaciones {

	public void insertarN (Lista lista)
	{
		System.out.println("No. nodos= ");
		int n = Leer.datoInt();
		String d;
		for (int i = 1; i <= n; i++) {
			System.out.print("Dato= ");
			d = Leer.dato();
			lista.insertar(d);
		}
	}

	public void mostrar (Lista lista) {
		Nodo nodo = lista.primero;
		while (nodo != null) {
			System.out.println(nodo.dato);
			nodo = nodo.sig;
		}
	}


	public void insertarPos (Lista lista, String x, String dato) {
		if (lista.listaVacia()) {
			lista.insertar(x);
		} else {
			Nodo nodo = lista.primero;
			while (nodo.sig.sig.dato.equals(x)) {
				nodo = nodo.sig;
			}
			lista.insertar2(dato, nodo);
		}
	}

	public void eliminarUltimoNodo (Lista lista) {
		if (!lista.listaVacia()) {
			if (lista.primero.sig == null) {
				lista.eliminar();
			} else {
				Nodo nodo = lista.primero;
				while (nodo.sig.sig != null) {
					nodo = nodo.sig;
				}
				if(nodo.sig != null) {
					lista.eliminar2(nodo);
				}
			}
		}
	}
}
