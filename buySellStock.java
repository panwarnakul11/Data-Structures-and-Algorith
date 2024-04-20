import java.util.*;


public class buySellStock {
    public static int profit(int arr[]){
        int buy = arr[0];
        int diff=0;
        for (int i = 1; i < arr.length; i++) {
            if (buy<arr[i]) {
                diff= Math.max(arr[i]-buy, diff);
            }
            else diff= arr[i];
        }
        return diff;
    } 
    public static void main(String[] args) {

       int Prices[]= {7,1,5,3,6,4};
      int pro= profit(Prices);
      System.out.println(pro);
        

    }
}
