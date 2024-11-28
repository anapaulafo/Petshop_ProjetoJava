import service.*;
import model.*;
import java.util.Scanner;

public class Main {
    private static int idAnimal = 1;
    private static int idServico = 1;
    private static int idAgendamento = 1;
    static ServicoService servicoService = new ServicoService();
    static FuncionarioService funcionarioService = new FuncionarioService();
    static ClienteService clienteService = new ClienteService();
    static AgendamentoService agendamentoService = new AgendamentoService();
    static AnimalService animalService = new AnimalService();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSISTEMA DO PETSHOP");
            System.out.println("1 - Administração");
            System.out.println("2 - Atendimento");
            System.out.println("3 - Controle de Ponto");
            System.out.println("4 - Pagamento");
            System.out.println("5 - Acessar dados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    administrar(scanner);
                    break;
                case 2:
                    atender(scanner);
                    break;
                case 3:
                    controlarPonto(scanner);
                    break;
                case 4:
                    pagar(scanner);
                    break;
                case 5:
                    acessarDados(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void administrar(Scanner scanner) {
        System.out.println("\nADMINISTRAÇÃO");
        System.out.println("1 - Cadastrar serviço");
        System.out.println("2 - Cadastrar funcionário");
        System.out.println("3 - Gerar contracheque");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                Servico servico = new Servico(idServico++);
                System.out.print("Nome do serviço: ");
                servico.setNomeServico(scanner.next());
                System.out.print("Preço do serviço: ");
                servico.setPrecoServico(scanner.nextDouble());
                servicoService.cadastrarServico(servico);
                break;
            case 2:
                System.out.print("Nome do funcionário: ");
                String nomeFuncionario = scanner.next();
                System.out.print("CPF do funcionário: ");
                String cpfFuncionario = scanner.next();
                Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario);
                System.out.print("Salário diário do funcionário: ");
                funcionario.setSalarioDia(scanner.nextDouble());
                funcionarioService.cadastrarFuncionario(funcionario);
                break;
            case 3:
                System.out.println("CPF do funcionário: ");
                String cpfFuncionario2 = scanner.next();
                funcionarioService.gerarContrachequeByCPF(cpfFuncionario2);
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void atender(Scanner scanner) {
        System.out.println("\nATENDIMENTO");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Cadastrar animal");
        System.out.println("3 - Agendar serviço");
        System.out.println("4 - Realizar serviço");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Nome do cliente: ");
                String nomeCliente = scanner.next();
                System.out.print("CPF do cliente: ");
                String cpfCliente = scanner.next();
                Cliente cliente = new Cliente(nomeCliente, cpfCliente);
                System.out.print("Telefone do cliente: ");
                cliente.setTelefone(scanner.next());
                clienteService.cadastrarCliente(cliente);
                break;
            case 2:
                System.out.print("Nome do animal: ");
                String nomeAnimal = scanner.next();
                System.out.print("Espécie do animal: ");
                String especieAnimal = scanner.next();
                Animal animal = new Animal(idAnimal++, nomeAnimal, especieAnimal);
                System.out.print("CPF do dono do animal: ");
                String cpfDono = scanner.next();
                animalService.cadastrarAnimal(animal);
                clienteService.vincularAnimal2(cpfDono, animal);
                break;
            case 3:
                System.out.println("CPF do cliente: ");
                String cpfCliente2 = scanner.next();
                System.out.println("ID do animal: ");
                int idAnimal2 = scanner.nextInt();
                System.out.println("ID do serviço: ");
                int idServico2 = scanner.nextInt();
                System.out.println("Data do agendamento: ");
                String data = scanner.next();
                Agendamento agendamento = new Agendamento(idAgendamento++, cpfCliente2, idAnimal2, idServico2, data);
                agendamentoService.cadastrarAgendamento(agendamento);
                String novonome = clienteService.getNomeClienteByCPF(cpfCliente2);
                agendamento.setNomeCliente(novonome);
                Animal animal2 = animalService.getAnimalById(idAnimal2);
                String novonomeservico = servicoService.getNomeServicoById(idServico2);
                double novoprecoservico = servicoService.getPrecoServicoById(idServico2);
                agendamento.setNomeServico(novonomeservico);
                agendamento.setPrecoServico(novoprecoservico);
                agendamento.setNomeAnimal(animal2.getNomeAnimal());
                break;
            case 4:
                System.out.println("ID do agendamento: ");
                int idAgendamento2 = scanner.nextInt();
                agendamentoService.realizarServico(idAgendamento2);
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void pagar(Scanner scanner) {
        System.out.println("\nREALIZAR PAGAMENTO");
        System.out.println("1 - À Vista");
        System.out.println("2 - A Prazo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Id do agendamento: ");
                int idAgendamento3 = scanner.nextInt();
                agendamentoService.pagarServico(idAgendamento3);
                agendamentoService.gerarPagamentoAVista(idAgendamento3);
                break;
            case 2:
                System.out.println("Id do agendamento: ");
                int idAgendamento4 = scanner.nextInt();
                System.out.println("Quantidade de parcelas: ");
                int parcelas = scanner.nextInt();
                agendamentoService.pagarServico(idAgendamento4);
                agendamentoService.gerarPagamentoAPrazo(idAgendamento4, parcelas);
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void controlarPonto(Scanner scanner) {
        System.out.println("\nCONTROLE DE PONTO");
        System.out.println("1 - Bater ponto");
        System.out.println("2 - Iniciar mês");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("CPF do funcionário: ");
                String cpfFuncionario3 = scanner.next();
                funcionarioService.baterPontoByCPF(cpfFuncionario3);
                break;
            case 2:
                System.out.println("CPF do funcionário: ");
                String cpfFuncionario4 = scanner.next();
                funcionarioService.iniciarMesByCPF(cpfFuncionario4);
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void acessarDados(Scanner scanner) {
        System.out.println("\nDADOS");
        System.out.println("1 - Lista de clientes cadastrados");
        System.out.println("2 - Lista de funcionários cadastrados");
        System.out.println("3 - Lista de serviços cadastrados");
        System.out.println("4 - Lista de agendamentos");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(clienteService.getClientes());
                break;
            case 2:
                System.out.println(funcionarioService.getFuncionario());
                break;
            case 3:
                System.out.println(servicoService.getServicos());
                break;
            case 4:
                System.out.println(agendamentoService.getAgendamentos());
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
