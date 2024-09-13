# dette programmet godtar data i form av tall fra brukeren til brukeren skriver inn tallet 0
# En liste dannes av tallene som er lagt inn av brukeren. Deretter skriver programmet ut hvert 
# element fra den opprettede listen fra en ny linje. Deretter teller programmet summen av 
# alle tallene fra listen og til slutt, ved å bruke for loops, finner det mindre og større 
# element fra listen

liste = []
tall = int(input('skriv en tall:\n> '))

while tall != 0:
    liste.append(tall)
    tall = int(input('skriv en tall:\n> '))

print('---------------------------')

for element in liste:
    print(element)

print('---------------------------')

sum = 0
for element in liste:
    sum += element
print(f'summen er: {sum}')

print('---------------------------')

# denne metoden for å finne minimums-/maksimumsverdien til en liste er enkel. Ved å 
# bruke for-løkken kjører vi gjennom hvert element i listen, og hvis elementet viser 
# seg å være mindre/større enn en forhåndsdefinert variabel, blir verdien til elementet
#  tilordnet denne variabelen

min = liste[0]
for element in liste:
    if element < min:
        min = element
print(f'minste elementet er: {min}')

print('---------------------------')

max = liste[0]
for element in liste:
    if element > max:
        max = element
print(f'største elementet er: {max}')

print('---------------------------')