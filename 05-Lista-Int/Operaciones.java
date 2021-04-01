public class Operaciones {

	public void insertarN (Lista lista)
	{
		System.out.println("No. nodos= ");
		int n = Leer.datoInt();
		int d;
		for (int i = 1; i <= n;i++) {
			System.out.print("Dato= ");
			d = Leer.datoInt();
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


	public void insertarFin (Lista lista, int x) {
		if (lista.listaVacia()) {
			lista.insertar(x);
		} else {
			Nodo nodo = lista.primero;
			while (nodo.sig != null) {
				nodo = nodo.sig;
			}
			lista.insertar2(x, nodo);
		}
	}

	public void eliminarDado (Lista lista, int d) {
		if (!lista.listaVacia()) {
			if (lista.primero.dato==d) {
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

	public void encuentraPromedio (Lista lista) {

		Nodo nodo = lista.primero;
		int cantidad = 0;
		double promedio = 0;

		while (nodo != null) {
			cantidad += 1;
			promedio += nodo.dato;
			nodo = nodo.sig;
		}
		if (cantidad != 0)
			System.out.println("El promedio es: " + (double)(promedio / cantidad));
		else
			System.out.println("No tiene ningun nodo");

	}

	public void encuentraMenorPositivo (Lista lista) {
		Nodo nodo = lista.primero;
		int menorPositivo = -1;

		while (nodo != null) {
			if (nodo.dato > -1 && (nodo.dato < menorPositivo || menorPositivo == -1))
				menorPositivo = nodo.dato;
			nodo = nodo.sig;
		}
		if (menorPositivo != -1)
			System.out.println("El menor Positivo es: " + menorPositivo);
		else
			System.out.println("No hay numeros positivos en su Lista");
	}
}
