public class ArgsDemo02 {
    public static void main(String args[]){
        int []arr = {1,2,3};
        for(int i = 0;i<3;i++){
        System.out.println(arr[i]);}
        change(arr);
        System.out.println("调用change方法之后");
        for(int i = 0;i<3;i++){
            System.out.println(arr[i]);}
    }
    public static void change(int []arr){
        arr[0] = 100;
    } 
}