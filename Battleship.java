import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 */
public class Battleship
{
    static Scanner in = new Scanner(System.in);
    public static int[] board = {0,0,0,0,0,0,0};
    public static void shipPlacement(int startSpace){
        for(int i=startSpace; i<startSpace+3; i++){
            board[i] = 1;
        }
    }
    static List<Integer> spacesDestroyed = new ArrayList<Integer>();
    static int misses;
    public static void searchAndDestroy(int element){
        if(spacesDestroyed.size()<3){
            if(board[element] == 1){
                if(spacesDestroyed.size() == 0){
                    spacesDestroyed.add(element);
                    System.out.println("You hit your ship at array element #"+element);
                    searchAndDestroy(in.nextInt());
                }
                else if(spacesDestroyed.size() == 1){
                    if(element == spacesDestroyed.get(0)){
                        System.out.println("You already destroyed element #"+element);
                        searchAndDestroy(in.nextInt());
                    }
                    else{
                        spacesDestroyed.add(element);
                        System.out.println("You hit your ship at array element #"+element);
                        searchAndDestroy(in.nextInt());
                    }
                }
                else if(spacesDestroyed.size() == 2){
                    if(element == spacesDestroyed.get(0) || element == spacesDestroyed.get(1)){
                        System.out.println("You already destroyed element #"+element);
                        searchAndDestroy(in.nextInt());
                    }
                    else{
                        spacesDestroyed.add(element);
                        System.out.println("You hit your ship at array element #"+element);
                        score();
                        printBoard();
                    }
                }
            }
            else{
                System.out.println("Miss");
                misses++;
                searchAndDestroy(in.nextInt());
            }
        }
    }
    static int score;
    public static void score(){
        score = (int)((3/((double)misses+spacesDestroyed.size())) * 100);
        System.out.println("You were "+score+"% accurate");
    }
    public static void printBoard(){
        System.out.print("Board: ");
        System.out.print(Battleship.board[0]+" ");
        System.out.print(Battleship.board[1]+" ");
        System.out.print(Battleship.board[2]+" ");
        System.out.print(Battleship.board[3]+" ");
        System.out.print(Battleship.board[4]+" ");
        System.out.print(Battleship.board[5]+" ");
        System.out.print(Battleship.board[6]+"\n");
    }
}
