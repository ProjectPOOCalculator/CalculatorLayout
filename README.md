<h1 align="center"> Projeto de Programação Orientada a Objetos | Java | Layout AWT | GUI Swing</h1>

<h2 align="left"> 📃 DESCRIÇÃO DOS PROJETOS </h2>

<h3 align="left"> Calculadora Idade </h3>

- O código cria uma aplicação gráfica simples para conversão de idades com base nas datas inseridas.
- A interface é intuitiva, com campos de entrada para valores de data, e botão para calcular.
- Além do Layout que foi o principal objeto de estudo, também conseguimos deixar a calculadora funcional, usando funções e o tryCatch para fazer a validação.
- <a href="Calculadoras/Relatórios/CalculadoraIdade.md">Relatório Calculadora Idade</a> 

<h3 align="left"> Calculadora IMC </h3>

- O código cria uma aplicação gráfica simples para cálculo do IMC (Índice de Massa Corporal).
- A interface é intuitiva, com campos de entrada para valores em Metros (Altura) e KG (Peso), além do botaõ de calcular.
- Além do Layout que foi o principal objeto de estudo, também conseguimos deixar a calculadora funcional, usando funções e o tryCatch para fazer a validação.
- <a href="Calculadoras/Relatórios/CalculadoraIMC.md">Relatório Calculadora IMC</a> 

<h3 align="left"> Calculadora Moeda </h3>

- O código cria uma aplicação gráfica simples para conversão de valores entre Dólar Americano e Real Brasileiro.
- A interface é intuitiva, com campos de entrada para valores em Dólar e em Real, botões para calcular e resetar.
- Além do Layout que foi o principal objeto de estudo, também conseguimos deixar a calculadora funcional, usando funções e o tryCatch para fazer a validação.
- <a href="Calculadoras/Relatórios/CalculadoraMoeda.md">Relatório Calculadora Moeda</a> 


<h2 align="left"> ⚙️ TIPOS DE LAYOUTS </h2>

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

<h2 align="left"> 💡 OUTROS TIPOS DE LAYOUT </h2>

<h3 align="left"> GridBagLayout: </h3> 

  - O GridBagLayout é um layout altamente flexível e poderoso. 
  - Ele permite posicionar os componentes em linhas e colunas, mas com grande controle sobre a disposição e o tamanho de cada componente. 
  - É particularmente útil para interfaces complexas e detalhadas.

<h3 align="left"> SpringLayout: </h3> 

  - O SpringLayout é um layout que utiliza molas (springs) para definir as relações de posicionamento entre os componentes. 
  - Ele oferece um alto nível de controle sobre o posicionamento e o redimensionamento dos componentes, sendo adequado para interfaces que requerem ajustes precisos.

<h3 align="left"> MigLayout: </h3> 

  - O MigLayout é um layout de terceiros muito popular que combina simplicidade com uma grande capacidade de personalização. 
  - Ele se adapta bem a uma ampla variedade de interfaces e oferece uma sintaxe expressiva para definir a disposição dos componentes.

 <h3 align="left"> AbsoluteLayout: </h3>
 
  - O AbsoluteLayout permite posicionar os componentes em coordenadas específicas, fornecendo um controle absoluto sobre a posição de cada elemento. 
  - Embora ofereça precisão no posicionamento, pode ser menos flexível em termos de adaptação a diferentes tamanhos de tela.


<h2 align="left"> 🎯 COMPARAÇÃO DOS LAYOUTS </h2>

- ORGANIZAÇÃO:
    - GridLayout: Componentes são organizados em uma grade com um número fixo de linhas e colunas.
    - FlowLayout: Componentes são dispostos em linha, adicionando-os da esquerda para a direita. Quando a linha fica cheia, os componentes continuam na próxima linha.
    - BorderLayout: Divide a área em cinco regiões: norte, sul, leste, oeste e centro. Cada componente é adicionado a uma dessas regiões.
