import java.util.LinkedList;
@SuppressWarnings("unchecked")

class LinkedListPertama {
    public static void main(String args[]){

        LinkedList item = new LinkedList();

        item.add("Pedang");
        item.add(1192);

        item.addFirst("Air");
        item.addLast(120);

        System.out.println("Item pertama = " + item.getFirst());
        System.out.println("Item terakhir = " + item.getLast());

        item.removeFirst();
        System.out.println("Item pertama = " + item.getFirst());
        
        item.removeLast();
        System.out.println("Item terakhir = " + item.getLast());
    }
}