class Papel:
    def usaPapel(arma, nome):
        if arma == 1:
            print(nome, "Ganhou!\n Papel envolve Pedra!")
        elif arma == 2:
            print(nome, "empatou!! \nDois papeis se encontram no meio do caminho!")
        else:
            print(nome, "Perdeu!! \nPapel é cortado por Tesoura!")
