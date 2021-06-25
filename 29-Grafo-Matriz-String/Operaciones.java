class Operaciones {
    
    public Grafo insertarN(Grafo g) {
        System.out.print("No. vertices=");
        int n=Leer.datoInt();
        g.asignaV(n);
        for(int i=1; i<=n;++i) {
            g.insertarVertice();
        }
        System.out.print("No. de aristas=");
        int na= Leer.datoInt();
        for(int i=1; i<=na;++i) {
            g.insertarArista();
        }
        return g;
    }
    public void horizontal(Grafo g, String vin) {
        OperCola opc=new OperCola();
        Cola CERR=new Cola();
        Cola ABI=new Cola();
        ABI.insertar(vin);
        String N,d; int v;
        while(!ABI.colaVacia() ) {
            N=ABI.ver();
            CERR.insertar(N);
            ABI.eliminar();
            v=g.verticeDeDato(N);
            for(int c=1;c<=g.nv;++c) {
                if(g.mady[v][c]==1) {
                    d=g.dato[c];
                    if(!opc.pertenece(ABI,d)&&!opc.pertenece(CERR,d))
                        ABI.insertar(d);
                }
            }
        }
        opc.mostrar(CERR);
    }
    public void vertical(Grafo g, String vin) // RECORRIDO VERTICAL EN EL GRAFO
    {
        String N,d; int v;
        OperCola opc = new OperCola();
        Cola CERR = new Cola();
        Cola ABI = new Cola();
        ABI.insertar(vin);
        while (!ABI.colaVacia()) {
            N = ABI.ver();
            CERR.insertar(N);
            ABI.eliminar();
            Cola VECINOS = new Cola();
            v=g.verticeDeDato(N); // VERTICE DEL DATO N
            for(int c=1;c<=g.nv;++c) {
                if(g.mady[v][c]==1) {
                    d=g.dato[c];
                    if(!opc.pertenece(ABI,d)&&!opc.pertenece(CERR,d))
                        VECINOS.insertar(d);
                }
            }
            ABI = opc.concatenar(ABI,VECINOS);
        }
        opc.mostrar(CERR);
    }
}

