import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class CandidatarCampanha {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		//Vagas
		Vagas vaga1 = new Vagas("Vaga A", "ONG Fazer o Bem", "São Paulo - SP", "Esportes para crianças e idosos");
		Vagas vaga2 = new Vagas("Vaga B", "ONG Rede Solidária", "Belo Horizonte - MG", "Comida para todos");
		
		LinkedList <Vagas> listaVagas = new LinkedList<Vagas>();
		
		listaVagas.add(vaga1);
		listaVagas.add(vaga2);
		
		
		//login
		System.out.println("LOGIN");
		System.out.println("Digite seu e-mail: ");
		String email = scanner.nextLine();
		System.out.println("Digite sua senha: ");
		String senha = scanner.nextLine();
		
		//menu
		do {
			System.out.println("Menu de opções:");
			System.out.println("1. Listar Vagas.");
			System.out.println("2. Solicitar Candidatura em vaga.");
			System.out.println("3. Sair do menu.");
			System.out.println("Digite uma opção: ");	
			
			opcao = scanner.nextInt();
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
				String titulo = scanner.nextLine();
				System.out.println("Digite o nome da ONG: ");
				String ong = scanner.nextLine();
				
				int flag = 0;
				for (int i = 0; i < listaVagas.size(); i++) {
					if (listaVagas.get(i).getTitulo().equals(titulo) && listaVagas.get(i).getOng().equals(ong)) {
						flag = 1;
					}
				}
				if (flag == 0) {
					System.out.println("Vaga não encontrada.");
				}else {
					System.out.println("Termos e condições: Pelo presente Termo de Adesão e ciente da Lei n. 9.608/1998 que rege o trabalho voluntário, decido espontaneamente realizar atividade voluntária nesta organização. Declaro, ainda, que estou ciente de que o trabalho não será remunerado e que não configurará vínculo empregatício ou gerará qualquer obrigação de natureza trabalhista, previdenciária ou afim. Declaro, por fim, que estou ciente de que eventuais danos pessoais ou materiais causados no exercício do trabalho voluntário serão de total e integral responsabilidade minha e não serão imputados à esta organização.");
					System.out.println("Aceita os termos (sim / não");
					String aceite = scanner.nextLine();
					if (aceite.equals("sim")){
						//TODO: implementar questionario de candidatura
					} else {
						break;
					}
				}
				break;
			} //fim do switch case
		} while (opcao != 3);	
	}

}
