public class Series extends Animes {
  int quantasTemps;
  int quantosEPs;
  int duracaoEPs;

  public Series (int quantasTemps, int quantosEPs, int duracaoEPs, String nome, int anoLancamento, String estudio, String produtores, String generos, int classificacaoIndicativa, boolean dubPT, boolean legPT){
    super (nome, anoLancamento, estudio, produtores, generos, classificacaoIndicativa, dubPT, legPT);
    
    this.quantasTemps = quantasTemps;
    this.quantosEPs = quantosEPs;
    this.duracaoEPs = duracaoEPs;
  }
  
  public void detalhesSeries() {
	  	detalhes();
		System.out.println("Quantas Temporadas: "+this.quantasTemps);
		System.out.println("Quantos Episódios: "+this.quantosEPs);
		System.out.println("Duração dos Episódios: "+this.duracaoEPs+" min");
  }

}
