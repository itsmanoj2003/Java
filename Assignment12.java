package Training;

class Nodes{
    int data;
    Nodes next;
    Nodes prev;
    Nodes(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}



public class Assignment12 {

    Nodes head;
//    Insert Node at End of the List
    void add(int data){
        Nodes newNode = new Nodes(data);
        if (head == null){
            head = newNode;
        }
        else {
            Nodes temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }


//    Print elements forward
    void print() {
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



//    Insert the Element at Begining
    void printfront(int data){
        Nodes newNode = new Nodes(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }




//    Insert the Element in the Third Position
    void addthird(int data){
        Nodes newNode = new Nodes(data);
        Nodes temp = head;
        for (int i = 0; i < 2 && temp!=null; i++) {
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("List has three elements");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;


    }



    void deletefirst(Nodes head){
        head = head.next;
        head.prev = null;

        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    void deletelast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            Nodes temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
        }

        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


//    Deleting the Elements in the Middle
    void deletemiddle(){
        Nodes temp = head;
        for (int i = 0; i < 2 && temp!=null; i++) {
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



}

class Main{
    public static void main(String[] args) {
        Assignment12 list = new Assignment12();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);;
        list.add(50);
        list.printfront(60);
        list.addthird(70);
        list.print();
        list.deletefirst(list.head);
        list.deletelast();
        list.deletemiddle();
    }
}
