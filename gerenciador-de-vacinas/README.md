# Gerenciador de Vacinas

Este projeto é um sistema para gerenciar dados de vacinação de pacientes. Ele permite cadastrar novas vacinações, listar todos os dados cadastrados, consultar informações por CPF, e deletar cadastros.

## Funcionalidades

1. **Cadastrar Nova Vacinação**: Adiciona um novo paciente ao sistema ou atualiza o cadastro de vacinação de um paciente existente.
2. **Listar Dados Cadastrados**: Exibe todos os dados de vacinação cadastrados no sistema.
3. **Consultar Dados por CPF**: Procura informações de vacinação específicas de um paciente usando o CPF.
4. **Deletar Cadastro**: Remove o registro de um paciente do sistema usando o CPF.
5. **Sair**: Encerra o programa.

## Estrutura do Projeto

### 1. `Main.java`

Este é o ponto de entrada do programa. Ele exibe o menu principal e lida com a entrada do usuário. Dependendo da opção escolhida, o `Main` chama os métodos apropriados do `GerenciadorDeVacinas`.

- **Principais Funções**:
  - Exibe o menu de opções.
  - Captura a escolha do usuário.
  - Chama métodos para cadastrar, listar, consultar ou deletar dados de vacinação.

### 2. `Vacina.java`

Representa um paciente e suas vacinações. Contém informações como nome, CPF, vacinas aplicadas e data da aplicação.

- **Principais Funções**:
  - Adiciona novas vacinações.
  - Exibe informações detalhadas sobre o paciente.

### 3. `GerenciadorDeVacinas.java`

Gerencia o cadastro de vacinações. Armazena os dados em um `HashMap` onde a chave é o CPF do paciente e o valor é um objeto `Vacina`.

- **Principais Funções**:
  - **Cadastrar Nova Vacinação**: Adiciona ou atualiza informações de vacinação.
  - **Consultar Informações**: Exibe as informações de vacinação para um CPF específico.
  - **Listar Dados**: Mostra todos os dados cadastrados.
  - **Deletar Cadastro**: Remove um paciente do sistema.

## Como Executar o Projeto

1. **Compile o código**:
   ```bash
   javac Main.java Vacina.java GerenciadorDeVacinas.java
   ```

2. **Execute o programa**:
   ```bash
   java Main
   ```

3. **Siga as instruções no menu** para usar as funcionalidades do sistema.

## Exemplo de Uso

Ao iniciar o programa, você verá um menu com as seguintes opções:

```
1 - CADASTRAR NOVA VACINAÇÃO
2 - LISTAR DADOS CADASTRADOS
3 - CONSULTAR DADOS POR CPF
4 - DELETAR CADASTRO
5 - SAIR
```

Digite o número da opção desejada e siga as instruções fornecidas para realizar a operação escolhida.

## Notas

- Certifique-se de digitar opções válidas (entre 1 e 5) quando solicitado.
- O programa encerrará quando a opção 5 for selecionada.
