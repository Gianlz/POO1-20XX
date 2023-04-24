package lista7.Exec4;

public class Exec4 {
    private final double INSS = 0.08;
    private final double IR = 0.11;
    private final double sindicato = 0.05;
    private double hganha;
    private double htrabalhado;

    public Exec4 (double ganha, double trabalhado)
    {
        setHganha(ganha);
        setHtrabalhado(trabalhado);
    }

    public void salB ()
    {
        System.out.println((hganha * htrabalhado));
    }

    public void INSS ()
    {
        System.out.println((hganha * htrabalhado) * INSS);
    }

    public void IR ()
    {
        System.out.println((hganha * htrabalhado) * IR );
    }

    public void sindicato ()
    {
        System.out.println((hganha * htrabalhado) * sindicato);
    }

    public void salL ()
    {
        System.out.println((hganha * htrabalhado) - ((hganha * htrabalhado) * INSS) - ((hganha * htrabalhado) * IR) - ((hganha * htrabalhado) * sindicato));
    }

    public double getHganha() {
        return hganha;
    }

    public void setHganha(double hganha) {
        this.hganha = hganha;
    }

    public double getHtrabalhado() {
        return htrabalhado;
    }

    public void setHtrabalhado(double htrabalhado) {
        this.htrabalhado = htrabalhado;
    }
}
