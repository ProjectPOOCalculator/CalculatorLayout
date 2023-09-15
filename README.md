<h2 align="center"> Projeto de Programação Orientada a Objetos | Java | Layout AWT | GUI Swing</h2>

<h2 align="left"> 📃 Descrição dos Projetos </h2>

<h3 align="left"> Calculadora Idade </h3>

- <a href="Calculadoras/Relatórios/CalculadoraIdade.md">Relatório Calculadora Idade</a> 


<h3 align="left"> Calculadora IMC </h3>

- <a href="Calculadoras/Relatórios/CalculadoraIMC.md">Relatório Calculadora IMC</a> 

<h3 align="left"> Calculadora Moeda </h3>

- O código cria uma aplicação gráfica simples para conversão de valores entre Dólar Americano e Real Brasileiro.
- A interface é intuitiva, com campos de entrada para valores em Dólar e em Real, botões para calcular e resetar.
- Além do Layout que foi o principal objeto de estudo, também conseguimos deixar a calculadora funcional, usando funções e o tryCatch para fazer a validação.
- <a href="Calculadoras/Relatórios/CalculadoraMoeda.md">Relatório Calculadora Moeda</a> 


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

## 1. GridBagLayout
O GridBagLayout é um layout altamente flexível e poderoso. Ele permite posicionar os componentes em linhas e colunas, mas com grande controle sobre a disposição e o tamanho de cada componente. É particularmente útil para interfaces complexas e detalhadas.

## 2. SpringLayout
O SpringLayout é um layout que utiliza molas (springs) para definir as relações de posicionamento entre os componentes. Ele oferece um alto nível de controle sobre o posicionamento e o redimensionamento dos componentes, sendo adequado para interfaces que requerem ajustes precisos.

## 3. MigLayout
O MigLayout é um layout de terceiros muito popular que combina simplicidade com uma grande capacidade de personalização. Ele se adapta bem a uma ampla variedade de interfaces e oferece uma sintaxe expressiva para definir a disposição dos componentes.

## 4. AbsoluteLayout
O AbsoluteLayout permite posicionar os componentes em coordenadas específicas, fornecendo um controle absoluto sobre a posição de cada elemento. Embora ofereça precisão no posicionamento, pode ser menos flexível em termos de adaptação a diferentes tamanhos de tela.


<h2 align="left"> 🎯 Comparação dos Layouts </h2>

- ORGANIZAÇÃO:
    - GridLayout:
    - FlowLayout:
    - BorderLayout:
- FLEXIBILIDADE:
    - GridLayout:
    - FlowLayout:
    - BorderLayout:
- ADAPTAÇÃO | RESPONSIVIDADE :
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


<h2 align="center"> Relatório Calculadora Moedas 💰 </h2>

<h2 align="left"> Detalhes do Código ⚙️ </h2>

- Bibliotecas:
    - JavaSwing (javax.swing.*)
    - JavaAWT (java.awt.*)
- Layouts:
    - GridLayout
    - FlowLayout
    - BorderLayout
- Classe:
    - Calculadora_idade
    - extends JPanel - a classe Calculadora_idade herda os comportamentos e propriedades de JPanel que é um componente da biblioteca JavaSwing e serve como contêiner para a organização dos componentes.
- Painéis | Contêiner:
    - painelPrincipal:
    - painelInput:
    - painelOutput:
    - painelBotao:
- Componentes:
    - JLabel:
    - JTextField:
    - JButton:
- Estilização:
    - 
- Botão Calcular:
    -
    -
- Botão Resetar:
    - 
- Exceptions | try-catch:
    - Dentro do bloco try-catch, o código lida com a possibilidade de o usuário inserir valores inválidos (não numéricos).
- Organização:
    - Para organizar melhor o código decidimos organizar da seguinte maneira:
        - Criação dos painéis.
        - Criação dos Componentes.
            - Estilização dos componentes.
        - Criação dos Botões.
            - Estilização dos Botões.
        - Adição dos elementos aos Painéis.
        - Funções para Calcular.
    - Além disso o código todo está comentado para melhor entendimento e compreensão no momento de debugar.

<h2 align="center"> Relatório Calculadora Idade 📅 </h2>

<h2 align="center"> Relatório Calculadora IMC ⚖️ </h2>


<h2 align="left"> 🙋 Autores </h2>

- Luigi
- Rafael de Sousa Moura
- Vinícius


    


