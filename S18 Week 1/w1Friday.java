public class w1Friday{


  public static void main(String [] args){
      /**
         * 
         * Make a method that accepts a string 
         * that consists of multiple of words and 
         * only abbreviates the words that have a 
         * length of 4 or greater.
         * 
         * 
         * But if the string has only one word of length 3 or less
         * just return the string.
         * 
         * example:
         * 
         * "Hello World and to the mass universe"
        //    5     5    3   2  3    4     8     // note that words of length
        *                                        // 3 or less are not abbreviated
         * 
         * output: 
         * 
         *  "H3o W3d and to the m2s u6e"
         * 
        
        */
  
  
  }
  public static String AlvaroMethod(String str){
    
    
    
  }
  private static StringBuilder abriviate(String c) {//Rushabh's Method
		// TODO Auto-generated method stub
		String[] array=c.split(" ");
		StringBuilder newer=new StringBuilder();
		for(int i=0;i<array.length;i++) {
			if(array[i].length()<=3) {
				newer.append(array[i]+" ");
				
			}else {
				
				int j=array[i].length()-2;
				char c1=array[i].charAt(0);
				char d=array[i].charAt(array[i].length()-1);
				newer.append(c1+Integer.toString(j)+d+" ");
				
			}
		}
		return newer;
	}

	
	public static String method(String str) //Phuc's method.
	{
		String toReturn = "";
		//int s = str.length();
		String []array = str.split(" ");
		//str.substring(0, 1) + (s-2) + str.charAt(s-1);
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].length() > 3)
			{
				int s = array[i].length();
				toReturn +=  array[i].substring(0,1) + (s-2) + array[i].charAt(s-1) + " ";
				//System.out.println(x);
			}
			else
			{
				toReturn += array[i] + " ";
				//System.out.println(array[i]);
			}
		}
		return toReturn;
	}
}
