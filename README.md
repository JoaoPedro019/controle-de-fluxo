# Desafio Controle de Fluxo 🚀  

Este projeto foi desenvolvido para exercitar os conceitos de **Controle de Fluxo** em Java, utilizando **estruturas de repetição** e **exceções personalizadas**.  

## 📝 Descrição  

O sistema recebe **dois números inteiros** via terminal e realiza uma contagem incremental entre eles. O comportamento esperado é:  

- Se o **primeiro número for menor** que o segundo, o programa imprimirá no console a sequência numérica correspondente.  
- Se o **primeiro número for maior** que o segundo, será lançada uma exceção personalizada (`ParametrosInvalidosException`).  

## 📌 Exemplo de Execução  

### Entrada:  
Digite o primeiro parâmetro: 12
Digite o segundo parâmetro: 30

### Saída:  
Imprimindo a 1ª interação: 1
Imprimindo a 2ª interação: 2
Imprimindo a 3ª interação: 3
... Imprimindo a 18ª interação: 18


Se a entrada for inválida (exemplo: `30` como primeiro número e `12` como segundo), o programa exibirá: 

Erro: O segundo parâmetro deve ser maior que o primeiro


## 🛠 Tecnologias Utilizadas  
- Java  
- Tratamento de Exceções  
- Estruturas de Repetição (`for`)  
- Scanner para entrada de dados  

