import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Purse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Purse
{
    private ArrayList<Coin> coins;
    
    public Purse() { 
        coins = new ArrayList<Coin>();
    }
    public void add(Coin aCoin){
        coins.add(aCoin);
    }
    
    // returns total value of all coins in purse
    double total;
    public double getTotal() {
        for(int i=0; i<coins.size(); i++){
            total += coins.get(i).getValue();
        }
        return total;
    } 
    
    // returns the number of coins in the Purse that matches aCoin
    private int count;
    public int count(Coin aCoin) {
        for(int i=0; i<coins.size(); i++){
            if(coins.get(i).getValue() == aCoin.getValue() && coins.get(i).getName().equals(aCoin.getName())){
                count++;
            }
        }
        return count;
    } 

    // returns the name of the Coin in the Purse that has the smallest value
    private static double min;
    private static int n;
    private static int element;
    public String findSmallest(){
        min = coins.get(0).getValue();
        n = coins.size();
        for(int i=0; i<n; i++){
            if(coins.get(i).getValue() < min){
                min = coins.get(i).getValue();
                element = i;
            }
        }
        return coins.get(element).getName();
    }
}
