class Grafo {

    int[][] mady;
    String [] dato;
    int nv;
    final int nel = 20;

    public Grafo() {
        nv = 0;
        mady = new int[nel][nel];
        dato = new String[nel];
    }

    public void asignaV( int ne ) {
        nv = ne;
    }

    public boolean grafoVacio() {
        return nv == 0;
    }

    public void insertarArista() {
        System.out.print("Vertice origen=");
        int vo=Leer.datoInt();
        System.out.print("Vertice destino=");
        int vd=Leer.datoInt();
        mady[vo][vd]=1;
    }
    public void insertarVertice() {
        System.out.print("No. vertice=");
        int v= Leer.datoInt();
        System.out.print("Dato del Vertice=");
        String dt=Leer.dato();
        dato[v]=dt;
    }

    public int verticeDeDato(String d) {
        int v=0;
        for(int i=1;i<=nv;++i ) {
            if(d.compareTo(dato[i])==0 ) {
                v=i;
            }
        }
        return v;
    }
}
