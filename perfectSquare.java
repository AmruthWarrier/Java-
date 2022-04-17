import java.util.Scanner;
public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double r = Math.sqrt(i);
        if(r-Math.floor(r) ==0) {
            System.out.println("It is a perfect square");

        }
        else{
            System.out.println("Not a perfect square");
        }
}
}
