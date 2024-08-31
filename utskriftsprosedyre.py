# Dette programmet består av dataforespørsler fra brukeren, 
# lagrer disse dataene i variabler og det viser også meldinger 
# i terminalen basert på mottatte data. Alle disse operasjonene 
# er kroppen til en funksjon som kalles nøyaktig tre ganger.


print('----------------------------------------------')
print()

def hilsen():
    navn = str(input('skriv inn navn: '))
    bosted = str(input('hvor kommer du fra? '))
    print(f'Hei, {navn}! Du er fra {bosted}')
    print()

hilsen()
hilsen()
hilsen()

print('----------------------------------------------')



