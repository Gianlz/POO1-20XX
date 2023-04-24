import java.util.Scanner;


public class ex32 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int codigo;
        int veic;
        int numa;
        int codigoA = 0;
        int codigoa = 0;
        int menora = 1000;
        int maiora = 0;
        int media = 0;
        int mediav = 0;
        int k = 0;

        for(int i = 0; i < 5; i++)
        {
            codigo = entrada.nextInt();
            veic = entrada.nextInt();
            numa = entrada.nextInt();
            media = media + veic;

            if (numa < menora)
            {
                menora = numa;
                codigoa = codigo;
            }

            if (numa > maiora)
            {
                maiora = numa;
                codigoA = codigo;
            }

            if (veic < 2000)
            {
                k++;
                mediav = mediav + numa;
            }
        }

        System.out.println("Maior indice de acidentes: " + maiora + "Cidade: " + codigoA);
        System.out.println("Menor indice de acidentes: " + menora + "Cidade: " + codigoa);
        System.out.println("Media de veiculos: " + (media / 5));
        System.out.println("Media de acidentes em cidades com menos de 2000 veiculos: " + (mediav / k));

        entrada.close();

    }
}