public class App {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList list = new DoubleLinkedList();
         list.printforward();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.printforward();
        System.out.print("---------------------");
        list.printbackward();
    }
}
