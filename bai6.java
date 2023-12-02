public class bai6 {
    public static void main(String[] args) {

    for (int a=1;a<=100;a++){
        if (a%5==0&&a%3==0){
            System.out.println(a+ " :FizzBuzz");
            continue;
        }
        if (a%3==0){
        System.out.println(a+ " :Fizz");
        continue;
        }
        if (a%5==0){
            System.out.println(a+ " :Buzz");
            continue;
        }
        else {
            System.out.println("khong co ket qua");
        }

      }





    }

    }

