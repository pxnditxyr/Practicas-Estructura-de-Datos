public class Operaciones {

	public void insertarN(Pila pila) {
		System.out.println("Nº de elementos = ");
		int n = Leer.datoInt();
		Estudiante estudiante;
		for(int c = 1; c <= n && !pila.pilaLlena(); c++) {
			System.out.println("Dato " + c + " = ");
			estudiante = new Estudiante();
			estudiante.leer();
			pila.insertar(estudiante);
		}
	}

	public void mostrar(Pila pila) {
		Pila pilaAux = new Pila();
		Estudiante estudiante;
		while(!pila.pilaVacia()) {
			estudiante = pila.ver();
			estudiante.mostrar();
			pila.eliminar();
			pilaAux.insertar(estudiante);
		}
		while(!pilaAux.pilaVacia()) {
			estudiante = pilaAux.ver();
			pilaAux.eliminar();
			pila.insertar(estudiante);
		}
		System.out.println("----------------------------");
	}

	public void cantidadEstudiantesCarrera (Pila pila, String carrera) {
		Pila pilaAux = new Pila();
		Estudiante estudiante;
		int cantidad = 0;
		while(!pila.pilaVacia()) {
			estudiante = pila.ver();
			if (estudiante.carrera.equals(carrera))
				cantidad += 1;
			pila.eliminar();
			pilaAux.insertar(estudiante);
		}
		while(!pilaAux.pilaVacia()) {
			estudiante = pilaAux.ver();
			pilaAux.eliminar();
			pila.insertar(estudiante);
		}
		if ( cantidad != 0 )
			System.out.println("La cantidad de estudiantes de la carrera dada es: " + cantidad);
		else
			System.out.println("No hay estudiantes de esa carrera");
	}

	public void eliminarAgnoAnterior (Pila pila, int agno) {
		Pila pilaAux = new Pila();
		Estudiante estudiante;
		while(!pila.pilaVacia()) {
			estudiante = pila.ver();
			pila.eliminar();
			pilaAux.insertar(estudiante);
		}

		while(!pilaAux.pilaVacia()) {
			estudiante = pilaAux.ver();
			pilaAux.eliminar();
			if ( estudiante.agnoIngreso >= agno )
				pila.insertar(estudiante);
		}
	}

}
