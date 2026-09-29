package br.ufpb.dcx.santos.eduardo.jogos;

public class Jogo {
    private String nomeTime1;
    private String nomeTime2;
    private int numGolsTime1;
    private int numGolsTime2;

    public Jogo(String nomeTime1, String nomeTime2, int numGolsTime1, int numGolsTime2){
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.numGolsTime1 = numGolsTime1;
        this.numGolsTime2 = numGolsTime2;
    }
    public String getNomeTime1(){
        return this.NomeTime1;
    }
    public String getNomeTime2(){
        return this.NomeTime2;
    }
    public int getNunGolsTime1(){
        return this.NumGolsTime1;
    }
    public int getNunGolsTime2(){
        return this.NumGolsTime2;
    }

}
