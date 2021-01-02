import java.util.ArrayList;
@SuppressWarnings("unchecked")

class ArrayListPertama{
    public static void main(String args[]){

        ArrayList item = new ArrayList();

        item.add("Pedang");
        item.add(1192);
        item.add(80.95);
        item.add("Api");

        // int hasil = (Integer) item.get(1);

        System.out.println("Senjata = "+ item.get(0) +
        "\nmempunyai kekuatan sebesar = "+ item.get(1) + 
        "\nPemakaian baru sekitar = "+ item.get(2) + "%" +
        "\nElement pedang adalah = "+ item.get(3));

        item.set(3, "Air");

        item.remove(2);
        System.out.println("\n" + item);
    
    }
}