public class OperatorDemo04 {
    public static void main(final String args[]) {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.print("max : "+ max);
        System.out.print("\n");

        int weight1 = 180;
        int weight2 = 200;
        boolean singal = (weight1 == weight2) ? true:false;
        System.out.print("weight1 == weight2 :"+singal);

        System.out.print("\n");

        int height1 = 150, height2 = 210, height3 = 165,tempHeight,maxHeight;
        tempHeight = (height1 > height2)? height1:height2;
        maxHeight = (tempHeight > height3)?tempHeight:height3;
        System.out.print(tempHeight);

    }
    
}