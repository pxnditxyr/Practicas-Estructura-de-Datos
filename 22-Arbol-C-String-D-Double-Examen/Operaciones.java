public class Operaciones {

	double menorDatoNeg;
	Operaciones () {
		menorDatoNeg = 0;
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

	public void obtenerMenorDatoNeg ( Nodo p ) {
		if( p != null ) {
			if ( p.dato < menorDatoNeg )
				menorDatoNeg = p.dato;
			obtenerMenorDatoNeg(p.hizq);
			obtenerMenorDatoNeg(p.hder);
		}
	}


	public void mostrarDatoIgualMenorNeg( Nodo p ) {
		if( p != null ) {
			if ( p.dato == menorDatoNeg )
				System.out.println( p.clave );
			mostrarDatoIgualMenorNeg(p.hizq);
			mostrarDatoIgualMenorNeg(p.hder);
		}
	}

	public void hacerMenNeg ( Nodo p ) {
		Nodo paux = p;
		obtenerMenorDatoNeg(paux);
		if ( menorDatoNeg != 0 )
			mostrarDatoIgualMenorNeg(p);
		else{
			System.out.println("No tiene datos negativos en su arbol");
		}
	}
}

