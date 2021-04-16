class Operaciones{

	public Cola insertarN(Cola cola) {

		System.out.print("N° elementos: ");
		int n = Leer.datoInt();
		Vehiculo dato;
		for(int i = 1; i <= n && (!cola.colaLlena()); i++) {
			System.out.print("dato " + i + ": " );
			dato = new Vehiculo();
			dato.leer();
			cola.insertar(dato);
		}
		return cola;
	}

	public Cola mostrar(Cola cola) {

		Cola colaux = new Cola();
		colaux.frente = cola.frente;
		colaux.fin = cola.frente;
		Vehiculo dato;

		while(!cola.colaVacia()) {
			dato = cola.ver();
			dato.mostrar();
			cola.eliminar();
			colaux.insertar(dato);
		}
		return colaux;
	}

	public Cola cuentaModeloDado (Cola cola, int modelo) {
		Cola colaux = new Cola();
		colaux.frente = cola.frente;
		colaux.fin = cola.frente;
		Vehiculo dato;
		int contador = 0;

		while(!cola.colaVacia()) {
			dato = cola.ver();
			if ( dato.modelo == modelo )
				contador += 1;
			cola.eliminar();
			colaux.insertar(dato);
		}

		if ( contador > 0)
			System.out.println("El numero de vehiculos de modelo " + modelo + " es: " + contador);
		else
			System.out.println("No tiene vehiculos con ese modelo");
		return colaux;
	}

	public Cola eliminaMarcaDada (Cola cola, String marca) {
		
		Cola colaux = new Cola();
		colaux.frente = cola.frente;
		colaux.fin = cola.frente;
		Vehiculo dato;

		while(!cola.colaVacia()) {
			dato = cola.ver();
			cola.eliminar();
			if ( !dato.marca.equals(marca) )
				colaux.insertar(dato);
		}
		return colaux;
	}

	public Cola insertaVehiculoAlfrente (Cola cola) {
		
		Cola colaux = new Cola();
		colaux.frente = cola.frente;
		colaux.fin = cola.frente;
		Vehiculo dato;

		Vehiculo nuevoVehiculo = new Vehiculo();
		nuevoVehiculo.leer();
		colaux.insertar(nuevoVehiculo);

		while(!cola.colaVacia()) {
			dato = cola.ver();
			System.out.println(dato);
			cola.eliminar();
			colaux.insertar(dato);
		}
		return colaux;
	}
}
