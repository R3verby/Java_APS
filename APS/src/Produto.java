
public class Produto {
	
	private int codigo;
	private String descricao;
	private double vcompra;
	private double custo;
	private double lucro;
	private int qtd_estoque;
	
	void compra(int quant)
	{qtd_estoque = qtd_estoque + quant;} 
	void venda(int quant)
	{qtd_estoque = qtd_estoque - quant;}
	double calculaPrecoVenda()
	{return vcompra + custo + lucro*(vcompra + custo); }
	public double getVcompra() {
		return vcompra;
	}
	public void setVcompra(double vcompra) {
		this.vcompra = vcompra;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public double getLucro() {
		return lucro;
	}
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	public Produto(int codigo, String descricao, double vcompra, double custo, double lucro, int qtd_estoque) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.vcompra = vcompra;
		this.custo = custo;
		this.lucro = lucro;
		this.qtd_estoque = qtd_estoque;
	}
	public Produto(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public Produto(int codigo, String descricao, double vcompra, double custo, double lucro) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.vcompra = vcompra;
		this.custo = custo;
		this.lucro = lucro;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQtd_estoque() {
		return qtd_estoque;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



}
