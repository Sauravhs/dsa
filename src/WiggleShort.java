public class WiggleShort {
    public static void main(String[] args) {
        int[] arr = {10,12,15,6,9,8,3,4,11};
        wiggleSort(arr);
        for(int num:arr){
            System.out.println(num + "");
        }
    }
    public static void swap(int[] arr, int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void wiggleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                //even index
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }else{
                //odd index
                if(arr[i] < arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
    }
}
