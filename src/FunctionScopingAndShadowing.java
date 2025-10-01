public class FunctionScopingAndShadowing {
    public static void main(String[] args) {
        System.out.println(x);

//        here the new x variable  is shadowing the class variable x which is out of this scope.
        int x; //here variable is declared
//        System.out.println(x); //scoping works after the variable is initialized.
        x=40; // here variable is initialized
        System.out.println(x);
        fun();
    }
    static int x = 90;
    static void fun() {
        System.out.println(x);
    }
}
