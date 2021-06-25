class OperCola {

    public Cola insertarN(Cola p) {
        System.out.print("No. elementos=");
        int n = Leer.datoInt();
        String dt;
        for (int i = 1; i <= n; ++i) { System.out.print("dato " + i + "=");
        dt = Leer.dato();
        p.insertar(dt);
        }
        return p;
    }

    public void mostrar(Cola p) {
        Cola aux = new Cola();
        String d;
        while (!p.colaVacia()) {
            d = p.ver();
            System.out.println(d);
            p.eliminar();
            aux.insertar(d);
        }
        while (!aux.colaVacia()) {
            d = aux.ver();
            aux.eliminar();
            p.insertar(d);
        }
    }

    public boolean pertenece(Cola p, String x) {
        Cola aux = new Cola();
        boolean sw = false;
        String d;
        while (!p.colaVacia()) {
            d = p.ver();
            p.eliminar();
            if (d.compareTo(x) == 0) {
                sw = true;
            }
            aux.insertar(d);
        }
        while (!aux.colaVacia()) {
            d = aux.ver();
            aux.eliminar();
            p.insertar(d);
        }
        return sw;
    }

    public Cola concatenar(Cola ab, Cola ve) {
        Cola aux = new Cola();
        String d;
        while (!ve.colaVacia()) {
            d = ve.ver();
            ve.eliminar();
            aux.insertar(d);
        }
        while (!ab.colaVacia()) {
            d = ab.ver();
            ab.eliminar();
            aux.insertar(d);
        }
        return aux;
    }
}

