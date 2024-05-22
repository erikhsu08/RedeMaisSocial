package Boundary;

import java.util.LinkedList;
import java.util.Scanner;
import Entity.Vaga;
import Entity.Candidatura;
import Entity.Campanha;
import control.CtrlCandidaturas;
import control.CtrlVagas;


public class Menu {
    public static void main(String[] args) {

        //Inicialização do Scanner e da variável que guarda a opção do menu
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        CtrlVagas controladorVagas = new CtrlVagas();
        CtrlCandidaturas conroladorCandidaturas = new CtrlCandidaturas();

        //LinkedList <Candidatura> listaCandidaturas = new LinkedList<Candidatura>();
        LinkedList <Campanha> listaCampanhas = new LinkedList<Campanha>();

        //Perguntar se é o usuário é ONG ou Voluntário
        System.out.println("Por favor, indique se você é: \n1.Voluntário\n2.ONG");
        int ong_ou_voluntario = scanner.nextInt();
        scanner.nextLine();

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
                System.out.println("2. Solicitar Candidatura em vaga.");
                System.out.println("3. Sair do menu.");
                System.out.println("Digite uma opção: ");

                opcao = scanner.nextInt(); //Guarda a opção digitada pelo usuário

                switch(opcao) {
                    case 1:
                        LinkedList<Vaga> listaVagas = controladorVagas.listarVagas();
                        if (listaVagas.isEmpty()) {
                            System.out.println("Não há vagas disponíveis.");
                        } else {
                            for (Vaga vaga : listaVagas) {
                                System.out.println(vaga.toString()); // Imprime a representação textual da vaga
                            }
                        }

                        break;
                    case 2:
                        System.out.print("Digite o título da vaga que você quer se candidatar: ");
                        String titulo =  scanner.nextLine();

                        System.out.print("Digite a ONG responsável: ");
                        String ong = scanner.nextLine();

                        if (! controladorVagas.validaVaga(titulo,ong)) {
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
                                conroladorCandidaturas.solicitaCandidatura(nome,data_nascimento,descricao);
                                //listaCandidaturas.add(candidatura); //Adiciona a candidatura criada na lista de candidaturas
                                System.out.println("Candidatura realizada com sucesso!");
                            } else {//Caso o usuário não concorde com os termos, o processo de candidatura é finalizado e é voltado para o menu de opções
                                break;
                            }
                        }
                        break;
                } //fim do switch case
            } while (opcao != 3);
        }else if(ong_ou_voluntario == 2) { //Menu caso o usuário seja ONG
            do {
                System.out.println("Menu de opções:");
                System.out.println("1. Listar Campanhas Existentes.");
                System.out.println("2. Criar Campanha.");
                System.out.println("3. Criar e Publicar Vaga.");
                System.out.println("4. Revisar Candidatura.");
                System.out.println("5. Sair do Menu.");
                System.out.println("Digite uma opção: ");

                opcao = scanner.nextInt(); //Guarda a opção digitada pelo usuário

                switch(opcao) {
                    case 1:
                        if (listaCampanhas.size() > 0) {
                            for (int i = 0; i < listaCampanhas.size(); i++) {
                                System.out.println("Nome da Campanha: " + listaCampanhas.get(i).getNome());
                                System.out.println("Descrição: " + listaCampanhas.get(i).getDescricao());
                                System.out.println("Localização: " + listaCampanhas.get(i).getLocal());
                                System.out.println("Data: " + listaCampanhas.get(i).getData());
                                System.out.println("-------------------------------------------");
                            }
                        }else {
                            System.out.println("Não há campanhas existentes!");
                        }
                        break;
                    case 2:
                        Campanha campanha = new Campanha();
                        System.out.println("Digite o nome da campanha: ");
                        scanner.nextLine();
                        String nome_campanha = scanner.nextLine();
                        campanha.setNome(nome_campanha);
                        System.out.println("Digite a descrição da campanha: ");
                        String descricao_campanha = scanner.nextLine();
                        campanha.setDescricao(descricao_campanha);
                        System.out.println("Digite o local da campanha: ");
                        String local_campanha = scanner.nextLine();
                        campanha.setLocal(local_campanha);
                        System.out.println("Digite a data da campanha: ");
                        String data_campanha = scanner.nextLine();
                        campanha.setData(data_campanha);

                        listaCampanhas.add(campanha); //Adiciona a campanha criada na lista de campanhas
                        System.out.println("Campanha criada com sucesso");
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                } //fim do switch case
            } while (opcao != 5);
        }else { //Caso o usuário digite uma opção não existente
            System.out.println("Opção invlálida. Por favor, tente novamente.");
        }

    }//Fim da main
}//Fim da classe CandidatarCampanha
