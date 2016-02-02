# DesignPattern
Design Pattern

#Title: Composite

Classification: Estrutural de objetos

Creator: Erich Gamma, Ralph Johnson, Richard Halm, John Vlissides

Subject: Estrutura de árvore, Hierarquias parte-todo

#Description:

Problem: Compor objetos em estruturas de árvore para representarem hierarquias parte-todo. Composite permite aos clientes tratarem de maneira uniforme objetos individuais e composições de objetos.

Motivation:

1. Em alguns sistemas, como por exemplo, aplicações gráficas tais como editores de desenhos e sistemas de captura esquemáticas, permitem aos usuários construir diagramas complexos a partir de componenetes simples. O usuário pode agrupar componentes para formar componentes maiores, os quais, por sua vez, podem ser agrupados para formar componentes ainda maiores. Uma implementação simples poderia definir classes que funcionam como recepientes para essas primitivas. Porém, há um problema com essa abordagem: o código que usa essas classes deve tratar objetos primitivos e objetos recepientes de modo diferente, mesmo se na maior parte do tempo o usuário os trata de forma idêntica. Ter que distinguir entre esses objetos torna a aplicação mais complexa. O padrão Composite descreve como usar a composição recursiva de maneira que os clientes não tenham que fazer essa distinção.
2. A chave para o padrão Composite é uma classe abstrata que representa tanto as primitivas como os seus recepientes.

Example:

1. Use o padrão Composite quando quiser representar hierarquias partes-todo de objetos.
2. Quando quiser que os clientes sejam capazes de ignorar a diferença entre composição de objetos e objetos individuais. Os clientes tratarão os objetos na estrutura composta de maneira uniforme.
