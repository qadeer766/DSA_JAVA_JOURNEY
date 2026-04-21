package Arrays;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {12,56,90,76,7,84};
        int target= 12;
        boolean flag= false;
        for (int i=0; i<arr.length; i++){

            if(arr[i] ==target){
                System.out.println("Target exists in array at "+i);
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println("Target exists in array.");
     //   else System.out.println("Target missing in Array");
    }
}
