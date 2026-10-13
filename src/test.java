public class Test {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(2, 3);

        if (result == 5) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED: expected 5 but got " + result);
            System.exit(1); // non-zero exit makes the Jenkins build fail
        }
    }
}