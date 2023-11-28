import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int inp=sc.nextInt();
        int 진법=sc.nextInt();

        StringBuilder sb=new StringBuilder();


        if(진법==16){
            while(true){
                if(inp==0) break;

                int 나머지=inp%진법;
                if(나머지>=10){
                    sb.append((char)(나머지-10+'a'));
                    // System.out.print();
                }
                else{
                    sb.append(나머지);
                    // System.out.print(나머지);
                }

                inp/=진법;
            }
        }

        else{
            while(true){
                if(inp==0) break;

                int 나머지=inp%진법;
               
                    // System.out.print(나머지);
                   sb.append(나머지);

                inp/=진법;
            }

        }

        sb.reverse();
        System.out.println(sb);
    }
}