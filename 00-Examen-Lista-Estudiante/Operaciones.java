public class Operaciones {

	public void insertarN(Lista L) {
		System.out.println("No. nodos= ");
		int nn=Leer.datoInt();
		int d;
		for(int i=1;i<=nn;i++) {
			System.out.print("Dato= ");
			d=Leer.datoInt();
			L.insertar(d);
		}
	}
	public void mostrar(Lista L) {
		Nodo p=L.primero;
		while(p!=null) {
			System.out.print(p.dato+"  ");
			p=p.sig;
		}
	}
	public void mayorNeg (Lista L) {
		double may = 1;
		Nodo p = L.primero;
		while(p != null) {
			System.out.println("Nodo" + p.dato);
			if(p.dato < 0 && (p.dato > may || may == 1)) {
				System.out.println("Entra puto");
				may = p.dato;
			}
			p=p.sig;
		}
		if(may != 1) {
			System.out.println("El mayor Negativo es: " + may);
		} else {
			System.out.println("No hay negativos");
		}
	}




	public void insertarcasiFin(Lista L, int x) {
		if(L.listaVacia()) {
			L.insertar(x);
		} else {
			Nodo p=L.primero;
			while(p.sig.sig!=null) {
				p=p.sig.sig;
			}
			L.insertar2(x, p);
		}
	}
}
