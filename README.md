#  EduConnect: Sistema de Gerenciamento Acadêmico

## Visão Geral do Projeto

O **EduConnect** é um sistema console em Java desenvolvido para simular e gerenciar as operações fundamentais de uma instituição de ensino. Ele foi projetado para demonstrar e aplicar conceitos de Orientação a Objetos (OO), como herança, polimorfismo, associações e tratamento robusto de exceções.

O fluxo do sistema começa com a **execução de testes automáticos** que verificam a criação de objetos e a formação de associações (`Turma` com `Aluno` e `Professor`), e em seguida, apresenta um **menu interativo** para novas operações.

## 🛠️ Tecnologias Utilizadas

* **Linguagem de Programação:** Java
* **Ambiente de Execução:** Console (Terminal)
* **Controle de Versão:** Git e GitHub

## 📂 Estrutura de Pacotes

A arquitetura do projeto segue uma organização lógica, adaptada para um sistema console:

* `mapaextensao.model`: Contém as classes de dados e entidades (`Aluno`, `Professor`, `Turma`, `CursoPresencial`, `CursoEAD`,`Avaliacao`).
* `mapaextensao.service`: Contém classes de lógica de negócio e regras (`Autenticacao`,`Relatorio`).
* `mapaextensao.ui`: Contém as classes responsáveis pela interação com o usuário (Menus).
* `mapaextensao.teste`: Contém a classe principal (`EduConnectTeste`) que atua como **Driver** e ponto de entrada da aplicação.

## ✨ Principais Funcionalidades e Conceitos de OO

| Funcionalidade | Conceito Aplicado | Descrição |
| :--- | :--- | :--- |
| **Modelagem de Cursos** | **Herança e Polimorfismo** | Criação de uma hierarquia de cursos (Ex: `CursoPresencial` e `CursoEAD` que herdam de `Curso`), permitindo relatórios específicos para cada tipo. |
| **Matrícula/Associação** | **Associação** | A classe `Turma` é associada a um `Professor` e a uma lista de `Alunos` (`List<Aluno>`). |
| **Avaliação Segura** | **Tratamento de Exceções** | Lógica implementada para garantir que a nota de um aluno seja um valor válido (entre 0.0 e 10.0), com *retry* em caso de erro de entrada. |
| **Autenticação** | **Encapsulamento** | Demonstração da autenticação de usuários (`Aluno` e `Professor`) com base em credenciais internas. |

## 🚀 Como Executar o Projeto

Para executar o sistema em sua máquina, siga os passos abaixo:

1.  **Clone o Repositório:**
    Abra seu terminal ou Git Bash na pasta desejada e execute (substitua o caminho do repositório):
    ```bash
    git clone [https://docs.github.com/pt/migrations/importing-source-code/using-the-command-line-to-import-source-code/adding-locally-hosted-code-to-github](https://docs.github.com/pt/migrations/importing-source-code/using-the-command-line-to-import-source-code/adding-locally-hosted-code-to-github)
    ```
2.  **Abra na IDE:**
    Importe a pasta do projeto em sua IDE Java preferida (IntelliJ, Eclipse, etc.).
3.  **Execute o Driver:**
    Execute o método `main` da classe principal (`mapaextensao.teste.EduConnectTeste`).

O programa primeiro exibirá a saída dos testes de atributos e associações, e em seguida, iniciará o Menu Principal Interativo.