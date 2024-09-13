# Basert på dataene mottatt fra brukeren, fyller dette programmet ut tre lister etter tur. 
# deretter opprettes en ny fjerde liste, som inkluderer de tre forrige listene. deretter ber
#  programmet brukeren om å angi visse numeriske verdier, etter å ha mottatt som viser 
# programmet et bestemt element fra den siste fjerde listen


steder = []
print('du må skrive fem reisemålene dine etter hverandre')
for i in range(5):
    steder.append(str(input('skriv et av reisemålene dine:\n> ')))

print('---------------------------------------------------------')

klesplagg = []
print('skriv dine fem klesplagg etter hverandre')
for i in range(5):
    klesplagg.append(str(input('skriv en av klesplagget ditt:\n> ')))

print('---------------------------------------------------------')

avreisedatoer = []
print('skriv fem påfølgende avreisedatoer')
for i in range(5):
    avreisedatoer.append(str(input('skriv en av dine avreisedatoer:\n> ')))

print('---------------------------------------------------------')

reiseplan = [steder, klesplagg, avreisedatoer]

for element in reiseplan:
    print(element)

print('---------------------------------------------------------')
print('la meg hjelpe deg med å sjekke reiseplanen din!')
print('---------------------------------------------------------')
print()
liste_indeks1 = int(input('velg listen du vil se\n0 for steder, 1 for klesplagg, 2 for avreisedatoer:\n> '))
print()
liste_indeks2 = int(input('velg ett av fem elementer i listen:\n0 or 1 or 2 or 3 or 4:\n> '))

print('---------------------------------------------------------')

# hvis brukeren legger inn feil data for å søke etter elementer fra den endelige listen, 
# viser programmet en melding på skjermen, dette forhindrer feilen "index out of range"

if 0 <= liste_indeks1 <= 2 and 0 <= liste_indeks2 <= 4:
    print(reiseplan[liste_indeks1][liste_indeks2])
else:
    print('Ugyldig input!')

print('---------------------------------------------------------')





