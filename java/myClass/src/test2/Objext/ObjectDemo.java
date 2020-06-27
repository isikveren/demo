package test2.Objext;

import java.io.PrintStream;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(30);
        s1.setName("林青霞");
        System.out.println(s1);
        Student s2 = new Student();
        s2.setAge(30);
        s2.setName("林青霞");
        System.out.println(s2);
        System.out.println(s1.equals(s2));
//        public void println(Object x) {
//            String s = String.valueOf(x);
//            if (getClass() == PrintStream.class) {
//                // need to apply String.valueOf again since first invocation
//                // might return null
//                writeln(String.valueOf(s));
//            } else {
//                synchronized (this) {
//                    print(s);
//                    newLine();
//                }
//            }
//        }
//        public static String valueOf(Object obj) {
//            return (obj == null) ? "null" : obj.toString();
//        }
//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }

    }
}
