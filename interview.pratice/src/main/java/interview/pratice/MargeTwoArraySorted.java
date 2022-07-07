package interview.pratice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MargeTwoArraySorted {
	
	 public static void main(String[] args) {
	        
	        int [] a= { 2,5,3,9,6,4};
	        
	        int []  b= {5,3,8,1,9};
	        
	        int res[]= new int[a.length + b.length];
	        System.arraycopy(a, 0, res, 0, a.length);
	        
	        System.arraycopy(a, 0, res, a.length, b.length);
	        
	        Arrays.sort(res);
	        System.out.println(Arrays.toString(res));
	        
	        
	        int i=0, j=0, k=0;
	        while(i<a.length) {
	            res[k]=a[i];
	            i++;
	            k++;
	        }
	        while(j<b.length) {
	            res[k]=b[j];
	            j++;
	            k++;
	            
	        }
	        
	        Arrays.sort(res);
	        System.out.println(Arrays.toString(res));
	        
	        

	    }

	}