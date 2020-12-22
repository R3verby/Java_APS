import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int control;
		List<Gerente> a = new ArrayList<Gerente>();
		List<Funcionario> b = new ArrayList<Funcionario>();
		List<Cliente> clientes = new ArrayList<Cliente>();
		Gerente g = new Gerente("Klaus",12,"ger","123");
		Funcionario o = new Funcionario("Dorian",11,"operator","123");
		a.add(g);
		b.add(o);
		Scanner s = new Scanner(System.in);
		do {

			System.out.println("***Bem-vindo, escolha um perfil abaixo:");
			System.out.println("1- Gerente");
			System.out.println("2- Operador de sistema");
			System.out.println("3- Sair");
			control = s.nextInt();
			//System.out.println("4- Inserir pokemon");
			//System.out.println("5- Deletar pokemon");
			//System.out.println("6- Deletar Treinador");
			//System.out.println("7- Inserir Treinador");
			//System.out.println("0- sair");
			System.out.println("****Faça seu login****");
			String log = s.nextLine();
			String senha = s.nextLine();
			//coloquei login e senha padrao apenas por praticidade
			if(control==1) {
				if(log.equals(g.login) && senha.equals(g.senha)) {
					int control2;
					do {
					System.out.println("****Ola gerente "  + g.nome + "****");
					System.out.println("1 - Cadastrar Produto");
					System.out.println("2 - Cadastrar Cliente");
					System.out.println("3 - Cadastrar Operador");
					System.out.println("4 - Listar Produtos");
					System.out.println("5 - Listar Clientes");
					System.out.println("6 - Listar Operadores");
					System.out.println("7 - Procurar Produto");
					System.out.println("8 - Procurar Cliente");
					System.out.println("9 - Procurar Operador");
					System.out.println("10 - Sair");
					control2 = s.nextInt();
					if(control2==3) {
						System.out.println("Insira o nome");
						String nome = s.nextLine();
						System.out.println("Insira a matricula");
						int mat = s.nextInt();
						System.out.println("Insira o login");
						String login = s.nextLine();
						System.out.println("Crie uma senha");
						String sen = s.nextLine();
						Funcionario f = new Funcionario(nome,mat,login,sen);
						b.add(f);
					}
					if(control2==6) {
						for(int i = 0;i<b.size();i++) {
							b.get(i).toString();
						}
					}
					
					}while(control2 != 10);
				}
			}
			if(control==2) {
				if(log.equals(o.login) && senha.equals(o.senha)) {
					int control2;
					do {
					System.out.println("****Ola Operador "  + o.nome + "****");
					System.out.println("1 - Fazer Locação");
					System.out.println("2 - Dar baixa em Locação");
					System.out.println("3 - Excluir Locação");
					System.out.println("4 - Procurar Produto");
					System.out.println("5 - Procurar Cliente");
					System.out.println("6 - Sair");
					control2 = s.nextInt();
					
					}while(control2 != 6);
				}
			}
			
			if(control==4) {

			}
			if(control==5) {
				
			}
			if(control==6) {
				
			}
			if(control==7) {
				
			}
			
			
		}while(control != 3);
		s.close();

	}

}
