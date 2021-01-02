import java.util.Stack;
@SuppressWarnings("unchecked")

class StackPertama{
    public static void main(String args[]){

        Stack <String> stk = new Stack <String>();

        stk.push("farah");
        stk.push("billah");
        stk.push("nissa");

        // int hasil = (Integer) item.get(1);

        System.out.println("Stack = " + stk);
        System.out.println("Stack paling atas adalah = " + stk.peek());


        System.out.println("Stack paling atas adalah = " + stk.search("farah"));

        stk.pop();
        System.out.println("Stack = " + stk);
        
    
    }
}