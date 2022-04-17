import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int gcd=1;
        for(int i = 1; i <= x && i <= y; i++)  
            {  
            //returns true if both conditions are satisfied   
            if(x%i==0 && y%i==0)  
            //storing the variable i in the variable gcd  
            gcd = i;  
            }  
        //prints the gcd  
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
        

    }
    
}
