# template

Implementação do padrão de projeto template baseado no artigo https://www.thiengo.com.br/padrao-de-projeto-template-method-metodo-template

Quando usar?

- Esse padrão vai permitir definir, através de um método template, os passos exatos de um algoritmo através dos métodos que realizam ações onde alguns desses passos, mais específicos, são implementados por subclasses. Como ponto positivo, a classe template abstrata pode implementar alguns métodos que possam estar repetidos em classes comuns, e fazer com que essas classes implementem à template, evitando código repetido e criando o método template para definir a ordem das ações.

**OBS.:** O *Princípio Hollywood* implica em classes de mais alto nível serem responsáveis pela invocação de dependência das classes de mais baixo nível. Esse princípio pode ser visto como uma boa prática da orientação a objetos.