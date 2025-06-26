public class Arbol {
    private Nodo raiz;


    public Arbol() {
        raiz = null;
    }
    private void insertar(Nodo actual,Computador dato){
        if (dato.getCodigo()<actual.getComputador().getCodigo()){
            //izquierdo
            if (actual.getIzquierdo()==null){  //libre
                actual.setIzquierdo(new Nodo(dato));
            }else {
                //ocupado lado izquierdo
                insertar(actual.getIzquierdo(),dato);
            }
        }else {
            //derecho
            if (actual.getDerecho()==null){  //libre
                actual.setDerecho(new Nodo(dato));
            }else {
                insertar(actual.getDerecho(),dato);
            }
        }
    }

    public void insertar(Computador computador) {
        if (raiz==null){
            raiz=new Nodo(computador);
        }else {
            insertar(raiz,computador);  //Recursivo
        }
    }

    private String inOrden(Nodo actual){
        if (actual!=null){
            return inOrden(actual.getIzquierdo())+actual.getComputador()+
                    inOrden(actual.getDerecho());
        }else {
            return "";
        }
    }

    public String inOrden(){
        if (raiz==null){
            return "No hay elementos en el arbol";
        }else {
            return inOrden(raiz);
        }
    }
}