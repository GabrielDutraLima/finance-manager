# Finance Manager

O **Finance Manager** é uma aplicação Java desenvolvida para auxiliar no gerenciamento financeiro pessoal, permitindo o controle de receitas, despesas e fornecendo uma visão geral das finanças do usuário.

## Funcionalidades

- **Cadastro de Receitas e Despesas:** Permite ao usuário adicionar, editar e remover entradas financeiras.
- **Classificação por Categorias:** Organiza as entradas em categorias personalizáveis para melhor análise.
- **Relatórios Financeiros:** Gera relatórios que ajudam a visualizar o fluxo de caixa e o balanço financeiro.
- **Alertas e Lembretes:** Notifica o usuário sobre contas a pagar ou receber próximas do vencimento.

## Tecnologias Utilizadas

- **Linguagem:** Java
- **Framework:** Spring Boot
- **Banco de Dados:** MySQL
- **Gerenciamento de Dependências:** Maven

## Pré-requisitos

- Java 11 ou superior instalado
- MySQL instalado e configurado
- Maven instalado

## Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/GabrielDutraLima/finance-manager.git
   ```

2. **Configure o Banco de Dados:**

   - Crie um banco de dados no MySQL:

     ```sql
     CREATE DATABASE finance_manager;
     ```

   - Atualize o arquivo `application.properties` com as credenciais do seu banco de dados:

     ```
     spring.datasource.url=jdbc:mysql://localhost:3306/finance_manager
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     ```

3. **Compile e execute a aplicação:**

   ```bash
   mvn clean install
   java -jar target/finance-manager-0.0.1-SNAPSHOT.jar
   ```

## Estrutura do Projeto

- `src/main/java/com/finance_manager/`: Contém os pacotes e classes principais da aplicação.
- `src/main/resources/`: Inclui os recursos da aplicação, como o arquivo `application.properties`.
- `pom.xml`: Arquivo de configuração do Maven com as dependências do projeto.
