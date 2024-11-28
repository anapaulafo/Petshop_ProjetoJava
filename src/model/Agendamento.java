<<<<<<< Updated upstream
package model;

public class Agendamento {
    private final int idAgendamento;
    private final String cpfCliente;
    private final int idAnimal;
    private final int idServico;
    private final String data;
    private boolean pago = false;
    private boolean realizado = false;

    private String nomeCliente;
    private String nomeAnimal;
    private String nomeServico;
    private double precoServico;
    private double desconto;
    private double precoFinal;
    private int qtdeParcelas;
    private double valorParcela;

    public Agendamento(int idAgendamento, String cpfCliente, int idAnimal, int idServico, String data) {
        this.idAgendamento = idAgendamento;
        this.cpfCliente = cpfCliente;
        this.idAnimal = idAnimal;
        this.idServico = idServico;
        this.data = data;
    }

    public void realizarServico(){
        realizado = true;
    }

    public void pagarServico(){
        pago = true;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "idAgendamento=" + idAgendamento +
                ", cpfCliente=" + cpfCliente +
                ", idAnimal=" + idAnimal +
                ", idServico=" + idServico +
                ", data='" + data + '\'' +
                ", pago=" + pago +
                ", realizado=" + realizado +
                '}';
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public int getIdServico() {
        return idServico;
    }

    public String getData() {
        return data;
    }

    public boolean isPago() {
        return pago;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public void setQtdeParcelas(int qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }


    public String toString2() {
        return "Agendamento{" +
                "idAgendamento=" + idAgendamento +
                ", cpfCliente='" + cpfCliente + '\'' +
                ", idAnimal=" + idAnimal +
                ", idServico=" + idServico +
                ", data='" + data + '\'' +
                ", pago=" + pago +
                ", realizado=" + realizado +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", nomeAnimal='" + nomeAnimal + '\'' +
                ", nomeServico='" + nomeServico + '\'' +
                ", precoServico=" + precoServico +
                ", desconto=" + desconto +
                ", precoFinal=" + precoFinal +
                ", qtdeParcelas=" + qtdeParcelas +
                ", valorParcela=" + valorParcela +
                '}';
    }
}
=======
package model;

public class Agendamento {
    private final int idAgendamento;
    private final String cpfCliente;
    private final int idAnimal;
    private final int idServico;
    private final String data;
    private boolean pago = false;
    private boolean realizado = false;

    private String nomeCliente;
    private String nomeAnimal;
    private String nomeServico;
    private double precoServico;
    private double desconto;
    private double precoFinal;
    private int qtdeParcelas;
    private double valorParcela;

    public Agendamento(int idAgendamento, String cpfCliente, int idAnimal, int idServico, String data) {
        this.idAgendamento = idAgendamento;
        this.cpfCliente = cpfCliente;
        this.idAnimal = idAnimal;
        this.idServico = idServico;
        this.data = data;
    }

    public void realizarServico(){
        realizado = true;
    }

    public void pagarServico(){
        pago = true;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "idAgendamento=" + idAgendamento +
                ", cpfCliente=" + cpfCliente +
                ", idAnimal=" + idAnimal +
                ", idServico=" + idServico +
                ", data='" + data + '\'' +
                ", pago=" + pago +
                ", realizado=" + realizado +
                '}';
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public int getIdServico() {
        return idServico;
    }

    public String getData() {
        return data;
    }

    public boolean isPago() {
        return pago;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public void setQtdeParcelas(int qtdeParcelas) {
        this.qtdeParcelas = qtdeParcelas;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }


    public String toString2() {
        return "Agendamento{" +
                "idAgendamento=" + idAgendamento +
                ", cpfCliente='" + cpfCliente + '\'' +
                ", idAnimal=" + idAnimal +
                ", idServico=" + idServico +
                ", data='" + data + '\'' +
                ", pago=" + pago +
                ", realizado=" + realizado +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", nomeAnimal='" + nomeAnimal + '\'' +
                ", nomeServico='" + nomeServico + '\'' +
                ", precoServico=" + precoServico +
                ", desconto=" + desconto +
                ", precoFinal=" + precoFinal +
                ", qtdeParcelas=" + qtdeParcelas +
                ", valorParcela=" + valorParcela +
                '}';
    }
}
>>>>>>> Stashed changes
