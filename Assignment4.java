package Training;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



//        1st Program
//        System.out.println("Enter the String: ");
//        String str = sc.nextLine();
//        String strcpy = str;
//        String rev = "";
//        for (int i = str.length()-1; i >= 0 ; i--) {
//            rev = rev+str.charAt(i);
//        }
//
//        if (rev.equals(strcpy)){
//            System.out.println("Pallindrome");
//        }
//        else {
//            System.out.println("Not Pallindrome");
//        }






//        2nd Program
//        System.out.println("Enter the String: ");
//        String str = sc.nextLine();
//        int vow = 0;
//        int cons = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u'){
//                vow++;
//            } else if (str.charAt(i) == ' '){
//                vow = vow;
//                cons = cons;
//            }
//            else {
//                cons++;
//            }
//        }
//        System.out.println("Vowels: "+vow);
//        System.out.println("Consonants: "+cons);






//        3rd Program
//        String a = "Apple";
//        HashSet<Character> s = new HashSet<>();
//        for (int i = 0; i <a.length() ; i++) {
//            s.add(a.charAt(i));
//        }
//        System.out.println(s);








//        4th Program
//        System.out.println("Enter the String: ");
//        StringBuilder str =  new StringBuilder(sc.nextLine());
//        str.reverse();
//        System.out.println(str);






//        5th Program
//        System.out.println("Enter the 1st String: ");
//        String str1 = sc.nextLine();
//        System.out.println("Enter the 2nd String: ");
//        String str2 = sc.nextLine();
//        char[] char_array1 = new char[str1.length()];
//        char[] char_array2 = new char[str1.length()];
//        for (int i = 0; i < str1.length(); i++) {
//            char_array1[i] = str1.charAt(i);
//            char_array2[i] = str2.charAt(i);
//        }
//        Arrays.sort(char_array1);
//        Arrays.sort(char_array2);
//        if (Arrays.equals(char_array1,char_array2)){
//            System.out.println("Anagram");
//        }
//        else {
//            System.out.println("Not Anagram");
//        }





//        6th Program
//        System.out.println("Enter the 1st String: ");
//        StringBuilder str1 = new StringBuilder(sc.nextLine());
//        char upperChar = ' ';
//        for (int i = 0; i < str1.length(); i++) {
//
//            if (Character.isLowerCase(str1.charAt(0))) {
//                upperChar = Character.toUpperCase(str1.charAt(0));
//                str1.setCharAt(0, upperChar);
//            }
//            if (str1.charAt(i) == ' ') {
//                upperChar = Character.toUpperCase(str1.charAt(i + 1));
//                str1.setCharAt(i + 1, upperChar);
//            }
//
//        }
//        System.out.println(str1);




//        7th Program




//        8th Program
//        System.out.println("Enter the String: ");
//        String input = sc.nextLine();
//        String result = "";
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//
//            if (Character.isLowerCase(ch)) {
//                result += Character.toUpperCase(ch);
//            } else if (Character.isUpperCase(ch)) {
//                result += Character.toLowerCase(ch);
//            }
//        }
//        System.out.println(result);




    }


}
