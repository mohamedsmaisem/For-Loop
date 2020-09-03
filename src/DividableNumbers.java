import java.util.Scanner;

public class DividableNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide the first number");
        int firtstnumber=scanner.nextInt();
        System.out.println("provide the second number");
        int second= scanner.nextInt();
        System.out.println("first : "+ firtstnumber);
        System.out.println("second "+second);
        for(int i=1;i<=firtstnumber;i++){
            if(i % second== 0){
                System.out.println(i +" is dividible by " +second);
            }

        }




    }
}
