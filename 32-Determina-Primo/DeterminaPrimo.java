import java.util.Scanner;

public class DeterminaPrimo {
    public static void main ( String[] args ) {

        Scanner leer = new Scanner( System.in );
        int numeroIntroducido;
        boolean esPrimo;
        System.out.println( "Introduce un numero cualquiera(Numero Entero), y este programa te dira si es primo o no" );
        numeroIntroducido = leer.nextInt();
        esPrimo = determinaSiEsPrimo( numeroIntroducido );
        if ( esPrimo ) {
            System.out.println( "El numero " + numeroIntroducido + " es primo" );
        } else {
            System.out.println( "El numero " + numeroIntroducido + " no es primo" );
        }
    }

    public static boolean determinaSiEsPrimo ( int numero ) {

        if ( numero <= 1 ) {
            return false;
        }

        for ( int i = 2; i <= Math.sqrt( numero ); i++ ) {
            if ( numero % i == 0 ) {
                return false;
            }
        }

        return true;
    }
}
