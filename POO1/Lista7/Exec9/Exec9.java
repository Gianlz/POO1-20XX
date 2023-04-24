package lista7.Exec9;

public class Exec9 {
    private int canal;
    private int volume;

    public String alterarCanal(int canal) {
        if (canal > 0 && canal <= 10) {
            setCanal(canal);
            return "Canal Alterado com Sucesso!";
        }
        return "Número do Canal Inexistente!";
    }

    public String aumentarVolume() {
        if (volume < 10) {
            setVolume(volume + 1);
            return faixaVolume();
        }
        return "Max";
    }

    public String diminuirVolume() {
        if (volume > 0) {
            setVolume(volume - 1);
            return faixaVolume();
        }
        return "Mudo";
    }

    public String faixaVolume() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < volume; i++) {
            builder.append("+");
        }
        return builder.toString();
    }

    public int getCanal() {
        return canal;
    }
    private void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Televisor [canal=" + canal + ", volume=" + volume + "]";
    }
}