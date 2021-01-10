public class Main3 
{ 
    @Deprecated
    public void Display() 
    { 
        System.out.println("Deprecatedtest display()"); 
    } 
  
    public static void main(String args[]) 
    { 
        Main3 d1 = new Main3(); 
        d1.Display(); 
    } 
} 