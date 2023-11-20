import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Eded daxil edin:");
        Scanner skan = new Scanner(System.in);
        int eded = skan.nextInt();
        int s = 1;
        while (eded > 0) {
            s = s * eded;
            eded = eded - 1;
        }
        System.out.print("Faktoriali : ");
        System.out.println(s);
    }
}