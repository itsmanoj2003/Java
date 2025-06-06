package Training;

import java.util.Stack;

public class Assignment13 {

    public static void main(String[] args) {


//        1st Program
//        Stack<Character> stack = new Stack<>();
//        String str = "abbaca";
//        char[] character = str.toCharArray();
//        for (char ch : character){
//            if(!stack.isEmpty() && stack.peek()==ch){
//                stack.pop();
//            }
//            else {
//                stack.push(ch);
//            }
//        }
//
//        String res = "";
//        for(char ch : stack){
//            res+=ch;
//        }
//        System.out.println(res);




//        2nd Program
//        int[] price = {100, 80, 60, 70, 60, 75, 85};
//        int n = price.length;
//        int[] span = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            int count = 1;
//            for (int j = i - 1; j >= 0; j--) {
//                if (price[j] <= price[i]) {
//                    count++;
//                } else {
//                    break;
//                }
//            }
//            span[i] = count;
//        }
//
//        for (int s : span) {
//            System.out.print(s + " ");
//        }



//        3rd Program
        String str = "((()))";
        if (isBalanced(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }


    }



//    3rd Program Function

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
        }

}
