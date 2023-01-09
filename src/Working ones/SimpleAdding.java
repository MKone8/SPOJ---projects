
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SimpleAdding {
    // Write how many numbers you want to add, then write numbers, then add them all.
    // Wpisz ile chcesz zsumować liczb, wypisz je a następnie zsumuj.
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int amountOfAttempts = scanner.nextInt();
        Map<Integer,Integer>list = new HashMap<>();
        List<Integer>gatheringNumbers = new ArrayList<>();
        
        for(int i=0;i<amountOfAttempts;i++){
                int amountOfNumbersToAdd = scanner.nextInt();
                for(int j=0;j<amountOfNumbersToAdd;j++){
                    gatheringNumbers.add(scanner.nextInt());
                    
                }
                Integer sum = gatheringNumbers.stream().mapToInt(Integer::intValue).sum();                 
                list.put(i,sum);
                gatheringNumbers.clear();
            }
                for(Map.Entry wynik : list.entrySet()){
                    System.out.println(wynik.getValue());
                }
            scanner.close();
        }
        
    }

