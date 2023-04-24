package funcao2;

public class FuncaoEx2 {
    public static void mostrarDiferente(int n1) {

        int z = 1;

        for (int i = 0; i < n1; i++) {
            // Adiciona os espaços em branco
            for (int k = 0; k < n1; k++) {
                if (i + k < n1 - 1)
                    System.out.print("");
                else
                    System.out.print(z + i);
            }
            System.out.print("\n");
        }
    }
}
