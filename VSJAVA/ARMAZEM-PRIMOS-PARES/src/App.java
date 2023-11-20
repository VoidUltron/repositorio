import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigoProduto = -1, opc = -1;
        int[][] arma = new int[2][8];
        while (opc != 0) {
            System.out.println("1 - Ler Codigo");
            System.out.println("2 - Ver Gavetas");
            System.out.println("0 - Sair");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    do {
                        System.out.println("Digite o Codigo do Protudo");
                        codigoProduto = entrada.nextInt();
                        if (codigoProduto <= 0) {
                            System.out.println("Digite Outro Numero");
                        }
                    } while (codigoProduto <= 0);
                    if (codigoProduto % 2 != 0) {
                        //impar
                        for (int i = 7; i >= 0; i--) {
                            if (codigoProduto % i == 0) {
                                arma[0][i] = codigoProduto;
                                break;
                            }
                        }
                    } else {
                        //par
                        for (int i = 7; i >= 0; i--) {
                            if (codigoProduto % i == 0) {
                                arma[1][i] = codigoProduto;
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Lista de Codigos Dos Produtos:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print(arma[i][j] + " | ");
                        }
                        System.out.println(" ");
                    }
                    break;
            }
        }
    }
}