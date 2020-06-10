
public class ArrayDemo {
    public static void main(String args[]){
        int []arr = new int[3];
        /*
            left：
                int:
                []：说明这是一个数组
                arr：arr是数组的名字
            right:
                new:为数组申请内存空间
                int:说明数组中元素是int类型
                []:说明这是一个数组
                3:数组中元素个数，即数组的长度
        */

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
    }
    
}