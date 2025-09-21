import java.util.Scanner;

class Resolucao{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        //Defino as variáveis onde vou armazenar as informações, o lado do quadrado, o valor da área e o valor do perímetro
        double ladoDoQuadrado, areaDoQuadrado, perimetroDoQuadrado; 

        System.out.println("Informe o lado do quadrado");
        double ladoDoQuadrado = scan.nextDouble();

        areaDoQuadrado = ladoDoQuadrado * ladoDoQuadrado;
        perimetroDoQuadrado = ladoDoQuadrado *4;
        
        System.out.println("O perímetro do quadrado é "+perimetroDoQuadrado);
        System.out.println("A área do quadrado é "+areaDoQuadrado);
    }
}