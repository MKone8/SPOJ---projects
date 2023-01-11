package ActuallyInProgress;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SweetTeether {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        List<Integer>members = new ArrayList<>();
        List<Integer>results = new ArrayList<>();
        int amountOfAttempts = scanner.nextInt();
        int amountOfSeconds = 86400;
        // int test = 43/5;
        // System.out.println(test);
        for(int i = 0; i<amountOfAttempts;i++){
            int amountOfMembers = scanner.nextInt();
            int cookiesInPack = scanner.nextInt();
            int wynik=0;
            int ilePaczek=0;
            while(members.size()!=amountOfMembers){
                members.add(scanner.nextInt());
            }
            for(int j=0;j<members.size();j++){
                wynik += (amountOfSeconds / members.get(j));
                
            }
            if(wynik%cookiesInPack==0){
                // wynik = wynik/cookiesInPack;
                ilePaczek = wynik/cookiesInPack;
            }
            else if(wynik>cookiesInPack){
                // wynik=(wynik/cookiesInPack)+1;
                ilePaczek=(wynik/cookiesInPack)+1;
            }else{
                // wynik = 1;
                ilePaczek = 1;
            }
            // System.out.println("Jestem za ostatnim:"+wynik);
            // System.out.println(wynik);
            // while(wynik%cookiesInPack!=0){
            //     wynik++;
            //     // System.out.println(wynik);
            // }
            
            // int ilePaczek = wynik/cookiesInPack;
            
            // System.out.println("Jestem ile Paczek"+ilePaczek);
            // System.out.println(ilePaczek);
            results.add(ilePaczek);
            members.clear();
    }
    for(Integer list : results){
        System.out.println(list);
    }
    scanner.close();
}}
