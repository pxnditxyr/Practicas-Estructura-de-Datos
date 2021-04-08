class Operaciones {

	public Pila insertarN(Pila pila) {
		System.out.print("Nº de elementos = ");
		int n = Leer.datoInt();
		String dato;
		for(int c = 1; c <= n; c++) {
			System.out.print("Dato " + c + "= ");
			dato = Leer.dato();
			pila.insertar(dato);
		}
		return pila;
	}

	public void mostrar(Pila pila)
	{
		Pila paux = new Pila();
		String dato;
		System.out.println("------------------");
		while( !pila.pilaVacia() )  {
			dato = pila.ver();
			System.out.println(" " + dato);
			pila.eliminar();
			paux.insertar(dato);
		}
		while( !paux.pilaVacia() )  {
			dato = paux.ver();
			paux.eliminar();
			pila.insertar(dato);
		}
		System.out.println("------------------");
	}

	public void eliminaBase (Pila pila) {
		Pila paux = new Pila();
		String dato;
		boolean primero = true;
		while( !pila.pilaVacia() )  {
			dato = pila.ver();
			pila.eliminar();
			paux.insertar(dato);
		}
		while( !paux.pilaVacia() )  {
			dato = paux.ver();
			paux.eliminar();
			if (!primero)
				pila.insertar(dato);
			else
				primero = false;
		}
	}
	public void buscaDato (Pila pila, String datoBuscado) {
		Pila paux = new Pila();
		String dato;
		boolean seEncontro = false;
		while( !pila.pilaVacia() )  {
			dato = pila.ver();
			if ( dato.equals(datoBuscado) )
				seEncontro = true;
			pila.eliminar();
			paux.insertar(dato);
		}
		while( !paux.pilaVacia() )  {
			dato = paux.ver();
			paux.eliminar();
			pila.insertar(dato);
		}
		if (seEncontro)
			System.out.println("Se encontro el dato " + datoBuscado + " en la pila");
		else
			System.out.println("No se encontro el dato " + datoBuscado + " en la pila");
	}
}

