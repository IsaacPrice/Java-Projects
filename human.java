public class human {
    String name;
    int age;
    double height;

    // Class initilizer
    public human(String Name, int Age, double Height) {
        name = Name;
        age = Age;
        height = Height;
    }

    // Prints the information about the human
    public void printValues() {
        System.out.println(name + " is " + age + " Years old, and is " + height + " Inches tall.");
    }

}