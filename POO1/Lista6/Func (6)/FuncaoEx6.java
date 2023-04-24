package funcao6;

public class FuncaoEx6 {

    public static void convertor(int n1, int n2){

        if (n1 > 12)
        {
            n1 = n1 - 12;
        }

        if (n2 >= 60)
        {
            n1 = n1 + 1;
            n2 = 0;
        }

        System.out.print(n1 + ":" + n2 + " ");
    }
}
