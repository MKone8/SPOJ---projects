import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flamaster {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        int amountOfAttempts = scanner.nextInt();
        List<String>kathyTexts = new ArrayList<>();
        List<String>newKathy = new ArrayList<>();
        

        for(int i = 0; i<amountOfAttempts;i++){
            kathyTexts.add(scanner.next());
        }
        // int howMany = 0;
        int howMany;
        
        
        
        long count = kathyTexts.get(0).chars().filter(ch -> ch == kathyTexts.get(0).charAt(0)).count();
        // long count = kathyTexts.get(0).chars().forEach(word -> System.out.println(word));
        System.out.println(count+""+kathyTexts.get(0).charAt(0));
        
        
        }
    }

