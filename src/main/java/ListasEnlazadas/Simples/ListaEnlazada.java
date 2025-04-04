package ListasEnlazadas.Simples;

public class ListaEnlazada<T> {
    private Node<T> head;
    private int size;

    //Constructor
    public  ListaEnlazada(){
        this.head = null;
        this.size = 0;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if (head == null){
            head = newNode;
        }else{
            Node<T> current = this.head;
            while (current != null){
                current = current.next;
            }
            current = newNode;
        }
        size++;
    }

    public void print(){
        Node<T> current = head;

        if(head == null){
            System.out.println("La lista esta vacia.");
        }else{
            while (current != null){
                System.out.println(current.toString());
                current = current.next;
            }
        }
    }


    public Node<T> search(T data){
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return current;
            }
            current = current.next;
        }

        System.out.println("El elemento buscado no se encuentra en la lista");
        return null;
    }

    public void sortList(){

    }



}
