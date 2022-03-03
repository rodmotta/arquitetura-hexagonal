## Arquitetura Hexagonal

A **"Arquitetura Hexagonal"** ou também conhecida por **"Ports and Adapters"** é um padrão de arquitetura que tem como
principio a construção de sistemas com alta coesão, baixo acoplamento e independência de tecnologia.

A arquitetura hexagonal é dividida em 3 partes:
* Centro do hexágono
* Lado esquerdo do hexágono
* Lado direito do hexágono

![image](src/main/resources/static/hexagonal-architecture.png)

### O centro do hexágono
É o lugar onde ficam as classes de domínios e regras de negócio de seu sistema. Um ambiente totalmente isolado de
ocorrências externas, por exemplo, banco de dados, UI, frameworks, bibliotecas externas a linguagem.

### O lado esquerdo do hexágono
É o lado do usuário, o ator principal que conduz uma ação ao sistema.

### O lado direito do hexágono
É o lado dos dados, que conduz a escrita, leitura, modificação e deleção de dados.

### Portas - adaptadores
As portas são responsáveis pela comunicação dos lados do hexágono com o centro.
Já os adaptadores são as implementações das portas para conduzir alguma ação.

[Link de referência](https://br.sensedia.com/post/use-of-the-hexagonal-architecture-pattern)