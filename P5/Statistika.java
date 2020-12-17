class Statistika{
    // int Angka1,Angka2;

    // public Aritmatika(int Angka1,int Angka2){
    //     this.Angka1 = Angka1;
    //     this.Angka2 = Angka2;
    // }
    
    int mean(int x){
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

        return rata2;
    }

    int modus(int x){
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
        return hasil;
    }

    void median(int x){
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
                    }
    }

     
}