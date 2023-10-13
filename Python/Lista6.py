#Exercício Crie um programa imprime na tela os valores de 1 a 100 (incluindo o 1 e o 100).   

for i in range(1,101): 

  print(i) 

#Exercício Crie um programa que imprime na tela todos os valores entre dois valores digitados pelo teclado. 

x=int(input("Digite um valor: ")) 

y=int(input("Digite outro valor: ")) 

if x>y: 

  maior=x 

  menor=y 

elif x<y: 

  maior=y 

  menor=x 

for valores in range (menor+1,maior): 

  print(valores) 

#Exercício Crie um programa que imprime a tabuada de um número qualquer digitado pelo usuário. 

nm=int(input("Digite um valor: ")) 

for resultado in range (1,11): 

  print(nm,"x",resultado,"=",nm*resultado) 

#Exercício Sabendo que uma string é uma lista de letras, peça para o usuário digitar um texto e imprima na tela a quantidade de vogais que existem no texto. 

frase=input("Digite uma frase: ") 

vogais=0 

for letra in frase: 

  if letra == "a" or letra == "e" or letra == "i" or letra == "o" or letra == "u": 

    vogais=vogais+1 

print("O número de vogais é", vogais) 

#Exercício Crie um programa que permita que o usuário crie sua lista de compras. Primeiramente, solicite que ele informe quantos produtos serão adicionados na lista. Depois disto, peça para que o usuário digite os produtos que ele vai comprar, e armazene em uma lista. Ao final, imprima a lista de compras do usuário. 

quantidade=int(input("Digite a quantidade de itens da sua lista de compras: ")) 

listadecompras = [] 

for itens in range (0,quantidade): 

  compra=str(input("Digite o que você comprará: ")) 

  listadecompras.append(compra) 

for itens in listadecompras: 

  print(itens) 

#Exercício Crie um programa que solicita o nome e o estado civil de 20 pessoas pelo teclado. Ao final, imprima apenas o nome das pessoas separadas por estado civil: solteiras, casadas, divorciadas e viúvas (nesta ordem!) 

solteiras=[] 

casadas=[] 

divorciadas=[] 

viúvas=[] 

for nomes in range (1,21): 

  nome=str(input("Digite o nome: ")) 

  estado=str(input("Digite o estado civil da pessoa: ")) 

  if estado == "solteiro" or estado == "solteira": 

    solteiras.append(nome) 

  elif estado == "casado" or estado == "casada": 

    casadas.append(nome) 

  elif estado == "divorciado" or estado == "divorciada": 

    divorciadas.append(nome) 

  elif estado == "viuva" or estado == "viuvo": 

    viúvas.append(nome) 

print("") 

if solteiras!=[]: 

  print("Lista de pessoas solteiras:") 

  for pessoas in solteiras: 

    print(pessoas) 

print("") 

if casadas!=[]: 

  print("Lista de pessoas casadas:") 

  for pessoass in casadas: 

    print(pessoass) 

print("") 

if divorciadas!=[]: 

  print("Lista de pessoas divorciadas:") 

  for pessoasss in divorciadas: 

    print(pessoasss) 

print("") 

if viúvas!=[]: 

  print("Lista de pessoas viúvas:") 

  for pessoassss in viúvas: 

    print(pessoassss) 

#Exercício Crie um programa que solicita ao usuário que ele defina sua senha. A senha deve ser um texto (string) composto apenas por dígitos e deve ter entre 5 e 10 valores. O usuário tem apenas 6 chances de definir corretamente a senha. Caso ele defina corretamente a senha nas tentativas que ele tem, imprima uma mensagem de sucesso. Caso ele não defina a senha corretamente, imprima uma mensagem de insucesso. Dica: na aula aprendemos a ver se uma string é formada apenas por dígitos e aprendemos a descobrir o tamanho do texto digitado. 

for tentativas in range(1,7): 

  print("Você terá seis tentativas para definir sua senha") 

  senha=str(input("Defina uma senha que contenha de 5 a 10 digitos: ")) 

  digitos=0 

  nao_numeros=0 

  for digito in senha: 

    digitos+=1 

  for digito in senha: 

    if digito != "0" and digito != "1" and digito != "2" and digito != "3" and digito != "4" and digito != "5" and digito != "6" and digito != "7" and digito != "8" and digito != "9": 

      nao_numeros+=1 

  if digitos>4 and digitos<11 and nao_numeros==0: 

    print("Senha definida com sucesso!") 

    break 

  else: 

    if tentativas>=1 and tentativas<6: 

      print("Falha na hora de definir a senha, tente novamente.",6-tentativas,"tentativas restantes.") 

    else: 

      print("Número máximo de tentativas excedido!") 

