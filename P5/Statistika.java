import java.util.Scanner;
class Statistika{
    Scanner scan =new Scanner(System.in);

    void modus(){
        System.out.print("masukan banyak nilai yang diinput = ");
        int x= scan.nextInt();

        int[]a=new int[x];
             int c=a[0];
             int b=0;
            int hasil=0,besar=0;
            for(int i=0;i<a.length;i++){
                System.out.print("masukan nilai ke-"+(i+1)+"=");
                a[i]=scan.nextInt();
            }
            //proses modus
            System.out.println("\n");
                  for (int i=0; i<a.length ;i++){
                    if(a[i]==c){
                    System.out.print(a[i]+" ");
                    System.out.println(++b);
                          if(b>besar){
                          besar=b;
                          hasil=c;
                           }
                     }
                      else{
                        c=a[i];
                        b=1;
                        System.out.print(a[i]+" ");
                        System.out.println(b);
                        }
                    }
        System.out.println("Modus = "+hasil);
    }

    void median(){
        System.out.print("masukan banyak nilai yang diinput = ");
        int x= scan.nextInt();
        int[]nilai=new int[x];
            //median
                for(int i=0;i<nilai.length;i++){
                System.out.print("masukan nilai ke-"+(i+1)+"=");
                nilai[i]=scan.nextInt();
            }
                //proses median
                float median=0.0f;
                int bil=nilai.length%2;
                if(bil==0){
                    int posisi=x/2;
                    System.out.println("bilangan genap");
                    median=(nilai[posisi-1]+nilai[posisi])/2;
                    System.out.printf("nilai median adalah %.2f",median);
                }else{
                    int posisi=x/2;
                    System.out.println("bilangan ganjil");
                    median=nilai[posisi];
                    System.out.print("nilai median adalah "+median+ "\n");
                }
    }

    void mean(){
        System.out.print("masukan banyak nilai yang diinput = ");
        int x= scan.nextInt();
        float[]za=new float[x];
            float jumlah=0;

            for(int i=0;i<za.length;i++){
                System.out.print("masukan nilai ke-"+(i+1)+"=");
                za[i]=scan.nextFloat();
            }
            System.out.println("\ntampilan nilai:");
                    for(int k=0;k<za.length;k++){
                    System.out.print(za[k]+" ;");
                    jumlah+=za[k];
                    }


        //proses rata2
        float rata2=jumlah/x;


        System.out.println("\nnilai rata2 = "+rata2);
    }

    
}