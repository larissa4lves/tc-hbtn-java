import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido1) {
	
		return pedido1.getProdutos().stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO) )
				.collect(Collectors.toList());
	}

	
	
}
