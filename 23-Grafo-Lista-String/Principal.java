public class Principal {

    public static void main (String[] args) {
        GrafoL grafoL = new GrafoL();
        Operaciones op = new Operaciones();
        op.insertarN( grafoL );
        op.mostrarListaAdy( grafoL );
    }
}

