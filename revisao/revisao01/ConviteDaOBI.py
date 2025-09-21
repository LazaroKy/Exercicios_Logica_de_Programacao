numero_competidores = int(input('Informe o número de competidores: '))
pontuacao_minima = int(input('Informe a pontuação mínima: '))

quantidade_aprovados = 0

for numero in range(0, numero_competidores):
    primeira_nota_competidor = int(input(f'\nInforme a primeira nota do competidor [{numero}]: '))
    segunda_nota_competidor = int(input(f'Informe a segunda nota do competidor [{numero}]: '))

    nota_total_competidor = primeira_nota_competidor + segunda_nota_competidor
    print('Verificando se competidor foi aprovado.. \n')
    if(nota_total_competidor >=pontuacao_minima):
        quantidade_aprovados+= 1
    

print('Número de competidores aprovados: '+str(quantidade_aprovados))
