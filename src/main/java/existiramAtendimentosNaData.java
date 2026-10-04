public class existiramAtendimentosNaData {
    public static boolean existiramAtendimentosNaData(String data, AtendimentoMedico[] aatendimentos){
        for(int i = 0; i < atendimentos.length; i++){
            if(atendimentos[i].getDiaAtendimento().equals(data)){
                return true;
            }
        }
        return false;
    }
}
