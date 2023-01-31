public class Filmes extends Animes{
	String duracao;
	boolean nosCinemas;
	
	public Filmes (String duracao, boolean nosCinemas, String nome, int anoLancamento, String estudio, String produtores, String generos, int classificacaoIndicativa, boolean dubPT, boolean legPT){
		super (nome, anoLancamento, estudio, produtores, generos, classificacaoIndicativa, dubPT, legPT);
	   
		this.duracao = duracao;
		this.nosCinemas = nosCinemas;
	}

	public void detalhesFilmes() {
	  	detalhes();
		System.out.println("Quantas Temporadas: "+this.duracao+" min");
		System.out.println("Nos Cinemas: "+this.nosCinemas);
	}

}
