import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {

    //CREATE AN ARRAY FROM THE TERMINAL
    //Add elements to the array from the terminal until the user enters nothing
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();



        System.out.println("pleas enter a element  ");
        String input = scanner.nextLine();

        while (!input.equals("exit")){
            arrayList.add(Integer.parseInt(input));
           input  =scanner.nextLine();
        }

        System.out.println(arrayList);

    }
}
