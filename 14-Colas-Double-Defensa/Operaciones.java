class Operaciones {

	public Cola insertarN(Cola cola) {

		System.out.print("N° elementos: ");
		int n = Leer.datoInt();
		double dato;
		for(int i = 1; i <= n && (!cola.colaLlena()); i++) {
			System.out.print("dato " + i + ": " );
			dato = Leer.datoDouble();
			cola.insertar(dato);
		}
		return cola;
	}

	public Cola mostrar(Cola cola) {

		Cola colaux = new Cola();
		colaux.frente = cola.frente;
		colaux.fin = cola.frente;
		double dato;
		System.out.println("----------------------------");
		while(!cola.colaVacia()) {
			dato = cola.ver();
			System.out.println(dato);
			cola.eliminar();
			colaux.insertar(dato);
		}
		System.out.println("----------------------------");

		return colaux;
	}

	public Cola cantidadPositivos (Cola cola) {

		Cola colaux = new Cola();
		colaux.frente = cola.frente;
		colaux.fin = cola.frente;
		double dato;
		int cantidad = 0;
		while(!cola.colaVacia()) {
			dato = cola.ver();
			if ( dato > 0 )
				cantidad += 1;
			cola.eliminar();
			colaux.insertar(dato);
		}

		if ( cantidad > 0 )
			System.out.println("La cantidad de positivos es: " + cantidad);
		else
			System.out.println("No tiene numeros positivos");
		return colaux;
	}
	public Cola eliminaNegativos (Cola cola) {

		Cola colaux = new Cola();
		colaux.frente = cola.frente;
		colaux.fin = cola.frente;
		double dato;

		while(!cola.colaVacia()) {
			dato = cola.ver();
			cola.eliminar();
			if ( dato > 0 )
				colaux.insertar(dato);
		}
		return colaux;
	}

	public Cola insertarAlFrente (Cola cola) {
		Cola colaux = new Cola();
		colaux.frente = cola.frente;
		colaux.fin = cola.frente;
		double dato;
		boolean primeraVez = true;

		System.out.println("Introduzca el dato a insertar al Frente");
		double nuevoDato = Leer.datoDouble();

		if ( cola.colaVacia() )
			colaux.insertar( nuevoDato );

		while(!cola.colaVacia()) {
			dato = cola.ver();
			cola.eliminar();
			if ( primeraVez ) {
				colaux.insertar(nuevoDato);
				primeraVez = false;
			}
			colaux.insertar(dato);
		}

		return colaux;
	}
	
}
