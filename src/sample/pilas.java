package sample;

/**
 * Created by Wendy on 08/11/2017.
 */
public class pilas {
    private nodo top;

    public pilas(){
        top = null;
    }

    public  boolean vacia(){
        return  (top == null);
    }

    public void push(int valor) {//Insertar
        nodo nuevoNodo;
        if (vacia())
            top = new nodo(valor);
        else {
            nuevoNodo = new nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
    }
    public void cima(){//Buscar
        if (!vacia())
            System.out.println("Cima:"+top.getValor());
        System.out.println("La pila esta vacia");

    }
    public void pop (){//Extraer
        if(!vacia()){
            System.out.println("Dato extraido:"+top.getValor());
            top = top.getProx();
        }
        else
            System.out.println("La pila esta vacia");
    }

        public void peek(){//Mostar
        nodo temp = top;
        if(temp!=null) {
            System.out.println("La pila es: ");
            while (temp != null) {
                System.out.println(temp.getValor());
                temp = temp.getProx();
            }
        }
        else
            System.out.println("PILA VACIA");
        }
}







