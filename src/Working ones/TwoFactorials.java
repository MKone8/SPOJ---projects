import java.util.Scanner;

public class TwoFactorials {
    // Wypisz dziesiątki i jedności wyniku silni
    // Get tens and digitals of factorial result
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        int amountOfAttempts = scanner.nextInt();
        int [] savedValues = new int[amountOfAttempts];
        for(int i = 0; i <amountOfAttempts; i++){
            savedValues [i] = scanner.nextInt();
        }

        for(int i = 0; i < amountOfAttempts;i++){
        int factorial = savedValues[i];
        int wynik = savedValues[i];
        if (wynik<=1){
            System.out.println(0+" "+1);
        }else if(wynik>1 && wynik <=9)
        {

        for(int j = 1;j<factorial;j++){
            
            wynik *= factorial-j;
    
        }
        int numOfDigits = (int) wynik % 10;      
        int numOfTens = (int) Math.floor((wynik % 100) / 10);
        
        System.out.print(numOfTens+" "+numOfDigits);
        System.out.println();
        }else{
            System.out.println(0+" "+0);
        }
        scanner.close();
    }



}}
