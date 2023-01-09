import java.util.Scanner;

public class Kindergarten {
    public static void main(String[]args){

        // 
        Scanner scanner = new Scanner(System.in);
        int amountOfAttempts = scanner.nextInt();
        int[]a = new int[amountOfAttempts];
        int[]b = new int[amountOfAttempts];

        for(int i =0;i<amountOfAttempts;i++){
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        for(int i=0;i<amountOfAttempts;i++){
        if(b[i]>a[i]){
            int mnoznik = 1;
            int higher = b[i];
            int lower =  a[i];
            int wynik = 1;
            while((double)wynik/higher!=(int)wynik/higher){

                wynik = lower * Math.round(mnoznik);
                mnoznik++;
            }
            System.out.println(wynik);
            }     
            
            else {
            int mnoznik = 1;
            int higher = a[i];
            int lower =  b[i];
            int wynik = 1;
            while((double)wynik/higher!=(int)wynik/higher){
                
                wynik = lower * Math.round(mnoznik);          
                mnoznik++;
            }
            System.out.println(wynik);
        }
            scanner.close();

        }
        


        }}


