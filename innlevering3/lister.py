# dette programmet legger først til et nytt element til listen som allerede er opprettet. 
# Deretter ber den brukeren om fire navn med mellomrom mellom dem og oppretter en ny liste 
# fra disse dataene. Deretter sjekker den listen over navn for tilstedeværelsen av brukerens navn, 
# basert på oppfyllelsen eller ikke-oppfyllelsen av betingelsen, gir den utdata og til slutt 
# beregner programmet summen og produktet av alle elementene fra den første listen,
# tildeler deretter de oppnådde verdiene til variabler, deretter legges disse variablene til den
#  andre listeb, hvoretter en tredje liste opprettes som inkluderer elementer fra både den første
# og andre liste og på slutten fjernes de to siste elementene fra den nye listen.

tallList = [7, 10 , 21]

tallList.append(500)
print(tallList)

print(f'første:{tallList[0]} og tredje:{tallList[2]}')
print('--------------------------------------')

navner = str(input('skriv inn fire navn med mellomrom mellom dem: '))
nyListe = navner.split()
print(nyListe)
print('--------------------------------------')

if 'Mikhail' in nyListe:
    print('Du husket meg!')
else:
    print('Glemte du meg?')
print('--------------------------------------')

summen = tallList[0] + tallList[1] + tallList[2] + tallList[3]
#or summen = sum(tallList)
produktet = tallList[0] * tallList[1] * tallList[2] * tallList[3]
nyListe.append(summen)
nyListe.append(produktet)
print(nyListe)
print('--------------------------------------')

tredjeListe = tallList + nyListe
print(tredjeListe)
print('--------------------------------------')
tredjeListe.pop()
tredjeListe.pop()
print(tredjeListe)
print('--------------------------------------')
