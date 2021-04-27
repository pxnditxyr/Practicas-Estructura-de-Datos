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

	public Cola contarMarcaDada( Cola cola, String marca ) {

		Cola caux = new Cola();
		Vehiculo dato;
		int contador = 0;
		System.out.println("Contar numero de vehiculos de una marca dada");
		while(!cola.colaVacia()) {
			dato = cola.ver();
			if ( dato.marca.equals( marca ) )
				contador += 1;
			cola.eliminar();
			caux.insertar(dato);
		}
		if ( contador > 0 ) {
			System.out.println("El numero de vehiculos de la marca " + marca + " es: " + contador);
		} else {
			System.out.println("No tiene Vehiculos con esa marca");
		}
		return caux;
	}

	public Cola eliminarModeloMarca( Cola cola, String marca, int modelo ) {

		Cola caux = new Cola();
		Vehiculo dato;
		System.out.println("Elimina vehiculos de una marca y modelo dado");
		while(!cola.colaVacia()) {
			dato = cola.ver();
			cola.eliminar();
			if ( !(dato.marca.equals( marca ) && dato.modelo == modelo) )
				caux.insertar(dato);
		}
		return caux;
	}
}
