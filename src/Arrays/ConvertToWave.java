package Arrays;

public class ConvertToWave {

    public static void main(String[] args) {
        ConvertToWave obj = new ConvertToWave();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        obj.convert(arr);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    void convert(int[] arr){
        for(int i = 0; i < arr.length; i += 2){
            if(i == arr.length - 1) break;

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
