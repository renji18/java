public class Main {
    public static void main(String[] args) {
        greet("Aadarsh", 21);
        greet("Mittal", 20);
        System.out.println(max(5,40));
    }

    public static void greet(String name, int age){
        System.out.println("Hello " + name + ". Your age is " + age);
    }

    public static int max(int num1, int num2){
//        return (num1 > num2) ? num1 : num2;
        return Math.max(num1, num2);
    }
}