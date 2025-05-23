# Biblioteca de Alexandria - Sistema de Cadastro de Livros

## Descrição

Este projeto é um sistema simples para cadastro, listagem, busca e remoção de livros em uma biblioteca fictícia chamada "Biblioteca de Alexandria". Desenvolvido em Java, o programa utiliza leitura e escrita de arquivos para armazenar os dados dos livros em um arquivo de texto (`livros.txt`).

---

## Funcionalidades

- **Cadastrar livro**  
  Permite ao usuário inserir informações do livro (título, autor, ano e nota). Os dados são armazenados em `livros.txt`.

- **Listar livros**  
  Lê o arquivo `livros.txt` e exibe todos os livros cadastrados no formato organizado.

- **Buscar livro**  
  Permite buscar livros por nome (implementação futura).

- **Remover livro**  
  Remove um livro do arquivo, criando um arquivo temporário para atualizar os dados sem o registro removido.

- **Limpar console**  
  Método para limpar a tela do terminal entre as operações, proporcionando melhor usabilidade (funciona em Windows e Linux/Mac).

---

## Como usar

1. Compile o programa:
   ```bash
   javac Biblioteca.java
2. Execute o programa:
   ```bash
   java Biblioteca.java
   
