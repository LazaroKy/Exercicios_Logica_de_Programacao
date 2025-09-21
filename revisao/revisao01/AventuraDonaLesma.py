altura_do_muro = float(input("Informe quantos centímetros tem o muro: "))
sobe_durante_dia = float(input("Informe quantos centímetros a lesma sobe durante o dia: "))
escorrega_durante_noite = float(input("Informe quantos centímetros a lesma escorrega durante a noite(Deve ser menor do que quanto ela sobe por dia): "))

dias = 0
ja_subiu =0.0

#TODO: Verifique se o valor de ESCORREGA é maior ou igual a quanto SOBE durante o dia, 
#         se for maior ou igual imprima uma texto informando que ela não conseguirá subir junto com os valores de sobe durante dia e escorrega durante a noite
#         caso contrário, execute o loop WHILE

while altura_do_muro> ja_subiu:
    # TODO: Atribua logo abaixo à variável ja_subiu o cálculo entre sobe_durante_dia e escorrega_durante_noite
    ja_subiu = x
    dias += 1

print(f"A lesma chegou ao topo do muro de {altura_do_muro}cm em {dias} dia(s)")