
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       
    int[] num = new int[10];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         for (int i = 1; i <= num.length; i++){
            num [10 - i] = Integer.parseInt(reader.readLine()); 
            
        }
        
        for ( int k = 0; k < num.length; k++){
    
            System.out.println(num[k]);
            
        }
        
    }
}
