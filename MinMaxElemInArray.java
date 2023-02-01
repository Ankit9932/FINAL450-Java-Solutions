class Solution{ 
    public static int findSum(int A[],int N) {

        //assigning min and max value
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
      
        //find Min value
        for(int i=0;i<A.length;i++){
            if(A[i]<min){
                min=A[i];
            }
        }
        //find Max value
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        //return min;
        //return max;
        return min+max;
    }
}
