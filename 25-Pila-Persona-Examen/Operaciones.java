public class Operaciones {

	public void insertarN(Pila pila) {

		System.out.println("Nº de elementos = ");
		int n = Leer.datoInt();
		Persona persona;
		for(int c = 1; c <= n && !pila.pilaLlena(); c++) {
			System.out.println("Dato " + c + " = ");
			persona = new Persona();
			persona.leer();
			pila.insertar(persona);
		}
	}

	public void mostrar(Pila pila) {

		Pila pilaAux = new Pila();
		Persona persona;
		while(!pila.pilaVacia()) {
			persona = pila.ver();
			persona.mostrar();
			pila.eliminar();
			pilaAux.insertar(persona);
		}
		while(!pilaAux.pilaVacia()) {
			persona = pilaAux.ver();
			pilaAux.eliminar();
			pila.insertar(persona);
		}
		System.out.println("----------------------------");
	}

    public int obtenerMayor ( Pila pila ) {

        Pila pilaAux = new Pila();
		Persona persona;
        int mayor = -1;

		while(!pila.pilaVacia()) {
			persona = pila.ver();
            if ( persona.edad > mayor ) {
                mayor = persona.edad;
            }
			pila.eliminar();
			pilaAux.insertar(persona);
		}
		while(!pilaAux.pilaVacia()) {
			persona = pilaAux.ver();
			pilaAux.eliminar();
			pila.insertar(persona);
		}

        return mayor;

    }

    public int eliminerEdadMayor ( Pila pila ) {
        int mayor = obtenerMayor( pila );
        Pila pilaAux = new Pila();
		Persona persona;

        if ( mayor == -1 ) {
            return mayor;                           // Como se pide retornar la edad mayor seguido de retornar se hace la observacion
        }
        while(!pila.pilaVacia()) {
			persona = pila.ver();
            pila.eliminar();
            if ( persona.edad != mayor ) {
                pilaAux.insertar(persona);
            }
		}
		while(!pilaAux.pilaVacia()) {
			persona = pilaAux.ver();
			pilaAux.eliminar();
			pila.insertar(persona);
		}

        return mayor;
    }

}
