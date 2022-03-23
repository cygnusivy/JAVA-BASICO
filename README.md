# Tipos de variáveis do Java

### Antes de iniciar destacando os tipos de variáveis que podemos utilizar com o Java, é importante entender o que é uma variável. Uma **variável** nada mais é do que uma estrutura ou declaração que permite armazenar dados na memória durante a execução de um programa. No Java, para que uma variável possa ser utilizada no código é importante que eles sejam primeiramente declaradas, ou seja, criadas dentro do programa, elas passam a existir.
### Vale ressaltar que a linguagem Java é fortemente tipada, ou seja, é imprenscindível que a variável seja declarada antes de ser utilizada. Além disso, uma vez declarada uma variável para um dado tipo de dado, só será possível atribuir valores deste dipo à variável, a não ser que sejam utilizados métodos de conversão de tipos. 

### Em Java, o nome da variável não pode ser declarado de qualquer forma e deve respeitar algumas regras básicas de formatação, como:
### 1. Conter apenas letras, underline( _ ), sifrão( $ ) ou números de 0 a 9;
### 2. Deve ser iniciada por uma letra(geralmente minúscula, por convensão), underline ou $;
### 3. Não deve haver espaço no nome da variável;
### 4. Não é possível utilizar palavras-chave reservadas da linguagem para atribuir nome a uma variável;
### 5. O nome da variável deve ser único. 
### 6. Caracteres especiais como `ç` e acentuação gráfica não são aceitos nos nomes das variáveis.
### Obs: Por convenção, variáveis com nomes compostos são iniciadas com letra minúscula e as letras iniciais dos demais nomes são representadas como maiúsculas. Vale ressaltar que o Java é case sensitive --> diferencia as letras minúsculas das maiúsculas. Ou seja, a variável `nome` é diferente da variável `Nome`.

## Exemplos válidos par nomes de variáveis;
### 1. `nome, `_nome ou nome_1`
### 2. `preco$`
### 3. `nomeDoMeio`, `_1PrimeiroNome`

## Exemplos inválidos par nomes de variáveis;
### 1. `nome do meio`
### 2. `1PrimeiroNome`
### 3. `preço`
### 4. `símbolo`

### A sintaxe básica na declaração das variáveis é a seguinte:
```
tipo nomeDaVariavel;
```
### Ou:
```
tipo nomeDaVariavel = valorDaVariavel;
```
### Ambos os casos descritos acima podem ser utilizados na declaração de variáveis no java, a diferença é que no primeiro caso não foi necessário atribuir um valor a variável, diferentemente do segundo exemplo, onde um valor foi atribuído à variável. 

### Em Java há dois tipos de dados, os que são representados por valor (tipos primitivos) e os que são representados por referência (tipos por referência). De modo geral, podemos destacar 8 tipos primitivos da linguagem java: `byte`, `short`, `int`, `long`, `char`, `float`, `double` e `boolean`. Estes constituem declarações ou informações que a própria linguagem possui implementada em sua definição. Já os tipos por referência são utilizados pelo programa para armazenar as informações de dado objeto na memória do computador, por referência. `String` é a variável de referência mais conhecida do Java, e assim como todas as outras variáveis de referência, ela deriva na classe `Object`. De modo geral, uma variável do tipo primitivo armazena um valor, ao passo que uma variável do tipo referência apontam para um local na memória do computador onde a informação declarada foi guardada.

## Tipos primitivos utilizados para manipular números inteiros:
### 1. `byte` - Dentre os números inteiros, `byte` é o tipo que menos possui capacidade de armazenamento, apenas 8 bits (1 byte), podendo armazenar valores de -128 a 127.
### 2. `short` - Com uma capacidade de armazenamento menor, `short` é capaz de armazenar números inteiros de até 16 bits (2 bytes), armazenando valores de -32.768 a 32.767
### 3. `int` - Este tipo numérico aramzena 32 bits (4 bytes) ou qualquer número inteiro entre -2.147.483.648 e 2.147.483.647.
### 4. `long` - `long` possui uma capacidade de armazenamente incrivelmente maior que o `int` sendo capaz de armazenar até 64 bits (8 bytes).

## Tipos primitivos utilizados para manipular números reais (com ponto flutuante):
### 1. `float  - O tipo primitivo `float` é capaz de armazenar 32 bits, assim, como o int. Porém esta variável armazena apenas números com ponto flutuante.
### 2. `double` - Assim como `long`, `double` também possui capacidade de armazenamento de até 64 bits, mas armazena variáveis com ponto flutuante.

## Tipo primitivo para manipular valores boleanos (vardadeiro ou falso; 0 ou 1):
### 1. `boolean` - Possui um tamanho de armazenamento de 1 bit, armazenando apenas 1(verdadeiro) ou 0(falso). Todas as variáveis do tipo `boolean` são inicializadas como false.

## Tipo primitivo para manipular caracteres:
### 1. char - Aceita a inserção de apenas um caractere. Por ser uma variável do tipo numérico, no fundo ela é um inteiro que possui sua respectiva representação no formato de caractere.
