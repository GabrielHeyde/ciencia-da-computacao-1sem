#Exercício Crie um programa em Python que possui os métodos abaixo[...]. Depois da criação dos métodos do exercício , seu programa deve imprimir na tela um menu, com opções de 1 a 7[...]: 


def verificaTriangulo(a,b,c):  

  if (abs(b-c)<a and a<(b+c)) and (abs(a-c)<b and b<(a+c)) and (abs(a-b)<c and c<(a+b)):  

      if a==b and a==c and b==c:   

        print("equilátero")   

      elif a!=b and a!=c and b!=c:   

        print("escaleno")   

      else:  

         print("isósceles")   

  else:  

    print("Erro! Os valores informados não obedecem à Condição de Existência de um Triângulo.")  

  

######################################################### 

  

def segundoGrau(a,b,c):  

  while a==0:  

    print("Os valores informados não se tratm de uma equação do segundo grau. Digite novos valores:")  

    a=int(input("Digite o valor de a: "))  

    b=int(input("Digite o valor de b: "))  

    c=int(input("Digite o valor de c: "))  

  delta=(b**2 - 4*a*c)  

  if delta<0:  

    print("Os valores informados não se tratm de uma equação do segundo grau.")  

  elif delta==0:  

    print("Esta equação possui um único valor de raiz: ")  

    soma=(-b+delta**(1/2))  

    X1=(soma/2*a)  

    print("A raiz da equuação é:",X1)  

  else:  

    soma=(-b+delta**(1/2))  

    X1=(soma/2*a)  

    subtração=(-b-delta**(1/2))  

    X2=(subtração/2*a)  

    print("As raiz da equuação são:",X1,"e",X2)  

  

######################################################### 

  

def verificaData():    

  while True:   

    ano=int(input("Digite o ano: "))  

    if ano>2022:  

      print("Data inválida!")  

    if ano>=0 and ano<=2022:   

      break   

  while True:   

    mes=int(input("Digite o mes: "))  

    if mes>12:  

      print("Data inválida!")  

    if mes>0 and mes<=12:   

      break   

  while True:   

    dia=int(input("Digite o dia: "))  

    if dia>31:  

      print("Data inválida!")  

    if dia>0 and dia<32:   

      break    

  if mes==4 or mes==6 or mes==9 or mes==11:   

    if dia<=30:   

      print("Data válida")  

    else:  

      print("Data inválida!")  

  if mes==2:   

    if (ano % 4 == 0 and ano % 100 != 0) or ano % 400 == 0:   

      if dia<=29:   

        print("Data válida!")   

      else:  

        print("Data inválida!")  

    else:   

      if dia<=28:   

        print("Data válida!")   

      else:  

        print("Data inválida!")  

  else:   

    print(dia,"/",mes,"/",ano,"é uma data válida")  

  

######################################################### 

  

def verificaTexto(palavra):  

  while len(palavra)>=20:  

    print("Texto inválido.")  

    palavra=str(input("Digite uma nova palavra: "))  

  if len(palavra)<5:  

    print("Texto muito pequeno.")  

  elif len(palavra)>=5 and len(palavra)<15:  

    print("Texto médio.")  

  elif len(palavra)>=15 and len(palavra)<20:  

    print("Texto grande")  

  

######################################################### 

  

def verificarCPF(cpf):  

  sodigitos=cpf.isdigit()  

  ndigitos=len(cpf)  

  i=0  

  while ndigitos!=11 or sodigitos==False:  

      cpf=str(input("Digite o CPF: "))  

      sodigitos=cpf.isdigit()  

      ndigitos=len(cpf)  

  if ndigitos==11 and sodigitos==True:  

    print("CPF Válido!")  

  

######################################################### 

  

def contaCaracteres(caracteres):  

  vogalA=caracteres.count("a")  

  vogalE=caracteres.count("e")  

  vogalI=caracteres.count("i")  

  vogalO=caracteres.count("o")  

  vogalU=caracteres.count("u")  

  espaço=caracteres.count(" ")  

  outros=caracteres.count("")  

  print("A soma de todas as vogais no texto é igual a:", vogalA+vogalE+vogalI+vogalO+vogalU)  

  print("A soma de todas os espaços no texto é igual a:", espaço)  

  print("A soma dos outros caracteres no texo é de:",outros-vogalA-vogalE-vogalI-vogalO-vogalU-espaço-1) 

  

######################################################### 

  

print("Olá Fulano.\n\nDigite a opção desejada:\n\n1) Verificar triângulo\n\n2) Calcular equação do segundo grau\n\n3) Conferir data\n\n4) Verificar tamanho do texto\n\n5) Analisar CPF\n\n6) Contar caracteres\n\n7) Sair\n") 

opcao=0  

limite=0 

while opcao!=7: 

  print("") 

  opcao=int(input("Digite a opção desejada: ")) 

  print("") 

  if opcao>7 or opcao<1: 

    print("Opção inválida!") 

    limite+=1 

  if limite==5: 

    print("Parece que você não está entendendo o funcionamento do sistema. Até mais.") 

    break 

  if opcao==1: 

    a=int(input("Digite um valor: ")) 

    b=int(input("Digite outro valor: ")) 

    c=int(input("Digite um último valor: ")) 

    verificaTriangulo(a,b,c) 

  if opcao==2: 

    a=int(input("Digite o valor de a: ")) 

    b=int(input("Digite o valor de b: ")) 

    c=int(input("Digite o valor de c: ")) 

    segundoGrau(a,b,c) 

  if opcao==3: 

    verificaData() 

  if opcao==4: 

    palavra=str(input("Digite uma palavra: ")) 

    verificaTexto(palavra) 

  if opcao==5: 

    cpf=str(input("Digite um CPF: ")) 

    verificarCPF(cpf) 

  if opcao==6: 

    caracteres=str(input("Digite uma frase: ")) 

    contaCaracteres(caracteres) 

if opcao==7: 

  print("Obrigado por utilizar nosso sistema.") 