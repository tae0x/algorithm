import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(char ch : a.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            }
            else if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            
            System.out.print(ch);
        }
    }
}