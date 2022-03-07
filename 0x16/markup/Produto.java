import java.util.function.Supplier;
import java.util.function.Consumer;

public class Produto {

	private String nome;
	private double preco;
	private double percentualMarkUp = 0.10;

	public Produto(double preco, String nome) {
		super();
		this.nome = nome;
		this.preco = preco;
		
	}
	
	Supplier<Double> precoComMarkUp = () -> preco * (percentualMarkUp + 1);
	
	Consumer<Double> atualizarMarkUp = t -> percentualMarkUp = t/100 ;


	public Produto() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPercentualMarkUp() {
		return percentualMarkUp;
	}

	public void setPercentualMarkUp(double percentualMarkUp) {
		this.percentualMarkUp = percentualMarkUp;
	}
}