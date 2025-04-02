import java.util.Scanner;

public class ListaOrdenadaMercado {
    public static void main(String[] args) {
        new ListaOrdenadaMercado();
    }

    public ListaOrdenadaMercado() {
        Scanner teclado = new Scanner(System.in);
        String[] lista = new String[20];
        int qtdItens = 0;

        System.out.println("*** Lista de compras ***");
        System.out.println("Digite o nome do item ou 'sair' para encerrar:");

        while (qtdItens < lista.length) {
            System.out.print("Item " + (qtdItens + 1) + ": ");
            String item = teclado.nextLine().trim();

            // Verifica se deseja sair
            if (item.equalsIgnoreCase("sair")) {
                break;
            }

            // Validação do item
            if (item.isEmpty()) {
                System.out.println("Informe um item válido.");
                continue;
            }

            // Verifica se item já existe
            boolean itemExiste = false;
            for (int i = 0; i < qtdItens; i++) {
                if (lista[i].equalsIgnoreCase(item)) {
                    itemExiste = true;
                    break;
                }
            }

            if (itemExiste) {
                System.out.println("Item já está na lista!");
                continue;
            }

            // Adiciona o item no final
            lista[qtdItens] = item;
            qtdItens++;

            // Aplica Insertion Sort na lista
            insertionSort(lista, qtdItens);

            // Exibe lista atualizada
            System.out.println("\nLista atual:");
            for (int i = 0; i < qtdItens; i++) {
                System.out.println((i + 1) + ". " + lista[i]);
            }

            // Pergunta se deseja continuar após 10 itens
            if (qtdItens >= 10 && qtdItens < 20) {
                System.out.print("\nDeseja adicionar mais um item? (s/n): ");
                String resposta = teclado.nextLine().trim();
                if (!resposta.equalsIgnoreCase("s")) {
                    break;
                }
            }
        }

        // Exibe lista final
        System.out.println("\n*** Lista final de compras ***");
        for (int i = 0; i < qtdItens; i++) {
            System.out.println((i + 1) + ". " + lista[i]);
        }

        teclado.close();
    }

    // Implementação do InsertionSort
    private static void insertionSort(String[] array, int n) {
        for (int i = 1; i < n; i++) {
            String listaEmOrdenacao = array[i];
            int j = i - 1;

            // Move os elementos maiores que a chave para frente
            while (j >= 0 && array[j].compareToIgnoreCase(listaEmOrdenacao) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = listaEmOrdenacao;
        }
    }
}