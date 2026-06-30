public class recursionPrint {

    //make a function that prints "Hello" and calls itself
    public static void fn(){
    System.out.println("Hello");
    fn();
}


    public static void main(String[] args) {
        fn();
    }
}


//stack overflow condition occurs- then recursion stops and throws an error.

