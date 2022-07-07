package interview.pratice1;

		public class NewString {

	    public static void main(String[] args) 
	    {
	        String s1 = "Cat dog cat tiger rat cat dog";
	        /*
	            Spliting String with whitespace (" ") using split()
	            method and store all value to a String[] array.
	         */

	        String split[] = s1.split(" ");

	        // All counter varible
	        int catCount = 0;
	        int dogCount = 0;
	        int ratCount = 0;
	        int tigerCount = 0;

	        /*
	            Iterating all split[] element and matching
	            all value. if match found it will increase
	            couter variable by 1.
	         */
	        for (int i = 0; i < split.length; i++) 
	        {

	            switch (split[i].toLowerCase()) 
	            {
	                case "cat":
	                    catCount++;
	                    break;
	                case "dog":
	                    dogCount++;
	                    break;
	                case "rat":
	                    ratCount++;
	                    break;
	                case "tiger":
	                    tigerCount++;
	                    break;
	            }

	        }

	        // Printing out all counter variables
	        System.out.println("cat = " + catCount + " times");
	        System.out.println("dog = " + dogCount + " times");
	        System.out.println("rat = " + ratCount + " times");
	        System.out.println("tiger = " + tigerCount + " times");

	    }

	}
	
	
	


