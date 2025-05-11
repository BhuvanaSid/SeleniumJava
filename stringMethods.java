package seleniumPackage1;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program to find the different String Methods
		
			String Mystr= ("itlearn 360");
			System.out.println(Mystr.length()); //prints the total length of the string
			
			System.out.println(Mystr.charAt(4)); // which character is at the 4th place, index starts with 0
			
			System.out.println(Mystr.charAt(Mystr.length()-1)); //to read the last character
			
			System.out.println(Mystr.indexOf("l",0)); //to find the index of 'l'
			
			System.out.println(Mystr.indexOf("n",5));
			
			//lower case
			
			System.out.println(Mystr.toLowerCase());
			
			System.out.println(Mystr.toUpperCase());
			
			System.out.println(Mystr.isEmpty()); //true or false;
			
			//String  Mystr1=" ";
			//System.out.println(Mystr1.isEmpty());
			
			String Mystr1= "itlearn";
			
			String Mystr2="360";
			
			System.out.println(Mystr1.concat(Mystr2));
			
				
			
		
	}

}
