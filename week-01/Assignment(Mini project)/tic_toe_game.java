import java.util.*;


public class tic_toe_game {
    static String[] board=new String[9];
    static String turn;
  
static void draw(){
    System.out.println("| ------- |--------- |--------- |");
    System.out.println("| ---"+board[0]+"--- |---"+board[1]+"----- |---"+board[2]+"----- |");
    System.out.println("| ------- |--------- |--------- |");
    System.out.println("| ---"+board[3]+"--- |---"+board[4]+"----- |---"+board[5]+"----- |");
    System.out.println("| ------- |--------- |--------- |");
     System.out.println("| ---"+board[6]+"--- |---"+board[7]+"----- |---"+board[8]+"----- |");
    System.out.println("| ------- |--------- |--------- |");
}
    public static void main(String args[]) {
          Scanner sc= new Scanner(System.in);
          for(int i=0;i<9;i++){
            board[i]=String.valueOf(i+1);
          }
        //   draw();
          int choice=1;
          while(choice==1){
             
             System.out.println("Do YOU Want to play tic toe game : ");
             System.out.println("press 1 for Yes  : ");
             System.out.println("press any key for No  : ");
             choice=sc.nextInt();
             if(choice==1){
 draw();
String x="X";
String y="O";
boolean win=false;
int user1;
int user2;
for(int i=0;i<9;i++){
    if(i%2==0){
          System.out.println("User 1 : Press given no. to Put X : ");
          user1=sc.nextInt();
    }
    else{
           System.out.println("User 2 : Press given no. to Put O : ");
           user2=sc.nextInt();
    }
}

             }
          }

}
}