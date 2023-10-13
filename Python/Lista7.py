#Exercício Crie um método que recebe um inteiro X por parâmetro e imprime os valores de 1 até X (inclusive). 

def valores_crescentes(x): 

  i=1 

  while i<=x: 

    print(i) 

    i+=1 

x=int(input("Digite um valor: ")) 

valores_crescentes(x) 

#Exercício Crie um método que recebe 3 notas por parâmetro e retorna o conceito atingido pela média aritmética das notas. Os conceitos são: 

#- entre 0.0 e 4.0 (inclusive): conceito "D" 
#- entre 4.0 (não incluído) e 7.0 (inclusive): conceito "C" 
#- entre 7.0 (não incluído) e 9.0 (inclusive): conceito "B" 
#- entre 9.0 (não incluído) e 10.0 (inclusive): conceito "A" 

#Caso alguma das notas digitadas seja negativa, retorne o texto "ERRO" 

def valores_crescentes(nota1,nota2,nota3): 

  if nota1<0 or nota2<0 or nota3<0: 

    print("Erro!") 

    return False 

  media=(nota1+nota2+nota3)/3 

  if media>=0 and media<=4: 

    print("Conceito D") 

  elif media>4 and media<=7: 

    print("Conceito C") 

  elif media>7 and media<=9: 

    print("Conceito B") 

  elif media>9 and media<=10: 

    print("Conceito A") 

nota1=float(input("Digite a primeira nota: ")) 

nota2=float(input("Digite a segunda nota: ")) 

nota3=float(input("Digite a terceira nota: ")) 

valores_crescentes(nota1,nota2,nota3) 

#Exercício Crie um método que recebe um inteiro por parâmetro e retorna verdadeiro caso seja um valor primo e falso caso contrário. Caso o parâmetro seja negativo o método deve retornar falso. 

def primo(x): 

  i=1  

  naoprimo=0  

  while i<x-1:  

    i+=1  

    valor=x%i  

    if valor == 0:  

      naoprimo=+1  

  if naoprimo != 0:  

   return False  

  else:  

   return True 

x=int(input("Digite um valor: ")) 

print(primo(x)) 