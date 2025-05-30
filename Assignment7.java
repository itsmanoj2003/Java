package Training;

//  1st Program

// This is "Calculator" class
//public class Assignment7 {
//
//    int result;
//    static int operationCount;
//    void add(int a,int b){
//        result = a+b;
//        operationCount ++;
//        System.out.println(result);
//    }
//
//    static void displayoperationCount(){
//        System.out.println("Operation Count: "+operationCount);
//    }
//
//    void displayResult(){
//        System.out.println("Result: "+result);
//    }
//
//}
//
//class Main{
//    public static void main(String[] args) {
//        Assignment7 obj = new Assignment7();
//        Assignment7 obj2 = new Assignment7();
//
//        obj.add(10,20);
//        obj2.add(5,5);
//
//        obj.displayResult();
//        obj2.displayResult();
//
//        Assignment7.displayoperationCount();
//
//    }
//}






//  2nd Program

// This is "Bank Account" Class
//public class Assignment7 {
//
//    private int balance = 0;
//
//    public void deposite(int amt){
//        balance = balance+amt;
//    }
//
//    public int getBalance(){
//        return balance;
//    }
//}
//
//class Main{
//    public static void main(String[] args) {
//        Assignment7 obj = new Assignment7();
//        obj.balance;        // Error: 'balance' has private access in 'Training.Assignment7'
//    }
//}




// 3rd Program

// This is "Student" Class
//public class Assignment7 {
//
//    String name;
//    int roll_no;
//
//    Assignment7(String name,int roll_no){
//        this.name = name;
//        this.roll_no = roll_no;
//        System.out.println(name);
//        System.out.println(roll_no);
//    }
//
//    Assignment7(int roll_no){
//        this.name = "Unknown";
//        this.roll_no = roll_no;
//        System.out.println(name);
//        System.out.println(roll_no);
//    }
//
//}
//
//class Manin{
//    public static void main(String[] args) {
//
//        Assignment7 obj = new Assignment7("Manoj",54);
//        Assignment7 obj2 = new Assignment7(54);
//
//    }
//}
