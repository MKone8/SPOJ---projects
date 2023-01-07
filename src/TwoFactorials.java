import java.util.Scanner;

public class TwoFactorials {
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

        for(int j = 1;j<factorial;j++){
            
            wynik *= factorial-j;
            
        }
        int numOfDigits;
        int numOfTens;

        if(wynik<10){
            numOfDigits = wynik;
            System.out.println(0 +" "+numOfDigits);
        }
        // String newWynik = Integer.toString(wynik);
        // char numOfDigits = newWynik.charAt(newWynik.length()-1);
         
        //    if(newWynik.length()<2){
        //     System.out.println(0+" "+numOfDigits);
        //    }else{
        //     char numOfTens = newWynik.charAt(newWynik.length()-2);
        //     System.out.print(numOfTens+" "+numOfDigits);
        //     System.out.println();
        //    }
        // }
}}}
