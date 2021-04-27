class Operaciones {

	public Cola insertarN(Cola cola) {
		System.out.print("Nº de elementos = ");
		int n = Leer.datoInt();
		Vehiculo dato;
		for(int i = 1; i <= n; i++) {
			System.out.print("Dato " + i + " = ");
			dato = new Vehiculo();
			dato.leer();
			cola.insertar( dato );
		}
		return cola;
	}

	public Cola mostrar(Cola cola) {
		Cola caux = new Cola();
		Vehiculo dato;
		System.out.println("-------------------------------------------------");
		while(!cola.colaVacia()) {
			dato = cola.ver();
			dato.mostrar();
			cola.eliminar();
			caux.insertar(dato);
		}
		System.out.println("-------------------------------------------------");
		return caux;
	}

	public Cola insertarPlacaDada( Cola cola, String placa ) {

		Cola caux = new Cola();
		Vehiculo dato, nuevoDato;
		boolean esElUnico = true;
		System.out.println("Inserta vehiculo despues de una placa dada");
		if ( !cola.colaVacia() ) {

			while(!cola.colaVacia()) {
				dato = cola.ver();
				cola.eliminar();
				caux.insertar(dato);
				if ( dato.placa.equals( placa ) && esElUnico ) {
					nuevoDato = new Vehiculo();
					nuevoDato.leer();
					caux.insertar(nuevoDato);
					esElUnico = false;
				}
			}
		} else {
			nuevoDato = new Vehiculo();
			nuevoDato.leer();
			caux.insertar(nuevoDato);
			esElUnico = false;
		}

		return caux;
	}

	public void contarMayoresAlPromedio( Cola cola ) {

		Cola caux = new Cola();
		Vehiculo dato;
		double promedio = 0;
		int cantidad = 0, contador = 0;
		System.out.println("Cuenta mayores al promedio: ");

		promedio = cantidad = 0;
		if ( !cola.colaVacia() ) {
			while(!cola.colaVacia())
			{
				dato = cola.ver();
				promedio += dato.modelo;
				cantidad += 1;
				cola.eliminar();
				caux.insertar(dato);
			}

			promedio = (double)(promedio / cantidad);
			System.out.println("Promedio: " + promedio);

			while(!caux.colaVacia())
			{
				dato = caux.ver();
				caux.eliminar();
				if( dato.modelo > promedio ) {
					contador += 1;
				}
				cola.insertar(dato);
			}

			System.out.println("Hay " + contador + " Vehiculos con modelo mayor al promedio");
		} else {
			System.out.println("No tiene Vehiculos");
		}
		

	}


}
