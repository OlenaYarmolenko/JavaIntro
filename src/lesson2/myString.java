package lesson2;

/**
 * Created by olena on 14.09.18.
 */
public class myString {
    public String everyNth(String str, int n) {
        String result = "";

        for (int i = 0; i < str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }
    public static void mymethod() {

    }

    public static void main(String[] args) {
        myString my = new myString();
        myString.mymethod();
        System.out.println(my.everyNth("Yarmolenko", 2));
        System.out.println(my.everyNth("Yarmolenko", 3));
        System.out.println(my.everyNth("Yarmolenko", 4));
    }
}