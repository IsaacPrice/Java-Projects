public class something {
    public static void hello() {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        human person = new human("John Doe", 43, 67.8);
        numbers[0] = 50;
        person.printValues();

        hello();
    }
}