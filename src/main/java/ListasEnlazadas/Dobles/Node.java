package ListasEnlazadas.Dobles;

public class Node<T> {

    //Aqui va la relacion al tipo de objeto del cual se creara el nodo, en este caso lo haremos generico.
    private T data;
    //Se referia asi mismo pero al siguiente y el anterior.
    private Node<T> next;
    private Node<T> prev;

    //Constructor
    public Node(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }



}
