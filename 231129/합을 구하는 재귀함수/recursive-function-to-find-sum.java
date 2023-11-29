import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        if(n%2==0)    {
            n=n/2-1;
            System.out.println(50*50+50-n*n-n);
        }
        else{
            n=(n+1)/2-1;
            System.out.println(50*50-n*n);
        }


    }
}