public class OperatorDemo01 {
    public static void main(String[] args){
        int i = 10, j = 20,k = 30;
        if(j>i&j>k){
            System.out.print("or");
        }
        else{
            System.out.print("and");   
        }

        
        System.out.print("\n");     
        if(j>i|j>k){
            System.out.print("or");
        }
        else{
            System.out.print("and");   
        }
    }
}