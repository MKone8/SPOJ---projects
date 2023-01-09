
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FunnyPeter {


    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    int amountOfAttempts = scanner.nextInt();
    List<Integer>list = new ArrayList<>();
    for(int i=0;i<amountOfAttempts;i++){
        list.add(scanner.nextInt());
    }
    scanner.close();
    
        List<Integer>result= new ArrayList<>();
        List<Integer>attempts = new ArrayList<>();

        for (int i=0;i<amountOfAttempts;i++){

            int number = list.get(i);
            int savingSum = number;
            boolean rolling = true;
            int attempt=0;

            while(rolling){
                int remainder = 0;
                int reversed = 0;               
                    while (number!=0){              
                        remainder = number % 10;  
                        reversed = reversed * 10 + remainder;        
                        number = number / 10;
                    }
                            if(reversed == savingSum){                  
                                result.add(savingSum);
                                attempts.add(attempt);
                                rolling = false;                 
                            } 
                                attempt++;
                                savingSum = savingSum+reversed; 
                                number = savingSum;                        
            }

                
        }

        for(int i=0; i<amountOfAttempts;i++){
                    System.out.println(result.get(i)+" "+attempts.get(i));
                
                }
        
        }                 
        
    }
        
        
    


    