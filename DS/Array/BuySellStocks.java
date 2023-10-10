package DS.Array;

public class BuySellStocks {

    public static int buySell(int arr[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for (int i = 0; i < arr.length; i++) {
            if (buyPrice<arr[i]) {//profit
                int profit= arr[i]-buyPrice;    //Today's profit
                maxProfit=Math.max(maxProfit, profit);     // Net Profit          
            } else {
                buyPrice=arr[i];
            }
        }


        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(buySell(arr));
    }
    
}
