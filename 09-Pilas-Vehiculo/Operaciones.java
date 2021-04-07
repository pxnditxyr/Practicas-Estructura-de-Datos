public class Operaciones {

	public void insertarN(Pila pila) {
		System.out.println("Nº de elementos = ");
		int n = Leer.datoInt();
		Vehiculo vehiculo;
		for(int c = 1; c <= n && !pila.pilaLlena(); c++) {
			System.out.println("Dato " + c + " = ");
			vehiculo = new Vehiculo();
			vehiculo.leer();
			pila.insertar(vehiculo);
		}
	}

	public void mostrar(Pila pila) {
		Pila pilaAux = new Pila();
		Vehiculo vehiculo;
		while(!pila.pilaVacia()) {
			vehiculo = pila.ver();
			vehiculo.mostrar();
			pila.eliminar();
			pilaAux.insertar(vehiculo);
		}
		while(!pilaAux.pilaVacia()) {
			vehiculo = pilaAux.ver();
			pilaAux.eliminar();
			pila.insertar(vehiculo);
		}
		System.out.println("----------------------------");
	}

	/*public void contarMarca(Pila pila) {
		System.out.print("Marca = ");
		String ma = Leer.dato();
		Pila pilaAux = new Pila();
		Vehiculo vehiculo;
		int c = 0;
		while(!pila.pilaVacia()) {
			vehiculo = pila.ver();
			if ( ma.compareTo(vehiculo.marca) == 0 )
				c++;
			pila.eliminar();
			pilaAux.insertar(vehiculo);
		}

		while(!pilaAux.pilaVacia()) {
			vehiculo = pilaAux.ver();
			pilaAux.eliminar();
			pila.insertar(vehiculo);
		}
		System.out.println("No. Vehículos de la marca " + ma + " = " + c);
	} */

	public int vehiculoMasAntiguo (Pila pila) {
		Pila pilaAux = new Pila();
		Vehiculo vehiculo;
		int menor = Integer.MAX_VALUE;

		while(!pila.pilaVacia()) {
			vehiculo = pila.ver();
			if ( vehiculo.modelo < menor )
				menor = vehiculo.modelo;
			pila.eliminar();
			pilaAux.insertar(vehiculo);
		}
		while(!pilaAux.pilaVacia()) {
			vehiculo = pilaAux.ver();
			pilaAux.eliminar();
			pila.insertar(vehiculo);
		}
		return menor;
	}

	public void cantidadVehiculosAntuguos (Pila pila) {
		Pila pilaAux = new Pila();
		Vehiculo vehiculo;
		int cantidad = 0;
		int menor = vehiculoMasAntiguo(pila);
		if (menor != Integer.MAX_VALUE) {
			while(!pila.pilaVacia()) {
				vehiculo = pila.ver();
				if (vehiculo.modelo == menor)
					cantidad += 1;
				pila.eliminar();
				pilaAux.insertar(vehiculo);
			}
			while(!pilaAux.pilaVacia()) {
				vehiculo = pilaAux.ver();
				pilaAux.eliminar();
				pila.insertar(vehiculo);
			}
			System.out.println("La cantidad de vehiculos mas antiguos es: " + cantidad);
		} else {
			System.out.println("Pila Vacia");
		}
	}

	public void eliminarMarca (Pila pila, String marca) {
		Pila pilaAux = new Pila();
		Vehiculo vehiculo;
		while(!pila.pilaVacia()) {
			vehiculo = pila.ver();
			pila.eliminar();
			pilaAux.insertar(vehiculo);
		}

		while(!pilaAux.pilaVacia()) {
			vehiculo = pilaAux.ver();
			pilaAux.eliminar();
			if ( !(vehiculo.marca.equals(marca) && vehiculo.modelo < 1990) )
				pila.insertar(vehiculo);
		}
	}

	public void insertarNuevo (Pila pila, String placa) {
		Pila pilaAux = new Pila();
		Vehiculo vehiculo;
		boolean esUnico = true;
		while(!pila.pilaVacia()) {
			vehiculo = pila.ver();
			pila.eliminar();
			pilaAux.insertar(vehiculo);
		}

		while(!pilaAux.pilaVacia()) {
			vehiculo = pilaAux.ver();
			pilaAux.eliminar();
			pila.insertar(vehiculo);
			if ( vehiculo.placa.equals(placa) && esUnico ) {
				Vehiculo vehiculoNuevo = new Vehiculo();
				vehiculo.leer();
				pila.insertar(vehiculo);
				esUnico = false;
			}
		}

		if ( esUnico )
			System.out.println(" No se encontro el vehiculo con la placa: " + placa);
	}
}
