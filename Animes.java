class Animes {
	String nome;
	int anoLancamento;  
	String estudio;
	String produtores;
	String generos;
	int classificacaoIndicativa;
	boolean dubPT;
	boolean legPT;

	public Animes (String nome, int anoLancamento, String estudio, String produtores, String generos, int classificacaoIndicativa, boolean dubPT, boolean legPT) {
	   this.nome = nome;
	   this.anoLancamento = anoLancamento;
	   this.estudio = estudio;
	   this.produtores = produtores;
	   this.generos = generos;
	   this.classificacaoIndicativa = classificacaoIndicativa;
	   this.dubPT = dubPT;
	   this.legPT = legPT;
	}

	
	public void detalhes() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Ano de Lançamento: "+this.anoLancamento);
		System.out.println("Estúdio: "+this.estudio);
		System.out.println("Produtores: "+this.produtores);
		System.out.println("Gêneros: "+this.generos);
		System.out.println("Classificacao Indicativa: +"+this.classificacaoIndicativa);
		System.out.println("Dublado: "+this.dubPT);
		System.out.println("Legendado: "+this.legPT);
	}
}
