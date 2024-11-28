# 😺 Projeto Java: Sistema para estabelecimento PetShop 🐶
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)


## 💬 Apresentação
Projeto apresentado para o componente curricular Linguagem de Programação I ministrado pela professora Fernanda Nobrega Martins Dias para obtenção de nota para a 2ª unidade.

## 💁‍♀️ Autoras
Ana Carolina da Matta Cartaxo
Ana Paula Ferreira Oliveira
Anna Luiza Britto de Lima

## 📝 Descrição
O projeto consiste em um sistema para um estabelecimento PetShop, onde é possível cadastrar, remover, atualizar e listar os animais, os clientes, os serviços, além de calcular o valor total de serviços prestados e proporcionar opções de pagamento à vista e a prazo. O sistema também inclui um sistema básico de controle de ponto diário de funcionários e geração de contracheque baseado no ponto.

## 🗺️ Mapa das funcionalidades
![Mapa de funcionalidades](/SistemaPetshop.jpg)
Descrição de classes e métodos

## 📝 Instruções para uso
Para utilizar o sistema, basta clonar o repositório e executar o arquivo Main.java.
O sistema é baseado em um menu interativo que permite a navegação entre as funcionalidades disponíveis.
- Funções administrativas
    - Cadastrar funcionários
        - Para cadastrar funcionários, basta acessar o menu "Administração" e selecionar a opção "Cadastrar funcionário". O sistema solicitará o nome do funcionário e o salário base.
        - Para consultar os funcionários cadastrados, basta acessar o menu "Acessar dados" e selecionar a opção "Listar funcionários". O sistema automaticamente listará os funcionários cadastrados, com as informações de cada funcionário, inclusive de dias trabalhados.
    - Fazer controle de ponto e gerar contracheques
        - Para fazer o controle de ponto, basta acessar o menu "Controle Ponto" e selecionar a opção "Bater ponto". O sistema solicitará o cpf do funcionário e adicionará aos dias trabalhados.
        - Para gerar o contracheque, basta acessar o menu "Administração" e selecionar a opção "Gerar contracheque". O sistema solicitará o cpf do funcionário e automaticamente recuperará os dados do funcionário, calculando o salário para os dias trabalhados, os descontos devidos e imprimirá o resultado.
        - Após gerar contracheque, acesse o menu "Controle Ponto" e selecione a opção "Iniciar mês" para zerar o contador de dias trabalhados.
    - Cadastrar serviços
        - Para cadastrar serviços, basta acessar o menu "Administração" e selecionar a opção "Cadastrar serviço". O sistema solicitará o nome do serviço e o valor.
        - Para consultar os serviços cadastrados, basta acessar o menu "Acessar dados" e selecionar a opção "Listar serviços". O sistema automaticamente listará os serviços cadastrados, com as informações de cada serviço.

- Funções de atendimento
    - Cadastrar clientes e animais
        - Para cadastrar clientes, basta acessar o menu "Atendimento" e selecionar a opção "Cadastrar cliente". O sistema solicitará o nome do cliente, o cpf e o telefone.
        - Para cadastrar animais, basta acessar o menu "Atendimento" e selecionar a opção "Cadastrar animal". O sistema solicitará o nome do animal, a espécie, e o cpf do dono e vinculará automaticamente o registro do animal ao seu dono.
        - Para consultar os clientes cadastrados, basta acessar o menu "Acessar dados" e selecionar a opção "Listar clientes". O sistema automaticamente listará os clientes cadastrados, com as informações de cada cliente e seus respectivos animais.
    - Agendar e gerenciar prestação de serviços
        - Para agendar serviços, basta acessar o menu "Atendimento" e selecionar a opção "Agendar serviço". O sistema solicitará o cpf do cliente, o id do animal, o id do serviço e a data do serviço. O sistema automaticamente preencherá os dados e cadastrará o serviço.
        - Para informar que o serviço foi realizado, basta acessar o menu "Atendimento" e selecionar a opção "Realizar serviço". O sistema solicitará o id do serviço e marcará o serviço como realizado.
        - Para consultar os serviços agendados, basta acessar o menu "Acessar dados" e selecionar a opção "Listar serviços". O sistema automaticamente listará os serviços agendados, com as informações de cada serviço.
    - Gerar pagamento e recibos
        - Para gerar pagamento, basta acessar o menu "Atendimento" e selecionar a opção correspondente ao tipo de pagamento. O sistema solicitará o id do serviço e o número de parcelas (se aplicável). O sistema automaticamente preencherá os dados e calculará o valor total do serviço, imprimindo o recibo e registrando como pago no banco de dados.
        - Para consultar os serviços realizados, basta acessar o menu "Acessar dados" e selecionar a opção "Listar serviços". O sistema automaticamente listará os serviços realizados, com as informações de cada serviço se foi ou não realizado e se está ou não pago.

