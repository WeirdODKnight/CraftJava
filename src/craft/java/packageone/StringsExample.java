package craft.java.packageone;

public class StringsExample {

	public static String fullName = "Craft Knowledges Java";
	public static String anotherName = "Craft Software Company";
	static char[] character={'c','r','a','f','t','k','n','o','w','l','e','d','g','e','s'};  
	public static String anotherOne=new String(character);  
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(fullName.length()); //prints the length of fullname string
     System.out.println(fullName.charAt(3));//prints the value at index 3
     System.out.println(fullName.equals(anotherName));//prints false
     System.out.println(fullName + " " + anotherName); //Concatenates the two strings
     char ch;  
     for(int i = 0;i<fullName.length();i++){
          ch = fullName.charAt(i);
          System.out.println(ch);
          if(Character.isDigit(ch)){
             continue;
             }
           else{
             System.out.println("String contains NON digits");
            }
   }
   System.out.println(fullName.indexOf("Knowledges")); //returns the index of the string
   System.out.println(fullName.substring(3,12));//displays the substring from index 3 to 12
   System.out.println(fullName.substring(4));//displays the substring from the 3rd index upto the final index
   String [] splitedString = fullName.split(" ");
   for(int i=0;i<splitedString.length;i++){
	    System.out.println(splitedString[i]); //displays the splitted string that splitted by the space
	    }
   System.out.println(fullName.compareTo(anotherName));//returns negative number
   
System.out.println(fullName.replace('C', 'D')); //Replaces c with d
System.out.println(fullName.replaceAll("no","yes"));//Replaces no with yes
System.out.println(fullName.trim());//trimmed the first and the ending spaces
System.out.println(fullName.toUpperCase());//change the characters in the string to upper case letter
System.out.println(fullName.toLowerCase());//change the characters in the string to lower caseSystem.out.println
System.out.println(fullName.concat(anotherName));//Concatenates the two strings
System.out.println(fullName.isEmpty());//returns false
System.out.println(fullName.endsWith("va"));//returns false
System.out.println(anotherName.contains("Software"));//returns false


StringBuffer anotherString=new StringBuffer("Hello ");  
System.out.println(anotherString.capacity());//returns the capacity
System.out.println(anotherString.append("World"));//append world in the string
System.out.println(anotherString.insert(1, "Welcome"));//insert welcome in the first index
System.out.println(anotherString.replace(1,3,"Java") );//replace from the first index to 3 with java
System.out.println(anotherString.delete(1, 4));//delete the substring from index 1 to 4
System.out.println(anotherString.reverse());//reverse the string






	}

}
