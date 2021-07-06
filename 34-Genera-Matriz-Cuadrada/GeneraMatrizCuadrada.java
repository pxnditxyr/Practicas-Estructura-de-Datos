import java.util.Scanner;

public class GeneraMatrizCuadrada {

    public static void main ( String[] args ) {
        Scanner leer = new Scanner( System.in );
        int n;
        double[][] matriz;
        System.out.println( "Introduzca el tamaño( n ) que quiere que tenga su matriz cuadrada NxN" );
        n = leer.nextInt();
        matriz = new double[ n ][ n ];
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( i == j ) {
                    matriz[ i ][ j ] = 1;
                } else {
                    matriz[ i ][ j ] = 0;
                }

            }
        }

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                System.out.print( matriz[ i ][ j ] + "\t" );
            }
            System.out.println( "" );
        }

    }
}
