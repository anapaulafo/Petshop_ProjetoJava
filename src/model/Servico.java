package model;

public class Servico {
    private int idServico;
    private String nomeServico;
    private double precoServico;

    public Servico(int idServico, String nomeServico, double precoServico) {
        this.idServico = idServico;
        this.nomeServico = nomeServico;
        this.precoServico = precoServico;
    }

    public Servico() {
    }

    public Servico(int idServico) {
        this.idServico = idServico;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "idServico=" + idServico +
                ", nomeServico='" + nomeServico + '\'' +
                ", precoServico=" + precoServico +
                '}';
    }

    public int getIdServico() {
        return idServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }
}
