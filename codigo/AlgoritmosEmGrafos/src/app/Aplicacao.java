package app;
import java.util.Scanner;

import business.Aresta;
import business.Grafo;
import business.GrafoPonderado;

public class Aplicacao {

    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        Grafo grafo_01;
        grafo_01 = new Grafo("grafo_01");

        String opcao = "";

        opcao = menu();

        while (opcao != "F") {

            switch (opcao) {

                case "1":
                    String localPadraoSalvar = "C:/Grafos/grafo_salvo.csv";
                    System.out.println("SALVAR GRAFO DE ARQUIVO:\n");
                    System.out.println("Salvando grafo em 'grafo_Salvo.csv'");
                    grafo_01.salvar(localPadraoSalvar);
                    opcao = "";

                    break;
                case "2":
                    String localPadraoCarregar = "C:/Grafos/grafo_01.csv";
                    System.out.println("CARREGAR GRAFO DE ARQUIVO:\n Entre com a string identificadora do grafo:");
                    String nomeIdGrafo = obj.nextLine();
                    System.out.println("Carregando grafo " + nomeIdGrafo + " em: " + localPadraoCarregar);
                    grafo_01.carregar(localPadraoCarregar);
                    opcao = "";
                    break;

                case "3":
                    System.out.println("SABER A ORDEM E O TAMNAHO DO GRAFO:\n");

                    System.out.println("A ordem do grafo é: " + grafo_01.ordem());
                    System.out.println("o tamanho do grafo é: " + grafo_01.tamanho());

                    opcao = "";

                    break;

                case "4":

                    System.out.println("VERIFICAR A EXISTÊNCIA DE UMA ARESTA:\n");

                    System.out.println("Entre com a origem da aresta:");
                    int origemEntrada = obj.nextInt();
                    System.out.println("Entre com o destino da aresta:");
                    int destinoEntrada = obj.nextInt();

                    Aresta resp = grafo_01.existeAresta(origemEntrada, destinoEntrada);
                    System.out.println("A aresta " + origemEntrada + " - " + destinoEntrada + resp.toString());

                    opcao = "";

                    break;
                case "5":

                    System.out.println("GERAR UM GRAFO COMPLETO\n");
                    System.out.println("Entre com a string identificadora do grafo:\n");
                    String nomeGrafo = obj.nextLine();
                    System.out.println("Entre com a ordem do grafo completo a ser gerado:\n");
                    int ordemEntrada = obj.nextInt();

                //    GrafoCompleto grafoCompleto = new Grafo(nomeGrafo, ordemEntrada);

                    opcao = "";

                    break;
                case "6":

                    System.out.println("GERAR UM SUBGRAFO DE UM GRAFO:\n");

                    // Grafo subgrafo =

                    opcao = "";

                    break;
                case "7":

                    System.out.println("PERMITIR A CRIAÇÃO DE ARESTAS PONDRADAS:\n");                 

                    GrafoPonderado GrafoPonderado = new GrafoPonderado();

            		GrafoPonderado.addVertice('A');
            		GrafoPonderado.addVertice('B');
            		GrafoPonderado.addVertice('C');
            		GrafoPonderado.addVertice('D');
            		GrafoPonderado.addVertice('E');

            		GrafoPonderado.addArestaNaoOrientada(0,3,4);				//A-D: 4
            		GrafoPonderado.addArestaNaoOrientada(0,4,3);				//A-E: 3
            		GrafoPonderado.addArestaNaoOrientada(0,2,10);				//A-C: 10

            		GrafoPonderado.addArestaNaoOrientada(1,3,7);				//B-D: 7
            		GrafoPonderado.addArestaNaoOrientada(1,2,1);				//B-C: 1

            	//	GrafoPonderado.MostraGrafo();
            	
        

                    opcao = "";

                    break;
 

                case "0":

                    System.out.println("Finalizado!");
                    opcao = "";
                    break;
                default:
                    System.out.println("opção invalida!");

            }
            opcao = menu();

        }
        obj.close();
    }

    public static String menu() {
        Scanner obj = new Scanner(System.in);
        System.out.println("GRAFO NÃO DIRECIONADO:\n");
        System.out.println("1 -  Salvar grafo em arquivo:");
        System.out.println("2 -  Carregar grafo de arquivo.");
        System.out.println("3 -  Saber a ordem e o tamamho do grafo.");
        System.out.println("4 -  Verificar a existência de uma aresta");
        System.out.println("5 -  Gerar um grafo completo.");
        System.out.println("6 -  Gerar um subgrafo de um grafo");
        System.out.println("7 -  Permitir a criação de arestas ponderadas");
        System.out.println("0 - para finalizar:\n");
        return obj.nextLine().toUpperCase();

    }

}
