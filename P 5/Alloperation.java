import java.util.Scanner;
class alloperation {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);

        System.out.print("masukan banyak nilai yang diinput= ");
        int x=scan1.nextInt();

        System.out.println("1. menghitung nilai modus");
        System.out.println("2. menghitung nilai min dan max");
        System.out.println("3. menghitung nilai median");
        System.out.println("4. menghitung nilai rata2");
        System.out.print("masukan piihan(1-4)=");int pilih=scan1.nextInt();
        switch(pilih){

        case 1:
            int[]a=new int[x];
             int c=a[0];
             int b=0;
            int hasil=0,besar=0;
            for(int i=0;i<a.length;i++){
                System.out.print("masukan nilai ke-"+(i+1)+"=");
                a[i]=scan1.nextInt();
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
        break;
        case 2:
            int[]input=new int[x];
            //mencari nilai max dan min

            for(int i=0;i<input.length;i++){
                System.out.print("masukan nilai ke-"+(i+1)+"=");
                input[i]=scan1.nextInt();
            }
            int max=0;
            int min=input.length;
            for(int k=0;k<input.length;k++){
                if(max<input[k]){
                    max=input[k];
                    }
                    if(min>input[k]){
                    min=input[k];
                    }
            }
            System.out.println("nilai max = "+max);
            System.out.println("nilai min = "+min);
            break;
        case 3:
            int[]nilai=new int[x];
            //median
                for(int i=0;i<nilai.length;i++){
                System.out.print("masukan nilai ke-"+(i+1)+"=");
                nilai[i]=scan1.nextInt();
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
                    System.out.print("nilai median adalah "+median);
        }break;
        case 4:

            float[]za=new float[x];
            float jumlah=0;

            for(int i=0;i<za.length;i++){
                System.out.print("masukan nilai ke-"+(i+1)+"=");
                za[i]=scan1.nextFloat();
            }
            System.out.println("\ntampilan nilai:");
                    for(int k=0;k<za.length;k++){
                    System.out.print(za[k]+" ;");
                    jumlah+=za[k];
                    }


        //proses rata2
        float rata2=jumlah/x;


        System.out.println("\nnilai rata2 = "+rata2);break;

        default:System.out.println("salah memasukan pilihan");break;
    }
  }
}