- FLEXIBILIDADE:
    - GridLayout: Permite definir o número de linhas e colunas na grade.
    - FlowLayout: ...
    - BorderLayout: Permite definir as regiões para disposição dos componentes.
- ADAPTAÇÃO | RESPONSIVIDADE :
    - GridLayout: Os componentes se ajustam automaticamente à medida que a janela é redimensionada.
    - FlowLayout: A altura da linha é ajustada automaticamente para acomodar os componentes adicionados.
    - BorderLayout: Mantém a organização mesmo quando a janela é redimensionada.
- ALINHAMENTO:
    - GridLayout: Componentes são todos do mesmo tamanho e são alinhados uniformemente.
    - FlowLayout: Pode haver variações no alinhamento horizontal ou vertical.
    - BorderLayout: Componentes em cada região mantêm o alinhamento automático, mas as regiões podem ter diferentes tamanhos.

- CONCLUSÃO:
  - GridLayout:
    - Ótimo para organização tabular e uniforme de componentes, especialmente útil para exibir dados em uma estrutura de tabela.
  - FlowLayout:
    - Simples e eficaz para organizar componentes em linha, sendo útil em situações onde a organização linear é suficiente.
  - BorderLayout:
    - Excelente para janelas principais onde diferentes áreas têm diferentes níveis de importância.


<h2 align="center"> Relatório Calculadora Moedas 💰 </h2>

<h3 align="left"> DETALHES DO CÓDIGO ⚙️ </h3>

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
    - JLabel
    - JTextField
    - JButton
- Estilização:
    - setfont
    - setForeground
    - setBackground
    - setHorizontalAlignment
    - setVerticalAlignment
- Botão Calcular:
    - É adicionado um ActionListener ao botão "Calcular". Quando o botão é pressionado, o código do método actionPerformed é executado.
    - O código dentro deste método lida com a conversão de valores inseridos pelo usuário, realiza o cálculo e exibe o resultado.
- Botão Resetar:
    - Similar ao botão "Calcular", o botão "Resetar" também tem um ActionListener associado.
    - Quando pressionado, ele limpa os campos de input e output.
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

<h3 align="left"> DETALHES DO CÓDIGO ⚙️ </h3>

## Introdução

A Calculadora IMC em Java é uma aplicação gráfica desenvolvida para calcular o Índice de Massa Corporal (IMC) com base no peso e altura fornecidos pelo usuário. Este relatório descreverá a estrutura do código, suas funcionalidades e as principais dificuldades enfrentadas durante o desenvolvimento.

## Estrutura do Código

O código está organizado de forma modular, utilizando a classe `Calculadora_IMC` que herda de `JPanel` e representa a interface gráfica da calculadora. Ele é composto por:

- Rótulos (`JLabel`): `alturaUsuario`, `pesoUsuario`, `resultadoIMC` e três rótulos adicionais para exibir mensagens sobre a classificação do IMC.
- Campos de Texto (`JTextField`): `campoAltura` e `campoPeso` para entrada de dados, e `campoResultado` para exibir o resultado do cálculo.
- Botão (`JButton`): `botaoCalcular` para iniciar o cálculo do IMC.

## Funcionalidades

A aplicação possui as seguintes funcionalidades:

1. O usuário pode inserir sua altura (em metros) e peso (em quilogramas) nos campos de texto correspondentes.
2. Ao pressionar o botão "Calcular", o programa verifica se os valores são válidos e realiza o cálculo do IMC.
3. Com base no resultado do cálculo, o programa exibe o IMC calculado e uma mensagem indicando se o usuário está abaixo do peso, no peso ideal ou acima do peso.
4. As mensagens de classificação são exibidas com cores diferentes para facilitar a identificação.

## Principais Dificuldades

Durante o desenvolvimento, algumas das principais dificuldades encontradas foram:

1. *Manipulação de Componentes Gráficos*: Garantir que os componentes gráficos fossem adicionados corretamente aos painéis e que estivessem dispostos de forma adequada.
2. *Tratamento de Eventos*: Implementar a lógica de cálculo do IMC e a exibição das mensagens de classificação com base nos valores fornecidos pelo usuário.
3. *Controle de Exceções*: Lidar com possíveis exceções que podem ocorrer ao tentar converter os valores de texto para números.

