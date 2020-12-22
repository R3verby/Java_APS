
public class Funcionario extends Pessoa{
	
	
	String login;
	String senha;
public Funcionario(String nome,int mat) {
		super(nome,mat);

	}
public Funcionario(String nome,int mat,String login, String senha) {
	super(nome,mat);
	this.login = login;
	this.senha = senha;
}
}
