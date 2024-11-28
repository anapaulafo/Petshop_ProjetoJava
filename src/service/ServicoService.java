package service;
import model.*;
import java.util.ArrayList;

public class ServicoService {
    private ArrayList<Servico> servicos = new ArrayList<>();

    public void cadastrarServico(Servico servico) {
        this.servicos.add(servico);
        System.out.println("Serviço cadastrado com sucesso!");
    }

    public String getServicos() {
        return servicos.toString();
    }

    public String getNomeServicoById(int IdServico) {
        for (Servico servico : servicos) {
            if (servico.getIdServico() == IdServico) {
                return servico.getNomeServico();
            }
        }
        return "Serviço não encontrado.";
    }

    public double getPrecoServicoById(int IdServico) {
        for (Servico servico : servicos) {
            if (servico.getIdServico() == IdServico) {
                return servico.getPrecoServico();
            }
        }
        return 0;
    }
}