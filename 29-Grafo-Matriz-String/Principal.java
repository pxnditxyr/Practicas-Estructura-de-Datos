public class Principal{
    public static void main(String[] args) {
        Grafo g=new Grafo();
        Operaciones op = new Operaciones();
        g=op.insertarN(g);
        System.out.print("Vertice inicial:");
        String vini=Leer.dato();
        op.horizontal(g,vini);
        op.vertical(g,vini);
    }
}