## 📝 Tabela de atributos e métodos

| CLASSE             | ATRIBUTO        | MÉTODO                 | DESCRIÇÃO                                                                                                                                       |
|--------------------|-----------------|------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|
| Pessoa             | Nome            |                        | String - Nome da   pessoa                                                                                                                       |
|                    | CPF             |                        | String - CPF   identificador da pessoa                                                                                                          |
|                    |                 | Construtor             | Construtor                                                                                                                                      |
|                    |                 | Getter/Setter          | Getter/Setter                                                                                                                                   |
| Funcionário        | Super.Nome      |                        | String - Nome da pessoa                                                                                                                         |
|                    | Super.CPF       |                        | String - CPF identificador da pessoa                                                                                                            |
|                    | salarioDia      |                        | double - Salário por dia                                                                                                                        |
|                    | diasTrabalhados |                        | int - Contador de dias trabalhados até   o contracheque                                                                                         |
|                    | descontoINSS    |                        | double - Desconto calculado com base   no salarioBruto                                                                                          |
|                    | salarioBruto    |                        | double - Calculado com base nos   diasTrabalhados                                                                                               |
|                    | salarioLiquido  |                        | double - Calculado com base no   salarioBruto e no descontoINSS                                                                                 |
|                    |                 | Construtor             | Construtor                                                                                                                                      |
|                    |                 | Getter/Setter          | Getter/Setter                                                                                                                                   |
|                    |                 | BaterPonto             | Incrementa a variável   diasTrabalhados                                                                                                         |
|                    |                 | iniciarMês             | Zera a variável   diasTrabalhados                                                                                                               |
|                    |                 | gerarContracheque      | Calcula salarioBruto   com base em diasTrabalhados, calcula desconto INSS, calcula salarioLiquido e   imprime contracheque                      |
| Cliente            | Super.Nome      |                        | String - Nome da pessoa                                                                                                                         |
|                    | Super.CPF       |                        | String - CPF identificador da pessoa                                                                                                            |
|                    | Telefone        |                        | String - Telefone do   cliente                                                                                                                  |
|                    | animaisCliente  |                        | ArrayList de animais do cliente                                                                                                                 |
|                    |                 | Construtor             | Construtor                                                                                                                                      |
|                    |                 | Getter/Setter          | Getter/Setter                                                                                                                                   |
| Animal             | idAnimal        |                        | int - Incremental   identificador do animal                                                                                                     |
|                    | nomeAnimal      |                        | String - Nome do animal                                                                                                                         |
|                    | especie         |                        | String - Espécie do   animal                                                                                                                    |
|                    |                 | Construtor             | Construtor                                                                                                                                      |
|                    |                 | Getter/Setter          | Getter/Setter                                                                                                                                   |
| Servico            | idServico       |                        | int - Incremental   identificador do serviço                                                                                                    |
|                    | nomeServico     |                        | String - Nome do serviço                                                                                                                        |
|                    | precoServico    |                        | double - Preço do serviço                                                                                                                       |
|                    |                 | Construtor             | Construtor                                                                                                                                      |
|                    |                 | Getter/Setter          | Getter/Setter                                                                                                                                   |
| Agendamento        |                 |                        |                                                                                                                                                 |
|                    | idAgendamento   |                        | int - Incremental identificador do   agendamento                                                                                                |
|                    | cpfCliente      |                        | String - Identificador do cliente                                                                                                               |
|                    | nomeCliente     |                        | String - A ser preenchido conforme   busca pelo cpf do cliente                                                                                  |
|                    | idAnimal        |                        | int - Identificador   do animal                                                                                                                 |
|                    | nomeAnimal      |                        | String - A ser preenchido conforme   busca pelo id do animal                                                                                    |
|                    | idServico       |                        | int - Identificador   do serviço                                                                                                                |
|                    | nomeServico     |                        | String - A ser preenchido conforme   busca pelo id do serviço                                                                                   |
|                    | precoServico    |                        | double - A ser preenchido conforme   busca pelo id do serviço                                                                                   |
|                    | data            |                        | String - Data do   agendamento                                                                                                                  |
|                    | pago            |                        | boolean - Se o   serviço está pago (default: false)                                                                                             |
|                    | realizado       |                        | boolean - Se o   serviço foi realizado (default: false)                                                                                         |
|                    |                 | Construtor             | Construtor                                                                                                                                      |
|                    |                 | Getter/Setter          | Getter/Setter                                                                                                                                   |
|                    |                 | realizarServiço        | Muda variável   realizado para true                                                                                                             |
|                    |                 | pagarServiço           | Muda variável pago   para true                                                                                                                  |
| FuncionarioService | funcionarios    |                        | ArrayList - Cadastro de todos os   funcionários                                                                                                 |
|                    |                 | cadastrarFuncionario   | Adiciona funcionário   no array funcionarios                                                                                                    |
|                    |                 | gerarContrachequeByCPF | Busca funcionario no   array pelo CPF e executa método gerarContracheque                                                                        |
|                    |                 | baterPontoByCPF        | Busca funcionario no   array pelo CPF e executa método baterPonto                                                                               |
|                    |                 | iniciarMesByCPF        | Busca funcionario no   array pelo CPF e executa método iniciarMes                                                                               |
|                    |                 | getFuncionarios        | Lista todo o array de   cadastros                                                                                                               |
| ServicoService     | servicos        |                        | ArrayList - Cadastro   de todos os servicos                                                                                                     |
|                    |                 | cadastrarServico       | Adiciona servico no   array servicos                                                                                                            |
|                    |                 | getNomeServicoById     | Busca servico no   array pelo id e retorna nomeServico                                                                                          |
|                    |                 | getPrecoServicoById    | Busca servico no   array pelo id e retorna precoServico                                                                                         |
|                    |                 | getServicos            | Lista todo o array de   cadastros                                                                                                               |
| AnimalService      | animais         |                        | ArrayList - Cadastro   de todos os animais                                                                                                      |
|                    |                 | cadastrarAnimal        | Adiciona animal no   array animais                                                                                                              |
|                    |                 | getAnimalById          | Busca animal no array   pelo id e retorna animal                                                                                                |
|                    |                 | getAnimais             | Lista todo o array de   cadastros                                                                                                               |
| ClienteService     | clientes        |                        | ArrayList - Cadastro   de todos os clientes                                                                                                     |
|                    |                 | cadsatrarCliente       | Adiciona cliente no   array clientes                                                                                                            |
|                    |                 | vincularAnimal         | Busca cliente pelo   cpf, acessa seu array animais e adiciona o animal no array                                                                 |
|                    |                 | getClientes            | Lista todo o array de   cadastros                                                                                                               |
| AgendamentoService | agendamentos    |                        | ArrayList - Cadastro de todos os   agendamentos                                                                                                 |
|                    |                 | cadastrarAgendamento   | Adiciona agendamento   no array agendamentos                                                                                                    |
|                    |                 | realizarServico        | Busca agendamento no   array pelo id e executa método realizarServico                                                                           |
|                    |                 | pagarServico           | Busca agendamento no   array pelo id e executa método pagarServico                                                                              |
|                    |                 | gerarPagamentoAVista   | Busca agendamento no   array pelo id, recupera dados de nome do cliente, animal, serviço e preço do   serviço, calcula desconto e emite recibo. |
|                    |                 | gerarPagamentoAPrazo   | Busca agendamento no   array pelo id, recupera dados de nome do cliente, animal, serviço e preço do   serviço, calcula parcelas e emite recibo. |
|                    |                 | getAgendamentos        | Lista todo o array de   cadastros                                                                                                               |