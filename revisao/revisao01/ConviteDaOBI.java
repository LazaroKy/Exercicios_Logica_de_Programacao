import java.util.Scanner;

class ConviteDaOBI{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número de competidores: ");
        int numeroCompetirodes = scan.nextInt();
        System.out.println("Informe a pontuação mínima: ");
        int pontuacaoMinima = scan.nextInt();

        int numeroDeAprovados =0;

        for(int count =0; count < numeroCompetirodes; count++){
            System.out.printf("Informe a nota 1 do competidor [%d]: \n",count+1);
            int primeiraNotaDoCompetidor = scan.nextInt();
            System.out.printf("Informe a nota 2 do competidor [%d]: \n",count+1);
            int segundaNotaDoCompetidor = scan.nextInt();

            int notaTotalDoCompetidor = primeiraNotaDoCompetidor +segundaNotaDoCompetidor;

            System.out.printf("Verificando se o competidor [%d] foi aprovado \n\n",count+1);
            if(notaTotalDoCompetidor >= pontuacaoMinima){
                numeroDeAprovados++;
            }
        }
        System.out.println("Número de competidores aprovados: "+numeroDeAprovados);

    }
}