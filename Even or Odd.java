public class EvenOdd {
    public static void main(String[] args) {
        int number = 42;
        if ((number & 1) == 0)
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is odd.");
    }
}
