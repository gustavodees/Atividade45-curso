# Calculadora de Média de Números Pares em Java

Este projeto consiste em um programa Java simples que lê uma quantidade especificada de números (podendo ser decimais) inseridos pelo usuário e calcula a média apenas dos números pares digitados. Caso nenhum número par seja inserido, o programa exibirá uma mensagem informando isso.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário, identificar os números pares, calcular a média deles e exibir o resultado ou uma mensagem apropriada.

## Como Usar

1.  **Salve o arquivo:** Salve o código fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile o arquivo Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:**
    * O programa primeiro solicitará que você digite a quantidade de números que você deseja inserir. Digite o número desejado e pressione Enter.
    * Em seguida, o programa pedirá que você digite cada um dos números, um por vez. Para cada número, digite-o e pressione Enter.

5.  **Resultado:** Após inserir todos os números, o programa exibirá:
    * A média dos números pares digitados, com a mensagem "Media dos pares " seguida do valor da média, caso haja pelo menos um número par.
    * Se nenhum número par for digitado, o programa exibirá a mensagem "Nenhum número par!".

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Solicita ao usuário que digite a quantidade de números que ele deseja inserir e armazena esse valor na variável inteira `n`.
    3.  Cria um array de números de ponto flutuante de dupla precisão (`double`) chamado `vect` com o tamanho especificado por `n`. Este array será utilizado para armazenar os números digitados pelo usuário.
    4.  Utiliza um loop `for` para iterar `n` vezes (para cada número que o usuário irá digitar). Em cada iteração:
        * Solicita ao usuário que digite um número.
        * Lê o número decimal inserido pelo usuário e armazena no array `vect` na posição correspondente ao índice `i`.
    5.  Inicializa três variáveis `double`: `npares` com 0 (para contar a quantidade de números pares), `soma` com 0.0 (para acumular a soma dos números pares) e `media` com 0.0 (para armazenar a média dos números pares).
    6.  Utiliza um loop `for` para percorrer o array `vect`. Em cada iteração:
        * Verifica se o número armazenado em `vect[i]` é divisível por 2 (ou seja, se o resto da divisão por 2 é igual a 0). Se for, considera o número como par, incrementa o contador `npares` e adiciona o valor do número à variável `soma`.
    7.  Após o loop, verifica se a variável `npares` é igual a 0. Se for, significa que nenhum número par foi digitado e, portanto, exibe a mensagem "Nenhum número par!".
    8.  Caso contrário (se `npares` for maior que 0), calcula a média dos números pares dividindo a `soma` pelo número de elementos pares (`npares`) e armazena o resultado na variável `media`. Em seguida, exibe a média dos pares com a mensagem "Media dos pares ".
    9.  O objeto `Scanner` é fechado ao final do método `main` para liberar os recursos.
