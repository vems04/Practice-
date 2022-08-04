import java.util.*;
public class oops {
     void vemss (String h,int x,int op){
        System.out.println(h);
        int d = x * op;
        System.out.print(d);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,op;
        String h;
        h = sc.nextLine();
        x= sc.nextInt();
        op = sc.nextInt();
        oops t = new oops();
        t.vemss(h,x,op);
           }
}
