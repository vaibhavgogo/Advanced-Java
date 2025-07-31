class string
{
    public static void main(String args[]) {

      	
        char characters[] = { 'a', 'b', 'c' };

      	
        String firstString = new String(characters);
      
    
        String secondString = new String(firstString);

        System.out.println(firstString);
        System.out.println(secondString);
    }
}