# dette programmet vil sjekke brukerens geografiske
# kunnskap og vil gi en vurdering basert på ti svar.
# Til syvende og sist vil det gi en premie for quizen 
# i form av en trekant, hvis høyde avhenger av 
# karakteren som er mottatt.

print('-------------------------------------------')
print('Velkommen til den korte geografiske quizen!')
print('-------------------------------------------')
print('')

riktigSvar = 0

førstSpml = str(input('hva er hovedstaden i Storbritannia? '))
if førstSpml == 'london' or førstSpml == 'London':
    riktigSvar += 1

print('-------------------------------------------')

andreSpml = str(input('hva er hovedstaden i Australia? '))
if andreSpml == 'canberra' or andreSpml == 'Canberra':
    riktigSvar += 1

print('-------------------------------------------')

tredjeSpml = int(input('Hvor mange kontinenter er det totalt? '))
if tredjeSpml == 4:
    riktigSvar += 1

print('-------------------------------------------')

fjerdeSpml = str(input('ved hvilken pol ligger Antarktis? ')) 
if fjerdeSpml == 'sørpol' or fjerdeSpml == 'Sørpol':
    riktigSvar += 1

print('-------------------------------------------')

femteSpml = str(input('ligger Mexico i Nord- eller Sør-Amerika? ')) 
if fjerdeSpml == 'nord' or fjerdeSpml == 'Nord':
    riktigSvar += 1

print('-------------------------------------------')

sjetteSpml = str(input('Hva er den største elven i Europa? ')) 
if sjetteSpml == 'volga' or sjetteSpml == 'Volga':
    riktigSvar += 1

print('-------------------------------------------')

print(f'gratulerer karakteren din er: {riktigSvar}')
print()
print('premien din er nedenfor :)')
print()

i = 0
amountOfStars = 1
spaces = ' '
amountOfSpaces = riktigSvar - 1
while i < riktigSvar:
   print(spaces * amountOfSpaces, '*' * amountOfStars )
   i += 1
   amountOfStars += 2
   amountOfSpaces -= 1