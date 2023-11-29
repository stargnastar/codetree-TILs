import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double a=Math.sqrt(sc.nextDouble());
        double b=Math.sqrt(sc.nextDouble());

        if(a>b){
            double temp=a;
            a=b;
            b=temp;
        }

        int min=(int)a; //6.16 ->6
        int max=(int)b; //15.59 ->15 .. 15.00->15
        if(max==b)max--;

        System.out.println(max-min);





    }
}