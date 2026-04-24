package Arrays;

public class SegregateZerosAndOnes {

    public static void main(String[] args) {
        SegregateZerosAndOnes obj = new SegregateZerosAndOnes();

        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};

        obj.segregate(arr);

        // print array
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    void segregate(int[] arr) {

        int numberOfZeros = 0;
        int numberOfOnes = 0;

        // Step 1: Count
        for(int ele: arr){
            if(ele == 0) numberOfZeros++;
            else numberOfOnes++;
        }

        // Step 2: Fill array
        int i = 0;

        // fill zeros
        while(numberOfZeros > 0){
            arr[i] = 0;
            i++;
            numberOfZeros--;
        }

        // fill ones
        while(numberOfOnes > 0){
            arr[i] = 1;
            i++;
            numberOfOnes--;
        }
    }
}