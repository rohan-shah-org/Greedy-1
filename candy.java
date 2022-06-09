//T.C = O(N)
//S.C =O(N)

class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int [] result=new int [n];
        Arrays.fill(result,1);
        //check with left neighbor
        for(int i=1;i<n;i++){
            if(ratings[i-1]<ratings[i]){
                result[i]=result[i-1]+1;
            }
        }
        
        int sum=result[n-1];
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                result[i]=Math.max(result[i],result[i+1]+1);
            }
            sum=sum+result[i];
        }
       return sum;
    }
}
