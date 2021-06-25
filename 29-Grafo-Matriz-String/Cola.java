public class Cola {
    NodoD frente, fin;
    public Cola() {
        frente = fin = null;
    }
    public boolean colaVacia() {
        return frente == null;
    }
    public String ver() {
        return frente.dato;
    }
    public void insertar(String x) {
        NodoD nuevo = new NodoD(x);
        if (colaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.sig = nuevo;
            nuevo.ant = fin;
            fin = nuevo;
        }
    }
    public void eliminar() {
        if (!colaVacia()) {
            if (fin == frente) {
                fin = frente = null;
            } else {
                frente = frente.sig;
                frente.ant = null;
            }
        }
    }
}

