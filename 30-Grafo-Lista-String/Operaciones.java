class Operaciones {
    public GrafoL insertarN(GrafoL g) {
        System.out.print("No. vertices=");
        int n=Leer.datoInt();
        String dt;
        for(int i=1; i<=n;++i) {
            System.out.print("dato "+i+"=");
            dt=Leer.dato();
            g.insertar(dt);
        }
        return g;
    }
    public void mostrarListaAdy(GrafoL g) {
        NodoG p=g.graf;
        Nodo q;
        while(p!=null) { // Recorre la lista de adyacencia
            System.out.println("dato= "+p.datox);
            q=p.vec;
            while(q!=null) { // Recorre lista de vecinos
                System.out.println("dato de vecino= "+q.dato);
                q=q.sig;
            }
            p=p.sigx;
        }
    }
    public void horizontal(GrafoL g, String vin) {
        NodoG r;
        Nodo p = null;
        String N;
        OperCola opc = new OperCola();
        Cola CERR = new Cola();
        Cola ABI = new Cola();
        ABI.insertar(vin);
        while (!ABI.colaVacia()) {
            N = ABI.ver();
            CERR.insertar(N);
            ABI.eliminar();
            r = g.localiza(N);
            if (r != null) {
                p = r.vec;
            }
            while (p != null) {
                if (!opc.pertenece(ABI, p.dato) && !opc.pertenece(CERR, p.dato))
                    ABI.insertar(p.dato);
                p = p.sig;
            }
        }
        opc.mostrar(CERR);
    }

    public void vertical(GrafoL g, String vin) {
        NodoG r;
        Nodo p = null;
        String N;
        OperCola opc = new OperCola();
        Cola CERR = new Cola();
        Cola ABI = new Cola(); ABI.insertar(vin);
        Cola VECINOS = new Cola();
        while (!ABI.colaVacia()) {
            N = ABI.ver();
            CERR.insertar(N);
            ABI.eliminar();
            r = g.localiza(N);
            if (r != null) {
                p = r.vec;
            }
            while (p != null) {
                if (!opc.pertenece(ABI, p.dato) && !opc.pertenece(CERR, p.dato))
                    VECINOS.insertar(p.dato);
                p = p.sig;
            }
            ABI= opc.concatenar(ABI,VECINOS);
        }
        opc.mostrar(CERR);
    }
}
