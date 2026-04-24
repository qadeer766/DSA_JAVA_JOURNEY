package Arrays;

public class MissingNum {
    static void main(String[] args) {
        MissingNum obj = new MissingNum();

        int[] arr = {1,2,4,5,6};
        int result = obj.missingNumm(arr);

        System.out.println("Missing number is: "+ result);
    }
    int missingNumm(int arr[]){
        int n = arr.length + 1;
        int sum = n*(n+1)/2;

        int arraySum = 0;
        for(int ele : arr){
            arraySum += ele;
        }
        return sum - arraySum;
    }
}


