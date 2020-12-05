import java.util.ArrayList;

public class RevendaComArray {
	private ArrayList<Produto> produtos = new ArrayList();
	private int ind;
	
	public void inserirProduto(Produto p) {
		produtos.add(p);
	}
	public void comprar(int qtd,int cod) {
		for(ind = 0;ind < produtos.size();ind++) {
			if(produtos.get(ind).getCodigo() == cod) {
				produtos.get(ind).setQtd_estoque(produtos.get(ind).getQtd_estoque() + qtd);
				return;
			}
		}
		System.out.println("Erro! produto inexistente");
	}
	public void vender(int qtd,int cod) {
		for(ind = 0;ind < produtos.size();ind++) {
			if(produtos.get(ind).getCodigo() == cod) {
				produtos.get(ind).setQtd_estoque(produtos.get(ind).getQtd_estoque() - qtd);
				return;
			}
		}
		System.out.println("Erro! produto inexistente");
	}
	public void consultaPrecoVenda(int cod) {
		for(ind = 0;ind < produtos.size();ind++) {
			if(produtos.get(ind).getCodigo() == cod) {
				System.out.println("Valor de venda: " + produtos.get(ind).calculaPrecoVenda());
				return;
			}
		}
		System.out.println("Erro! produto inexistente");
	}
	public void listaPrecos() {
		for(ind = 0;ind < produtos.size();ind++) {
			System.out.println("codigo: " + produtos.get(ind).getCodigo());
			System.out.println("descricao: " + produtos.get(ind).getDescricao());
			System.out.println("valor de venda: " + produtos.get(ind).calculaPrecoVenda());
			System.out.println("==========================================================");
		}
	}

}
