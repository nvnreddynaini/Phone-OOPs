public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Landline l1 = new Landline("123");

        Landline l2 = new Landline("786");

        l1.dailNo("786");

        l2.receivePhone("786");

        boolean isAnswer = l2.answerPhone();
    }
}