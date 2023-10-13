#Exercício 1. Crie um programa que recebe um inteiro pelo teclado e imprime se ele é par ou ímpar.
valor=int(input("Insira um número inteiro"))
if valor % 2 == 0:
 print(valor,"é par!")
else:
 print(valor,"é ímpar!")

#Exercício 2. Crie um programa que recebe dois valores inteiros pelo teclado e imprime qual dos dois é maior.
valor1=int(input("Insira um número inteiro "))
valor2=int(input("Insira outro número inteiro "))
if valor1>valor2:
 print(valor1,"é maior que", valor2)
elif valor1 == valor2:
 print("Os valores informados são iguais")
else:
 print(valor2,"é maior que", valor1)

#Exercício 3. Crie um programa que recebe dois valores inteiros A e B pelo teclado e imprime o valor de A dividido por B. Entretanto, se o valor de B for 0, imprima uma mensagem de erro e não faça a divisão.
A=int(input("Insira um valor inteiro para A "))
B=int(input("Insira um valor inteiro para B "))
if B == 0:
 print("Erro! O dividendo é igual a 0")
else:
 print(A/B)

#Exercício 4. Crie um programa que recebe três valores inteiros pelo teclado e imprime qual dos três é menor.
A=int(input("Insira um valor para A "))
B=int(input("Insira um valor B "))
C=int(input("Insira um valor C "))
if A<B and A<C:
 print(A,"é o menor valor")
elif B<A and B<C:
 print(B,"é o menor valor")
elif C<A and C<B:
 print(C,"é o menor valor")
else:
 print("Não há um único valor menor")

#Exercício 5. Crie um programa que recebe o preço de um produto pelo teclado e imprime na tela a mensagem adequada, de acordo com o preço: 
#• “Preço inválido”, se o preço for negativo ou zero
#• “Preço baixo”, se o preço for entre 0 e 30 (inclusive) 
#• “Preço médio”, se o preço for entre 30 e 50 (inclusive)
#• “Preço alto”, se o preço for maior do que 50
x=float(input("Insira um valor "))
if x<=0:
 print("Preço inválido")
elif x <= 30:
 print("Preço baixo")
elif x <= 50:
 print("Preço médio")
else:
 print("Preço alto")

#Exercício 6. Crie um programa que aplica uma taxa de juros em um determinado preço digitado pelo teclado. A taxa aplicada deve ser:
#• Aumento de 10% caso o valor seja menor do que 100
#• Aumento de 20% caso o valor esteja entre 100 (inclusive) e 300
#• Aumento de 50% caso o valor esteja entre 300 (inclusive) e 1000
#• Imprima uma mensagem de erro se o valor for negativo
#• Ao final, seu programa deve imprimir o novo valor, já com a taxa aplicada.
x=float(input("Digite um valor "))
if x<100 and x>=0:
 print("Seu novo valor é",x+x*0.1)
elif x>=100 and x<300:
 print("Seu novo valor é",x+x*0.2)
elif x>=300 and x<1000:
 print("Seu novo valor é",x+x*0.5)
elif x<0 or x>1000:
 print("Erro, valor inválido informado")

#Exercício 7. Crie um programa que recebe um valor inteiro referente a um determinado ano. Imprima na tela se o ano informado é bissexto ou não.
ano=int(input("Informe um ano "))
if (ano % 4 == 0 and ano % 100 != 0) or ano % 400 == 0:
 print("Seu ano é bissexto!")
else:
 print("Seu ano não é bissexto.")

#Exercício 8. Crie um programa que exibe um menu de calculadora na tela. O menu exibido deve ser o seguinte:
#• Digite 1 para somar dois valores
#• Digite 2 para subtrair dois valores
#• Digite 3 para multiplicar dois valores
#• Digite 4 para dividir dois valores
#• Digite 5 para realizar uma potência entre dois valores
#• Digite 6 para realizar uma radiciação entre dois valores
#• Digite qualquer outro número para sair
#De acordo com a opção informada pelo usuário, solicite os valores necessários para o usuário e imprima na tela o resultado da operação realizada.
print("Digite 1 para somar dois valores\nDigite 2 para subtrair dois valores\nDigite 3 para multiplicar dois valores\nDigite 4 para dividir dois valores\nDigite 5 para realizar uma potência entre dois valores\nDigite 6 para realizar uma radiciação entre dois valores\nDigite qualquer outro número para sair")
X=int(input("Digite um valor "))
if X == 1:
 A=int(input("Digite um valor de parcela "))
 B=int(input("Digite outro valor de parcela "))
 print("Total =",A+B)
elif X == 2:
 A=int(input("Digite um valor de aditivo "))
 B=int(input("Digite um valor de subtrativo "))
 print("Diferença =",A-B)
elif X == 3:
 A=int(input("Digite um valor de fator "))
 B=int(input("Digite outro valor de fator "))
 print("Produto =",A*B)
elif X == 4:
 A=int(input("Digite um valor de dividendo "))
 B=int(input("Digite um valor para divisor "))
 print("Quociente =",A/B)
elif X == 5:
 A=int(input("Digite um valor de base "))
 B=int(input("Digite um valor de expoente "))
 print("Potência =",A**B)
elif X == 6:
 A=int(input("Digite um valor de radical "))
 B=int(input("Digite o valor da índice "))
 print("Raíz =",A**(1/B))
else:
 print("Muito obrigado!")

#Exercício 9. Crie um programa que recebe a nota do Grau A e a nota do Grau B pelo teclado e imprime na tela se será necessário ou não realizar o Grau C (considere o sistema de avaliação da Unisinos). Caso algum valor informado seja negativo, informe uma mensagem de erro e não realize o cálculo.
A=float(input("Digite a nota do Grau A "))
B=float(input("Digite a nota do Grau B "))
if A<0 or B<0:
 print("Erro! Valor negativo informado.")
elif (A >= 0 and A <= 10) and (B >= 0 and B <= 10):
 AB=(A+2*B)
 final=(AB/3)
 if final<6:
    print("Você precisará fazer o Grau C.")
 elif final>=6:
    print("Você está aprovado!")
else:
 print("Valor acima de 10 informado")

#Exercício 10. Crie um programa que solicita que o usuário digite uma letra e imprime na tela se a letra é uma vogal ou uma consoante.
X=str(input("Digite uma letra "))
if X == "a" or X == "e" or X == "i" or X == "o" or X == "u":
    print("A letra",X,"é vogal.")
elif X == "b" or X == "c" or X == "d" or X == "f" or X == "g" or X == "h" or X == "j" or X == "k" or X == "l" or X == "m" or X == "n" or X == "p" or X == "q" or X == "r" or X == "s" or X == "t" or X == "v" or X == "w" or X == "x" or X == "y" or X == "z":
    print("A letra",X,"é consoante.")
else:
    print("Valor inválido inserido.")