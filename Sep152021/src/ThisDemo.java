public class ThisDemo {
    int myVariable =10;
    final int myInstanceFinal;
    ThisDemo(int assignInstance){
        myInstanceFinal = assignInstance;
        System.out.println("My Instance variable" + myInstanceFinal);
    }
    void display(){
        int myVariable = 100;
        System.out.println("The Value of myVariable "+ myVariable);
        System.out.println("The Value of myVariable using this keyword "+ this.myVariable);
        System.out.println();
    }
    public static void main(String args[]){
        ThisDemo td1 = new ThisDemo(30);
        td1.display();
    }
}
