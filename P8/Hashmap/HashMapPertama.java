import java.util.HashMap;

class HashMapPertama{
    public static void main(String args[]){

        HashMap <String,String> item = new HashMap <String,String> ();

        item.put("Senjata","Pedang");
        item.put("Kekuatan","1192");
        item.put("Element","Api");

        // int hasil = (Integer) item.get(1);

        System.out.println("Senjata = "+ item.get("Senjata") +
                        "\nmempunyai kekuatan sebesar = "+ item.get("Kekuatan") + 
                        "\nElement pedang adalah = "+ item.get("Element"));

        item.put("Element", "Air");

        item.remove("Kekuatan");
        System.out.println("\n" + "Item nya adalah = " + item);
        System.out.println("\n" + "Ukuran Item nya = " + item);

        for (String i : item.keySet()){
            System.out.println("Item nya adalah = " + item.get(i));
        }
    
    }
}