package Arrays;

/**
 * LargestContiguousSum
 */
public class LargestContiguousSum {
      
    int largestContiguousSum(int[] arr){
	    
        int psum =0, nsum =0, current =0;
         
        for(int i=0; i<arr.length; i++){
          
            current = arr[i];

            if(current >=0){
               
               psum += current;

            }else{
           
            if(nsum == 0){
                
            }



            }

        }   



         return psum+nsum;

	}
    
    
}


