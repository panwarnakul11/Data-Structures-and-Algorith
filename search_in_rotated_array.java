import java.util.*;

public class search_in_rotated_array {
    public static int index(int[] nums, int target){
        if(nums.length<=1){
            if(nums[0]==target){
                return 0;
            }else{
                return -1;
            }
        }
        int pivotElement=getPivotElement(nums);
        int a=binarySearch(nums,target,0,pivotElement);
        int b=binarySearch(nums,target,pivotElement+1,nums.length-1);
        return Math.max(a,b);
    }

    public static int binarySearch(int[] arr,int target,int start,int end){
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static  int getPivotElement(int[] arr){
        int start=0,end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<arr.length-1 &&  arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>=arr[start]){
                start=mid+1;
            }else if(arr[mid]<arr[start]){
                end=mid-1;
            }
        }
        return -1;
    }


    
    public static void main(String[] args) {
        int target = 4;
        int num[] = {4, 5, 6, 7, 0, 1, 2};
        int k = index(num, target);
        System.out.println(k);
        


        
        
    }
}
