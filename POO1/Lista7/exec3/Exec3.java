package lista7.exec3;

public class Exec3 {

    private double num;
    private double num2;

    public Exec3  (int n1, int n2)
    {
        this.num = n1;
        this.num2 = n2;

        System.out.println(num + num2);
        System.out.println(num - num2);
        System.out.println(num * num2);
        System.out.println(num / num2);
    }

    public double getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public  double getNum2() {
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
