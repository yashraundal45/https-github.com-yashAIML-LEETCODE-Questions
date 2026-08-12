class Solution { 
    public int shipWithinDays(int[] weights, int days) { 
        int n = weights.length; 
        int max = weights[0]; 
        int sum= 0; 
        for(int i=0; i<n; i++){ 
            if(weights[i]> max) {
                max =weights[i]; 
            }
            sum = sum+ weights[i]; 
        }        
        int low = max; 
        int high= sum;        
        while(low<= high){ 
            int mid =low +(high-low)/2;            
            if(isValid(mid, weights,days)){ 
                high =mid - 1; 
            }else { 
                low =mid +1; 
            } 
        } 
        return low;
    } 

    
    boolean isValid(int mid, int[] arr, int days){ 
        int day = 1; 
        int sum = 0; 
        
        for(int i=0; i<arr.length; i++){ 
            if(arr[i] + sum > mid){ 
                day++;
                sum = 0; 
            } 
            sum += arr[i]; 
        } 
        return day <= days; 
    }    
}

