package Arrays;

public class productOfArrays {
    static void main(String[] args) {
         // product of array
        int[] arr = {4,5,6,6};
        int product = 1;
        for (int i=0; i<arr.length; i++){
            product *= arr[i];

        }
        System.out.println(product);
    }
}
