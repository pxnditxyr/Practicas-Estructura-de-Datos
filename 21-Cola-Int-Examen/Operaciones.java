class Operaciones {

	public Cola insertarN(Cola cola) {
		System.out.print("Nº de elementos = ");
		int n = Leer.datoInt();
		int dato;
		for(int i = 1; i <= n; i++) {
			System.out.print("Dato " + i + " = ");
			dato = Leer.datoInt();
			cola.insertar(dato);
		}
		return cola;
	}

	public Cola mostrar(Cola cola)
	{
		Cola caux = new Cola();
		int dato;
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

	public Cola encontrarMayNeg ( Cola cola ) {
		Cola caux = new Cola();
		int dato;
		int mayNeg = 0;

		while(!cola.colaVacia()) {
			dato = cola.ver();
			if ( (dato > mayNeg && dato < 0) || (dato < 0 && mayNeg == 0))
				mayNeg = dato;
			cola.eliminar();
			caux.insertar(dato);
		}
		if ( mayNeg == 0 ) {
			System.out.println("No tiene numeros negativos");
		} else {
			System.out.println("El mayor negativo es: " + mayNeg);
		}
		return caux;
	}

	public Cola eliminarUltimo(Cola cola)
	{
		Cola caux = new Cola();
		int dato;
		while(!cola.colaVacia()) {
			dato = cola.ver();
			cola.eliminar();
			if ( !cola.colaVacia() ) {
				caux.insertar(dato);
			}
		}
		return caux;
	}
}
