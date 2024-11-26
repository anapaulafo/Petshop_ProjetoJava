package model;



public class Funcionario extends Pessoa{
    private double salarioDia;
    private int diasTrabalhados = 0;
    private double descontoINSS;
    private double salarioBruto;
    private double salarioLiquido;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getCpf() {
        return super.cpf;
    }

    public void setSalarioDia(double salarioDia) {
        this.salarioDia = salarioDia;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioDia=" + salarioDia +
                ", diasTrabalhados=" + diasTrabalhados +
                '}';
    }

    public Funcionario(double salarioDia, int diasTrabalhados, double descontoINSS, double salarioBruto, double salarioLiquido) {
        this.salarioDia = salarioDia;
        this.diasTrabalhados = diasTrabalhados;
        this.descontoINSS = descontoINSS;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public Funcionario(String nome, String cpf, double salarioDia, int diasTrabalhados, double descontoINSS, double salarioBruto, double salarioLiquido) {
        super(nome, cpf);
        this.salarioDia = salarioDia;
        this.diasTrabalhados = diasTrabalhados;
        this.descontoINSS = descontoINSS;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public void baterPonto(){
        diasTrabalhados++;
    }

    public void iniciarMes(){
        diasTrabalhados = 0;
    }

    public void gerarContracheque(){
        salarioBruto = diasTrabalhados * salarioDia;
        if (salarioBruto <= 2112) {
            descontoINSS = 0;
        } else if (salarioBruto > 2112 && salarioBruto <= 2826.65){
            descontoINSS = salarioBruto * 0.075;
        } else if (salarioBruto > 2826.65 && salarioBruto <= 3751.05){
            descontoINSS = salarioBruto * 0.15;
        } else if (salarioBruto > 3751.05 && salarioBruto <= 4664.68){
            descontoINSS = salarioBruto * 0.225;
        } else {
            descontoINSS = salarioBruto * 0.275;
        }
        salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("===CONTRACHEQUE===");
        System.out.println("Funcionário: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Dias trabalhados no mês: " + diasTrabalhados);
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Desconto INSS: R$" + descontoINSS);
        System.out.println("Salário Liquido: R$" + salarioLiquido);
        System.out.println("====================");
    }
}
