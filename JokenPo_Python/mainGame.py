from random import randint
from JokenPo_Python.Player import Player
import funcoes

print("••••• JokenPo •••••")

escolha = input("Escolha como você quer jogar? \n1 - Player 1 x Machine \n2 - Player 1 x Player 2 \n→→ ")
while (int(escolha) !=1 and (int(escolha) !=2)):
    print("Somente 1 ou 2 jogadores podem jogar. Tente novamente!")
    escolha = input("Quantos jogadores querem jogar? \n1 ou 2 →→ ")


if int(escolha) == 1:
    p1 = Player(input("Qual é seu nome Player? "))
    print("OLÁ", p1.nome.upper(), "!!")
    armaUser1 = p1.escolheArma()

    print("Boa escolha! Eu escolho essa arma →→ ")
    armaComputer = str(randint(1, 3))
    print(armaComputer)

    print ("A batalha é", funcoes.nomeArma(armaUser1), "x", funcoes.nomeArma(armaComputer))

    p1.vamosBatalhar(armaUser1, armaComputer)

elif int(escolha) == 2:
    p1 = Player(input("Qual é seu nome Player 1? → "))
    print("OLÁ", p1.nome.upper(), "!!")
    armaUser1 = p1.escolheArma()

    p2 = Player(input("Qual é seu nome Player 2? → "))
    print("OLÁ", p2.nome.upper(), "!!")
    armaUser2 = p2.escolheArma()

    print("A batalha é", funcoes.nomeArma(armaUser1), "x", funcoes.nomeArma(armaUser2))

    p1.vamosBatalhar(armaUser1, armaUser2)


