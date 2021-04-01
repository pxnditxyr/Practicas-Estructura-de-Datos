public class Operaciones {

	public void insertarN (Lista lista)
	{
		System.out.println("No. nodos= ");
		int n = Leer.datoInt();
		Estudiante d;
		for (int i = 1; i <= n; i++) {
			System.out.print("Dato= ");
			d = new Estudiante();
			d.leer();
			lista.insertar(d);
		}
	}

	public void mostrar (Lista lista) {
		Nodo nodo = lista.primero;
		while (nodo != null) {
			nodo.dato.mostrar();
			nodo = nodo.sig;
		}
	}

	public void eliminarDado (Lista lista, Estudiante d) {
		if (!lista.listaVacia()) {
			if (lista.primero.dato == d) {
				lista.eliminar();
			} else {
				Nodo nodo = lista.primero;
				while (nodo.sig != null && nodo.sig.dato != d) {
					nodo = nodo.sig;
				}
				if(nodo.sig != null) {
					lista.eliminar2(nodo);
				}
			}
		}
	}

	public int sacaMasAntiguo (Lista lista) {

		Nodo nodo = lista.primero;
		int antiguo = -1;
		while (nodo != null) {
			if ((nodo.dato.agnoIngreso < antiguo) || (antiguo == -1)) {
				antiguo = nodo.dato.agnoIngreso;
			}
			nodo = nodo.sig;
		}
		return antiguo;
	}
	public void mostrarCi (Lista lista) {
		int antiguo = sacaMasAntiguo(lista);
		if (antiguo != -1) {
			Nodo nodo = lista.primero;
			while (nodo != null) {
				if (nodo.dato.agnoIngreso == antiguo) {
					System.out.println("Estudiantes: ");
					System.out.println("C.I.: " + nodo.dato.ci);
					System.out.println("Nombre: " + nodo.dato.nombre);
				}
				nodo = nodo.sig;
			}
		} else {
			System.out.println("No tiene estudiantes");
		}
	}

	public void eliminarCarrera (Lista lista, String carrera) {

		Nodo nodo = lista.primero;
		while (nodo != null) {
			if (nodo.dato.carrera.equals(carrera)) {
				eliminarDado(lista, nodo.dato);
			}
			nodo = nodo.sig;
		}
	}
}
