# Sistema de Gerenciamento de Contas Bancárias

## Objetivo
Implementar um sistema simples de gerenciamento de contas bancárias utilizando as operações CRUD (Create, Read, Update, Delete) em Java. A classe `Bank` gerencia uma lista de contas, enquanto a classe `Account` representa cada conta individualmente.

## Estrutura do Projeto

### Classe `Bank`
A classe `Bank` é responsável por:
- Gerenciar uma lista de contas (`ArrayList<Account>`).
- Criar novas contas.
- Remover contas existentes.
- Adicionar saldo a uma conta específica.
- Listar todas as contas.

#### Atributos
- `accounts`: Lista de contas.
- `accountCounter`: Atributo estático para incrementar o número de cada conta criada.

#### Métodos
- `addAccount(double initialBalance)`: Cria uma nova conta com um saldo inicial.
- `removeAccount(int accountNumber)`: Remove uma conta pelo número.
- `addBalance(int accountNumber, double amount)`: Adiciona saldo a uma conta específica.
- `findAccount(int accountNumber)`: Busca uma conta pelo número.
- `listAccounts()`: Lista todas as contas.

### Classe `Account`
A classe `Account` representa cada conta bancária individualmente.

#### Atributos
- `accountNumber`: Número da conta.
- `balance`: Saldo da conta.

#### Métodos
- `getAccountNumber()`: Retorna o número da conta.
- `getBalance()`: Retorna o saldo da conta.
- `setBalance(double balance)`: Define o saldo da conta.
- `toString()`: Retorna uma representação em string da conta.

### Classe `Main`
A classe `Main` demonstra o uso das operações CRUD implementadas nas classes `Bank` e `Account`.
