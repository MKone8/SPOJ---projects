import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int liczbaTestow = scanner.nextInt();
        int[]numbersToTest = new int[liczbaTestow];
        for(int i = 0;i<liczbaTestow;i++){
            numbersToTest[i]=scanner.nextInt();

        }
        scanner.close();
        for (int i = 0;i<liczbaTestow;i++){
            
            Double number = (double)numbersToTest[i];
               
            String str = "TAK";
            List<Integer>ifPrime = new ArrayList<>();
    
            if (number == 1){
            
            str = "NIE";
             }
            for(int j = 1;j<number+1;j++){
                double wynik = number/j;
                    
                    if(wynik == (int)wynik){            
                        ifPrime.add((int)wynik);
                            if (ifPrime.size()>2){
                                str = "NIE";
                            }         
                    }   
            }
            System.out.println(str);
        }
        

    }
    

    }

