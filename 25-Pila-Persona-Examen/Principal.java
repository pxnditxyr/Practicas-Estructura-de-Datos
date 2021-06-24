
public class Principal {

	public static void main (String[] args) {
		Operaciones op = new Operaciones();
		Pila pila = new Pila();
		op.insertarN(pila);
		op.mostrar(pila);
        int edad = op.eliminerEdadMayor( pila );
        if ( edad != 1 ) {
            System.out.println("La edad mayor, la que se eliminara es=" + edad);
        } else {
            System.out.println("No tiene personas en su pila");
        }
		op.mostrar(pila);
	}
}
