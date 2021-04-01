public class Operaciones {

	public void leer (double[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Vector["+ i +"]= ");
			vector[i] = Leer.datoDouble();
		}
	}

	public void mostrar (double[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Vector["+ i +"]= " + vector[i]);
		}
	}
	
	public void promNegativos (double[] vector) {
		double promedio = 0;
		int cant = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < 0) {
				promedio += vector[i];
				cant += 1;
			}
		}
		if (cant != 0)
			System.out.println("El promedio es: " + (double)(promedio / cant));
		else
			System.out.println("No tiene numeros negativos");
	}

	public void menorPositivo (double[] vector) {

		double menPos = -1;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > 0 && (vector[i] < menPos || menPos == -1))
				menPos = vector[i];
		}
		if (menPos != -1)
			System.out.println("El menor Positivo es: " + menPos);
		else
			System.out.println("No hay numeros positivos");
	}
}
