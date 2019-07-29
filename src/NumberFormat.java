public class NumberFormat {

    public static void main(String[] args) {
        long number = 100;

        String s = numberFormat(number);
        System.out.println(s);
    }

    public static String numberFormat(long number) {
        String stringNumber = String.valueOf(number);
        int length = stringNumber.length();
        long mod = length % 3;

        if (length <= 3) {
            return String.valueOf(number);
        }

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < length; i++) {
            if (i > 0) {
                if (i == mod) {
                    stringBuffer.append(",");
                } else if (i % 3 == 1) {
                    stringBuffer.append(",");
                }
            }

            stringBuffer.append(stringNumber.charAt(i));
        }

        return stringBuffer.toString();
    }
}
