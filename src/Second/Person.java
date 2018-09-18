package Second;

public class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    public Person(String first, String secondName, int age) {
        firstName = first;
        this.secondName = secondName;
        this.age = age;
        count++;
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        count++;
    }
    void doSomething (){
        println(count + " makes smth.");
    }

    private static void println(String x) {
        System.out.println(x);
    }

    static void doSomethingElse (){
        println(count + " makes smth else");
    }
    static{
        println("class was initialized");
    }
    {
        println(count + " person was created");
    }
    private static void Println(String out) {
        println(out);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
