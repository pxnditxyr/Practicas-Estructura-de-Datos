class Operaciones{

	double promedio;

	public Operaciones () {
		promedio = 0;
	}

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

		while(!cola.colaVacia()) {
			dato = cola.ver();
			System.out.println(dato);
			cola.eliminar();
			colaux.insertar(dato);
		}
		return colaux;
	}

	public Cola calculaPromedioPositivo (Cola cola) {

		Cola colaux = new Cola();
		colaux.frente = cola.frente;
		colaux.fin = cola.frente;
		double dato;
		double cantidad = 0;

		while(!cola.colaVacia()) {
			dato = cola.ver();
			if ( dato > 0 ) {
				promedio += dato;
				cantidad += 1;
			}
			cola.eliminar();
			colaux.insertar(dato);
		}
		
		if ( cantidad > 0 ) {
			promedio /= cantidad;
			System.out.println("El promedio de los positivos es: " + promedio);
		} else {
			System.out.println("No tiene numeros positivos");
		}
		return colaux;
	}
	public Cola eliminaMenoresAlPromedio (Cola cola) {

		Cola colaux = new Cola();
		colaux.frente = cola.frente;
		colaux.fin = cola.frente;
		double dato;

		while(!cola.colaVacia()) {
			dato = cola.ver();
			cola.eliminar();
			if ( dato > promedio )
				colaux.insertar(dato);
		}
		return colaux;
	}
	
}
