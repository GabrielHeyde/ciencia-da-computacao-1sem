#Exercício Crie um programa em Python que possui os métodos abaixo[...]. Depois da criação dos métodos do Exercício 1, seu programa deve imprimir na tela um menu, com opções de 1 a 9[...]: 

def somaPositivos(x,y): 

  if x<0 or y<0: 

    return -1 

  else: 

    return x+y 

  

########################################################## 

  

def divide(x,y): 

  if y==0: 

    print("Erro!") 

    return 0 

  else: 

    return x/y 

  

########################################################## 

  

def verificaTriangulo(x,y,z): 

  if x==y and x==z and y==z: 

    return "equilátero" 

  elif x!=y and x!=z and y!=z: 

    return "escaleno" 

  else: 

    return "isósceles" 

  

########################################################## 

  

def verificaIdade(idade): 

  if idade<0: 

    return "erro, menor que zero" 

  elif idade>=0 and idade<=12: 

    return "criança" 

  elif idade>=13 and idade<=18: 

    return "adolescente" 

  elif idade>=19 and idade<=120: 

    return "adulto" 

  elif idade>120: 

    return "erro, maior que 120" 

  

########################################################## 

  

def sinaleira(cor): 

  if cor=="verde": 

    print("aberta") 

  elif cor=="vermelho": 

    print("fechada") 

  elif cor=="amarelo": 

    print("atenção") 

  else: 

    print("erro") 

  

########################################################## 

  

def contador(valor): 

  for numeros in range(valor,301): 

    print(numeros) 

  

########################################################## 

  

def verificaPrimo(numero): 

  i=1 

  naoPrimos=0 

  while i<numero-1: 

    i+=1 

    resultado=numero%i 

    if resultado==0: 

      naoPrimos+=1 

  if naoPrimos!=0: 

    print(numero,"NÃO é primo!") 

  else: 

    print(numero,"é primo!") 

  

########################################################## 

  

def achaMaior(X,Y,Z): 

  if X>Y and X>Z: 

    print(X) 

  elif Y>X and Y>Z: 

    print (Y) 

  else: 

    print (Z) 

  

########################################################## 

  

def imprimePares(n): 

  i=0 

  while i<n+1: 

    print(i) 

    i+=2 

  

########################################################## 

  

print("MENU\n\n1. soma positivos\n2. divide\n3. verifica triângulo\n4. verifica idade\n5. sinaleira\n6. conta até 300\n7. verifica primo\n8. acha maior\n9. imprime pares\n") 

  

opcao=1 

  

while opcao>0 and opcao<10: 

  opcao=int(input("Digite a opção desejada: ")) 

  

  if opcao==1: 

    x=int(input("Digite um primeiro valor: ")) 

    y=int(input("Digite outro valor: ")) 

    print("A soma dos valores informados é: ") 

    print(somaPositivos(x,y)) 

    print("") 

  

  elif opcao==2: 

    x=int(input("Digite um primeiro valor: ")) 

    y=int(input("Digite outro valor: ")) 

    print("A divisão dos valores informados é: ") 

    print(divide(x,y)) 

    print("") 

  

  elif opcao==3: 

    x=int(input("Digite um primeiro valor: ")) 

    y=int(input("Digite outro valor: ")) 

    z=int(input("Digite outro valor: ")) 

    print("Isto resultaria em um triângulo do tipo: ") 

    print(verificaTriangulo(x,y,z)) 

    print("") 

  

  elif opcao==4: 

    idade=int(input("Digite a idade: ")) 

    print("Esta pessoa está na seguinte faixa etária: ") 

    print(verificaIdade(idade)) 

    print("") 

  

  elif opcao==5: 

    cor=str(input("Digite uma cor: ")) 

    print("Sua sinaleira está informando: ") 

    sinaleira(cor) 

    print("") 

  

  elif opcao==6: 

    valor=int(input("Digite um valor: ")) 

    print("Segue o contador que vai de",valor,"até 300:") 

    contador(valor) 

    print("") 

  

  elif opcao==7: 

    numero=int(input("Digite um valor: ")) 

    verificaPrimo(numero) 

    print("") 

  

  elif opcao==8: 

    X=int(input("Digite um primeiro valor: ")) 

    Y=int(input("Digite outro valor: ")) 

    Z=int(input("Digite outro valor: ")) 

    print("O maior valor entre os números informados é: ") 

    achaMaior(X,Y,Z) 

    print("") 

  

  elif opcao==9: 

    n=int(input("Digite um valor: ")) 

    print("Os números pares de 0 à",n,"são:") 

    imprimePares(n) 

    print("") 

  

  else: 

    print("Muito obrigado!") 

    print("Você saiu.") 