#Exercício Crie um método chamado imprimeValor, que recebe um valor qualquer por parâmetro e imprime-o na tela. 

def imprimeValor(x): 

  print(x) 

x=int(input("Digite um valor: ")) 

imprimeValor(x) 

 

#Exercício Crie um método chamado somaValores que recebe dois valores por parâmetro e imprime na tela a soma dos dois valores. 

def somaValores(x,y): 

  soma=x+y 

  print("A soma de",x,"e",y,"é",soma) 

x=int(input("Digite um valor: ")) 

y=int(input("Digite outro valor: ")) 

somaValores(x,y) 

 

#Exercício Crie um método que recebe dois valores val1 e val2 (assuma que serão inteiros). O método deve retornar verdadeiro se val1 for divisível por val2 e falso caso contrário. 

def Valores(val1,val2): 

  if val1%val2==0: 

    return True 

  else: 

    return False 

val1=int(input("Digite um valor: ")) 

val2=int(input("Digite outro valor: ")) 

print(Valores(val1,val2)) 

 

 

 

 

#Exercício Crie um método chamado maiorValor que recebe 3 valores por parâmetro (assuma que serão inteiros) e retorna o maior dos três valores. 

def maiorValor(val1,val2,val3): 

  if val1>val2 and val1>val3: 

    return val1 

  elif val2>val1 and val2>val3: 

    return val2 

  else: 

    return val3 

val1=int(input("Digite um valor: ")) 

val2=int(input("Digite outro valor: ")) 

val3=int(input("Digite outro valor: ")) 

print("O maior valor entre os digitados é",(maiorValor(val1,val2,val3))) 

 

#Exercício Crie um método que recebe um valor por parâmetro (assuma que será inteiro) e retorna a soma de todos os valores entre 0 e o valor recebido. Caso o valor seja negativo, o método deve retornar -1. 

def maiorValor(val1):  

  if val1<0:  

    return -1  

  else: 

    soma=0 

    for valores in range(1,val1+1): 

      soma+=valores 

    return soma 

val1=int(input("Digite um valor: "))  

print("A soma dos valores entre 0 e",val1,"é",maiorValor(val1)) 

 

 

 

 

 

 

#Exercício Crie um método que recebe um valor por parâmetro (assuma que será uma string) e retorna a quantidade de letras que existem neste texto. 

def numeroLetras(Palavra): 

  i=0 

  for letras in Palavra: 

    i+=1 

  return i 

Palavra=str(input("Digite uma palavra: ")) 

print("O número de letras dentro da palavra",Palavra,"é",numeroLetras(Palavra)) 

 

#Exercício Crie um método que recebe uma lista por parâmetro e imprime os elementos da lista recebida. 

def termosLista(lista): 

  print(lista) 

lista=["Internacional","Fluminense","Vasco","Santos","Juventude"] 

termosLista(lista) 

 

#Exercício Crie um método que recebe uma lista por parâmetro (assuma que será uma lista de string) e retorna a menor string da lista (com menos caracteres). 

def itensLista(lista): 

  i=189819 

  palavra=" " 

  for palavrasLista in lista: 

      if len(palavrasLista)<i: 

        i=len(palavrasLista) 

        palavra=palavrasLista 

  return palavra 

lista=["Pedro","chão","arroz","tijolo","sol","água"] 

print(itensLista(lista)) 

 

 

 

 

#Exercício Crie um método que recebe dois parâmetros, que serão um inteiro N e uma string S (nesta ordem). O método deve imprimir na tela N vezes a string S. 

def vezesPalavra(N,S): 

  palavra="" 

  for vezes in range(0,N): 

    palavra=palavra+S+"\n" 

  print(palavra) 

N=int(input("Digite o número de vezes que deseja repetir a palavra: ")) 

S=str(input("Digite a palavra que deseja repetir: ")) 

vezesPalavra(N,S) 

 

#Exercício Depois dos métodos criados, chame todos os métodos acima, passando os parâmetros correspondentes e SEMPRE SOLICITANDO OS PARÂMETROS PELO TECLADO, imprimindo na tela o retorno (para os que retornam algum valor). 

def Valores(val1,val2):  

  if val1%val2==0:  

    return True  

  else:  

    return False 

def maiorValor(val1A,val2A,val3A):  

  if val1A>val2A and val1A>val3A:  

    return val1A  

  elif val2A>val1A and val2A>val3A:  

    return val2A  

  else: 

    return val3A  

def maiorValor(val1B):   

  if val1B<0:   

    return -1   

  else:  

    soma=0  

    for valores in range(1,val1B+1):  

      soma+=valores  

    return soma  

def numeroLetras(Palavra):  

  i=0  

  for letras in Palavra:  

    i+=1  

  return i  

def termosLista(lista): 

  print(lista)  

def itensLista(lista):  

  i=189819  

  palavra=" "  

  for palavrasLista in lista:  

      if len(palavrasLista)<i:  

        i=len(palavrasLista)  

        palavra=palavrasLista  

  return palavra  

def vezesPalavra(N,S): 

  palavra=""  

  for vezes in range(0,N):  

    palavra=palavra+S+"\n"  

  print(palavra)  

x1=int(input("Questão 1: Digite um valor: "))  

imprimeValor(x1)  

print("") 

x2=int(input("Questão 2: Digite um valor: "))  

y2=int(input("Questão 2: Digite outro valor: "))  

somaValores(x2,y2) 

print("") 

val1=int(input("Questão 3: Digite um valor: "))  

val2=int(input("Questão 3: Digite outro valor: "))  

print(Valores(val1,val2)) 

print("") 

val1A=int(input("Digite um valor: "))  

val2A=int(input("Digite outro valor: "))  

val3A=int(input("Digite outro valor: "))  

print("O maior valor entre os digitados é",(maiorValor(val1A,val2A,val3A)))  

val1B=int(input("Questão 5: Digite um valor: "))   

print("A soma dos valores entre 0 e",val1B,"é",maiorValor(val1B))  

print("") 

Palavra=str(input("Questão 6: Digite uma palavra: "))  

print("O número de letras dentro da palavra",Palavra,"é",numeroLetras(Palavra)) 

print("") 

lista=["Internacional","Fluminense","Vasco","Santos","Juventude"]  

print("Questão 7: ") 

termosLista(lista) 

print("") 

lista=["Pedro","chão","arroz","tijolo","sol","água"]  

print("Questão 8: ") 

print(itensLista(lista))  

print("") 

N=int(input("Questão 9: Digite o número de vezes que deseja repetir a palavra: "))  

S=str(input("Questão 9: Digite a palavra que deseja repetir: "))  

vezesPalavra(N,S) 