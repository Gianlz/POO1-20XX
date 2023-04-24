package lista7.exec2;

public class Exec2 {

    private int num;
    private int num2;

    public Exec2  (int n1, int n2)
    {
        this.num = n1;
        this.num2 = n2;

        if (n1 > n2)
        {
            System.out.println("Reversão em andamento");
            num = num2 + num;
            num2 = num - num2;
            num = num - num2;
        }

        for (int i = num + 1; i < num2; i++)
        {
            System.out.println(i);
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public  int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("numero 1 = ");
        builder.append(num);
        builder.append(", numero 2 = ");
        builder.append(num2);
        return builder.toString();
    }

}