#Exercício Crie um programa que separa o joio do trigo. Seu programa deve ler a lista abaixo e criar duas listas diferentes: uma com todas as ocorrências da palavra "joio" e outra com todas as ocorrências da palavra "trigo". Ao final, imprima as listas separadas. 

joioETrigo = ["joio", "trigo", "trigo", "joio", "trigo", "joio", "joio", "joio", "joio", "trigo", "trigo", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", "joio", "joio", "joio", "trigo", "trigo", "trigo", "joio", "trigo", "joio", "joio", "joio"] 

contador_joio=0 

joio=[] 

contador_trigo=0 

trigo=[] 

for palavra in joioETrigo: 

  if palavra == "joio": 

    joio.append("joio") 

    contador_joio+=1 

  if palavra == "trigo": 

    trigo.append("trigo") 

    contador_trigo+=1 

print(joio,"\n\nHá",contador_joio,"joios na lista.") 

print("") 

print(trigo,"\n\nHá",contador_trigo,"trigos na lista.") 

#Exercício Faça novamente todos os exercícios da lista de exercícios sobre WHILE da Aula 7, porém utilizando o for para realizar a repetição. 

#9.1 Exercício Crie um programa que pede para o usuário digitar o nome de 13 pessoas pelo teclado. 

for vezes in range(1,14): 

  nome=str(input("Digite o nome: ")) 

#9.2 Exercício Crie um programa que imprime os números de 0 a 1000. 

for numeros in range(0,1001): 

  print(numeros) 

#9.3 Exercício Crie um programa que imprime os números pares de 0 a 2000. 

pares=0 

print("0") 

for numeros in range(0,1000): 

  pares+=2 

  print(pares) 

#9.4 Exercício Crie um programa que imprime os números de 0 a 1000 em ordem decrescente (ou seja, de 1000 a 0). 

for numeros in range(0,1000): 

  print(1000-numeros) 

print("0") 

#9.5 Exercício Crie um programa que solicita o time de 10 usuários pelo teclado. Ao final, imprima quantos torcedores torcem para o Grêmio. 

gremistas=0 

for vezes in range(0,10): 

  time=str(input("Digite o seu time: ")) 

  if time=="Grêmio": 

    gremistas+=1 

print("Há",gremistas,"torcedores do Grêmio.") 

#9.6 Exercício Crie um programa que pede para o usuário digitar 20 números com ponto flutuante pelo teclado. Ao final, seu programa deve imprimir todos os números digitados. Dica: armazene-os em uma string e concatene os valores digitados. No final, imprima a string. 

digitados="" 

for vezes in range(0,20): 

  numero=float(input("Digite um número decimal: ")) 

  digitados=digitados+" "+str(numero) 

print(digitados) 

#9.7 Exercício Crie um programa que solicita para o usuário que ele digite 10 valores inteiros. Ao final, imprima a soma de todos os valores digitados.   

soma=0 

for vezes in range(0,10): 

  valor=int(input("Digite um valor: ")) 

  soma+=valor 

print("A soma dos números informados é",soma) 

#9.8 Exercício Crie um programa que pergunta para o usuário (via Teclado) quantos números ele irá digitar e armazena em uma variável chamada quant. Logo após, faça com que o usuário digite quant números inteiros, e para cada número digitado imprima na tela se o número é negativo, positivo ou zero. 

quant=int(input("Digite a quantidade de números que você irá inserir: ")) 

for vezes in range(1,quant+1): 

  numero=int(input("Digite um número inteiro: ")) 

  if numero == 0: 

    print("Seu número é zero(neutro).") 

  elif numero > 0: 

    print("Seu número é positivo.") 

  else: 

    print("Seu número é negativo.") 

print("Fim! Obrigado :D") 

#9.9 Exercício Crie um programa que pede para o usuário digitar 2 valores inteiros via Teclado (val1 e val2). Se nenhum dos valores for negativo, escreva os números pares entre o menor e o maior valor. 

val1=int(input("Digite um primeiro valor: ")) 

val2=int(input("Digite outro valor: ")) 

if val1<0 or val2<0: 

  print("Erro! Valor negativo informado.") 

for numeros in range(val1+1,val2): 

  if numeros%2==0: 

    print(numeros) 

#9.10 Exercício Crie um programa que faça a soma dos valores de 0 até 198. 

soma=0 

for vezes in range(0,199): 

  soma+=vezes 

print("A soma de todos os números inteiros entre 1 e 198 é",soma) 

#9.11 Exercício Crie um programa que imprima a soma dos valores pares e a soma dos valores ímpares entre dois números quaisquer digitados pelo usuário. 

val1=int(input("Digite um primeiro valor: "))  

val2=int(input("Digite outro valor: "))  

if val1==val2:  

  print("Erro! Valor iguais informados.")  

pares=0 

impares=0 

for numeros in range(val1+1,val2):  

  if numeros%2==0: 

    pares+=numeros 

  elif numeros%2!=0: 

    impares+=numeros 

print("A soma dos valores pares entre",val1,"e", val2,"é:",pares) 

print("A soma dos valores impares entre",val1,"e", val2,"é:",impares) 

#9.12 Exercício Crie um programa que pede para o usuário digitar números positivos via Teclado. Quando o usuário digitar um número negativo, informe a média de todos os números que ele informou. 

soma=0 

for vezes in range(0,99999999999999999999999999*99999999999999999999999999): 

  valor=float(input("Digite um número positivo: ")) 

  if valor>=0: 

    soma+=valor 

  else: 

    print("A soma dos valores informados é de:",soma) 
    Break 

#9.13 Exercício Crie um programa que calcule o fatorial de um número informado pelo usuário (não permita números negativos). 

valor=int(input("Digite um valor para calcular a fatorial: ")) 

fatorial=valor 

for vezes in range(1,valor): 

  fatorial=fatorial*vezes 

print(fatorial) 

#9.14 Exercício Crie um programa que diga se o número informado pelo usuário é primo ou não. 

valor=int(input("Digite um valor para verificar se ele é primo: ")) 

nao_primos=0 

for vezes in range(2,valor): 

  if valor%vezes==0: 

    nao_primos+=1 

if nao_primos==0: 

  print(valor,"é um número primo!") 

if nao_primos!=0: 

  print(valor,"NÃO é um número primo!") 

#Exercício Faça novamente todos os exercícios da lista de exercícios de fixação WHILE da Aula 9, porém utilizando o for para realizar a repetição. A lista está neste link: LISTA DE EXERCÍCIOS DE FIXAÇÃO: WHILE. 

#10.1 Exercício Faça o código que implementa o algoritmo descrito no fluxograma. 

for vezes in range (1,11): 

  nome=int(input("Digite um número qualquer: ")) 

  if nome == 0: 

    print("ZERO") 

  elif nome > 0: 

    print("NÚMERO POSITIVO") 

  else: 

    print("NÚMERO NEGATIVO") 

#10.2 Exercício Faça um programa que escreva na tela todos os números inteiros entre 0 (inclusive) e 1000 (inclusive). 

for valores in range(0,1001): 

  print(valores) 

#10.3 Exercício Faça um programa que escreva na tela todos os números inteiros entre 0 (inclusive) e 1000 (inclusive). 

num1=int(input("Digite um valor: ")) 

num2=int(input("Digite outro valor: ")) 

if num1>num2: 

  print("Erro! Primeiro valor maior que o segundo.") 

elif num1<num2: 

  for valores in range(num1+1,num2): 

    print(valores) 

#10.4 Exercício Faça um programa que escreva na tela todos os valores inteiros entre dois valores digitados pelo usuário (num1 e num2). Caso num1 seja maior do que num2, seu programa deve imprimir os valores entre num1 e num2 da mesma forma. 

num1=int(input("Digite um valor: ")) 

num2=int(input("Digite outro valor: ")) 

if num1>num2: 

  maior=num1 

  menor=num2 

elif num1<num2: 

  menor=num1 

  maior=num2 

for valores in range(menor+1,maior): 

  print(valores) 

#10.5 Exercício Faça um programa que escreva na tela todos os valores inteiros entre dois valores digitados pelo usuário (num1 e num2). Caso num1 seja maior do que num2, seu programa deve imprimir os valores entre num1 e num2 da mesma forma. 

soma=0 

for valor in range(1,1001): 

  soma=soma+valor 

print("A soma dos valores entre 1 e 1000 é",soma) 

#10.6 Exercício Faça um programa que solicita ao usuário que ele digite números que sejam positivos e pares. Quando o usuário digitar um número que não seja o solicitado, imprima na tela a soma dos valores positivos e pares digitados. 

soma=0 

for vezes in range(1,9999999999999999999999999999999999999): 

  x=int(input("Digite um valor par e positivo: ")) 

  if x>0 and x%2==0: 

    soma+=x 

  else: 

    print("A soma dos valores positivos e pares informados anteriormente é",soma) 

    break 