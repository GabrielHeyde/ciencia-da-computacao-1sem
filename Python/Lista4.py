#Exercício 1. Crie um programa que pede para o usuário digitar o nome de 13 pessoas pelo teclado. 

x=input(str("Digite um nome: ")) 

contador=0 

while contador<12: 

  x=input("Digite um nome: ") 

  contador = contador + 1 

else: 

  print("Treze nomes informados!") 

#Exercício 2. Crie um programa que imprime os números de 0 a 1000.  

contador=0 

while contador<1001: 

  print(contador) 

  contador = contador + 1 

else: 

  print("Fim! :D") 

#Exercício 3. Crie um programa que imprime os números pares de 0 a 2000. 

contador=0  

while contador<2001:  

  print(contador)  

  contador = contador + 2  

else:  

  print("Fim! :D") 

#Exercício 4. Crie um programa que imprime os números de 0 a 1000 em ordem decrescente (ou seja, de 1000 a 0). 

contador=1000 

while contador>-1:  

  print(contador)  

  contador = contador - 1  

else:  

  print("Fim! :D") 

#Exercício 5. Crie um programa que solicita o time de 10 usuários pelo teclado. Ao final, imprima quantos torcedores torcem para o Grêmio. 

contador=0 

gremista=0 

while contador<10: 

  time=input("Insira o seu time: ") 

  contador = contador + 1 

  if time == "Grêmio": 

    gremista = gremista + 1 

print("Há",gremista,"torcedores do Grêmio.") 