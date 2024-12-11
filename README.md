<div align="center">
  <a href="https://www.oracle.com/br/education/oracle-next-education/">
    <img src="https://img.shields.io/badge/challenge-oracle%20next%20education-blue" alt="Challenge Oracle Next Education">
  </a>
</div>
<div align="center">
    <img src="https://img.shields.io/badge/finished-december-green" alt="Finished in December">
</div>

--

 # Conversor de Moedas

## Descrição do Projeto

Este é um conversor de moedas simples desenvolvido em Java que utiliza a API ExchangeRate-API para realizar conversões entre diferentes moedas. O projeto inclui um menu interativo para que o usuário escolha as moedas de origem e destino, insira o valor e receba a conversão calculada. Além disso, todas as conversões realizadas são registradas em um arquivo de log.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal do projeto.
- **Gson**: Biblioteca para manipulação de JSON.
- **Java HTTP Client**: Para realizar requisições HTTP.
- **ExchangeRate-API**: API utilizada para obter as taxas de conversão.
- **Sistema de arquivos**: Para leitura da chave da API e registro de logs.

## Estrutura do Projeto

- **`Main.java`**: Contém o ponto de entrada do programa.
- **`MenuInicial.java`**: Gera o menu interativo e manipula as opções escolhidas pelo usuário.
- **`Conversor.java`**: Realiza as chamadas à API e faz os cálculos de conversão.

## Como Executar o Projeto

1. **Requisitos**:
   - Java 17 ou superior instalado.
   - A biblioteca `Gson` adicionada ao projeto.

2. **Configuração da API**:
   - Crie um arquivo `api_key.txt` na pasta `config`.
   - Adicione a sua chave da ExchangeRate-API no formato:
     ```
     MINHA_CHAVE_DE_API=SUACHAVEAQUI
     ```

3. **Execução**:
   - Compile o projeto:
     ```
     javac -d bin src/br/com/alura/conversordemoedas/*.java
     ```
   - Execute a aplicação:
     ```
     java -cp bin br.com.alura.conversordemoedas.Main
     ```

4. **Navegação**:
   - Escolha uma opção no menu inicial para converter valores entre as moedas suportadas.
   - Insira o valor a ser convertido no formato decimal (usando vírgula para separar os centavos).

## Funcionalidades

- Conversão entre as moedas:
  - Real Brasileiro (BRL) para Rand Sul-Africano (ZAR), Naira Nigeriana (NGN) e Peso Filipino (PHP), e vice-versa.
- Registro de todas as conversões em um arquivo de log com a data e hora.

## Exemplo de Saída

Menu inicial:

