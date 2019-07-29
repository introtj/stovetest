import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Sort {

    public static void main(String[] args) throws IOException {
        Long number = 100L;

        Map<Long, Boolean> longBooleanHashMap = readFromFile();

        Boolean aBoolean = existNumber(number, longBooleanHashMap);

        if (aBoolean) {
            System.out.println(number.toString() + " is exist.");
        } else {
            System.out.println(number.toString() + " is not exist.");
        }
    }

    private static Boolean existNumber(Long number, Map<Long, Boolean> longBooleanHashMap) {
        return longBooleanHashMap.get(number);
    }

    private static Map<Long, Boolean> readFromFile() throws IOException {
        File file = new File("src/sample.txt");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String number;
        Map<Long, Boolean> hashMap = new HashMap<>();

        while ((number = bufferedReader.readLine()) != null) {

            hashMap.put(Long.valueOf(number), true);
        }

        return hashMap;
    }


}
