# dette programmet består av tre funksjoner som tar parametere 
# og bruker dem til å returnere resultatet basert på operasjonene i hver funksjon

# denne funksjonen rett og slett returnerer summen av to elementer
def adder(tall1, tall2):
    return tall1 + tall2

kall = adder(5,9)
print(f'summen er: {kall}')
kall = adder(14,13)
print(f'summen er: {kall}')
print()

# denne funksjonen returnerer resultatet av hvor mange ganger en gitt 
# bokstav (den andre parameteren som bruker skriv inn) forekommer i en 
# tekststreng (den første parameteren som bruker skriv inn), inne i funksjonen 
# blir hver bokstav i strengen iterert over, og hvis denne bokstaven
# samsvarer med bokstaven som den andre parameteren aksepterer, så legges en til 
# variabelen ganger (som representerer antall treff) og på slutten vil
# verdien av disse kampene bli returnert som en utdata
def bokstavAntall(streng, bokstav):
    antall = 0
    for i in streng:
        if i == bokstav:
            antall += 1
    return antall

antall = bokstavAntall(input('skriv inn en tekstsreng\n< '), input('skriv inn en bokstav\n< '))
print('--------------------------------------------------')
ganger = 'gang' if antall == 1 else 'ganger'
print(f'bokstaven forekommer {antall} {ganger} i tekstsreng')

# Jeg brukte også betinget logikk før den endelige 'print' for å sjekke 
# om 'antall' er en flertalls- eller entallsform for å gjøre output grammatisk korrekt



    



