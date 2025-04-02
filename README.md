# Lista Ordenada de Compras - Java

Este projeto é um programa em Java que permite ao usuário criar uma lista de compras ordenada automaticamente conforme os itens são inseridos. A ordenação é realizada utilizando o algoritmo **Insertion Sort**.

## Funcionalidades
- Permite ao usuário inserir até **20 itens** na lista de compras.
- Os itens são **ordenados automaticamente** em ordem alfabética.
- Evita a duplicação de itens na lista.
- Após inserir **10 itens**, o programa pergunta se deseja continuar adicionando mais.
- O programa encerra a entrada de itens ao digitar **"sair"**.
- Exibe a lista final ao final da execução.

## Tecnologias Utilizadas
- **Java** (versão recomendada: 8 ou superior)
- **Scanner** para entrada de dados do usuário
- **Insertion Sort** para ordenar a lista de compras

## Como Executar o Programa

1. Certifique-se de ter o **Java** instalado em seu computador.
2. Copie o código-fonte para um arquivo chamado `ListaOrdenadaMercado.java`.
3. Compile o programa utilizando o seguinte comando no terminal ou prompt de comando:
   ```sh
   javac ListaOrdenadaMercado.java
   ```
4. Execute o programa com o comando:
   ```sh
   java ListaOrdenadaMercado
   ```
5. Siga as instruções exibidas no console para adicionar itens à lista de compras.

## Exemplo de Uso
```sh
*** Lista de compras ***
Digite o nome do item ou 'sair' para encerrar:
Item 1: Maçã
Item 2: Arroz
Item 3: Banana

Lista atual:
1. Arroz
2. Banana
3. Maçã
...
```

## Estrutura do Código
- **Classe `ListaOrdenadaMercado`**: Contém o método principal (`main`) e o construtor que gerencia a entrada do usuário.
- **Método `insertionSort(String[] array, int n)`**: Implementa o algoritmo de ordenação **Insertion Sort**.
- **Uso do `Scanner`**: Permite capturar a entrada do usuário pelo teclado.

## Melhorias Futuras
- Permitir salvar e carregar listas de compras.
- Criar uma interface gráfica para facilitar a interação do usuário.
- Permitir a remoção de itens da lista.

## Licença
Este projeto é livre para uso e modificação.

