package ActuallyInProgress;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SweetTeether {
    public static void main(String []args){
        // Liczba ciastek w jednym pudełku 10
        // 60 minut jedno ciastko w dobe zje 24
        // 30 minut zje łącznie 48 ciastek
        // razem zjedzą 72 modulo 10, jeśli nie to ++;
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer>tempoOfMember = new HashMap<>();
        List<Integer>amountOfMembers = new ArrayList<>();
        List<Integer>cookiesInPack = new ArrayList<>();
        int amountOfAttempts = scanner.nextInt();
        
        // int i=0;
        for(int i = 0; i<amountOfAttempts;i++){
            System.out.println("Wpisuję kolejnego zawodnika: ");
            amountOfMembers.add(scanner.nextInt());
            cookiesInPack.add(scanner.nextInt());
        while(tempoOfMember.size()!=amountOfMembers.get(0)){
            System.out.println("wypisuję liczbę zawodników: "+amountOfMembers.get(0));
            tempoOfMember.put(i,scanner.nextInt());
            System.out.println("przypisuję tempo zawodnika numer:"+i+" "+tempoOfMember);         
        }
        }
        // int amountOfAttempts = scanner.nextInt();

        // for(int i = 0; i<amountOfAttempts;i++){
        //     amountOfMembers.add(scanner.nextInt());

        // }
    }
}
