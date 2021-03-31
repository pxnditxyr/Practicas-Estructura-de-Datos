public class Principal {
	public static void main(String[] args )
	{
		Operaciones op = new Operaciones();
		Lista lista = new Lista();
		op.insertarN(lista);
		op.mostrar(lista);
		op.encuentraPromedio(lista);
		op.encuentraMenorPositivo(lista);
	}
}
