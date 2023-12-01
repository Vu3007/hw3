import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        Double bankinh=sc.nextDouble();
        Double thetich=4/3*bankinh*bankinh*bankinh*3.14159;
        System.out.println( "the tich la: "+  thetich);
    }
}
