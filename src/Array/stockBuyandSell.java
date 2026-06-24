package Array;
//Only transaction is Allowed
public class stockBuyandSell {
    public static void main(String[] args) {
        int prices[] = {7, 10, 1, 3, 6, 9, 2};
        int maxProfitAns=maxProfit(prices);
        System.out.println(maxProfitAns);
    }
    public static int maxProfit(int[] prices) {
        int mProfit=0;
        int ini=prices[0];
        for(int i=1;i<prices.length;i++){
            if(ini<prices[i]){
                mProfit=Math.max(mProfit,prices[i]-ini);
            }
            else if(ini>prices[i]){
                ini=prices[i];
            }
        }
        return mProfit;
    }

}
