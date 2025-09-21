habitantes_pais_A = 5_000_000
habitantes_pais_B = 7_000_000

taxa_natalidade_pais_A = 0.03 # 3% ao ano
taxa_natalidade_pais_B = 0.02 # 2% ao ano

contagem_dos_anos = 0 

print(f'Quantidade de habitante no país A: {habitantes_pais_A}, quantidade de habitantes no país B: {habitantes_pais_B}')
print("Ano atual: 2025")

#TODO: Simplifique a forma de calcular o número de habitantes do país a cada ano
#     Baseie-se no fato de que o número de habitantes dos países crescem por ano com base no fator da sua respectiva taxa de natalidade
while habitantes_pais_B > habitantes_pais_A:
    aumento_no_pais_A = habitantes_pais_A * taxa_natalidade_pais_A
    habitantes_pais_A += aumento_no_pais_A

    aumento_no_pais_b = habitantes_pais_B * taxa_natalidade_pais_B
    habitantes_pais_B += aumento_no_pais_b 

    contagem_dos_anos+= 1 # A cada iteração do loop se passa mais um ano
    print(f"Ano: {2025 +contagem_dos_anos} -- Habitante país A: {habitantes_pais_A:.2f} - Habitantes país B: {habitantes_pais_B:.2f}")
#TODO: Justifique o uso da estrutura de repetição WHILE e não FOR

print("A quantidade de anos que se passou para o país A ter mais habitantes que o país B: "+str(contagem_dos_anos) +" anos")


"""  
Esse trecho é um comentário de múltipla linha

Forma mais direta de calcular (Tendo em vista que o número de habitantes dos países crescem por ano com base no fator da taxa de natalidade):


while habitantes_pais_B>habitantes_pais_A:
    habitantes_pais_A *= (taxa_natalidade_pais_A +1)
    habitantes_pais_B *= (taxa_natalidade_pais_B +1)
    contagem_dos_anos+= 1


--------------------------
Também poderia usar uma variável representando o aumento percentual para se ter mais controle 
  e evitar grandes mdificações ao longo do código

aumento_percentual_pais_A = 1 + taxa_natalidade_pais_A  # representaria os 100% (Os 5 milhões) + 3% (Nasce a cada ano)
aumento_percentual_pais_B = 1 + taxa_natalidade_pais_B  # representaria os 100% (Os 7 milhões) + 2% (Nasce a cada ano)

"""