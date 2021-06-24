public class Operaciones {

	double promNeg;
    int cantidad;
	Operaciones () {
		promNeg = 0;
	}
	public Arbol insertarN( Arbol arbol ) {

		System.out.print( "No de nodos = " );
		int n = Leer.datoInt();
		for( int i = 1; i <= n; i++ ) {
			System.out.println( "Nodo " + i + ": " );
			System.out.print( "Clave: " );
			String clave = Leer.dato();
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
			System.out.println( p.clave + ", " + p.dato );
			simetrico(p.hder);
		}
	}

	public void posorden( Nodo p ) {
		if( p!=null ) {
			posorden( p.hizq );
			posorden( p.hder );
			System.out.println( p.clave + ", " + p.dato );
		}
	}

	public void buscar( Arbol arbol, String cb )
	{
		Nodo p = arbol.raiz;
		while( p != null && !p.clave.equals( cb ) ) {
			if( p.clave.compareTo( cb ) > 0)
				p = p.hizq;
			else
				p = p.hder;
			}
			if ( p == null )
				System.out.println("NO LOCALIZADO");
			else
				System.out.println(p.dato);
	}

    public void obtenerPromedioNegativo ( Nodo p ) {
        obtenerPromNeg( p );
        if ( promNeg == 0 ) {
            System.out.println( "No se encontro negativos en su arbol" );
        } else {
            System.out.println("El promedio de negativos es=" + ( promNeg / cantidad ) );
        }
    }

	public void obtenerPromNeg ( Nodo p ) {

		if( p != null ) {
            if ( p.dato < 0 ) {
                promNeg += p.dato;
                cantidad++;
            }
			obtenerPromNeg(p.hizq);
			obtenerPromNeg(p.hder);
		}
	}
	
}

