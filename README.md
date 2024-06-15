# A3 - Sistema de Biblioteca em Java

Este é um sistema de biblioteca simples desenvolvido em Java, utilizando conceitos de programação orientada a objetos como herança e polimorfismo. O programa permite realizar operações básicas em uma biblioteca, como inserir, alterar, remover e listar itens (livros e revistas).

## Funcionalidades

- Inserir novos itens (livros ou revistas).
- Alterar informações de itens existentes.
- Remover itens da biblioteca.
- Listar todos os itens cadastrados na biblioteca.

## Estrutura do Projeto

O projeto é estruturado em várias classes principais:

- `Item`: Classe abstrata base para itens da biblioteca.
- `Livro`: Classe que herda de `Item`, representa livros na biblioteca.
- `Revista`: Classe que herda de `Item`, representa revistas na biblioteca.
- `Biblioteca`: Classe que gerencia os itens na biblioteca.
- `Principal`: Classe principal que contém o menu e interação com o usuário.

## Como Executar

Para executar o programa:

1. Clone o repositório para sua máquina local.
2. Abra o projeto em um IDE como o NetBeans.
3. Compile e execute a classe `Principal.java`.

Certifique-se de ter o JDK (Java Development Kit) e o NetBeans instalados em seu sistema.

## Exemplo de Uso

Aqui está um exemplo de como utilizar o sistema:

1. Insira um novo livro ou revista.
2. Liste todos os itens cadastrados.
3. Altere as informações de um item existente.
4. Remova um item da biblioteca.
5. Saia do programa.

