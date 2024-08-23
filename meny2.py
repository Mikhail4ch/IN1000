'''
Først av alt viser dette programmet menyen til brukeren. 
Basert på innspill fra brukeren godkjenner eller avviser 
dette programmet brukerens valg ved hjelp av meldingene.
'''

print('---------------------------------------')

print('                  Menu                   ')

print('---------------------------------------')

print('Hovedretter')
print('  - Salat')
print('  - Bif')
print('  - Torsk')

print('---------------------------------------')

print('Tilbehør')
print('  - Agurk')
print('  - Choronsaus')

print('---------------------------------------')

hovedrett = input('velg en hovedrett: ')
tilbehør = input('velg en tilbehør: ')

print('---------------------------------------')

'''
Jeg bestemte meg for å forkorte koden ved å gjøre den mer kortfattet.
Jeg legger alle «hvis»-uttrykkene i én konstruksjon.
Siden det er nok at ett av uttrykkene er sant for å oppfylle programmets
formål, er denne modellen passende.
'''

if hovedrett != 'Salat' and tilbehør != 'Agurk':
    print('Du spiser ikke nok grønnsaker!')
    print('---------------------------------------')
elif (
    (hovedrett == 'Bif' and tilbehør == 'Agurk') or 
    (hovedrett == 'Torsk' and tilbehør == 'Agurk') or 
    (hovedrett == 'Salat' and tilbehør == 'Choronsaus')
):
    print(f'Du har valgt {hovedrett} med {tilbehør}')
    print('---------------------------------------')
else:
    print('Du har valgt et vegetarmåltid')
    print('---------------------------------------')


