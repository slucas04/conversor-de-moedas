<div align="center">
  <a href="https://www.oracle.com/br/education/oracle-next-education/">
    <img src="https://img.shields.io/badge/challenge-oracle%20next%20education-blue" alt="Challenge Oracle Next Education">
  </a>
</div>
<div align="center">
    <img src="https://img.shields.io/badge/finished-december-green" alt="Finished in December">
</div>

# Conversor de Moedas

## Descrição do projeto

Este é um conversor de moedas desenvolvido em Java, com propósito de praticar o uso de comunicação com APIs externas na linguagem, que utiliza a API ExchangeRate-API para realizar conversões entre diferentes moedas. O projeto inclui um menu interativo para que o usuário escolha as moedas de origem e destino, insira o valor e receba a conversão calculada. Além disso, todas as conversões realizadas são registradas em um arquivo de log.

## Funcionalidades

- Conversão entre as moedas:
  - Real brasileiro (BRL) para rand sul-africano (ZAR), naira nigeriana (NGN) e peso filipino (PHP), e vice-versa.
- Registro de todas as conversões em um arquivo de log com a data e hora.

## Exemplo de execução

Menu inicial e conversão de real brasileiro (BRL) para rand sul-africano (ZAR):

<img width="427" alt="menu" src="https://github.com/user-attachments/assets/713ed4ff-8180-4331-aab2-42b971ff7fb3" />

Log de transações salvo em txt:

<img width="195" alt="log" src="https://github.com/user-attachments/assets/c53ed932-09e4-417a-b28e-aedf5a6faaa0" />


## Tecnologias utilizadas

- **Java 17**: Linguagem de programação principal do projeto.
- **Gson**: Biblioteca para manipulação de JSON.
- **Java HTTP Client**: Para realizar requisições HTTP.
- **ExchangeRate-API**: API utilizada para obter as taxas de conversão em tempo real.
- **Sistema de arquivos**: Para leitura da chave da API e registro de logs com histórico de conversões.

## Estrutura do projeto

- **`Main.java`**: Contém o ponto de entrada do programa.
- **`MenuInicial.java`**: Gera o menu interativo e manipula as opções escolhidas pelo usuário.
- **`Conversor.java`**: Realiza as chamadas à API e faz os cálculos de conversão, além de registrar conversões em log.

## Como executar

1. **Requisitos**:
   - Java 17 ou superior instalado.
   - A biblioteca `Gson` adicionada como dependência ao projeto (não utilizei nenhum assistente, apenas instalei o jar [aqui](https://mvnrepository.com/artifact/com.google.code.gson/gson) e importei ao projeto pelo IntelliJ).

2. **Configuração da API**:
   - Crie um arquivo `api_key.txt` na pasta `config`.
   - Adicione a sua chave da ExchangeRate-API no formato:
     ```
     MINHA_CHAVE_DE_API=SUACHAVEAQUI
     ```
     
3. **Navegação**:
   - Escolha uma opção no menu inicial para converter valores entre as moedas suportadas.
   - Insira o valor a ser convertido no formato decimal (usando vírgula para separar os centavos).

## Observações

- Certifique-se de que a chave da API esteja configurada corretamente no arquivo `api_key.txt`.
- O arquivo de log será salvo no caminho especificado no código: `C:\Users\samuel\conversor-de-moedas\src\log_de_transacoes.txt`. Altere o caminho para onde salvar seu projeto.

## Desenvolvimento

Projeto desenvolvido como parte da especialização back-end em Java de [Oracle Next Education](https://www.oracle.com/br/education/oracle-next-education/) em parceria com [Alura](https://www.alura.com.br/).
