package Arrays;

public class ReverseErray {

    static void main(String[] args) {
        int[] arr = {6,8,1,2,3,4,9,0};
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        for (int ele: arr){
            System.out.print(ele+ " ");
        }
    }
}
