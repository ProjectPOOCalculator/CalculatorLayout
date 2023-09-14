<h2 align="center"> Projeto de Programação Orientada a Objetos | Java | Layout AWT | GUI Swing</h2>

<h2 align="left"> 🧠 Projetos </h2>
<h3 align="left"> Calculadora Idade </h3>

- 
<h3 align="left"> Calculadora IMC </h3>

-

<h3 align="left"> Calculadora Moeda </h3>

-

<h2 align="left"> 🗂️ Descrição </h2>

<h2 align="left"> ⚙️ Tipos de Layouts </h2>

<h3 align="left"> GridLayout: </h3>

  - Organização em Grade:
      - Facilita a organização dos componentes em um número determinado de linhas e colunas, o que é útil para interfaces de usuário que exigem uma disposição tabular.
  - Alinhamento Uniforme:
      - Garante que todos os componentes tenham o mesmo tamanho, criando uma aparência uniforme e organizada.
  - Responsividade:
      - Os componentes se ajustam automaticamente à medida que a janela é redimensionada, mantendo a estrutura de grade.
  - Configuração Flexível:
      - Permite que você defina o número de linhas e colunas na grade.
  - Ordem não se altera:
      - Os componentes mantêm sua posição relativa mesmo quando a janela é redimensionada.

<h3 align="left"> FLowLayout: </h3>

  - Organização Simples: 
    - Organiza os componentes em uma linha, adicionando-os da esquerda para a direita.
  - Adaptação em Diferentes Telas:
    - Os componentes são dispostos em linha, mas a altura da linha é ajustada automaticamente para acomodar os componentes adicionados.
  - Responsividade:
      - Se a janela for redimensionada, os componentes manterão sua ordem.
  - Solução Rápida:
      - É útil quando você precisa criar interfaces rapidamente sem se preocupar com o posicionamento preciso de cada componente.
  - Alinhamento Personalizado:
      - Embora os componentes sejam adicionados da esquerda para a direita, você ainda pode ajustar o alinhamento vertical ou horizontal de cada componente.
    
<h3 align="left"> BorderLayout: </h3>

  - Fácilidade de Uso:
    - Basta adicionar componentes à janela e definir a direção.
  - Organização Hierárquica:
    - É útil quando você tem componentes que são de importância hierárquica diferente.
  - Responsividade:
    - Se ajusta automaticamente quando a janela é redimensionada, mantendo a hierarquia entre os componentes.
  - Janelas Principais:
    - É frequentemente usado para janelas principais ou painéis de aplicativos.
  - Alinhamento Automático:
    - Os componentes são alinhados automaticamente dentro de suas regiões.
  - Janelas Maximizadas:
    - É eficaz quando a janela é maximizada, pois mantém a organização das regiões.

<h2 align="left"> 💡 Outros tipos de Layouts </h2>
1. CardLayout
O CardLayout é um layout que permite alternar entre diferentes componentes em um mesmo espaço. Cada componente é tratado como um "cartão", e apenas um deles é visível por vez. É útil para interfaces que necessitam de navegação entre diferentes telas ou painéis.

Exemplo de uso:
CardLayout cardLayout = new CardLayout();
JPanel cards = new JPanel(cardLayout);

// Adicionando "cartões"
cards.add(new JPanel(), "card1");
cards.add(new JPanel(), "card2");

// Para alternar entre os cartões
cardLayout.show(cards, "card1");


<h2 align="left"> 🎯 Comparação dos Layouts </h2>

- ORGANIZAÇÃO:
    - GridLayout:
    - FlowLayout:
    - BorderLayout:
- FLEXIBILIDADE:
    - GridLayout:
    - FlowLayout:
    - BorderLayout:
- ADAPTAÇÃO:
    - GridLayout:
    - FlowLayout:
    - BorderLayout:
- CASO DE USO:
    - GridLayout:
    - FlowLayout:
    - BorderLayout:

- CONCLUSÃO:
  - GridLayout:
    - Ótimo para organização tabular e uniforme de componentes, especialmente útil para exibir dados em uma estrutura de tabela.
  - FlowLayout:
    - Simples e eficaz para organizar componentes em linha, sendo útil em situações onde a organização linear é suficiente.
  - BorderLayout:
    - Excelente para janelas principais onde diferentes áreas têm diferentes níveis de importância.

<h2 align="left"> 🙋 Autores </h2>

- Luigi
- Rafael de Sousa Moura
- Vinícius


    


