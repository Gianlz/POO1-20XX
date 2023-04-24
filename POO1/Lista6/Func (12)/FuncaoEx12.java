package funcao12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FuncaoEx12 {

    public static String Embaralhar(String palavra) {
        List<String> letters = Arrays.asList(palavra.split(""));
        Collections.shuffle(letters);
        StringBuilder t = new StringBuilder(palavra.length());
        for (String k : letters) {
            t.append(k);
        }
        return t.toString();
    }
}
