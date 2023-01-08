/**
 Determine the words that are in a camel case String.
 
 Example: 
  - How many words has the Camel case String "DreamBig" the result is 2
  - How many words has the Camel case String "StarsCantShineWithoutDarkness" the result is 5
*/

Class 04_CamelCase {
  public static void main(String [] args){
   
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
    String s = bufferedReader.readLine();
    
    System.out.println("The muber of words are : " + countCamelCaseWords(s));
  }
  
  public static int countCamelCaseWords(String s){
   
    //Write your code here
  }
}
