public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mylist = new MyLinkedList<>("Van");
        mylist.add("Son");
        mylist.add(1,"Phat");
        mylist.add("Van");
        mylist.add("Nam");
        mylist.add("Viet");
        mylist.remove(2);
        mylist.printList();
        mylist.remove("Van");
        mylist.printList();
        mylist.addFirst("Son");
        mylist.printList();
    }
}