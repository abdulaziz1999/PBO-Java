class Exception_Demo
{ 
    public static void main(String args[]) 
    { 
        try { 
            int a = 30, b = 0; 
            int c = a/b;  // tidak bisa membagi dengan nol 
            System.out.println ("Hasil = " + c); 
        } 
        catch(ArithmeticException e) { 
            System.out.println ("Tidak dapat membagi angka dengan 0"); 
        } 
    } 
}  