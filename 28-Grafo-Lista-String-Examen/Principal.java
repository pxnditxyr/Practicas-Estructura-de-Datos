public class Principal {

    public static void main (String[] args) {
        GrafoL grafo = new GrafoL();
        Operaciones op = new Operaciones();
        grafo = op.insertarN( grafo );
        op.mostrarListaAdy( grafo );
        String nodoInicial;
        System.out.println("Insertar nodo inicial para recorrido Horizontal");
        nodoInicial = Leer.dato();
        op.horizontal( grafo, nodoInicial );
    }
}
