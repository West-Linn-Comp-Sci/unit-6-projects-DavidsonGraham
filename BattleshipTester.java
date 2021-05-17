/**
 * Graham Davidson
 * 5/15/21
 * On a 1x7 game board, empty spaces are displaed as 0s
 * and ship spaces are displayed as 1s
 */
public class BattleshipTester
{
    public static void main(String[] args){
        System.out.println("Type an integer 0 - 6 to guess where the ship is.");
        Battleship.shipPlacement((int)(Math.random() * 4));
        Battleship.searchAndDestroy(Battleship.in.nextInt());
    }
}
