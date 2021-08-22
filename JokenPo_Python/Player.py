from JokenPo_Python.Papel import Papel
from JokenPo_Python.Pedra import Pedra
from JokenPo_Python.Tesoura import Tesoura


class Player:
    def __init__(self, nome):
        self.nome = nome

    def escolheArma(self):
        armaUser1 = input("Escolha sua arma:\n 1 - Pedra\n 2 - Papel \n 3 - Tesoura \n →→ ")
        while (int(armaUser1) < 1 or int(armaUser1) > 3):
            print("Não existe esta arma, tente novamente!")
            armaUser1 = input("Escolha sua arma:\n 1 - Pedra\n 2 - Papel \n 3 - Tesoura \n →→ ")
        return armaUser1

    def vamosBatalhar(self, arma1, arma2):
        if int(arma1) == 1:
            Pedra.usaPedra(int(arma2), self.nome.upper())
        elif int(arma1) == 2:
            Papel.usaPapel(int(arma2), self.nome.upper())
        elif int(arma1) == 3:
            Tesoura.usaTesoura(int(arma2), self.nome.upper())
