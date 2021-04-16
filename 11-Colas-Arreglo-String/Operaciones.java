class Operaciones{

	public Cola insertarN(Cola cola)
	{
		System.out.print("N° elementos: ");
		int n = Leer.datoInt();
		String dato;
		for(int i = 1; i <= n && (!cola.colaLlena()); i++) {
			System.out.print("dato " + i + ": " );
			dato = Leer.dato();
			cola.insertar(dato);
		}
		return cola;
	}
	public Cola mostrar(Cola cola)
	{
		Cola colaux = new Cola();
		colaux.frente = cola.frente;
		colaux.fin = cola.frente;
		String dato;

		while(!cola.colaVacia()) {
			dato = cola.ver();
			System.out.println(dato);
			cola.eliminar();
			colaux.insertar(dato);
		}
		return colaux;
	}
}
