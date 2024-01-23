package accio.assignment.recursion.recursnOnString;

public class stringEncoding {
    public static void main(String[] args) {
        String s = "123";
        encoding(s, 0, "");
    }

    static void encoding(String s, int i, String sub) {
        int n = s.length();
        if (i == n) {
            System.out.println(sub);
            return;
        }
        char c = (char) ((s.charAt(i) - '0') + 96);
        encoding(s, i + 1, sub + c);

        if (i + 1 < n) {
            int num = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
            if (num <= 26) {
                char ch = (char) (num + 96);
                encoding(s, i + 2, sub + ch);
            }
        }

    }

}
