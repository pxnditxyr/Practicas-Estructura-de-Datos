class Operaciones {

	public Cola insertarN(Cola cola) {
		System.out.print("Nº de elementos = ");
		int n = Leer.datoInt();
		double dato;
		for(int i = 1; i <= n; i++) {
			System.out.print("Dato " + i + " = ");
			dato = Leer.datoDouble();
			cola.insertar(dato);
		}
		return cola;
	}

	public Cola mostrar(Cola cola)
	{
		Cola caux = new Cola();
		double dato;
		System.out.println("-------------------------------------------------");
		while(!cola.colaVacia()) {
			dato = cola.ver();
			System.out.println(" " + dato);
			cola.eliminar();
			caux.insertar(dato);
		}
		System.out.println("-------------------------------------------------");
		return caux;
	}

	public void eliminaMayoresPromedio(Cola cola) {

		Cola caux = new Cola();
		double dato, promedio;
		int cantidad;
		System.out.println("Elimina mayores al promedio: ");

		promedio = cantidad = 0;

		while(!cola.colaVacia())
		{
			dato = cola.ver();
			promedio += dato;
			cantidad += 1;
			cola.eliminar();
			caux.insertar(dato);
		}

		if (cantidad > 0) {
			promedio = (double)(promedio / cantidad);
			System.out.println("Promedio: " + promedio);
		}

		while(!caux.colaVacia())
		{
			dato = caux.ver();
			caux.eliminar();
			if(dato < promedio )
				cola.insertar(dato);
		}
	}

	public void insertarDespuesDeMenor ( Cola cola ) {
		
		Cola caux = new Cola();
		double dato, nuevoDato, menor = Double.MAX_VALUE;
		boolean esElUnico = true;
		System.out.println("Inserta despues del menor ");

		if ( !cola.colaVacia() ) {
			while( !cola.colaVacia() ) {
				dato = cola.ver();
				if ( dato < menor )
					menor = dato;
				cola.eliminar();
				caux.insertar( dato );
			}

			while(!caux.colaVacia()) {
				dato = caux.ver();
				caux.eliminar();
				cola.insertar( dato );
				if( dato == menor && esElUnico ) {
					nuevoDato = Leer.datoDouble();
					cola.insertar( nuevoDato );
					esElUnico = false;
				}
			}
		} else {
			nuevoDato = Leer.datoDouble();
			cola.insertar( nuevoDato );
		}
	}
}
