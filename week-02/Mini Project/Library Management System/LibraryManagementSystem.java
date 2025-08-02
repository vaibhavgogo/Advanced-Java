import java.util.*;
class LibraryManagementSystem{
  
  
public static void display(){
   System.out.println(
            "----------------------------------------------------------------------------------------------------------");
                System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 1 to Add new Book.");
    
        System.out.println(
            "Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println(
            "Press 6 to Show All Registered Students.");
        System.out.println("Press 7 to Check Out Book. ");
        System.out.println("Press 8 to Check In Book");
        System.out.println(
            "-------------------------------------------------------------------------------------------------------");
}
  public static void main(String args[]){
   System.out.println(
            "********************Welcome to the VS Library!********************");
        System.out.println(
            "                  Select From The Following Options:               ");
        System.out.println(
            "**********************************************************************");
            Student s=new Student();
            Book b=new Book();
            while(true){
               display();
  Scanner sc=new Scanner(System.in);
  int in=sc.nextInt();
switch(in){
  case 1:
     break;
  case 0:
    return;
  case 2:
     break;
  case 3:
     break;
  case 4:
     break;
  case 5:
     break;
  case 6:
     break;
  case 7:
    break;
    case 8:
    break;
    default:
      System.out.println("Enter valid number : ");
      break;
}

            }
           

 }
  
};
