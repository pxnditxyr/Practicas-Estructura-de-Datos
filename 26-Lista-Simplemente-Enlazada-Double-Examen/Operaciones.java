public class Operaciones {

	public void insertarN (Lista lista)
	{
		System.out.println("No. nodos= ");
		int n = Leer.datoInt();
		double d;
		for (int i = 1; i <= n;i++) {
			System.out.print("Dato= ");
			d = Leer.datoInt();
			lista.insertar(d);
		}
	}

	public void mostrar (Lista lista) {
		Nodo nodo = lista.primero;
		while (nodo != null) {
			System.out.println(nodo.dato);
			nodo = nodo.sig;
		}
	}


	public void encuentraMenorPositivo (Lista lista) {
		Nodo nodo = lista.primero;
		double menorPositivo = -1;

		while (nodo != null) {
            if ( ( nodo.dato > 0 && nodo.dato < menorPositivo ) || ( menorPositivo == -1 && nodo.dato > 0 ) )
				menorPositivo = nodo.dato;
			nodo = nodo.sig;
		}
		if (menorPositivo != -1)
			System.out.println("El menor Positivo es: " + menorPositivo);
		else
			System.out.println("No hay numeros positivos en su Lista");
	}

    public void encuentraMayorNegativo ( Lista lista ) {
        Nodo nodo = lista.primero;
		double mayorNegativo = 0;

		while (nodo != null) {
            if ( ( nodo.dato < 0 && nodo.dato > mayorNegativo ) || ( mayorNegativo == 0 && nodo.dato < 0 ) )
				mayorNegativo = nodo.dato;
			nodo = nodo.sig;
		}
		if (mayorNegativo != 0)
			System.out.println("El Mayor Negativo es: " + mayorNegativo);
		else
			System.out.println("No hay numeros negativos en su Lista");
    }
}
