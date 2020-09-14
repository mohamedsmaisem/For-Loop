public class Merge {
    public static void main(String[] args) {
        int [] arrayA = {1,3,5};
        int [] arrayB = {2,4,6};

        merge(arrayA,arrayB);

    }
    public static void merge(int []array1,int[] array2){
        for(int i = 0;i<array1.length;i++){
            System.out.print(array1[i] +""+array2[i]);

        }


    }


    //Write a method that will merge two int arrays. Merge rule is first element from the first array, then first from the second array, … Print the result array.
}
