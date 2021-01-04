import java.util.PriorityQueue;
import java.util.Iterator;

class QueePertama{
    public static void main(String args[]){

        PriorityQueue <String> queue = new PriorityQueue <String>();
        queue.add("fatih");
        queue.add("Mardi");
        queue.add("Karan");
        queue.add("Yuna");
        queue.add("Fatma");
        System.out.println("head : " + queue.element());
        System.out.println("head : " + queue.peek());
        System.out.println("Iterating the queue elements : ");

        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();
        System.out.println("After removing two elements : ");

        Iterator <String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        
    }
}