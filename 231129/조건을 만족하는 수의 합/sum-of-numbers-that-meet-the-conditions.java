import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int inp=sc.nextInt();
        if(inp%2==1) inp++;

        int idx=inp/2-1;
        System.out.println(250*250+250-idx*idx-idx);





    }
}