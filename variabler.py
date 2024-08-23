'''
Dette programmet viser visse meldinger i terminalen. Den mottar også innspill
fra brukeren og lagrer disse dataene i variabler. På sin side blir verdien
av differansen og summen av disse variablene tildelt nye variabler, hvis 
verdi vises i terminalen til slutt.
'''
print('---------------------------------------')

print('Hei Student!')

print('---------------------------------------')

navn_1 = input('Hva heter du? ')
print(f'Hei, {navn_1}')

print('---------------------------------------')

a = 10
b = 7
print(f'{a}')
print(f'{b}')

print('---------------------------------------')

c = a - b
print(f'Differanse: {c}')

print('---------------------------------------')

navn_2 = input('Skriv inn et nytt navn: ')
sammen = navn_1+navn_2
print(sammen)

print('---------------------------------------')

sammen = navn_1 + ' ' + 'og' + ' ' + navn_2
print(sammen)

print('---------------------------------------')

