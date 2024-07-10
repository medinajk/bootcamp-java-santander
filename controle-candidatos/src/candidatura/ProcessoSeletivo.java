package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        imprimirSelecionados();
        
    
    }
    //mostra os candidatos selecionados
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
           
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);

           }

    }

    //analisa e seleciona candidatos
    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JOAO"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou o seguinte valor de salário " + salarioPretendido);
            double salarioBase = 2000.00;
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    // imprime o valor de salário pretendido de cada candidato aleatoriamente
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
               tentativasRealizadas++;
            } else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while (continuarTentando && tentativasRealizadas<3);
        if(atendeu){
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas);
    } else {
        System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS ATINGIDO");
    }


    }

    // método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    // liga para candidatos selecionados
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
             System.out.println("LIGAR PARA CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DEMAIS CANDIDATOS");
        }

    }

}
