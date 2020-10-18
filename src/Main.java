public class Main {
    String name;
    int age;

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        String s = "Hello world!";
        System.out.println(s);

        printName();
    }
    public static void printName() {
        String name = "Stepan";
        int age = 32;
        System.out.println(name + " " + age);
    }
}
