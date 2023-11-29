import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=1;
        for(int i=0;i<3;i++){
            ans*=sc.nextInt();
        }
        
        int[] num=new int[10];
        char[] temp=String.valueOf(ans).toCharArray();
        for(int i=0;i<temp.length;i++)
            num[temp[i]-'0']++;

        for(int a: num)
        System.out.println(a);    
    }
}