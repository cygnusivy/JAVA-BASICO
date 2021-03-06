# Tipos de variáveis do Java

#### Antes de iniciar destacando os tipos de variáveis que podemos utilizar com o Java, é importante entender o que é uma variável. Uma **variável** nada mais é do que uma estrutura ou declaração que permite armazenar dados na memória durante a execução de um programa. No Java, para que uma variável possa ser utilizada no código é importante que eles sejam primeiramente declaradas, ou seja, criadas dentro do programa, elas passam a existir.
#### Vale ressaltar que a linguagem Java é fortemente tipada, ou seja, é imprenscindível que a variável seja declarada antes de ser utilizada. Além disso, uma vez declarada uma variável para um dado tipo de dado, só será possível atribuir valores deste dipo à variável, a não ser que sejam utilizados métodos de conversão de tipos. 

## Em Java, o nome da variável não pode ser declarado de qualquer forma e deve respeitar algumas regras básicas de formatação, como:
#### 1. Conter apenas letras, underline( _ ), sifrão( $ ) ou números de 0 a 9;
#### 2. Deve ser iniciada por uma letra(geralmente minúscula, por convensão), underline ou $;
#### 3. Não deve haver espaço no nome da variável;
#### 4. Não é possível utilizar palavras-chave reservadas da linguagem para atribuir nome a uma variável;
#### 5. O nome da variável deve ser único. 
#### 6. Caracteres especiais como `ç` e acentuação gráfica não são aceitos nos nomes das variáveis.
#### Obs: Por convenção, variáveis com nomes compostos são iniciadas com letra minúscula e as letras iniciais dos demais nomes são representadas como maiúsculas. Vale ressaltar que o Java é case sensitive --> diferencia as letras minúsculas das maiúsculas. Ou seja, a variável `nome` é diferente da variável `Nome`.

## Exemplos válidos par nomes de variáveis;
#### 1. `nome` `_nome ou nome_1`
#### 2. `preco$`
#### 3. `nomeDoMeio`, `_1PrimeiroNome`

## Exemplos inválidos par nomes de variáveis;
#### 1. `nome do meio`
#### 2. `1PrimeiroNome`
#### 3. `preço`
#### 4. `símbolo`

#### A sintaxe básica na declaração das variáveis é a seguinte:
```
tipo nomeDaVariavel;
```
#### Ou:
```
tipo nomeDaVariavel = valorDaVariavel;
```
#### Ambos os casos descritos acima podem ser utilizados na declaração de variáveis no java, a diferença é que no primeiro caso não foi necessário atribuir um valor a variável, diferentemente do segundo exemplo, onde um valor foi atribuído à variável. 

#### Em Java há dois tipos de dados, os que são representados por valor (tipos primitivos) e os que são representados por referência (tipos por referência). De modo geral, podemos destacar 8 tipos primitivos da linguagem java: `byte`, `short`, `int`, `long`, `char`, `float`, `double` e `boolean`. Estes constituem declarações ou informações que a própria linguagem possui implementada em sua definição. Já os tipos por referência são utilizados pelo programa para armazenar as informações de dado objeto na memória do computador, por referência. `String` é a variável de referência mais conhecida do Java, e assim como todas as outras variáveis de referência, ela deriva na classe `Object`. De modo geral, uma variável do tipo primitivo armazena um valor, ao passo que uma variável do tipo referência apontam para um local na memória do computador onde a informação declarada foi guardada.
#### `String` na verdade é uma classe (começa com letra maiúscula) e deriva do pacote `java.lang`, o único pacote que não precisa ser importado. Assim como `String`, `System`, `RunTimeException`, `Exception`, `NullPointerException`, entre outros, são derivados desse pacote. Contudo, mesmo sendo uma classe, na instanciação de um objeto do tipo `String` não é necessário utilizar a palavra reservada `new`, embora a máquina virtual entenda dessa forma também -> `String nome;` <- indicado | `String nome = new String();` <- funciona, mas não é indicado. 
#### Vale ressaltar também que `String` é uma classe imutável, ou seja, uma vez declarada não é possível alterá-la. Para que isso seja possível, será necessário criar outro objeto do tipo `String` onde as alterações serão refletidas com base no novo objeto que será instanciado a partir do anterior, como podemos ver no exemplo abaixo:
```
String nome = "Maria";
String nomeModificado = nome.replace("a", "o");
```

## Tipos primitivos utilizados para manipular números inteiros:

#### 1. `byte` - Dentre os números inteiros, `byte` é o tipo que menos possui capacidade de armazenamento, apenas 8 bits (1 byte), podendo armazenar valores de -128 a 127.
#### 2. `short` - Com uma capacidade de armazenamento menor, `short` é capaz de armazenar números inteiros de até 16 bits (2 bytes), armazenando valores de -32.768 a 32.767
#### 3. `int` - Este tipo numérico aramzena 32 bits (4 bytes) ou qualquer número inteiro entre -2.147.483.648 e 2.147.483.647.
#### Exemplo de uma variável do tipo `int` declarada e inicializada:
```
int numero = 20;
```
#### Um detalhe interessante ao manipular números inteiros é que, em operações matemáticas, como uma divisão ou multiplicação, o resultado nem sempre é um número inteiro. Esse fator pode representar um conflito na hora de obter resoltados com o código, pois a forma como o número é impresso no console é diferente. 
#### Por exemplo:
```
public class Numero{

public static void main(String[] args){

int numero1 = 5;
int numero2 = 2;

System.out.prinln(numero1/numero2);
}
}
```

