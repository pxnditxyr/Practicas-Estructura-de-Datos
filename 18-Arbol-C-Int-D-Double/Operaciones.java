public class Operaciones {

	public Arbol insertarN( Arbol arbol ) {

		System.out.print( "No de nodos = " );
		int n = Leer.datoInt();
		for( int i = 1; i <= n; i++ ) {
			System.out.println( "Nodo " + i + ": " );
			System.out.print( "Clave: " );
			int clave = Leer.datoInt();
			System.out.print( "Dato: " );
			double dato = Leer.datoDouble();
			arbol.insertar(clave, dato);
		}
		return arbol;
	}

	public void preorden( Nodo p ) {
		if( p != null ) {
			System.out.println( p.clave + ", " + p.dato );
			preorden(p.hizq);
			preorden(p.hder);
		}
	}

	public void simetrico( Nodo p ) {
		if( p != null ) {
			simetrico( p.hizq );
			if ( p.dato > 0 )
				System.out.println( p.clave + ", " + p.dato );
			simetrico(p.hder);
		}
	}

	public void posorden( Nodo p ) {
		if( p!=null ) {
			posorden( p.hizq );
			posorden( p.hder );
			if ( p.clave % 2 != 0 && p.dato < 0 )
				System.out.println( p.clave + ", " + p.dato );
		}
	}

	public void buscar( Arbol arbol, int cb )
	{
		Nodo p = arbol.raiz;
		while( p != null && p.clave != cb ) {
			if( p.clave > cb )
				p = p.hizq;
			else
				p = p.hder;
			}
			if ( p == null )
				System.out.println("NO LOCALIZADO");
			else
				System.out.println(p.dato);
	}
}

