package boundary;

import java.util.LinkedList; 
import java.util.Scanner;
import Entity.Vaga;
import Entity.Candidatura;
import Entity.Campanha;
import control.CtrlCandidaturas;
import control.CtrlVagas;
import control.CtrlCampanhas;

public class Menu {
    public static void main(String[] args) {

        //Inicialização do Scanner e da variável que guarda as opçóes dos menus
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int opcao_menu_vagas = 0;
        
        
        //Iniciando controllers 
        CtrlVagas controladorVagas = new CtrlVagas();
        CtrlCandidaturas controladorCandidaturas = new CtrlCandidaturas();
        CtrlCampanhas controladorCampanhas = new CtrlCampanhas();

        //Tela inicial e Perguntar se é o usuário é ONG ou Voluntário
        System.out.println("Bem-vindo à Rede + Social!\n");
   
        do {
        	System.out.println("Por favor, indique se você é: \n1.Voluntário\n2.ONG\n3.Sair da aplicação");
            if (scanner.hasNextInt()) {
            	int ong_ou_voluntario = scanner.nextInt();
                scanner.nextLine();

                if (ong_ou_voluntario == 1 || ong_ou_voluntario == 2) {
                	//Login
                    System.out.println("LOGIN (Meramente ilustrativo)");
                    System.out.println("Digite seu e-mail: ");
                    String email = scanner.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senha = scanner.nextLine();

                    //Menu
                    if (ong_ou_voluntario == 1) { //menu caso o usuário seja Voluntário
                        do {
                            System.out.println("Menu de opções:");
                            System.out.println("1. Listar Vagas.");
                            System.out.println("2. Solicitar Candidatura em vaga de campanha.");
                            System.out.println("3. Voltar para a tela inicial de seleção de usuário.");
                            System.out.println("Digite uma opção: ");

                            opcao = scanner.nextInt(); //Guarda a opção digitada pelo usuário

                            switch(opcao) {
                                case 1:
                                    LinkedList<Vaga> listaVagas = controladorVagas.listarVagas();
                                    if (listaVagas.isEmpty()) {
                                        System.out.println("Não há vagas disponíveis.\n");
                                    } else {
                                        for (Vaga vaga : listaVagas) {
                                            System.out.println(vaga.toString()); // Imprime a representação textual da vaga
                                        }
                                    }
                                    break;
                                case 2:
                                	
                                	System.out.print("Digite o nome da campanha em que você quer se candidatar: ");
                                    String nomeCampanha = scanner.nextLine();
                                    
                                    System.out.print("Digite o título da vaga que você quer se candidatar: ");
                                    String titulo =  scanner.nextLine();

                                    if (! controladorVagas.validaVaga(titulo,nomeCampanha)) {
                                        System.out.println("Vaga não encontrada."); //Mensagem retornada caso a vaga e ong digitada não correspondam */
                                    }else {//Caso correspondam, o processo de candidatura continua
                                        System.out.println("Termos e condições: Pelo presente Termo de Adesão e ciente da Lei n. 9.608/1998 que rege o trabalho voluntário, decido espontaneamente\nrealizar atividade voluntária nesta organização. Declaro, ainda, que estou ciente de que o trabalho não será remunerado e que\nnão configurará vínculo empregatício ou gerará qualquer obrigação de natureza trabalhista, previdenciária ou afim. Declaro, por fim, \nque estou ciente de que eventuais danos pessoais ou materiais causados no exercício do trabalho voluntário serão de total e integral responsabilidade minha e não serão imputados à esta organização.\n");
                                        System.out.println("Aceita os termos (sim / não): ");
                                        String aceite = scanner.nextLine(); //Guarda a resposta de aceitação do usuário
                                        if (aceite.equals("sim")){//Caso o usuário concorde com os termos, o processo de candidatura continua
                                            //Candidatura candidatura = new Candidatura();
                                            System.out.println("------- Formulário de Candidatura -------");
                                            System.out.println("Por favor, digite suas informações.");
                                            System.out.println("Nome Completo: ");
                                            String nome = scanner.nextLine();
                                            //candidatura.setNome(nome);
                                            System.out.println("Data de Nascimento (formato DD/MM/AAAA, com /): ");
                                            String data_nascimento = scanner.nextLine();
                                            //candidatura.setData_nascimento(data_nascimento);
                                            System.out.println("Descrição (um breve resumo sobre você e motivação de sua candidatura): ");
                                            String descricao = scanner.nextLine();
                                            //candidatura.setDescricao(descricao);
                                            controladorCandidaturas.solicitaCandidatura(nome,data_nascimento,descricao);
                                            //listaCandidaturas.add(candidatura); //Adiciona a candidatura criada na lista de candidaturas
                                            System.out.println("Candidatura realizada com sucesso!\n");
                                        } else {//Caso o usuário não concorde com os termos, o processo de candidatura é finalizado e é voltado para o menu de opções
                                            break;
                                        }
                                    }
                                case 3:
                                	//Volta para a tela de seleção de usuário
                                	break;
                                default:
                                	System.out.println("Opção inválida. Por favor, digite novamente.\n");
                            } //fim do switch case
                        } while (opcao != 3);
                    }else if(ong_ou_voluntario == 2) { //Menu caso o usuário seja ONG
                        do {
                            System.out.println("Menu de opções:");
                            System.out.println("1. Listar Campanhas Existentes.");
                            System.out.println("2. Criar Campanha.");
                            System.out.println("3.");
                            System.out.println("4. Revisar Candidatura.");
                            System.out.println("5. Voltar para a tela inicial de seleção de usuário.");
                            System.out.println("Digite uma opção: ");

                            opcao = scanner.nextInt(); //Guarda a opção digitada pelo usuário

                            switch(opcao) {
                                case 1:
                                	LinkedList <Campanha> listaCampanhas = controladorCampanhas.listarCampanhas();
                                    if (listaCampanhas.isEmpty()) {
                                    	System.out.println("Não existem campanhas no momento.\n");
                                    } else {
                                    	for (Campanha campanha : listaCampanhas) {
                                    		System.out.println(campanha.toString());
                                    	}
                                    }
                                    break;
                                case 2:
                                    //Campanha campanha = new Campanha();
                                	
                                    System.out.println("Digite o nome da campanha: ");
                                    scanner.nextLine(); //limpar buffer
                                    String nome_camp = scanner.nextLine();
                          
                                    //campanha.setNome(nome_campanha);
                                    
                                    System.out.println("Digite a descrição da campanha: ");
                                    String desc_camp = scanner.nextLine();
                                    
                                    //campanha.setDescricao(descricao_campanha);
                                    
                                    System.out.println("Digite o local da campanha: ");
                                    String local_camp = scanner.nextLine();
                                    
                                    //campanha.setLocal(local_campanha);
                                    
                                    
                                    System.out.println("Digite a data da campanha: ");
                                    String data_camp = scanner.nextLine();
                                    
                                    //campanha.setData(data_campanha);
                                    
                                    System.out.println("Digite o número de vagas totais disponíveis na campanha: ");
                                    int num_vagas = scanner.nextInt();
                                    
                                    controladorCampanhas.criarCampanha(nome_camp, desc_camp, local_camp, data_camp, num_vagas);
                                    
                                    Campanha campanha = controladorCampanhas.buscarCampanha(nome_camp);
                                    
                                    //Menu para adicionar tipos de vagas diferentes e suas quantidades
                                    System.out.println("Agora, adicione os tipos de vagas disponíveis e suas quantidades (ou sair)");
                                    while(opcao_menu_vagas != 2) {
                                    	System.out.println("1. Adicionar tipo de vaga disponível");
                                        System.out.println("2. Sair\n");
                                        opcao_menu_vagas = scanner.nextInt();
                                     
                                        if (opcao_menu_vagas == 1) {
                                        	System.out.println("Digite o titulo de vaga disponível: (Exemplo: Cozinheiro) \n");
                                        	scanner.nextLine(); //limpa o buffer
                                            String titulo_vaga = scanner.nextLine();
                                            
                                            System.out.println("Digite a quantidade de vagas disponíveis para essa vaga: (Exemplo: 5) \n");
                                            int qtd_titulo_vaga = scanner.nextInt();
                                            
                                            controladorCampanhas.addVagaCampanha(campanha, titulo_vaga, qtd_titulo_vaga);
                                            
                                            System.out.println("Vaga adicionada com sucesso.\n");
                                        }
                                    }
                                    
                                    //listaCampanhas.add(campanha); //Adiciona a campanha criada na lista de campanhas
                                    System.out.println("Campanha criada com sucesso!\n");
                                    break;
                                case 3:
                                    break;
                                case 4:

                                    break;
                                case 5:
                                	//Volta paara a tela de seleção de usuário
                                	break;
                                default:
                                	System.out.println("Opção inválida. Por favor, digite novamente.\n");
                            } //fim do switch case
                        } while (opcao != 5);
                    }
                } else if (ong_ou_voluntario == 3) {
                	break;
                } else {
                	System.out.println("Opção inválida. Por favor, digite novamente.\n");
                }
            } else {
            	System.out.println("Entrada inválida. Por favor, digite um número.\n");
            	scanner.nextLine();
            }
        } while (true); // Continua o loop principal (escolha entre ONG ou voluntário) até que o usuário escolha sair do app
    }//Fim da main
}//Fim da classe CandidatarCampanha