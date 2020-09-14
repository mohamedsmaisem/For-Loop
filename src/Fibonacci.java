public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(printFibonacci(4));
    }
        public static int printFibonacci(int n){
            if (n==0){
                return 0;
            }else if (n<=2){
                return 1;
            }else {
                return printFibonacci(n-1) + printFibonacci(n-2);
            }


    }
}
