class Tesoura:
    def usaTesoura(arma, nome):
        if arma == 1:
            print(nome, "perdeu!\nTesoura é quebrada por pedra!")
        elif arma == 2:
            print(nome, "ganhou!! \nTesoura corta papel")
        else:
            print(nome, "empatou!! \nVamos tesourar por aí?")
