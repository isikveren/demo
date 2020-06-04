
public class shuixianhuaDemo {
    public static void main(String args[]){
        int x,y,z;
        for(int i = 99;i<1000;i++){
            x = i/100;
            z = i%10;
            y = i/10;
            y = y%10;
            if(((x*x*x)+(y*y*y)+(z*z*z)) == i)
            {System.out.println(i);}
        }
    }

    
}