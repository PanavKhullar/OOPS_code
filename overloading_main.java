public class overloading_main {
    public static void main(String[] args) {
        System.out.println("main with string[]");   // But JVM calls main() method which receives string array as arguments only.
    }

    public static void main(String args) {
        System.out.println("main with string");
    }

    public static void main() {
        System.out.println("main without args");
    }
}
