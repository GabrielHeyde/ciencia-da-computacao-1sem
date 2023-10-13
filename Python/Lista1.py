nome=input("Digite o seu nome ")
print("Nome:", nome)


nome=input("Digite o seu nome ")
idade=input("Digite a sua idade ")
print("Nome:", nome)
print("Idade:", idade)


nome=input("Digite o seu nome ")
print("Nome:", nome)
altura=float(input("Digite a sua altura "))
print("Altura:", altura)
print("Muito obrigado!")


Rua=input("Digite o nome de sua rua ")
Número=int(input("Digite o número de sua residência "))
Bairro=input("Digite o nome do seu bairro ")
Cidade=input("Digite o nome de sua cidade ")
Estado=input("Digite o seu estado ")
CEP=input("Digite o seu CEP ")
print(Rua + ", Número " + str(Número) + ", Bairro " + Bairro + ", Cidade " + Cidade + ", Estado " + Estado + ", CEP " + CEP)


Slot1=int(input("Digíte um número inteiro "))
Slot2=int(input("Digíte outro número inteiro "))
Slot3=int(input("Digíte outro número inteiro "))
Slot4=int(input("Digíte outro número inteiro "))
Slot5=int(input("Digíte outro número inteiro "))
print("Soma de todos os números:", Slot1 + Slot2 + Slot3 + Slot4 + Slot5)
print("Produto da multiplicação:", Slot1 * Slot2 * Slot3 * Slot4 * Slot5)


A=int(input("Digíte um número inteiro "))
B=int(input("Digíte outro número inteiro "))
C=int(input("Digíte outro número inteiro "))
D=int(input("Digíte outro número inteiro "))
E=int(input("Digíte outro número inteiro "))
BeC=(B*C)
print("Área do Triângulo:", BeC/2)
print("Perímetro do Retângulo:", A+B+C+D)
print("Área do Círculo:", 3.14*E*E)


A=float(input("Digíte a nota do trabalho "))
B=float(input("Digíte a nota da prova "))
C=float(input("Digíte a nota do teste "))
A1=float(A*0.10)
B1=float(B*0.60)
C1=float(C*0.30)
print("Nota Final:", A1+B1+C1)


A1=float(input("Digíte a nota da Atividade prática "))
A2=float(input("Digíte a nota da Atividade teórica "))
B1=float(input("Digíte a nota da Prova em laboratório "))
B2=float(input("Digíte a nota do Teste teórico "))
B3=float(input("Digíte a nota do Trabalho extraclasse "))
A11=float(A1*0.45)
A12=float(A2*0.55)
GRAUA=float((A11+A12)*0.33)
B11=float(B1*0.60)
B12=float(B2*0.20)
B13=float(B3*0.20)
GRAUB=float((B11+B12+B13)*0.67)
print("Nota Final:", GRAUA+GRAUB)