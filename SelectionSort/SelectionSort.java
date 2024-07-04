package SelectionSort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[10000];
        Random rand = new Random();
        for(int i=0;i<10;i++){
            a[i] = rand.nextInt(1000);
        }
        // System.out.println(Arrays.toString(a));
        long startTime = System.currentTimeMillis();
        selectionSort(a);
        long endTime = System.currentTimeMillis();
        // System.out.println(Arrays.toString(a));
        System.out.println("Took "+(endTime-startTime)+"ms to exicute");
    }
    public static void selectionSort(int [] nums){
        int lenght = nums.length;

        for(int i=0;i<lenght;i++){
            int mn = nums[i];
            int pos = i;
            for(int j=i+1;j<lenght;j++){
                if(mn > nums[j]){
                    mn = nums[j];
                    pos = j;
                }
            }
            swap(nums, i , pos);
        }
    }

    public static void swap(int[] nums , int x,int y){
        int tem = nums[x];
        nums[x] = nums[y];
        nums[y] = tem;
    }

}
