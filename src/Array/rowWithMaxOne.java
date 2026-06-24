package Array;

public class rowWithMaxOne {
    public static void main(String[] args) {
       int arr[][] = {{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
       int ans=rowWithMax1s(arr);
       System.out.println(ans);
    }
    public static int rowWithMax1s(int[][] arr) {
        int maxOne=Integer.MIN_VALUE;
        int row=-1;
        int i=0;
        for(int[] a:arr){
            int countOne=Integer.MIN_VALUE;
            for(int num:a){
                if(num==1){
                    countOne++;
                }
            }
            if(countOne>maxOne){
                maxOne=countOne;
                row=i;
            }
            i++;
        }
        return row;
        }
}
