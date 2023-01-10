import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Arrays {

    // Takes of attempts, numbers to be read from line, and declared by previous number number of numbers, returns them reversed.
    // Pobiera ilość prób, zczytuje ile liczb będzie dodawanych, następnie wczytuje od tyłu wszystkie zapisane liczby.
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int amountOfAttempts = scanner.nextInt();
        Map<Integer,ArrayList<Integer>>listOfInts = new HashMap<>();
        
        for(int i=0;i<amountOfAttempts;i++){
            ArrayList<Integer>list = new ArrayList<>();
            int howManyNumbers = scanner.nextInt();
            for(int j=0;j<howManyNumbers;j++){
                list.add(scanner.nextInt());
                listOfInts.put(i, list);                    
        }
    }
            for(int whichOne = 0;whichOne<listOfInts.size();whichOne++){
            for(int i = 0;i<listOfInts.get(whichOne).size();i++){
                
                System.out.print(listOfInts.get(whichOne).get(listOfInts.get(whichOne).size()-i-1));
                System.out.print(" ");
                
                
            }System.out.println();
        }
        scanner.close();
    
    
}}
