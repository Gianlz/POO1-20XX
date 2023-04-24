package funcao10;

public class FuncaoEx10 {

    public static int craps(int n1,int n2){


        if (n2 == 0 && n1 == 7 || n2 == 0 && n1 == 11)
        {
            System.out.println("Natural");
        }
        else if (n2 == 0 && n1 == 2 || n2 == 0 && n1 == 3 || n2 == 0 && n1 == 12)
        {
            System.out.println("Craps");
        }
        else if (n1 == 4 || n1 == 5 || n1 == 6 || n1 == 8 || n1 == 9 || n1 == 10)
        {
            n2++;
        }

        if (n2 > 0 && n1 == 7)
        {
            System.out.println("Perdeu");
        }

        return n2;
    }
}
