import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide a number:");
        int input = scanner.nextInt();
        for (int i= 1;i<= 10;i++){
            int result =input*i;
            System.out.println(input+"*"+ i+"="+result);
        }


    }

}
