package Variables;

public class Variables {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(x);

        int y;

        y = x + 11;

        System.out.println("y = " + y);
        System.out.println("x = " + x);

        String word = "Lorem ipsum Lorem ipsum";

        System.out.println(word.charAt(15));

        System.out.println(word.indexOf("m"));

        System.out.println((word.length()));

        String word2= "header";

        System.out.println(word.equals(word2));
        System.out.println(!word.equals(word2));

        System.out.println(word.substring(6,11).length());

        System.out.println(word.contains("ipsum"));
        System.out.println("args = [" + args + "]");
        int myStringLen = word.substring(6,11).length();

        String words []= word.split(" ");




    }
}
