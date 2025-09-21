import java.util.Scanner;

class AventuraDaDonaLesma{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a altura do muro em centímetros: ");
        double alturaDoMuro = scan.nextDouble();
        System.out.println("Informe a quanto a lesma sobe durante o dia em centímetros: ");
        double sobeDuranteDia = scan.nextDouble();
        System.out.println("Informe quanto a lesma escorrega durante a noite em centímetros(Deve ser um valor menor do que quanto ela sobe): ");
        double escorregaDuranteNoite = scan.nextDouble(); 

        int dias =0;
        double subiu =0.0;

//TODO: VERIFIQUE se o valor de ESCORREGA durante a noite é MAIOR OU IGUAL quanto ela SOBE, 
//         se for maior ou igual imprima um texto informando que ela não conseguirá subir junto com os valores de sobe por dia e escorrega por noite,
//           caso contrário,  execute o loop WHILE
        while(alturaDoMuro> subiu){
//TODO: Altere o valor de subiu atribuindo o cálculo para saber quanto ela subiu e escorregou por dia 
            subiu = 10000;
            dias++;
        }

        System.out.println("A lesma levou "+dias+" dia(s) para subir o muro de "+alturaDoMuro+ "cm");
    }
}