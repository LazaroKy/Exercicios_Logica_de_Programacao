valor_da_compra = float(input('Insira o valor da compra:'))

#TODO: Adicione uma verificação se o valor da compra inserido não foi menor ou igual a 0,
#         caso seja menor ou igual a zero informe que não será possível processar, do contrário continue a verificação
if valor_da_compra <100:
    print('Não há descontos aplicáveis para sua compra.')
    print(f'O valor do compra é de {valor_da_compra:.2f}')
elif valor_da_compra >= 100 and valor_da_compra<200:
    print('Opaa! 10% de descontos aplicáveis à sua compra.')
    print(f'O valor do compra é de {valor_da_compra*0.9:.2f}') # 0.9 = 90% (Lembre que o uso do símbolo da porcetagem é usada pega cálcular o resto de uma divisão)
elif valor_da_compra >200:
    print('Opaa! 20% de descontos aplicáveis à sua compra.')
# Corrija o valor do desconto aplicado
    print(f'O valor do compra é de {valor_da_compra * 0.0:.2f}')