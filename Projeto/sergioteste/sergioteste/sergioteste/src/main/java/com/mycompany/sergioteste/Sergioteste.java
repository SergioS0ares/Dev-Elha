/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sergioteste;
import java.util.Scanner;
/**
 *
 * 
 */
public class Sergioteste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//fiz um import de Scanner caso venha a ajudar alguém
        int soma = 0,somaO = 0,somaH = 0, x;//para realizar a soma total da matriz
        int selecione = 0;//selecionar qual matriz o usuario desejar
        int velha[][] = new int[3][3];//o tabuleiro do jogo da velha
        int resultados[][] = new int[2][5];//tabela de resultados
        int matrizA[][] = new int[2][5];//matriz copiada da tabela de resultados
        int matrizB[][] = new int[2][5];//matriz invertida da tabela de resultados
        int matrizC[][] = new int[5][2];//matrtiz transportada da tabela de resultados
        int matrizD[][] = new int[2][5];//matriz soma de matrizA e matrizB
        int matrizE[][] = new int[2][5];//matriz subtração de matrizA e matrizB
        int matrizF[][] = new int[2][2];//matriz resultado da multiplicação de matrizA com matrizC (pode estar precisando de correções)
        int trecoH1 = 0;//convertida em hexadecimal da tabela de resultados
        int trecoO1 = 0;//convertida em octal da tabela de resultados
        int trecoB1 = 0;//convertida em binário da tabela de resultado
        int treco[] = new int[9], bloqueio[] = new int[8], turno = 0;//variaveis logicas do jogo
        for (int i = 0; i < 5; i++) {
            boolean vitoria = false;//variável lógica para dizer se o jogo acabou ou não
            int winner = 0;//variável pra guardar o vencedor
            int turnos = 0;//variável para guardar quantas vezes os jogadores revesaram suas jogadas, se ela chegar a 9 sem um vencedor o jogo termina em empate
            while (!vitoria) {
                int cont = 0;//variavel auxiliar
                
                if (turno == 0) {
                    System.out.println("[_ _ \n _ _ _\n _ _ _]\n");
                    System.out.println("\n[ 1  2  3\n  4  5  6\n  7  8  9]");
                    turno++;
                }
                while (!vitoria) {
                    cont = entrada.nextInt();//mandar a troca de pontos
                    if (turno % 2 == 1) {//inicialização do trabalho de trocar entre jogador número 1 e número 2 e contar quantas partidas foram (nesse caso jogador 1)
                        if (cont == 1) {
                            treco[cont - 1] = 1;
                            turnos= turnos +1;

                        } else if (cont == 2) {
                            treco[cont - 1] = 1;
                            turnos= turnos +1;

                        } else if (cont == 3) {
                            treco[cont - 1] = 1;
                            turnos= turnos +1;

                        } else if (cont == 4) {
                            treco[cont - 1] = 1;
                           turnos= turnos +1;

                        } else if (cont == 5) {
                            treco[cont - 1] = 1;
                           turnos= turnos +1;

                        } else if (cont == 6) {
                            treco[cont - 1] = 1;
                            turnos= turnos +1;

                        } else if (cont == 7) {
                            treco[cont - 1] = 1;
                            turnos= turnos +1;

                        } else if (cont == 8) {
                            treco[cont - 1] = 1;
                            turnos ++;

                        } else if (cont == 9) {
                            treco[cont - 1] = 1;
                            turnos ++;

                        }
                    }
                    if (turno % 2 == 0) {//inicialização do trabalho de trocar entre jogador número 1 e número 2 e contar quantas partidas foram (nesse caso jogador 2)
                        if (cont == 1) {
                            treco[cont - 1] = 2;
                            turnos ++;

                        } else if (cont == 2) {
                            treco[cont - 1] = 2;
                            turnos ++;

                        } else if (cont == 3) {
                            treco[cont - 1] = 2;
                            turnos ++;

                        } else if (cont == 4) {
                            treco[cont - 1] = 2;
                            turnos ++;

                        } else if (cont == 5) {
                            treco[cont - 1] = 2;
                            turnos ++;

                        } else if (cont == 6) {
                            treco[cont - 1] = 2;
                            turnos ++;

                        } else if (cont == 7) {
                            treco[cont - 1] = 2;
                            turnos ++;

                        } else if (cont == 8) {
                            treco[cont - 1] = 2;
                            turnos ++;

                        } else if (cont == 9) {
                            treco[cont - 1] = 2;
                            turnos ++;

                        }
                    }
                    /*
                    daqui pra baixo é toda a lógica do jogo da velha, pra fazer aparecer qual é o quadro vazio e qual está marcado "X" ou "O"
                     */
                    
                    if (treco[0] == 1) {
                        System.out.print("[X ");
                        velha[0][0] = 1;
                        turno = 2;
                    } else if (treco[0] == 2) {
                        System.out.print("[O ");
                        velha[0][0] = 2;
                        turno = 1;
                    } else if (treco[0] == 0) {
                        System.out.print("[_ ");
                    }
                    if (treco[1] == 1) {
                        System.out.print("X ");
                        velha[0][1] = 1;
                        turno = 2;
                    } else if (treco[1] == 2) {
                        System.out.print("O ");
                        velha[0][1] = 2;
                        turno = 1;
                    } else if (treco[1] == 0) {
                        System.out.print("_ ");
                    }
                    if (treco[2] == 1) {
                        System.out.print("X]\n");
                        velha[0][2] = 1;
                        turno++;
                    } else if (treco[2] == 2) {
                        System.out.print("O]\n");
                        velha[0][2] = 2;
                        turno--;
                        
                    } else if (treco[2] == 0) {
                        System.out.print("_]\n");
                    }
                    if (treco[3] == 1) {
                        System.out.print(" X ");
                        velha[1][0] = 1;
                        turno = 2;
                        
                    } else if (treco[3] == 2) {
                        System.out.print(" O ");
                        velha[1][0] = 2;
                        turno = 1;
                    } else if (treco[3] == 0) {
                        System.out.print(" _ ");
                    }
                    if (treco[4] == 1) {
                        System.out.print("X ");
                        velha[1][1] = 1;
                        turno = 2;
                    } else if (treco[4] == 2) {
                        System.out.print("O ");
                        velha[1][1] = 2;
                        turno = 1;
                    } else if (treco[4] == 0) {
                        System.out.print("_ ");
                    }
                    if (treco[5] == 1) {
                        System.out.print("X\n");
                        velha[1][2] = 1;
                        turno++;
                    } else if (treco[5] == 2) {
                        System.out.print("O\n");
                        velha[1][2] = 2;
                        turno--;
                    } else if (treco[5] == 0) {
                        System.out.print("_\n");
                    }
                    if (treco[6] == 1) {
                        System.out.print(" X ");
                        velha[2][0] = 1;
                        turno++;
                    } else if (treco[6] == 2) {
                        System.out.print(" O ");
                        velha[2][0] = 2;
                        turno--;
                    } else if (treco[6] == 0) {
                        System.out.print(" _ ");
                    }
                    if (treco[7] == 1) {
                        System.out.print("X ");
                        velha[2][1] = 1;
                        turno++;
                    } else if (treco[7] == 2) {
                        System.out.print("O ");
                        velha[2][1] = 2;
                        turno--;
                    } else if (treco[7] == 0) {
                        System.out.print("_ ");
                    }
                    if (treco[8] == 1) {
                        System.out.print("X]\n\n");
                        velha[2][2] = 1;
                        turno++;
                    } else if (treco[8] == 2) {
                        System.out.print("O]\n\n");
                        velha[2][2] = 2;
                        turno--;
                    } else if (treco[8] == 0) {
                        System.out.print("_]\n\n");
                    }
                    if (turnos == 9) {
                        vitoria = true;
                    }

                }
                vitoria = false;//retornando o falso pra não fechar a partida sem terminar

                if (velha[0][0] == 1 && velha[0][1] == 1 && velha[0][2] == 1) {
                    winner = 1;
                    vitoria = true;
                }
                if (velha[1][0] == 1 && velha[1][1] == 1 && velha[1][2] == 1) {
                    winner = 1;
                    vitoria = true;
                }
                if (velha[2][0] == 1 && velha[2][1] == 1 && velha[2][2] == 1) {
                    winner = 1;
                    vitoria = true;
                }
                if (velha[0][0] == 1 && velha[1][0] == 1 && velha[2][0] == 1) {
                    winner = 1;
                    vitoria = true;
                }
                if (velha[0][1] == 1 && velha[1][1] == 1 && velha[2][1] == 1) {
                    winner = 1;
                    vitoria = true;

                }
                if (velha[0][2] == 1 && velha[1][2] == 1 && velha[2][2] == 1) {
                    winner = 1;
                    vitoria = true;

                }
                if (velha[0][0] == 1 && velha[1][1] == 1 && velha[2][2] == 1) {
                    winner = 1;
                    vitoria = true;

                }
                if (velha[0][2] == 1 && velha[1][1] == 1 && velha[2][0] == 1) {
                    winner = 1;
                    vitoria = true;

                }
                /*
                condicionais para a vitória do jogador 2
                 */

                if (velha[0][0] == 2 && velha[0][1] == 2 && velha[0][2] == 2) {
                    winner = 2;
                    vitoria = true;

                }
                if (velha[1][0] == 2 && velha[1][1] == 2 && velha[1][2] == 2) {
                    winner = 2;
                    vitoria = true;

                }
                if (velha[2][0] == 2 && velha[2][1] == 2 && velha[2][2] == 2) {
                    winner = 2;

                }
                if (velha[0][0] == 2 && velha[1][0] == 2 && velha[2][0] == 2) {
                    winner = 2;
                    vitoria = true;

                }
                if (velha[0][1] == 2 && velha[1][1] == 2 && velha[2][1] == 2) {
                    winner = 2;
                    vitoria = true;

                }
                if (velha[0][2] == 2 && velha[1][2] == 2 && velha[2][2] == 2) {
                    winner = 2;
                    vitoria = true;

                }
                if (velha[0][0] == 2 && velha[1][1] == 2 && velha[2][2] == 2) {
                    winner = 2;
                    vitoria = true;

                }
                if (velha[0][2] == 2 && velha[1][1] == 2 && velha[2][0] == 2) {
                    winner = 2;
                    vitoria = true;

                }
                /*
                se liga na declaração de empate, ele é tão gigante que assusta:
                 */
                if (turnos == 9 && winner == 0) {//caso tenha chegado a nove jogadas sem um vencedor o jogo declara empate
                    vitoria = true;//fechando esse laço de repetição fedido...
                }
            
                /*
                cabô... a declaração é tão gigante que broxa...
                 */
                System.out.println("fim da partida:");
                turnos = 0;//retornando à primeira jogada
                turno = 1;//retornando ao turno 1
                for (int q = 0; q < 9; q++) {//zerando o auxiliar de coordenada
                    treco[q] = 0;
                }
                for (int a = 0; a < 3; a++) {//zerando o placar do tabuleiro
                    for (int b = 0; b < 3; b++) {
                        velha[a][b] = 0;
                    }
                }
                if (winner != 0) {//declarando resultado
                    System.out.print(" o vencedor desta partida foi o jogador " + winner + "!\n");//quem venceu
                } else {
                    System.out.print(" o jogo finalizou em empate!\n");//caso tenha finalizado em empate
                }
                System.out.println("[_ _ \n _ _ _\n _ _ _]\n");//chamando pela próxima partida
                System.out.println("\n[ 1  2  3\n  4  5  6\n  7  8  9]");
                //encerrou a partida
            }
            if (winner == 1 && i == 0) {//jogador número 1 venceu caso seja primeira partida
                resultados[0][i] = 5;
                resultados[1][i] = 0;
                matrizA[0][i] = 5;
                matrizA[1][i] = 0;
                matrizB[0][((i * -1) + 4)] = 5;
                matrizB[1][((i * -1) + 4)] = 0;
                matrizC[i][0] = 5;
                matrizC[i][1] = 0;
            } else if (winner == 1 && i > 0) {//jogador um venceu na segunda partida ou qualquer outra partida que não seja a primeira
                resultados[0][i] = resultados[0][i - 1] + 5;
                resultados[1][i] = resultados[1][i - 1] + 0;
                matrizA[0][i] = matrizA[0][i - 1] + 5;
                matrizA[1][i] = matrizA[1][i - 1] + 0;
                matrizB[0][((i * -1) + 4)] = matrizB[0][((i * -1) + 5)] + 5;
                matrizB[1][((i * -1) + 4)] = matrizB[1][((i * -1) + 5)] + 0;
                matrizC[i][0] = matrizC[i - 1][0] + 5;
                matrizC[i][1] = matrizC[i - 1][1] + 0;
            }
            if (winner == 2 && i == 0) {//jogador número 2 venceu caso seja a primeira partida
                resultados[0][i] = 0;
                resultados[1][i] = 5;
                matrizA[0][i] = 0;
                matrizA[1][i] = 5;
                matrizB[0][((i * -1) + 4)] = 0;
                matrizB[1][((i * -1) + 4)] = 5;
                matrizC[i][0] = 0;
                matrizC[i][1] = 5;
            } else if (winner == 2 && i > 0) {//jogador 2 venceu na segunda ou qualquer outra partida que não seja a primeira
                resultados[0][i] = resultados[0][i - 1] + 0;
                resultados[1][i] = resultados[1][i - 1] + 5;
                matrizA[0][i] = matrizA[0][i - 1] + 0;
                matrizA[1][i] = matrizA[1][i - 1] + 5;
                matrizB[0][((i * -1) + 4)] = matrizB[0][((i * -1) + 5)] + 0;
                matrizB[1][((i * -1) + 4)] = matrizB[1][((i * -1) + 5)] + 5;
                matrizC[i][0] = matrizC[i - 1][0] + 0;
                matrizC[i][1] = matrizC[i - 1][1] + 5;
            }
            if (winner == 0 && i == 0) {//nenhum dos jogadores venceu (empate) caso seja a primeira partida
                resultados[0][i] = 2;
                resultados[1][i] = 2;
                matrizA[0][i] = 2;
                matrizA[1][i] = 2;
                matrizB[0][((i * -1) + 4)] = 2;
                matrizB[1][((i * -1) + 4)] = 2;
                matrizC[i][0] = 2;
                matrizC[i][1] = 2;
            } else if (winner == 0 && i > 0) {//empate caso seja a segunda ou qualquer outra partida que não seja a primeira
                resultados[0][i] = resultados[0][i - 1] + 2;
                resultados[1][i] = resultados[1][i - 1] + 2;
                matrizA[0][i] = matrizA[0][i - 1] + 2;
                matrizA[1][i] = matrizA[1][i - 1] + 2;
                matrizB[0][((i * -1) + 4)] = matrizB[0][((i * -1) + 5)] + 2;
                matrizB[1][((i * -1) + 4)] = matrizB[1][((i * -1) + 5)] + 2;
                matrizC[i][0] = matrizC[i - 1][0] + 2;
                matrizC[i][1] = matrizC[i - 1][1] + 2;
            }
        }
        for (int i = 0; i < 5; i++) {//criando as matrizes que são subtrações ou somas da matriz a e b
            matrizD[0][i] = matrizA[0][i] + matrizB[0][i];
            matrizD[1][i] = matrizA[1][i] + matrizB[1][i];
            matrizE[0][i] = matrizA[0][i] - matrizB[0][i];
            matrizE[1][i] = matrizA[1][i] - matrizB[1][i];
        }
        for (int i = 0; i < 5; i++) {//somando as variaveis que vão ser convertidas
            trecoB1 = trecoB1 + matrizA[0][i];
            trecoB1 = trecoB1 + matrizA[1][i];
            trecoH1 = trecoH1 + matrizA[0][i];
            trecoH1 = trecoH1 + matrizA[1][i];
            trecoO1 = trecoO1 + matrizA[0][i];
            trecoO1 = trecoO1 + matrizA[1][i];
        }
       //multiplicação da matrizA com a matrizC
         matrizF[0][0]= (matrizA[0][0]*matrizC[0][0]+matrizA[0][1]*matrizC[1][0]+matrizA[0][2]*matrizC[2][0]+matrizA[0][3]*matrizC[3][0]+ matrizA[0][4]*matrizC[4][0]);
         matrizF[0][1]= (matrizA[0][0]*matrizC[0][1]+matrizA[0][1]*matrizC[1][1]+matrizA[0][2]*matrizC[2][1]+matrizA[0][3]*matrizC[3][1]+ matrizA[0][4]*matrizC[4][1]);
         matrizF[1][0]= (matrizA[1][0]*matrizC[0][0]+matrizA[1][1]*matrizC[1][0]+matrizA[1][2]*matrizC[2][0]+matrizA[1][3]*matrizC[3][0]+ matrizA[1][4]*matrizC[4][0]);
         matrizF[1][1]= (matrizA[1][0]*matrizC[0][1]+matrizA[1][1]*matrizC[1][1]+matrizA[1][2]*matrizC[2][1]+matrizA[1][3]*matrizC[3][1]+ matrizA[1][4]*matrizC[4][1]);
         
         for (int linha = 0; linha < matrizA.length; linha++) {//realizar a soma total da matriz resultado
            for (int coluna = 0; coluna < matrizA[0].length; coluna++) {
                soma = soma + matrizA[linha][coluna];
                somaO = soma;
                somaH = soma;
                 }
          }
        for (int i = 0; i < 2; i++) {//apresentação da tabela de resultados (está com problemas na extenção da matriz... não sei como nem porque)
            for (int a = 0; a < 5; a++) {
                if (a == 0) {
                    System.out.print("[");
                }
                System.out.print(" " + resultados[i][a] + " ");
                if (a == 4) {
                    System.out.print("]\n");
                }
            }
        }
         System.out.print("Qual matriz ele deseja visualizar? \n selecione 1: Matriz A\n selecione 2: Matriz B\n selecione 3: Matriz C\n selecione 4: Matriz D\n selecione 5: Matriz E\n selecione 6: Matriz F\n selecione 7: Matriz B1\n selecione 8: Matriz O1\n selecione 9: Matriz H1\n ");
        selecione = entrada.nextInt();
         while(selecione != 0){
            selecione = entrada.nextInt();
         if(selecione == 1){
         for (int a1 = 0; a1 < 2; a1++) {//apresentação da matrizA
            for (int a2 = 0; a2 < 5; a2++) {
                if (a2 == 0) {
                    System.out.print("["); 
                }
                System.out.print(" " + matrizA[a1][a2] + " ");
                if (a2 == 4) {
                    System.out.print("]\n");
                }
            }
        }
         }
         if(selecione == 2){
         for (int a1 = 0; a1 < 2; a1++) {//apresentação da matrizB
            for (int a2 = 0; a2 < 5; a2++) {
                if (a2 == 0) {
                    System.out.print("[");
                }
                System.out.print(" " + matrizB[a1][a2] + " ");
                if (a2 == 4) {
                    System.out.print("]\n");
                }
            }
        }
         }
         if(selecione == 3){
         for (int a1 = 0; a1 < 5; a1++) {//apresentação da matrizC
            for (int a2 = 0; a2 < 2; a2++) {
                if (a2 == 0) {
                    System.out.print("\n[");
                }
                System.out.print(" " + matrizC[a1][a2] + " ");
                if (a2 == 4) {
                    System.out.print("]");
                }
            }
        }
         }
         if(selecione == 4){
         for (int a1 = 0; a1 < 2; a1++) {//apresentação da matrizD
            for (int a2 = 0; a2 < 5; a2++) {
                if (a2 == 0) {
                    System.out.print("[");
                }
                System.out.print(" " + matrizD[a1][a2] + " ");
                if (a2 == 4) {
                    System.out.print("]\n");
                }
            }
        }
         }
         if(selecione == 5){
         for (int a1 = 0; a1 < 2; a1++) {//apresentação da matrizE
            for (int a2 = 0; a2 < 5; a2++) {
                if (a2 == 0) {
                    System.out.print("[");
                }
                System.out.print(" " + matrizE[a1][a2] + " ");
                if (a2 == 4) {
                    System.out.print("]\n");
                }
            }
        }
         }
         if(selecione == 6){//apresentação da matrizF
         for (int a1 = 0; a1 < 2; a1++) {
            for (int a2 = 0; a2 < 2; a2++) {
                if (a2 == 0) {
                    System.out.print("\n[");
                }
                System.out.print(" " + matrizF[a1][a2] + " ");
                if (a2 == 4) {
                    System.out.print("]");
                }
            }
        }
         }
         if(selecione == 7){//apresentação da matrizB1
         int  con, binario=0, exp=0;
        while(soma!=0){
        con = soma%2;
        binario+=con*Math.pow(10, exp);
        exp++;
        soma/=2;
        }
        System.out.println("Conversão do valor total para Binário:"+binario);
         }
         if(selecione == 8){
         int conv, oct=0, exp1=0;
        while(somaO!=0){
        conv = somaO%8;
        oct+=conv*Math.pow(10, exp1);
        exp1++;
        somaO/=8;
        }
        System.out.println("Conversão do valor total para Octal:"+oct);
        }
         if(selecione == 9){
          int rem;
     String str2="";
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     while(somaH>0)
     {
       rem=somaH%16; 
       str2=hex[rem]+str2; 
       somaH=somaH/16;
     }
     System.out.println("Method 2: Decimal to hexadecimal: "+str2);
  }
         }
    }
}
    
