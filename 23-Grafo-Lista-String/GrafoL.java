class GrafoL {

    NodoG graf;

    public GrafoL() {
        graf = null;
    }
    public boolean grafoVacio() {
        return graf == null;
    }
    public void insertar( String x ) {
        NodoG nuevo = new NodoG( x );
        if( grafoVacio() )
            graf = nuevo;
        else {
            NodoG p = graf;
            while( p.sigx != null ) {
                p = p.sigx;
            }
            p.sigx = nuevo;
        }
        String dt;
        System.out.print("No. vecinos=");
        int mv = Leer.datoInt();
        for( int i = 1; i <= mv; ++i ) {
            System.out.print("dato de vecino "+i+"=");
            dt=Leer.dato();
            nuevo.vec=insertarVec(nuevo.vec, dt);
        }
    }

    public Nodo insertarVec(Nodo qv, String dv) {
        Nodo novo = new Nodo(dv);
        if( qv==null )
            qv=novo;
        else {
            Nodo p=qv;
            while( p.sig != null ) {
                p=p.sig;
            }
            p.sig=novo;
        }
        return qv;
    }
    public NodoG localiza(String db)
    {
        NodoG p = graf;
        while( p != null && !p.datox.equals( db ) ) {
            p = p.sigx;
        }
        return p;
    }
}
