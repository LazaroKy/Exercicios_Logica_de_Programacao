import java.util.Scanner;
class Fatorial{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número para descobrimos seu valor fatorial");
        int numero = scan.nextInt();

        //TODO: Verifique se o número é maior que 1, se for maior que 1 calcule o fatorial do número
        //         caso contrário, imprima uma mensagem informando que o número deve ser maior que 1

        int resultado =1;
        
        //TODO: Crie um loop FOR ou WHILE para realizar o cálculo 
        // exemplo com número no valor 5: 5! = 5 × 4 × 3 × 2 × 1
        // vá atribuindo o valor do cálculo a variável resultado (lembre do operador *=)

        System.out.println("O fatorial de "+numero+ " é: "+ resultado);
    }
}