## Conclusão

A Calculadora IMC em Java proporciona uma interface simples e interativa para calcular o Índice de Massa Corporal. Ela foi desenvolvida de forma modular e utiliza componentes gráficos para proporcionar uma experiência amigável ao usuário.

Para futuras melhorias, pode-se considerar a adição de validações adicionais e aprimoramentos na interface gráfica para proporcionar uma experiência ainda mais intuitiva.

<h2 align="center"> Relatório Calculadora IMC ⚖️ </h2>

<h3 align="left"> DETALHES DO CÓDIGO ⚙️ </h3>

### Layouts Utilizados
Utilizamos em uma aplicação de calculadora de idade desenvolvida em Java Swing, dois dos três layouts indicados. Avaliamos esses layouts com base em critérios objetivos e subjetivos para determinar sua adequação e eficácia na organização da interface do usuário.

### BorderLayout:
Usabilidade: O BorderLayout foi considerado uma escolha adequada para os componentes principais da aplicação. Ele organiza os componentes em cinco áreas predefinidas: norte, sul, leste, oeste e centro. Isso ajuda a criar uma interface de usuário intuitiva, com o campo de entrada de data de nascimento na parte superior, o botão "Calcular" no centro e a exibição do resultado na parte inferior.
Ajustabilidade: Embora o BorderLayout tenha limitações em termos de flexibilidade, para esta aplicação, a disposição dos elementos se encaixa bem nas áreas predefinidas, tornando-o ajustável o suficiente.
Eficiência de Código: A implementação do BorderLayout é clara e direta, sem complexidade excessiva. Isso contribui para a eficiência do código.
Estética: O uso do BorderLayout resulta em uma interface de usuário organizada e limpa. A disposição dos componentes é lógica e agradável esteticamente.

### FlowLayout:
Usabilidade: O FlowLayout não é apropriado para a organização dos componentes principais desta aplicação. Ele coloca os componentes em uma única linha, o que não se encaixa bem para o campo de entrada de data e o botão "Calcular". Contudo, acreditamos que tenha sido uma boa escolha, ja que não foram criados muitos componentes.
Ajustabilidade: O FlowLayout permite que os componentes fluam naturalmente, mas não é ideal para organizar elementos em várias linhas ou colunas, o que é necessário neste caso.
Eficiência de Código: Embora o código que utiliza o FlowLayout seja eficiente, a escolha desse layout não é apropriada para a interface principal.
Estética: O FlowLayout não resulta em uma estética agradável para a organização dos componentes principais.

### GridLayout:
Usabilidade: O GridLayout é apropriado para a exibição do resultado da idade, pois organiza os componentes em uma grade de células de tamanho igual. Isso ajuda a criar uma exibição organizada e fácil de ler. Porém, por se tratar de ua aplicação simples, optamos pelo FlowLayout. 
Ajustabilidade: O GridLayout é adequado para exibir resultados, pois os componentes se ajustam facilmente à grade, adaptando-se ao tamanho da janela.
Eficiência de Código: A implementação do GridLayout é simples e eficiente, adequada para a finalidade de exibir o resultado da idade.
Estética: O GridLayout é esteticamente apropriado para a exibição do resultado, pois organiza o texto de forma organizada e uniforme.

### Conclusão:
Com base na análise dos critérios objetivos e subjetivos, concluímos que o BorderLayout é a escolha mais apropriada para organizar os componentes principais da calculadora de idade, enquanto o GridLayout é adequado para a exibição do resultado da idade. Ambos os layouts contribuem para uma interface de usuário funcional, organizada e esteticamente agradável, atendendo às necessidades do aplicativo.


<h2 align="left"> 🙋 AUTORES </h2>

- Luigi Souza
- Rafael de Sousa Moura
- Vinícius Granço Feitoza
