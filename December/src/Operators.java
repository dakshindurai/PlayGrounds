public class Operators {
    public static void main(String[] args){
        int i =10; int j = 21;
        int k = 5;
        //Arthimetic Operators (+  addition ,- subtraction ,* multiplication,/ division ,%  gives only remainder)
        System.out.println("Binary Addition "+ (i+j));
        System.out.println("Binary Subtraction "+ (j-1));
        System.out.println("Binar Multiplication "+ (i*j));
        System.out.println("Binary Division "+ (j/i));
        System.out.println("Binary Modulus "+ (j%i));
        //Unary Operators (- minus, != Not equal to, ++ Increment, --Decrement, ++P pre-increment, --P pre decrement, Bitwise operator)
        System.out.println("Unary Minums   "+ -i);
        System.out.println("Unary Not equal to "+ (i != 10));
        System.out.println("Unary Post Increment "+ (i++));
        System.out.println("Now value of I is Increments "+ i);
        System.out.println("Unary Pre Increment "+ (++j));
        System.out.println("Unary Pre Decrement "+ --j);
        System.out.println("Unary Post Decrement "+ i--);
        System.out.println("Now th valye of I is decremented "+ i);
        System.out.println("Bitwise Operator "+ ~k);
        //Assignment Operator Simple and Compound (=, +=, -=, *=, /=, %= )
        int num = 25;
        System.out.println("Simple Assignment "+ num);
        System.out.println("Compound Assignment += "+ (num += 5));
        System.out.println("Compound Assignment -= "+ (num -= 5));
        System.out.println("Compound Assignment /= "+ (num /= 5));
        System.out.println("Compound Assignment *= "+ (num *= 5));
        System.out.println("Compound Assignment %= "+ (num %= 4));
        //Logical Operator ( AND, OR, NOT)
        int a = 10; int b=20; int c =30;
        System.out.println("Logical AND Operator "+ ((a < b) && (a > c)));
        System.out.println("Logical OR Operator "+ ((a > b) || (a < c)));
        System.out.println("Logical NOT Operator "+ !(a>b));
        //Ternary Operator (replacement for if then else)
        int res1 = a < b ? a : b;
        int res2 = b > a ? b - a : a - b;
        System.out.println("Ternary Operation "+ res1);
        System.out.println("Ternary Operation "+ res2);
    }
}
