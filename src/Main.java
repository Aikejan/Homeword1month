public class Main {
    public static void main(String[] args) {

//        int m = one();
//        System.out.println(m+2);

        //System.out.println(function(150));

        // System.out.println(myReturnMethod(8,4));

        //System.out.println(myCekondReturnMethod(5));


//        int[] a = {12,34,31,56,4,5,6,7,1234,534,2};
//        myArray(a);

        //sunOfTwoNumbers(7,6);
        //methodWithParametr("Aikezhan");
        //myFirstVoidMethod();
    }

    static void myFirstVoidMethod() {
        System.out.println("This is my first void method ");
    }

    static void methodWithParametr(String name) {

        System.out.println("Hello" + " " + name);
    }

    /// METHOD MATH CLASS  ///

    static void sunOfTwoNumbers(int a, int x) {
        System.out.println(Math.max(a, x));

    }

    ///  METHOD ARRAY  ///
    static void myArray(int[] a) {
        for (int c : a) {
            System.out.println((c));
        }

        /// TODO JUP SAN TAK SAN   ///

    }

    static String myCekondReturnMethod(int n) {
        if (n % 2 == 1) {
            return "Бул тaк сан";
        }
        return "Бул жуп сан";

    }

    static int myReturnMethod(int j, int v) {
        return j * v;
    }

    ///TODO STRING TYPE EXAMPLE  ///
    static String function(int s) {
        if (s < 10)
            return "Number less than 10";

        if (s < 200)
            return "Number greater than 10 but than less than 100";
        s = s * 10;
        return "Number greater than or egual to 200";
    }

    static int one() {
        return 2;
    }


}
