import java.lang.String;

public class exercise_07 {
    public static void main(String[] args) {
        String original = "   abcde FGHIJ ABC abc DEFG    ";
        String lower = original.toLowerCase();
        String upper = original.toUpperCase();
        String trim = original.trim();

        System.out.println("toLowerCase: " + lower);
        System.out.println("toUpperCase: " + upper);
        System.out.println("trim: " + trim);
    }
}
