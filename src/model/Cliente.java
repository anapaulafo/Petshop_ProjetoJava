package model;
import java.util.ArrayList;

public class Cliente extends Pessoa{
    private  String telefone;
    private final ArrayList<Animal> animaisCliente = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente(String telefone) {
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf);
        this.telefone = telefone;
    }

    public String getNome() {
        return super.nome;
    }

    public String getCpf() {
        return super.cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getStringAnimais() {
        return animaisCliente.toString();
    }

    public ArrayList getAnimais() {
        return animaisCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefone='" + telefone + '\'' +
                ", animais=" + animaisCliente.toString() +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
