
public class Tets1 {
	static int[] inputArray = {0,-2, 4, 5, 8,1,6,6};  //   
	static String outputString ="";
	public static void main(String[] args) {
	    int k = 6;
	    outputString = sum(inputArray, k);
	    System.out.println (outputString);
	}
	public static String sum(int[] inputArray, int k){
	    int arrayLength = inputArray.length;
	    for (int i = 0; i < arrayLength; i++){
	        for (int j = i+1; j < arrayLength; j++){
	            if (inputArray[i] + inputArray[j] == k) 
	            {
	            	if (! outputString.contains( "[" + inputArray[i] + "," + inputArray[j] + "]" )) {
	            		outputString = outputString + ("[" + inputArray[i] + "," + inputArray[j] + "]");
	            	}
	            }
            		
	        }
	       
	    }
	    return outputString;
	}

}
