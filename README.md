# POO com Java | Curso em Vídeo

Código fonte completo desenvolvido durante as aulas de Programação Orientada a Objetos utilizando Java. O curso engloba conceitos como classes, objetos, encapsulamento, métodos e classes abstratas, interfaces, herança e polimorfismo.

[Curso POO - Curso em Vídeo | Plataforma Curso em Vídeo](https://www.cursoemvideo.com/curso/java-poo/).

[Curso POO - Curso em Vídeo | Youtube](https://youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&si=_9aErmpUG-j4H1_g).

## 🖥 Atalhos Net Beans com Windows
- **Ctrl + A** = sugestão automática.
- **ALT + Insert** = gera construtor, getters e setters.
- **Ctrl + E** = apaga a linha.

## 💻 Resumos das Aulas

### Método toString
- ao selecionar os atributos, este método retorna uma string com o conteúdo de todos os atributos.

### Método abstract
- um método que você vai descrever a funcionalidade dele em outra classe que implemente ele, usando @override na outra classe para sobrescrever os métodos.

### Interface
- para criar uma interface gere um novo arquivo do tipo interface.
#### implementar interface
- class NomeDaClasse implements NomeDaInterface.

### Saída de dados na tela
**print:** gera uma string sem alterar a linha, não formata os dados na saída.

**println:** cria uma nova linha abaixo da atual, não formata os dados na saída.

**printf:** gera uma string sem alterar a linha, mostra os dados na saída formatados.

### Herança
- A superclasse que não tem nenhum classe acima dela é a raiz, e as subclasses que não tem nenhuma filha são as folhas, a árvore é escrita com a raiz no topo e as folhas no final.
- **ancestrais:** são as superclasses que estão a pelo menos, duas gerações de distância das subclasses, "não contando as classes mães, apenas as avós e antecessoras".
- **descendentes:** são as subclasses que estão a pelo menos, duas gerações de distância das superclasses, "não contando as classes filhas, apenas as netas e sucessoras".
- quando você percorre a árvore de cima para baixo, da raiz às folhas: **especialização.**
- quando você percorre a árvore de baixo para cima, das folhas às raízes: **generalização.**
- **herança de implementação:** herança pobre, mais simples, quando a subclasse não implementa mais nenhum atributo ou método.
- **herança para diferença:** herança mais completa, quando a subclasse implementa algum atributo ou método diferente da superclasse.

**Classe abstrata:**
Não pode ser instanciada, serve apenas como progenitora.

**Método abstrato:**
Método declarado, mas não implementado na progenitora, só pode ser colocado dentro de uma classe abstrata ou dentro de uma interface.

**Classe final:**
não pode ter filhos, obrigatoriamente folha.

**Método final:**
não pode ser sobrescrito pelas subclasses, ele é obrigatoriamente herdado.

### Polimorfismo
- fazer uma determinada coisa com o mesmo nome, e essa coisa poder agir de diferentes maneiras
- **Assinatura do método**: quantidade e os tipos dos parâmetros, o tipo do método não entra na assinatura.
- **polimorfismo de Sobreposição:** acontece quando substituímos um método de uma superclasse em sua subclasse, usando a mesma **assinatura**.
- **polimorfismo de Sobrecarga:** acontece quando colocamos o mesmo nome do método diversas vezes na mesma classe, porém, com assinaturas diferentes.
    - uma assinatura int, float é diferente de uma assinatura float, int.
    - o tipo de retorno do método não interfere na assinatura.

### Método Super
este método referencia a superclasse, a classe progenitora, pode ser usada nos construtores das classes filhas, onde a classe mãe é abstrata e possui construtor, e pode ser usada no toString das classes filhas, usando super.toString(), que printa na tela o toString da classe progenitora.

## 🔍 Referências
- [Curso POO - Curso em Vídeo | Plataforma Curso em Vídeo](https://www.cursoemvideo.com/curso/java-poo/).

- [Curso POO - Curso em Vídeo | Youtube](https://youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&si=_9aErmpUG-j4H1_g).