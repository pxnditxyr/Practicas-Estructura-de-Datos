public class Operaciones {

	public void leer (Estudiante[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = new Estudiante();
			System.out.println("Vector["+ i +"]= ");
			vector[i].leer();
		}
	}

	public void mostrar (Estudiante[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Vector["+ i +"]= ");
			vector[i].mostrar();
		}
	}
	public void cuentaEstudiantes (Estudiante[] vector) {
		int contador = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i].edad < 20)
				contador += 1;
		}
		if (contador != 0)
			System.out.println("El numero de estudiantes menores de 20 es: " + contador);
		else
			System.out.println("No se han encontrado estudiantes menores de 20");
	}

	public int sacaMayor (Estudiante[] vector) {
		int mayor = -1;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i].edad > mayor)
				mayor = vector[i].edad;
		}
		return mayor;
	}
	
	public void cuentaMayores (Estudiante[] vector) {
		int mayor = sacaMayor(vector);
		int contador = 0;
		if (mayor != -1) {
			for (int i = 0; i < vector.length; i++) {
				if (vector[i].edad == mayor)
					contador += 1;
			}
			System.out.println("Hay " + contador + " estudiantes de " + mayor + " Años");
		} else {
			System.out.println("No se encontraron estudiantes");
		}
	}
}
