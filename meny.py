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
    





