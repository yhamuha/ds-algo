package misc.java_core;
import java.util.*;
import misc.binary.DoubleToBinary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class JavaCore extends Thread {

    // List is dynamic
    /*public static void main( String[] args ) {
        List list = new ArrayList( 3 ); //1

        list.add( new Integer( 100 ) );
        list.add( new Integer( 200 ) );
        list.add( new Integer( 300 ) );
        list.add( new Integer( 400 ) ); //2

        System.out.println( list.size() ); //3
    }

    >> 4
    */

    // array.add (index, elem)
   /* public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>(2);
        array.add(5);
        array.add(6);
        array.add(0, 7);
        System.out.println(array);
        System.out.println("6st: " +array.indexOf(6));

        array.remove(1);
        System.out.println(array);
        System.out.println("6st: " + array.indexOf(6));
    }*/

    // have access to private method other instance from the same class
    /*private int getX() {
        return 5;
    }

    public int get2X() {
        return 2 * getX();
    }

    public static void main(String[] args) {
        JavaCore jc = new JavaCore();
        System.out.println(2 * jc.getX());
    }*/

    // remove return from finally
    /*public static void main(String... args) {
        System.out.println("" + new JavaCore().summ(3, 3));
    }

    public int summ(int a, int b) {
        try {
            return a + b;
        } finally {
            if (a == b)
                return 0;
        }
    }*/

    // automatically change type from int to byte
    /*public static void main(String[] s) {
        byte b = 8;
        m(b);
        m(7);
    }

    static void m(byte b) {
        System.out.print("byte");
    }*/

    // nested if else
    /*public static void main(String...args) {
        boolean b = false;
        if (b == false)
            if (b = false)
                System.out.println("if statement");
            else
                System.out.println("else 1");
        else
            System.out.println("else 2");
    }*/

    // by def equals compare references; == too
    // with @override equals compare obj internals
    /* public static void main(String[] args) {
        V v1 = new V("abc");
        V v2 = new V("abc");
        System.out.println((v1 == v2) + " " + v1.equals(v2));
        }
    }*/
    /*class V {
        String s = null;

        V(String str){
            this.s = str;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            V v = (V) o;
            return s != null ? s.equals(v.s) : v.s == null;
        }
   */

    // separate thread in main
    /* !! here field x is not volatile */
    /*private int x = 2;

    public static void main(String[] args) throws Exception {
        new JavaCore().makeItSo();
    }

    public JavaCore() {
        x = 5;
        start();
    }

    public void makeItSo() throws Exception {
        join();
        x = x - 1;
        System.out.println(x);
    }

    public void run() { x *= 2; }*/
    /* result will be 9 */

    // references to method are transmitted by value
    /*private String name;

    JavaCore(String name) {
        this.name =  name;
    }

    public void test(JavaCore test) {
        test = new JavaCore("three");
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        JavaCore t1 = new JavaCore("one");
        JavaCore t2 = new JavaCore("two");
        t1.test(t2);
        System.out.println(t2);
    }*/

    // empty operator is allowed
    /*public static void main(String[] args) {

        int i, j;
        i = 100;
        j = 200;
        while(++i < --j);
        System.out.println(i);

    }*/

    // compiler doesn't choice between int and Integer
    // compile error
    /*public static void test(int ...a) {
        System.out.println("int...");
    }

    public static void test(Integer ...a) {
        System.out.println("Integer...");
    }

    public static void test(Number ...a) {
        System.out.println("Number...");
    }

    public static void test(Object ...a) {
        System.out.println("Object...");
    }

    public static void main(String args[]){
        Number n = new Integer(1);
        test(n.intValue());
    }*/

    // for
    // iterations:
    // 2 → 1 → 3 → 4
    // 4 → 3 → 7 → 8
    // 8 → 7 → 15 → 16
    /*public static void main(String[] s) {
        for (int i = 2; i < 10; i = (i++) + i--, i++) {
            System.out.print(--i);
        }
    }*/

    // hiding
    /*class A {
        int i = 0;
        public int increment() {
            return ++i;
        }
    }
    class B extends A {
        int i = 10;
        public int increment() {
            return ++i;
        }

        public static void main(String[] args) {
            A a = new A();
            System.out.println(a.increment());
            *//*hiding*//*
            A obj = new B();
            System.out.println(obj.increment());
        }
    }*/

    // 29.1f + 1.0d = 30.100000XXXXd
    /*public static void main(String[] args) {
        try {
            String value = "29.1";
            System.out.println((Float.valueOf(value) + 1.0) == 30.1);
            System.out.println((Double.valueOf(value) + 1.0) == 30.1);
            System.out.println(Float.valueOf(value)/0);
            System.out.println(Double.valueOf(value)/0);
        }
        catch (NumberFormatException ex) {
            System.out.println("NumberFormatException");
        }
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
    }*/

    // ambiguous methods; compile error
    /*static void m(int ... a) {
        System.out.println("1");
    }

    static void m(Integer ... a) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        m(1, 2);
    }*/

    // class initialization order
    /*{
        System.out.print("1 ");
    }

    JavaCore(){
        System.out.print("2 ");
    }

    public static void main(String[] args) {
        System.out.print("3 ");
        JavaCore m = new JavaCore();
        System.out.print("4 ");
    }

    static {
        System.out.print("5 ");
    }*/

    // byte, char , short to int implicit and explicit convert
    /*public static void main(String[] args) {
        byte b = 12;
        byte k = (byte)(b + 1);
        System.out.println(k);
    }*/

    // inner static class
    /*private static String var1 = "var1";

    private static class Test2 {
        private static final String name = "Name";
        static String var2= var1 + "+update";
    }

    public static void main(String[] args) {
        System.out.println(Test2.name);
        System.out.println(Test2.var2);
    }*/

    // Integer pool range is -128 .. 127
    /*public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        Integer c = -128;
        Integer d = -128;
        System.out.println(a == b);
        System.out.println(c == d);
    }*/

    // psvm contains String[]
    /*static public void main(String[] args) {
        try {
            int k = Integer.parseInt(args[1]);
            System.out.println(args[k]);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }*/
    /*java.lang.NumberFormatException: For input string: "Two"*/

    // non-primitives or null values in if
    /*private static Boolean b1, b2;

    public static void main (String[] args) {
        //if should use primitives or correct values of Wrapper types*
        //*Boolean nulls won't work here*
        if (b1 || !b2 || !b1 || b2) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }*/
    /*NullPointerException*/

    // labels; continue, break
    /*public static void main(String[] args) {
        label1: for (int i = 0; i < 3; i++) {
            if (i == 1)
                continue label1;
            label2:
            System.out.print("TEST ");
            label3:;
        }
    }*/

    // boolean "true/false" = true/false; null==false; others == true
    /*public static void main(String... args){
        Boolean I1 = false;
        Integer I2 = -1;
        Number I3 = 1;
        Formatter f = new Formatter();
        f.format("%1$b ", I1)
                .format("%1$b ", I2.toString())
                .format("%1$b ", I3.toString());
        System.out.println(f.toString());
    }*/

    // objects init order
    /*class A {
        public A() { System.out.print(" A;"); }
    }
    class B {
        public B() { System.out.print(" B;"); }
    }
    class C {
        public C() { System.out.print(" C;"); }
    }
    class D extends C {
        private A objA = new A();
        private static B objB = new B();
        static {
            System.out.println(" before static B;");
        }
        public D() { System.out.print(" D;"); }

        public static void main(String[] args){
            new D();
        }
    }*/

    // using method calls in for
    /*static boolean foo(char c) {
        System.out.print(c);
        return true;
    }
    public static void main(String[] args) {
        int i = 0;
        for ( foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }
    }*/

    // java.lang.Math declared as final
    /*class Funcs extends java.lang.Math {
        public int add(int x, int y) {
            return x + y;
        }
        public int sub(int x, int y) {
            return x - y;
        }
        public static void main(String[] a) {
            misc.java_core.Funcs f = new misc.java_core.Funcs();
            System.out.println("" + f.add(1, 2));
        }
    }*/

    // varargs is analyzing on a last step
    /*private void process(String... s) {
        System.out.print("*");
    }
    private void process(String s) {
        System.out.print("1");
    }
    private void process(String s, String a) {
        System.out.print("2");
    }
    public static void main(String[] args) {
        JavaCore c = new JavaCore();
        c.process("asd");
        c.process("asd","asd");
        c.process("asd","asd","asd");
    }*/

    // two references to list in method
    /*List<Integer> list;
    JavaCore(){
        list = new ArrayList<Integer>();
        someVoid(list);
    }
    void someVoid(List<Integer> l){
        l.add(0);
        l=null;
    }
    public static void main(String[] args) {
        JavaCore test=new JavaCore();
        System.out.println("Size is: "+test.list.size());
    }*/

    // ternary
    /*public static void main(String s[]) {
        System.out.println((1<2) ? "1_true answer" : 1 == 1 ? "otherwise_ second true answer" : "otherwise_ second false answer");
    }*/

    // can't call non-static from static
    /*private final String DUMMY = "DUMMY";

    public static void main(String[] args) {
        System.out.println(DUMMY);
    }*/

    // non-typyng collection
    /*public static void main(String[] args) {
        try {
            ArrayList<Integer> ar = new ArrayList<Integer>();
            List temp = ar; //1
            temp.add(new java.util.Date()); //2
            temp.add(new Float(1.66));
            Iterator it = ar.iterator();
            while (it.hasNext())
                System.out.println(it.next());
            System.out.println(ar.get(0));
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }*/
    /*could use: List temp = Collections.checkedList(ar, Integer.class);
    *  for checking the right object come into collection*/

    // transmit primitive types by value
    /*private double x = 2;
    public static void multX(JavaCore a, double n){
        a.setX(a.getX()*n);
    }
    public double getX() {return x;}
    public void setX(double xn) {x = xn;}
    public static void trippleValue(double x){
        x*=3;
    }
    public static JavaCore resetX(JavaCore a){
        a = new JavaCore();
        return a;
    }
    public static void main(String[] args) {
        int x = 3;
        trippleValue(x);
        JavaCore anA = new JavaCore();
        multX(anA,x);
        resetX(anA);
        x=0;
        System.out.print(anA.getX());
    }*/

    // number to new Integer and back by "=="
    /*1000 to new Integer will create a new obj
    by == we have a conversion from Integer to primitive*/
    /*public static void main(String[] args) {
        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(i1 == i2);
        System.out.println(i1 == 1000);
    }*/

    // polymorphism doesn't allow for static methods
    /*class Tenor extends Singer {
        public static String sing() { return "fa"; }
        public static void main(String[] args) {
            Tenor t = new Tenor();
            Singer s = new Tenor();
            System.out.println(t.sing() + " " + s.sing());
        }
    }
    class Singer { public static String sing() { return "la"; } }*/

    // concat priority is higher than "=="
    /*public static void main(String[] args) {
        String s1 = "str";
        String s2 = "str";
        System.out.println("Result: " + s1 == s2);
    }*/

    // float + double = XX.XXXtail
    /*public static void main(String[] args) {
        try {
            String value = "29.1";
            float fl = Float.valueOf(value);
            double doub = fl + 1.0;
            System.out.println(doub);
        }
        catch (NumberFormatException ex) {
            System.out.println("NumberFormatException");
        }
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
    }*/

    // variable can be init outside the loop
    /*public static void main(String[] arg) {
        int limit = 10;
        int sum = 0;

        int i = 1;
        for (; i <= limit;) {
            sum += i++;
            }
        System.out.println(sum);
    }*/

    // abstract class should be extended and overrided
    /*abstract class Parent {
        String s = "hello!";
        public void test() {
            System.out.println(s);
        }
    }

    class T extends Parent {
        @Override
        public void test() {
            System.out.println("T");
        }
    }

    class P {
        public static void main(String[] args) {
            Parent p = new T();
            p.test();
        }
    }*/
}

class HelloWorld {
    static void changeIt(String value) {
        value = new
                String("Hello!");
    }
    public static void main(String[] argvc)
    {
        String test = new String("Hello World!");
        changeIt(test);
        System.out.println("After changing : " + test);
    }
}

class HelloWorld2 {
    private int iValue;
    static void changeIt(HelloWorld2 value) {
        value.iValue = 10;
    }
    public static void main(String[] argvc)
    {
        HelloWorld2 hw = new HelloWorld2();
        hw.iValue = 20;
        changeIt(hw);
        System.out.println("After changing : " + hw.iValue);
    }
}






