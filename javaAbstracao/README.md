# Exercícios

**Observação geral:**  
Todos os exercícios devem possuir um **menu interativo** para chamar as funções e uma **opção de sair**, que finalize a execução do programa.

---

## Exercício 1 — Conta Bancária

Escreva um código onde temos uma **conta bancária** que possa realizar as seguintes operações:

- Consultar saldo
- Consultar cheque especial
- Depositar dinheiro
- Sacar dinheiro
- Pagar um boleto
- Verificar se a conta está usando cheque especial

### Regras de implementação

- A conta bancária deve ter um **limite de cheque especial somado ao saldo da conta**.
- O valor do cheque especial deve ser definido **no momento da criação da conta**, de acordo com o valor depositado inicialmente.
- Se o valor depositado na criação da conta for **R$ 500,00 ou menos**, o cheque especial deve ser de **R$ 50,00**.
- Para valores **acima de R$ 500,00**, o cheque especial deve ser de **50% do valor depositado**.
- Caso o limite de cheque especial seja utilizado, assim que possível a conta deve **cobrar uma taxa de 20%** sobre o valor usado do cheque especial.

---

## Exercício 2 — Controle de um Carro

Escreva um código onde controlamos as funções de um **carro**, que deve possuir as seguintes operações:

- Ligar o carro
- Desligar o carro
- Acelerar
- Diminuir velocidade
- Virar para esquerda/direita
- Verificar velocidade
- Trocar a marcha

### Regras de implementação

- Quando o carro for criado, ele deve iniciar:
    - Desligado
    - Em ponto morto (marcha 0)
    - Com velocidade igual a 0 km/h
- O carro **desligado não pode realizar nenhuma função**.
- Ao acelerar, a velocidade deve aumentar **1 km/h por vez**, podendo chegar ao máximo de **120 km/h**.
- Ao diminuir a velocidade, ela deve reduzir **1 km/h por vez**, podendo chegar ao mínimo de **0 km/h**.
- O carro deve possuir **6 marchas**, não sendo permitido pular marchas.
- A velocidade do carro deve respeitar os seguintes limites para cada marcha:
    - Marcha 0 (ponto morto): não pode acelerar
    - 1ª marcha: 0 km/h a 20 km/h
    - 2ª marcha: 21 km/h a 40 km/h
    - 3ª marcha: 41 km/h a 60 km/h
    - 4ª marcha: 61 km/h a 80 km/h
    - 5ª marcha: 81 km/h a 100 km/h
    - 6ª marcha: 101 km/h a 120 km/h
- O carro só pode ser desligado se estiver:
    - Em ponto morto (marcha 0)
    - Com velocidade igual a 0 km/h
- O carro só pode virar para a esquerda ou direita se sua velocidade estiver entre:
    - **Mínimo:** 1 km/h
    - **Máximo:** 40 km/h

---

## Exercício 3 — Controle de Banho de um Petshop

Escreva um código que controle uma **máquina de banho de um petshop**, com as seguintes operações:

- Dar banho no pet
- Abastecer com água
- Abastecer com shampoo
- Verificar nível de água
- Verificar nível de shampoo
- Verificar se há pet no banho
- Colocar pet na máquina
- Retirar pet da máquina
- Limpar máquina

### Regras de implementação

- A máquina de banho deve permitir **apenas 1 pet por vez**.
- Cada banho realizado deve consumir:
    - **10 litros de água**
    - **2 litros de shampoo**
- A máquina possui capacidade máxima de:
    - **30 litros de água**
    - **10 litros de shampoo**
- Se o pet for retirado da máquina **sem estar limpo**, será necessário **limpar a máquina** antes de permitir a entrada de outro pet.
- A limpeza da máquina deve consumir:
    - **3 litros de água**
    - **1 litro de shampoo**
- O abastecimento de água e shampoo deve permitir **2 litros por vez** a cada acionamento.

---
