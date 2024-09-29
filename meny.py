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
Videre, i koden, kontrolleres hver av betingelsene ved
å bruke "if"-uttrykket og en melding sendes ut til brukeren
basert på resultatet av sjekkene.
'''

if hovedrett != 'Salat' and tilbehør != 'Agurk':
    print('Du spiser ikke nok grønnsaker!')
    print('---------------------------------------')

if hovedrett == 'Salat' and tilbehør == 'Agurk':
    print('Du har valgt et vegetarmåltid')
    print('---------------------------------------')

if hovedrett == 'Bif'and tilbehør == 'Agurk':
    print(f'Du har valgt {hovedrett} med {tilbehør}')
    print('---------------------------------------')
elif hovedrett == 'Torsk'and tilbehør == 'Agurk':
    print(f'Du har valgt {hovedrett} med {tilbehør}')
    print('---------------------------------------')
elif hovedrett == 'Salat'and tilbehør == 'Choronsaus':
    print(f'Du har valgt {hovedrett} med {tilbehør}')
    print('---------------------------------------')
    





