# Pacote `java.util`

#### O [pacote `java.util`](https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html) contém a estrutura de coleções, classes de coleção legadas, modelo de evento, recursos de data e hora, internacionalização e classes de utilitários diversas. Entre os ecursos fornecidos por este pacote podemos citar: `Arrays`, `ArrayList` e `LikedList`.

#### A classe `Array` contém vários métodos para manipular arrays, sendo considera a estrutura de dados de mais baixo nível, identificado por meio do `[]`. Os arrays ou matrizes, Esses objetos contém um número fixo de valores de um único tipo e seu comprimento é estabelecido quando criado, sendo que após a criação o seu comprimento fica fixo. Cada item em um array é chamado de elemento, e cada elemento é acessado pelo número, o índice. 

### Declaração de um `Array`

#### Na declaração de um array, cada elemento recebe um valor padrão, sendo 0 (zero) para números de tipo primitivo, falso (false) para elementos booleanos e nulo (null) para referências (não aponta para nenhum objeto). Veja os exemplos abaixo: 

#### `Array` de inteiros:

```
// o [] é o marcador para dizer que a declaração é um array
// o índice 5 é o tamanho fixo do array estabelecido na sua criação
// embora seja 5 seu tamanho, a contagem começa a partir do 0 e vai até o 4, formando assim 5 posições 
int[] numeros = new int[2]

// adicionando elementos ao array
i[0] = 1;
i[1] = 2;
```

#### As mesmas considerações dadas anteriormente para todos os tipos de `Array` criados

#### `Array` de `String`

```
String[] nomes = new String[6];

//adicionando elementos ao array
nomes[0] = "Maria";
nomes[1] = "Mario";
nomes[2] = "Madalena";
nomes[3] = "Mahamd";
nomes[4] = "Mateus";
```
