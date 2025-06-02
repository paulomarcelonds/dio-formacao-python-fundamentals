texto = input('Digite algo: ')
VOGAIS = 'AEIOU'

for letra in texto:
    if letra.upper() in VOGAIS:
        print(letra, end="")
    else:
        print()
        #print('final do resultado')
