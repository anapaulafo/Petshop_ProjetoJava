package service;
import model.*;
import java.util.ArrayList;

public class FuncionarioService {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }
    public String getFuncionario() {
        return funcionarios.toString();
    }

    public void gerarContrachequeByCPF(String cpf){

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                Funcionario funcionarioConsiderado = funcionario;
                funcionarioConsiderado.gerarContracheque();
                return;
            }
        }
        System.out.println("Funcionário não encontrado!");
    }

    public void baterPontoByCPF(String cpf){
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                Funcionario funcionarioConsiderado = funcionario;
                funcionarioConsiderado.baterPonto();
                return;
            }
        }
        System.out.println("Funcionário não encontrado!");
    }

    public void iniciarMesByCPF(String cpf){
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                Funcionario funcionarioConsiderado = funcionario;
                funcionarioConsiderado.iniciarMes();
                return;
            }
        }
        System.out.println("Funcionário não encontrado!");
    }
}
