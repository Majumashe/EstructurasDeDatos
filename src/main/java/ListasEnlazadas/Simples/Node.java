package ListasEnlazadas.Simples;

public class Node<T> {

    //Aqui va la relacion al tipo de objeto del cual se creara el nodo, en este caso lo haremos generico.
    T data;
    //Se referia asi mismo pero solo al siguiente.
    Node<T> next;

    //Constructor
    public Node(T data){
        this.data = data;
        this.next = null;

    }

    //Getters and Setters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
