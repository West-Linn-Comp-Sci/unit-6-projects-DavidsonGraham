/**
 * Graham Davidson
 * 5/2/21
 */
public class FrequencyChart
{
    static int ones;
    static int tens;
    static int twenties;
    static int thirties;
    static int fourties;
    static int fifties;
    static int sixties;
    static int seventies;
    static int eighties;
    static int nineties;
    
    //Ints that the user would input.
    static int[] input = {40, 65, 94, 31, 6, 99, 26, 33, 74, 69, 22, 66,
    86, 2, 72, 29, 78, 68, 83, 10, 36, 57, 5, 7, 37, 56, 25,
    8, 19, 60, 32, 59, 18, 14, 58, 20, 90, 55, 12, 62, 9, 15,
    3, 87, 23, 73};
        
    public static void main(String[] args){
       sort();
       chart();
    }
    static void sort(){
        for(int i=0; i<input.length; i++){
            if(input[i]>=1 && input[i]<=10){
                ones++;
            }
            else if(input[i]>=11 && input[i]<=20){
                tens++;
            }
            else if(input[i]>=21 && input[i]<=30){
                twenties++;
            }
            else if(input[i]>=31 && input[i]<=40){
                thirties++;
            }
            else if(input[i]>=41 && input[i]<=50){
                fourties++;
            }
            else if(input[i]>=51 && input[i]<=60){
                fifties++;
            }
            else if(input[i]>=61 && input[i]<=70){
                sixties++;
            }
            else if(input[i]>=71 && input[i]<=80){
                seventies++;
            }
            else if(input[i]>=81 && input[i]<=90){
                eighties++;
            }
            else{
                nineties++;
            }
        }
    }
    static void chart(){
        System.out.print("\n1-10: ");
        for(int i=0; i<=ones; i++){
            if(i<ones){
                System.out.print("*");
            }
        }
        System.out.print("\n11-20: ");
        for(int i=0; i<=tens; i++){
            if(i<tens){
                System.out.print("*");
            }
        }
        System.out.print("\n21-30: ");
        for(int i=0; i<=twenties; i++){
            if(i<twenties){
                System.out.print("*");
            }
        }
        System.out.print("\n31-40: ");
        for(int i=0; i<=thirties; i++){
            if(i<thirties){
                System.out.print("*");
            }
        }
        System.out.print("\n41-50: ");
        for(int i=0; i<=fourties; i++){
            if(i<fourties){
                System.out.print("*");
            }
        }
        System.out.print("\n51-60: ");
        for(int i=0; i<=fifties; i++){
            if(i<fifties){
                System.out.print("*");
            }
        }
        System.out.print("\n61-70: ");
        for(int i=0; i<=sixties; i++){
            if(i<sixties){
                System.out.print("*");
            }
        }
        System.out.print("\n71-80: ");
        for(int i=0; i<=seventies; i++){
            if(i<seventies){
                System.out.print("*");
            }
        }
        System.out.print("\n81-90: ");
        for(int i=0; i<=eighties; i++){
            if(i<eighties){
                System.out.print("*");
            }
        }
        System.out.print("\n91-100: ");
        for(int i=0; i<=nineties; i++){
            if(i<nineties){
                System.out.print("*");
            }
        }
    }
}
