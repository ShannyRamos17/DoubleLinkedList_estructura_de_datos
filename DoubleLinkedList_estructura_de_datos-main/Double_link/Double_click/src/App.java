public class App {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList list = new DoubleLinkedList();
        System.out.println("----------------------------"); 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);

        list.printforward();
        list.remove(3);
        list.printforward();

        System.out.println("----------------------------"); 
        list.printbackward();
    
    }
}
