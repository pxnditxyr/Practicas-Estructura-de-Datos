import java.util.Scanner;
import java.util.Arrays;

public class DeterminaPeorYMejorNota {

    public static void main ( String[] args ) {
        Scanner leer = new Scanner( System.in );
        int n;
        double[] notas;
        System.out.println( "Introduce cuantas notas pondras" );
        n = leer.nextInt();
        notas = new double[ n ];

        System.out.println( "Ahora introduce todas las notas que tengas una por una" );

        for ( int i = 0; i < n; i++ ) {
            notas[ i ] = leer.nextDouble();
        }

        Arrays.sort( notas ); // ordena el arreglo
        System.out.println( "La peor nota es: " + notas[ 0 ] );
        System.out.println( "La mejor nota es: " + notas[ n - 1 ] );
    }

}
