import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b) {
            if(a>c){
                System.out.println(a+" is greatest");
            }
        
        }
        else if(b>c){
            System.out.println(b+" is greatest");
        }
        else {
            System.out.println(c+" is greatest");
        }
    }
    
}
