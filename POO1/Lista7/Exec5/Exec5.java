package lista7.Exec5;

import java.util.Arrays;

public class Exec5 {
    public static final float[] cardapio = {1.2f, 1.3f, 1.5f, 1.2f, 1.3F, 1f};
    private int[] itens = {0, 0, 0, 0, 0, 0};

    public int[] getItens() {
        return itens;
    }

    public void setItens(int id, int qtd) {
        if (qtd > 0) {
            itens[id] += qtd;
        }
    }

    public String getCardapio() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < cardapio.length; i++) {
            builder.append(i);
            builder.append(" - R$ ");
            builder.append(cardapio[i]);
            builder.append(System.getProperty("line.separator"));
        }

        return builder.toString();
    }

    public float getTotalItem(int id)
    {
        return itens[id] * cardapio[id];
    }

    public float getTotal()
    {
        float total = 0;
        for (int id = 0; id < itens.length; id++) {
            total += getTotalItem(id);
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cardapio [itens=");
        builder.append(Arrays.toString(itens));
        builder.append("]");
        return builder.toString();
    }
}