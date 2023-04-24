package lista7.Exec10;

public class Exec10 {
    public static final int TIPO_DISEL = 0;
    public static final int TIPO_GASOLINA = 1;
    public static final int TIPO_ALCOOL = 2;

    private int tipoCombustivel;
    private float valorLitro;
    private float qtdCombustivel = 1000f;

    Exec10(int tipoCombustivel, float valorLitro) {
        setTipoCombustivel(tipoCombustivel);
        setValorLitro(valorLitro);
    }

    public float abastercerPorValor(float dinheiro) {
        float litros = dinheiro/valorLitro;
        setQtdCombustivel(qtdCombustivel - litros);
        return litros;
    }

    public float abastercerPorLitro(float litros) {
        float dinheiro = litros * valorLitro;
        setQtdCombustivel(qtdCombustivel - litros);
        return dinheiro;
    }

    public boolean alterarValor(float valorLitro) {
        if (valorLitro > 0) {
            setValorLitro(valorLitro);
            return true;
        }
        return false;
    }

    public boolean alterarCombustivel(int tipoCombustivel) {
        if (tipoCombustivel == TIPO_DISEL || tipoCombustivel == TIPO_GASOLINA || tipoCombustivel == TIPO_ALCOOL) {
            setTipoCombustivel(tipoCombustivel);
            return true;
        }
        return false;
    }

    public int getTipoCombustivel() {
        return tipoCombustivel;
    }
    private void setTipoCombustivel(int tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public float getValorLitro() {
        return valorLitro;
    }
    private void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }
    public float getQtdCombustivel() {
        return qtdCombustivel;
    }
    private void setQtdCombustivel(float qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }


}
