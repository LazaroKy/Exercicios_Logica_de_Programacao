import java.util.Scanner;

class DescontoEmCompra{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double valorDaCompra = 0;
        
        valorDaCompra = scan.nextDouble();

//TODO: Adicione uma verificação se o valor da compra inserido não foi menor ou igual a 0,
    //  caso seja menor ou igual a zero informe que não será possível processar, do contrário continue a verificação
        if(valorDaCompra<100){
            System.out.println("Não é aplicado desconto em compras com valor menor que 100");
            System.out.println("Você deverá pagar: R$"+String.format("%.2f",valorDaCompra));
        } else if(valorDaCompra >= 100 && valorDaCompra <200){
            System.out.println("Hmm, você tem direito a um desconto de 10% (Você pagará 90% do valor da compra)");
            System.out.println("Você deverá pagar: R$"+String.format("%.2f",valorDaCompra * 0.9));
        } else if(valorDaCompra >=200){
            System.out.println("Hmm, você tem direito a um desconto de 20% (Você pagará 80% do valor da compra)");
//TODO: Atribua o cálculo do desconto a variável valorComDesconto e faça com que ele seja impreso no lugar do valor 0.0
            double valorComDesconto;
            System.out.println("Você deverá pagar: R$"+String.format("%.2f", 0.0));
        }
    }
}