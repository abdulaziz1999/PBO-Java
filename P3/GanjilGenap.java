import java.util.Scanner;


class GanjilGenap{

    public static void main(String[] args){
        // membuat variabel dan Scanner
        int nilai,i;
        String cek;
        Scanner scan = new Scanner(System.in);

        //Mengambil inputan
        System.out.print("Nilai : ");
        nilai = scan.nextInt();

        //perullangan sesuai nilai inputan
        for(i=1; i <= nilai; i++){
            //cek Ganjil atau genap
            if(i % 2 == 0){
                cek = "genap"; 
            }else{
                cek = "ganjil"; 
            }
            System.out.println(i + " ini angkanya " +cek);
            
        }

    }

} 