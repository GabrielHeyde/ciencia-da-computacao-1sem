#Exercício 1. Faça o código que implementa o algoritmo descrito no fluxograma abaixo: 

i=0 

while i<10: 

  x=int(input("Digite um número aleatório: ")) 

  i+=1 

  if x<0: 

    print("NÚMERO NEGATIVO") 

  elif x == 0: 

    print("ZERO") 

  else: 

    print("NÚMERO POSITIVO") 

#Exercício 2. Faça um programa que escreva na tela todos os números inteiros entre 0 (inclusive) e 1000 (inclusive). 

i=0 

while i<=1000: 

  print(i) 

  i+=1 

print("Fim!") 

#Exercício 3. Faça um programa que escreva na tela todos os valores inteiros que estão entre dois valores digitados pelo usuário (num1 e num2). Caso num1 seja maior do que num2, imprima uma mensagem de erro e não imprima. 

num1=int(input("Digite um valor: ")) 

num2=int(input("Digite um valor maior que o anteior: ")) 

i=num1+1 

if num1>num2: 

  print("Erro!") 

else: 

  while i<num2: 

    print(i) 

    i+=1 

#Exercício 4. Faça um programa que escreva na tela todos os valores inteiros entre dois valores digitados pelo usuário (num1 e num2). Caso num1 seja maior do que num2, seu programa deve imprimir os valores entre num1 e num2 da mesma forma. 

num1=int(input("Digite um valor: ")) 

num2=int(input("Digite outro valor: ")) 

if num1 == num2: 

  print("Erro!Valores iguais digitados") 

elif num1>num2: 

  menor=num2 

  maior=num1 

  i=menor 

  while i<maior-1: 

    i+=1 

    print(i) 

elif num1<num2: 

  menor=num1 

  maior=num2 

  i=menor 

  while i<maior-1: 

    i+=1 

    print(i) 

#Exercício 5. Faça um programa que imprima na tela a soma de todos os valores entre 1 e 1000. 

i=0 

soma=0 

while i<1000: 

  soma=soma+i 

  i+=1 

  print(i) 

print("A soma de todos os números entre 1 e 1000 é:",soma) 

#Exercício 6. Faça um programa que solicita ao usuário que ele digite números que sejam positivos e pares. Quando o usuário digitar um número que não seja o solicitado, imprima na tela a soma dos valores positivos e pares digitados. 

soma=0 

x=int(input("Digite um número positivo e par: ")) 

while x>0 and x % 2 == 0: 

  soma=soma+x 

  x=int(input("Digite um número positivo e par: ")) 

if x<=0 or x % 2 != 0: 

  print("A soma dos números positivos e pares informada é =",soma) 

#Exercício 7. O usuário e a senha de um cliente são, respectivamente, USER10 e PASSWORD1234. Sabendo disso, faça um programa que solicita ao usuário que ele digite seu usuário e senha. O programa só termina quando ele acertar o usuário e a senha. Quando ele acertar, você deve informar a mensagem: LOGIN EFETUADO COM SUCESSO. 

usuario=str(input("Digite seu usuário: ")) 

senha=str(input("Digite a sua senha: ")) 

while usuario!="USER10" and senha!="PASSWORD1234": 

  usuario=str(input("Digite seu usuário: ")) 

  senha=str(input("Digite a sua senha: ")) 

print("LOGIN EFETUADO COM SUCESSO") 

#Exercício 8. O usuário e a senha de um cliente são, respectivamente, USER10 e PASSWORD1234. Sabendo disso, faça um programa que solicita ao usuário que ele digite seu usuário e senha. O programa termina quando ele acertar o usuário e a senha ou quando ele exceder o máximo de 3 tentativas. Quando ele acertar, o programa deve informar a mensagem: LOGIN EFETUADO COM SUCESSO. Caso ele exceda a quantidade de tentativas, o programa deve informar a mensagem: NÚMERO MÁXIMO DE TENTATIVAS EXCEDIDO! 

i=0 

while i<3: 

  usuario=input("Digite seu usuário: ") 

  senha=input("Digite sua senha: ") 

  if usuario=="USER10" and senha=="PASSWORD1234" and i<3: 

    print("LOGIN EFETUADO COM SUCESSO") 

    break 

  elif usuario!="USER10" or senha!="PASSWORD1234" and i<3: 

    i+=1 

if i==3: 

  print("NÚMERO MÁXIMO DE TENTATIVAS EXCEDIDO")