import java.util.Scanner;
public class natural {
    public static void main(String[] args){
        int i,sum=0;
        Scanner a = new Scanner(System.in);
        i= a.nextInt();

        for(int k=1;k<i;k++) {
            sum = sum +k;
        }
        System.out.print("The Sum of " + i + " natural numbers is : " + sum );
    }
    
}
