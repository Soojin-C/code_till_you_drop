/***********************************************

Interface Deque
     * a queue from which you can enqueue and dequeue from both ends

***********************************************/

public interface IDeque<T> {

     // Get the node at the front
     public T getFront();
     // Get the node at the end
     public T getLast();

     // Enqueue a node to the front of the queue
     public void addFirst(T inp);
     // Enqueue a node to the end of the queue
     public void addLast(T inp);

     // Remove and return the front node
     public T removeFirst();
     // Remove and return the end node
     public T removeLast();

     // Return the size of the queue
     public int size();
}