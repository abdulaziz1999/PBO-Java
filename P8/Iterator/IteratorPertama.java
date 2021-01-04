import java.util.ArrayList;
import java.util.Iterator;
@SuppressWarnings("unchecked")

class IteratorPertama{
    public static void main(String args[]){

        ArrayList <Integer> umur = new ArrayList <Integer> ();

        umur.add(17);
        umur.add(8);
        umur.add(16);

        System.out.println(umur);
        

        Iterator <Integer> it = umur.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i<10){
                it.remove();
            }
        }

        System.out.println(umur);
    
    }
}