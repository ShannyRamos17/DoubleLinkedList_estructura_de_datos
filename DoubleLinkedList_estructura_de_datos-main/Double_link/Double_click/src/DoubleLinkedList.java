public class DoubleLinkedList {
    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;        
        }
        current.next = newNode; //guardar el nuevo nodo
        newNode.prev = current; //guardar la referencia al nodo anterior

    }

    
        public void printforward(){
            if(head == null){
                System.out.println("La lista esta vacia");
                return;
            }
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
                
            }
            System.out.println("NULL");
        }

        public void printbackward(){
            if(head == null){
                System.out.println("La lista esta vacia");
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;        
            }
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
            System.out.println("NULL");
        }

        public void remove(int data) {
            if (head == null) {
                System.out.println("La lista está vacía");
             return;
            }

            Node current = head;
            while (current != null && current.data != data) {
             current = current.next;
            }

            if (current == null) {
             System.out.println("No se encontro el valor");
             return;
            }

            if (current == head) {
                head = head.next; 
                if (head != null) {
                    head.prev = null; 
                }
                return;
            }

            if (current.prev != null) {
             current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }

}
