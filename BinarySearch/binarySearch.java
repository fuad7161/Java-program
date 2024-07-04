package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] a = {1,3,4,7,10,11,14,17,21,23};
        System.out.println(binarysearch(a, 24));
    }

    private static int binarysearch(int[] nums , int val){
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int mid = (l+r)/2;
            if(nums[mid] == val){
                return mid+1;
            }
            if(nums[mid] > val){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
}
