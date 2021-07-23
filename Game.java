import java.util.*;


public class Game {
    Scanner sc =new Scanner(System.in);
    private int turn = 1;
    private int maxturn = 99;
    private int leftship  = 0;
    //private int hp = 3;
    public void game(){
        while(leftship > 0 && turn < maxturn){
            turn++;
            System.out.printf("ターン%d\n" ,turn);
            for(int i = 0; i < leftship; i++){

            }
        /*}else{
            System.out.println("船沈没");
        */
        }


    }
    
}
