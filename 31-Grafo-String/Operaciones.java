class Operaciones {

    public GrafoL insertarN(GrafoL g)
    {
        System.out.print("No. vertices=");
        int n = Leer.datoInt();
        String dt;
        for(int i = 1; i <= n; ++i)
        {
            System.out.print("dato "+i+"=");
            dt = Leer.dato();
            g.insertar( dt );
        }
        return g;
    }

    public void mostrarListaAdy(GrafoL g)
    {
        NodoG p = g.graf;
        Nodo q;
        while( p != null ) {
            System.out.println("dato= "+p.datox);
            q = p.vec;
            while(q != null) {
                System.out.println("dato de vecino= "+q.dato);
                q = q.sig;
            }
            p = p.sigx;
        }
    }
}
