import java.util.*;
 
public class tic_toe_game {
    static String[] board=new String[9];
    static String turn;
  static boolean checkWinner()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }
            //For X winner
            if (line.equals("XXX")) {
               System.out.println("User1(X) is winner ");
                   System.out.println();
                return true;
            }
            
            // For O winner
            else if (line.equals("OOO")) {
                System.out.println("User2(O) is winner ");
                    System.out.println();
                return true;
            }
        }
        return false;
    }
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
boolean b[]={false,false,false,false,false,false,false,false,false};
int i=0;
for(;i<9;i++){
    if(i%2==0){
          System.out.println("User 1 : Press given no. to Put X : ");
          user1=sc.nextInt();
          if(user1<0||(user1>9)||b[user1-1]==true){
               System.out.println("INVALID ");
            i--;
                draw();
            continue;
          }
          else{
           b[user1-1]=true;
           board[user1-1]="X";
           draw();
           win = checkWinner();
           if(win==true){
            break;
           }
          }
    }
    else{
           System.out.println("User 2 : Press given no. to Put O : ");
           user2=sc.nextInt();
           if(user2<0||(user2>9)||b[user2-1]==true){
            System.out.println("INVALID ");
            i--;
            draw();
            continue;
          }
          else{
 b[user2-1]=true;
           board[user2-1]="O";
           draw();
           win = checkWinner();
           if(win==true){
            break;
           }
          }
    }
}
if(i==9){
     System.out.println("It's draw");
                
}

             }
          }

}
}