import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int sum1=0, sum2=0;


        String inp=sc.next();
        for(int i=0;i<inp.length();i++){
            char a=inp.charAt(i);
            if(a<'0' || '9'<a) continue;
            sum1=sum1*10+(int)(a-'0');

        }

        inp=sc.next();
      for(int i=0;i<inp.length();i++){
            char a=inp.charAt(i);
            if(a<'0' || '9'<a) continue;
            sum2=sum2*10+(int)(a-'0');

        }
        System.out.println(sum1+sum2);



    }
}