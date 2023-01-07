import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class CanIIncrease {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        
        int amountOfAttempts = scanner.nextInt();
        int[]variablesA = new int[amountOfAttempts];
        int[]variablesB = new int[amountOfAttempts];
        int[]results = new int[amountOfAttempts];

        for(int i = 0; i<amountOfAttempts;i++){
            variablesA[i] = scanner.nextInt();      
            variablesB[i] = scanner.nextInt();
            }
            
            for(int i=0;i<amountOfAttempts;i++){
            if(variablesA[i]==0){
                variablesA[i] = 0;
                results[i] = variablesA[i];
                
            }else if(variablesB[i]==0){
                variablesB[i] = 1;
                results[i] = variablesB[i];
            }else if(variablesA[i]>9 && variablesA[i]%10==0){
                variablesA[i]=0;                                 
                results[i]=variablesA[i]; 
                                      
            }else if(variablesA[i]>9&&variablesA[i]%10==1){
                variablesA[i] = 1;
                results[i]=variablesA[i];
                
            }else if(variablesA[i]>9&&variablesA[i]%10>=2 && variablesB[i]>=10&&variablesB[i]%10>=0){
                variablesA[i] = variablesA[i]%10;
                variablesB[i] = (variablesB[i]%10)+2;
                results[i] = ((int)Math.pow(variablesA[i],variablesB[i])); 
            }
            else if(variablesA[i]>9&&variablesA[i]%10>=2){ 
                variablesA[i] = variablesA[i]%10;
                results[i] = ((int)Math.pow(variablesA[i],variablesB[i]));         
            }else if(variablesB[i]>=10&&variablesB[i]%10>=0){    
                variablesB[i] = (variablesB[i]%10)+((variablesB[i]%100)/10)+2;
                
                results[i] = ((int)Math.pow(variablesA[i],variablesB[i])); 
                // System.out.println((variablesB[i]%100)/10);
                // System.out.println(variablesB[i]);
            }else {
                results[i] = ((int)Math.pow(variablesA[i],variablesB[i])); 
            }                                     
                
                
                
            }
            for(int i =0;i<amountOfAttempts;i++){
            System.out.println(results[i]%10);
            }
                        
            
                
            
        // 5 do potęgi 6
        // 30517578125
        // 152587890625

        // 5*5*5*5*5*5*5*5
        // 4 8 16 32 64 128 256 512 1024 2048 4096
        // 3 9 27 81 243 729 2187 6561 19683 59049
        // 16 64 256 1024 4096 16384 65536 262144
        // dla 5 zawsze 5
        // 36 216 1296 7776 46656 279936
        // 49 343 2401 16807 117649 823543 5764801
        // 64 512 4096 32768 262144 2097152
        // 81 729 6561 59049 531441
        // 10 to potęga 2 dla 3 też dla 4 też 5 6

    }
}
