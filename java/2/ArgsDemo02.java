public class ArgsDemo02 {
    public static void main(String args[]){
        int []arr = {1,2,3};
        for(int i = 0;i<3;i++){
        System.out.println(arr[i]);}
        change(arr);
        System.out.println("����change����֮��");
        for(int i = 0;i<3;i++){
            System.out.println(arr[i]);}
    }
    public static void change(int []arr){
        arr[0] = 100;
    } 
}