import java.util.LinkedList;
import java.util.Scanner;

public class CandidatarCampanha {
	public static void main(String[] args) {
		
		//Inicialização do Scanner e da variável que guarda a opção do menu
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		//LinkedLists utilizadas para armazenar as vagas existentes e candidaturas 
		LinkedList <Vagas> listaVagas = new LinkedList<Vagas>();
		LinkedList <Candidatura> listaCandidaturas = new LinkedList<Candidatura>();
		
		//Criando vagas manualmente
		Vagas vaga1 = new Vagas("Vaga A", "ONG Fazer o Bem", "São Paulo - SP", "Esportes para crianças e idosos");
		Vagas vaga2 = new Vagas("Vaga B", "ONG Rede Solidária", "Belo Horizonte - MG", "Comida para todos");
		
		//Adicionando vagas na lista de vagas
		listaVagas.add(vaga1);
		listaVagas.add(vaga2);
		
		//Login
		System.out.println("LOGIN");
		System.out.println("Digite seu e-mail: ");
		String email = scanner.nextLine();
		System.out.println("Digite sua senha: ");
		String senha = scanner.nextLine();
		
		//Menu
		do {
			System.out.println("Menu de opções:");
			System.out.println("1. Listar Vagas.");
			System.out.println("2. Solicitar Candidatura em vaga.");
			System.out.println("3. Sair do menu.");
			System.out.println("Digite uma opção: ");	
			
			opcao = scanner.nextInt(); //Guarda a opção digitada pelo usuário
			
			switch(opcao) {
			case 1: 
				for (int i = 0; i < listaVagas.size(); i++) {
					System.out.println(listaVagas.get(i).getTitulo());
					System.out.println("ONG: " + listaVagas.get(i).getOng());
					System.out.println("Localização: " + listaVagas.get(i).getLocal());
					System.out.println("Campanha: " + listaVagas.get(i).getCampanha());
					System.out.println("-------------------------------------------");
				}
				break;
			case 2:
				System.out.println("Digite o título da vaga que você quer se candidatar: ");
				scanner.nextLine();
				String titulo = scanner.nextLine();
				System.out.println("Digite o nome da ONG: ");
				String ong = scanner.nextLine();
				
				//Validação da escolha de vaga a se candidatar pelo usuário
				int flag = 0;
				for (int i = 0; i < listaVagas.size(); i++) {
					if (listaVagas.get(i).getTitulo().equals(titulo) && listaVagas.get(i).getOng().equals(ong)) {
						flag = 1;
					}
				}
				if (flag == 0) {
					System.out.println("Vaga não encontrada."); //Mensagem retornada caso a vaga e ong digitada não correspondam
				}else {//Caso correspondam, o processo de candidatura continua
					System.out.println("Termos e condições: Pelo presente Termo de Adesão e ciente da Lei n. 9.608/1998 que rege o trabalho voluntário, decido espontaneamente\nrealizar atividade voluntária nesta organização. Declaro, ainda, que estou ciente de que o trabalho não será remunerado e que\nnão configurará vínculo empregatício ou gerará qualquer obrigação de natureza trabalhista, previdenciária ou afim. Declaro, por fim, \nque estou ciente de que eventuais danos pessoais ou materiais causados no exercício do trabalho voluntário serão de total e integral responsabilidade minha e não serão imputados à esta organização.\n");
					System.out.println("Aceita os termos (sim / não): ");
					String aceite = scanner.nextLine(); //Guarda a resposta de aceitação do usuário
					if (aceite.equals("sim")){//Caso o usuário concorde com os termos, o processo de candidatura continua
						Candidatura candidatura = new Candidatura();
						System.out.println("------- Formulário de Candidatura -------");
						System.out.println("Por favor, digite suas informações.");
						System.out.println("Nome Completo: ");
						String nome = scanner.nextLine();
						candidatura.setNome(nome);
						System.out.println("Data de Nascimento (formato DDMMAAAA, apenas números): ");
						int data_nascimento = scanner.nextInt();
						candidatura.setData_nascimento(data_nascimento);
						scanner.nextLine();
						System.out.println("Descrição (um breve resumo sobre você e motivação de sua candidatura): ");
						String descricao = scanner.nextLine();
						candidatura.setDescricao(descricao);
						listaCandidaturas.add(candidatura);
						System.out.println("Candidatura realizada com sucesso!");
					} else {//Caso o usuário não concorde com os termos, o processo de candidatura é finalizado e é voltado para o menu de opções
						break;
					}
				}
				break;
			} //fim do switch case
		} while (opcao != 3);
	}

}
