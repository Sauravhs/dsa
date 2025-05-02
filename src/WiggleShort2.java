import java.util.Arrays;

public class WiggleShort2 {
    public static void main(String[] args) {
        int[] nums = {1,5,1,1,6,4};
         wiggleSort2(nums);
        for(int num: nums){
            System.out.println(num + "");
        }
    }
    public static void wiggleSort2(int[] nums){
        Arrays.sort(nums);  //sort the array
        int n = nums.length;
        int[] res = new int[n];
        int i = 1;
        int j = n-1;
        // Fill odd indices first with larger numbers
        while(i<n){
            res[i] = nums[j];
            i+= 2;
            j--;
        }
        // Fill even indices with remaining smaller numbers
        i = 0;
        while(i<n){
            res[i] = nums[j];
            i+=2;
            j--;
        }
        //copy back the original array
        for(i =0;i<n;i++){
            nums[i] = res[i];
        }
    }
}
