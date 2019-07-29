import java.util.HashSet;

public class EncodeURL {
    private static HashSet<Integer> unreserved;

    static {
        unreserved = new HashSet<>();

        int i = 0;
        for (i = 'A'; i <= 'Z'; i++) {
            unreserved.add(i);
        }

        for (i = 'a'; i <= 'z'; i++) {
            unreserved.add(i);
        }

        for (i = '0'; i <= '9'; i++) {
            unreserved.add(i);
        }

        unreserved.add(45); // -
        unreserved.add(95); // _
        unreserved.add(46); // .
        unreserved.add(126); // ~

    }
    public EncodeURL() {
        unreserved = new HashSet<>();
    }

    public static void main(String[] args) {
        // write your code here


        String string = "http://www.google.com/asdfasd\0asdfasdfasdfasf";
        String encodedURL = "http%3A%2F%2Fwww.google.com%2Fasdfasd";

        EncodeURL(string);
        DecodeURL(encodedURL);
    }

    private static void DecodeURL(String encodedURL) {
        // hex to dec
    }

    private static void EncodeURL(String string) {
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < string.length(); i++) {
            int ascii = string.charAt(i);

            if (ascii == 0) {
                break;
            }

            if (!unreserved.contains(ascii)) {
                stringBuffer.append("%" + Integer.toHexString(string.charAt(i)).toUpperCase());
            } else {
                stringBuffer.append(string.charAt(i));
            }
        }

        System.out.println(stringBuffer.toString());
    }
}
