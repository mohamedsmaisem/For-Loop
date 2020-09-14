public class Arrayexsercise {
    public static void main(String[] args) {
        int  [] reversed ={1,2,3,4,5,};
        reverse(reversed);


    }
    public static void reverse(int [] array){
     for(int i= array.length-1;i>0;i--){
         System.out.print(array[i]);
     }

    }
}
