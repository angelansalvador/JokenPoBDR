class Pedra:
    def usaPedra(arma, nome):
        if arma == 1:
            print(nome, "empatou!\nDuas pedrinhas brincando juntinhas!")
        elif arma == 2:
            print(nome, "perdeu! \nPedra é envolvida por papel!")
        else:
            print(nome, "ganhou!! \nPedra quebra tesoura!")
