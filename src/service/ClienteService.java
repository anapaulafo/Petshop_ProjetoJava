<<<<<<< Updated upstream
package service;
import model.*;
import java.util.ArrayList;

public class ClienteService {
    private final ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }
    public String getClientes() {
        return clientes.toString();
    }

    public String getNomeClienteByCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente.getNome();
            }
        }
        return "Cliente não encontrado.";
    }

    public void getDadosClienteByCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("===DADOS DO CLIENTE===");
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("Animais cadastrados: " + cliente.getStringAnimais());
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }


    public void vincularAnimal2(String cpf, Animal animal) {
        Cliente cliente = null;

        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                cliente = c;
                break;
            }
        }

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        cliente.getAnimais().add(animal);

        System.out.println("Animal vinculado com sucesso ao cliente " + cliente.getNome());
    }


}
=======
package service;
import model.*;
import java.util.ArrayList;

public class ClienteService {
    private final ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }
    public String getClientes() {
        return clientes.toString();
    }

    public String getNomeClienteByCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente.getNome();
            }
        }
        return "Cliente não encontrado.";
    }

    public void getDadosClienteByCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("===DADOS DO CLIENTE===");
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("Animais cadastrados: " + cliente.getStringAnimais());
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }


    public void vincularAnimal2(String cpf, Animal animal) {
        Cliente cliente = null;

        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                cliente = c;
                break;
            }
        }

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        cliente.getAnimais().add(animal);

        System.out.println("Animal vinculado com sucesso ao cliente " + cliente.getNome());
    }


}
>>>>>>> Stashed changes
