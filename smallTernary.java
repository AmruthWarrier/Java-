import java.util.Scanner;


public class smallTernary {
    public static void main(String[] args) { 
        int a,b,c,smallest,temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        temp=a<b?a:b;
        smallest=c<temp?c:temp;  
        //prints the smallest number  
        System.out.println("The smallest number is: "+smallest);  
    }

    
}
