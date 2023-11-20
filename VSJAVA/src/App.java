import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int CodigoProduto = -1, opc = -1;
        int[][] armaA = new int[1][8];
        int[][] armaB = new int[2][8];

        while (opc != 0) {
            System.out.println("1- Digite o Código");
            System.out.println("2- Analisar armazém");
            System.out.println("0- Sair");

            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    do {
                        System.out.println("Escreva o código do produto: ");
                        CodigoProduto = entrada.nextInt();
                        if (CodigoProduto <= 0) {
                            System.out.println("Digite outro código: ");
                        }
                    } while (CodigoProduto <= 0);

                    if (CodigoProduto % 2 != 0) {
                        for (int i = 7; i >= 0; i--) {
                            if (CodigoProduto % i == 0) {
                                armaA[0][i] = CodigoProduto;
                                break;
                            }
                        }
                    } else {
                        for (int i = 7; i >= 0; i--) {
                            if (CodigoProduto % i == 0) {
                                armaB[0][i] = CodigoProduto;
                                break;
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("Lista dos armazéns: ");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print(armaA[i][j] + '|');
                            System.out.print(armaB[i][j] + '|');
                        }
                    }
                    System.out.println("");
                    break;
            }
        }
    }
}