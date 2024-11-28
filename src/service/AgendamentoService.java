package service;
import model.*;
import java.util.ArrayList;

public class AgendamentoService {
    private final ArrayList<Agendamento> agendamentos = new ArrayList<>();

    public void cadastrarAgendamento(Agendamento agendamento) {
        this.agendamentos.add(agendamento);
        System.out.println("Agendamento cadastrado com sucesso!");
    }

    public String getAgendamentos() {
        return agendamentos.toString();
    }

    public Agendamento getAgendamentoById(int idAgendamento) {
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getIdAgendamento() == idAgendamento) {
                return agendamento;
            }
        }
        return null;
    }

    public void realizarServico(int idAgendamento) {
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getIdAgendamento() == idAgendamento) {
                agendamento.realizarServico();
                System.out.println("Serviço realizado com sucesso!");
                return;
            }
        }
        System.out.println("Agendamento não encontrado!");
    }

    public void pagarServico(int idAgendamento) {
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getIdAgendamento() == idAgendamento) {
                agendamento.pagarServico();
                System.out.println("Pagamento realizado com sucesso!");
                return;
            }
        }
        System.out.println("Agendamento não encontrado!");
    }



    public void gerarPagamentoAVista(int idAgendamento){
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getIdAgendamento() == idAgendamento) {
                Agendamento agendamentoConsiderado = agendamento;
                String nomeClienteConsiderado = agendamentoConsiderado.getNomeCliente();
                String nomeAnimalConsiderado = agendamentoConsiderado.getNomeAnimal();
                String nomeServicoConsiderado = agendamentoConsiderado.getNomeServico();
                double precoServicoConsiderado = agendamentoConsiderado.getPrecoServico();
                double desconto = precoServicoConsiderado * 0.1;
                double precoFinal = precoServicoConsiderado * 0.9;
                agendamentoConsiderado.pagarServico();

                System.out.println("===RECIBO===");
                System.out.println("Cliente: " + nomeClienteConsiderado);
                System.out.println("Animal: " + nomeAnimalConsiderado);
                System.out.println("Servico realizado: " + nomeServicoConsiderado);
                System.out.println("Valor: R$" + precoServicoConsiderado);
                System.out.println("Desconto à vista (10%): " + desconto);
                System.out.println("Preço final: R$" + precoFinal);
                System.out.println("====================");

                return;
            }
        }
        System.out.println("Agendamento não encontrado!");
    }

    public void gerarPagamentoAPrazo(int idAgendamento, int qtdeParcelas){
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getIdAgendamento() == idAgendamento) {
                Agendamento agendamentoConsideradoPrazo = agendamento;
                String nomeClienteConsiderado = agendamentoConsideradoPrazo.getNomeCliente();
                String nomeAnimalConsiderado = agendamentoConsideradoPrazo.getNomeAnimal();
                String nomeServicoConsiderado = agendamentoConsideradoPrazo.getNomeServico();
                double precoServicoConsiderado = agendamentoConsideradoPrazo.getPrecoServico();
                double valorParcela = precoServicoConsiderado / qtdeParcelas;
                agendamentoConsideradoPrazo.pagarServico();

                System.out.println("===RECIBO===");
                System.out.println("Cliente: " + nomeClienteConsiderado);
                System.out.println("Animal: " + nomeAnimalConsiderado);
                System.out.println("Servico realizado: " + nomeServicoConsiderado);
                System.out.println("Valor: R$" + precoServicoConsiderado);
                System.out.println("Pagamento em " + qtdeParcelas + " de R$ " + valorParcela);
                System.out.println("====================");

                return;
            }
        }
        System.out.println("Agendamento não encontrado!");
    }

}