#### Teoricamente o resultado desta divisão deveria ser `2.5`, mas o resultado mostrado no console é desanimador. Esta operação tenta dividir dois números inteiros, e isso é totalmente possível no Java. Contudo, o Java ignora qualquer número que esteja após o ponto, mostando no console apenas o valor que representa o número inteiro , neste caso o número `2`.

#### 4. `long` - `long` possui uma capacidade de armazenamente incrivelmente maior que o `int` sendo capaz de armazenar até 64 bits (8 bytes).

## Tipos primitivos utilizados para manipular números reais (com ponto flutuante):

#### 1. `float  - O tipo primitivo `float` é capaz de armazenar 32 bits, assim, como o int. Porém esta variável armazena apenas números com ponto flutuante.
#### 2. `double` - Assim como `long`, `double` também possui capacidade de armazenamento de até 64 bits, mas armazena variáveis com ponto flutuante. A mesma situação que destacamos na realização de operações matemáticas com variáveis do tipo `int` pode ser aplicada às variáveis do tipo `double`, mas com uma pequena diferença. Veja no código abaixo: 
```
public class Numero{

public static void main(String[] args){

double numero1 = 5;
double numero2 = 2;

System.out.prinln(numero1/numero2);
}
}
```
#### O resultado mostrado no console deveria ser `2.5`, mas para o Java não é. Nesta situação dividindo dois númerados inteiros que foram declarados como `double`. Desta forma, o resultado mostrado no console, apesar de ser um número fluturante, não é o verdadeiro resultado da divisão, pois desconsidera qualquer valor após a vígula e substitui por `0`. Ou seja, imprime `2.0`.

## Tipo primitivo para manipular valores boleanos (vardadeiro ou falso; 0 ou 1):

#### 1. `boolean` - Possui um tamanho de armazenamento de 1 bit, armazenando apenas 1(verdadeiro) ou 0(falso). Todas as variáveis do tipo `boolean` são inicializadas como false.

## Tipo primitivo para manipular caracteres:

#### 1. `char`  - Aceita a inserção de apenas um caractere. Por ser uma variável do tipo numérico, no fundo ela é um inteiro que possui sua respectiva representação no formato de caractere. Veja o exemplo abaixo:

```
public class Numero{

public static void main(String[] args){

char letra1 = B;
char letra2 = 66;

System.out.prinln(letra1);
System.out.prinln(letra2);
}
}
```
#### Como foi mensionado anteriormente, um `char` é um `int` por debaixo dos panos. Ao rodar o código acima o console não irá mostrar `B`e `66`, e sim, `B` e `B`, pois a letra B é representada pelo número interiro 66, o Java faz a converção automaticamente. 

# Wrapper
#### Wrapper são são objetos -> tendo como principal função “envolver coisas” adicionando funcionalidades à ela. O Java conta com diversos Wrappers que adicionam funcionalidades a outras classes ou tipos primitivos, um exemplo dele é o Integer, que é o Wrapper do tipo primitivo int. Que tipo de funcionalidade você pode executar tendo apenas uma variável definida como “int”? Nenhuma, a não ser atribuir valores, pois int é um tipo primitivo e não possuí métodos.

#### O Java possui oito wrappers para tipos primitivos que adicionam a funcionalidade de tratar tipos primitivos como classes.

### Tipos primitivos e seus respectivos Wrappers:

#### --> int = Integer
#### --> double = Double
#### --> long = Long
#### --> short = Short
#### --> floar = Float
#### --> byte = Byte
#### --> char = Character
#### --> boolean = Boolean

#### Quando você faz um:
```
Integer i = Integer.valueOf(2);
```
#### Você está criando uma classe, que "envolve" o número 2 (primitivo) e adiciona métodos como intValue() nele. Você ainda ganha a funcionalidade de trabalhar com o número 2 como se ele fosse um objeto.  O Java (a partir da versão 5) é inteligente o suficiente para criar ou desfazer wrappers de tipo primitivo automaticamente (Autoboxing), de tão útil e comum que é essa prática, veremos mais a diante como funciona o Autoboxing.

#### Vale ressaltar que todos os wrappers são derivados do pacote `java.lang`, não sendo necessário sua importação nem instanciação por meio da palavra reservada `new`, embora o sua implementação funcione. Os wrappers numéricos derivam do pacote `java.lang.Number`, ao passo que `Character` e `Boolean` estende java.

## Formas de converção primitivo -> Wrapper | Wrapper -> primitivo | String -> primitivo | String -> Wrapper

### primitivo -> Wrapper 

```
// deprecated
Double d = new Double(5.5);
Integer i = new Integer(14);

// usual e indicado
Double d = Double.valueOf(5.5);
Double d = 5.5;
Integer i = Integer.valueOf(14);
Integer i = 14;
```
### Wrapper -> primitivo

```
double d = Double.valueOf(5.5)
int i = Integer.valueOf(14);

// ou a partir de um wrapper x já instanciado
double d = x.doubleValue();
int i = x.intValue();
```
### `String` -> primitivo

```
// converte a String "9" em um primitivo int
int i = Integer.valueOf("9");
double d = Double.valueOf("8.8");
```
### `String` -> Wrapper

```
// converte a String "85.4" em um objeto Double
Double d = Double.valueOf("85.4");
Integer i = Integer.valueOf(5);

//ou
// converte a String "78.4" em um objeto Double
Double d = Double.parseDouble("78.4");
Integer i = Integer.parseInt("19");
```

#### OBS: Embora os wrappers possuam uma infinidade de métodos associados, utilizar tipos primitivos é mais vantajoso no que diz respeito ao consumo de memória e eficiência na execução do código. 
