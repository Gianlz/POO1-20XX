package funcao9;

public class FuncaoEx9 {

    public static int reverter (int n1){

        int i = 0;

        while (n1 > 0) {
            i *= 10;
            i += (n1 % 10);
            n1 /= 10;
        }
        return i;
    }
}
