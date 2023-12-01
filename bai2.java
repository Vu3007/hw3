import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ");
        String a=sc.nextLine();
        String b=a+"-";

        String repeat=b.repeat(10);

        System.out.print(repeat.substring(0,repeat.length()-1));

    }
}
