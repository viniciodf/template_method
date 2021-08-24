Padroes de Projeto

1) Criacionais -> Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.
2) Estruturais -> Os padrões estruturais explicam como montar objetos e classes em estruturas maiores mas ainda mantendo essas estruturas flexíveis e eficientes.
3) Comportamentais -> Padrões comportamentais são voltados aos algoritmos e a designação de responsabilidades entre objetos.

* Comportamentais

9.Template Method

O que é:
O Template Method é um padrão de projeto comportamental que permite definir o esqueleto de um algoritmo em uma classe base e permitir que as subclasses substituam as etapas sem alterar a estrutura geral do algoritmo.

Aplicabilidade:
Utilize o padrão Template Method quando você quer deixar os clientes estender apenas etapas particulares de um algoritmo, mas não todo o algoritmo e sua estrutura.
Utilize o padrão quando você tem várias classes que contém algoritmos quase idênticos com algumas diferenças menores. Como resultado, você pode querer modificar todas as classes quando o algoritmo muda.

Identificação:
O Template Method pode ser reconhecido por métodos comportamentais que já possuem um comportamento “padrão” definido pela classe base.

Exempos de utilizacao:
java.io.InputStream
java.util.AbstractList