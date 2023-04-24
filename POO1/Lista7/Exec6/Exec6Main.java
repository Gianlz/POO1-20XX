package lista7.Exec6;

import java.util.Scanner;

public class Exec6Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        System.out.print("Informe o quadrado: ");
        float size = input.nextFloat();

        Exec6 square = new Exec6(size);
        builder.append("Size: ");
        builder.append(square.getSize());
        builder.append(System.getProperty("line.separator"));
        builder.append("Area: ");
        builder.append(square.getArea());

        System.out.println(builder.toString());

        input.close();
    }
}