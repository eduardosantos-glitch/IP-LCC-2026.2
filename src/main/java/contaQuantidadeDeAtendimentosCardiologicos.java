public class contaQuantidadeDeAtendimentosCardiologicos {
    public static int  contaQuantidadeDeAtendimentosCardiologicos( AtendimentoMedico [] atendimentos){
        int quantidade = 0;
        for(int k = 0; k < atendimentos.length; k++){
            if(atendimentos[k].getCategoriaAtendimento().equals("CARDIOLÓGICO")){
                quantidade++;
            }
        }
        return quantidade;
    }
}
