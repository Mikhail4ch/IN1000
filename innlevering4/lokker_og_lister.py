# de to første løkkene i dette programmet godtar ganske enkelt ti vilkårlige tall fra 
# brukeren for å fylle forhåndslagrede tomme lister med tall 
# programmet ber deretter om visse data fra brukeren og stopper denne prosessen når 
# tallet angitt av brukeren overstiger tallet 20. Deretter oppretter programmet en for-løkke 
# for å fylle en tom liste med indeksene til den forrige listen med tallene angitt av brukeren. 
# Deretter skriver programmet ut hvert element i listen individuelt med tallene som er lagt 
# inn av brukeren og helt til slutt endrer denne listen ved å tidoble hvert element, dette skjer 
# ved å bruke en for-løkke og en liste med indekser som ble opprettet tidligere

liste1 = []
counter = 0
while counter < 10:
    liste1.append(int(input('skriv en tall:\n> ')))
    counter += 1
print(liste1)

print('---------------------------------------------------------')

liste2= []
for element in range(10):
    liste2.append(int(input('skriv en tall:\n> ')))
print(liste2)

print('---------------------------------------------------------')

# a) jeg tror at 'range(10)' står for en samling i
# for-løkke tilfellet, siden range er en sekvens av tall 

# b) 'range(10)' inneholder tallene fra 0 til 9, det er denne 
# tallene vi itererer over. Sammenlignet med listen er denne
# tallene ikke faktiske verdiene, med andre ord, er 'range(10)'
# en midlertidig samling av tall som vi itererer over for å lage en ny samling.

mine_tall = []
tallInput = int(input('skriv inn tallene som starter fra null og øker de påfølgende med tre, for eksempel 0, 3, 6, o.s.v:\n> '))
while tallInput < 20:
    mine_tall.append(tallInput)
    tallInput = int(input('skriv en tall:\n> '))
print(mine_tall)

print('---------------------------------------------------------')

mine_tall_indekser = []
for element in range(len(mine_tall)):
    mine_tall_indekser.append(element)
print(mine_tall_indekser)

print('---------------------------------------------------------')

for element in mine_tall:
    print(element)

print('---------------------------------------------------------')

for index in mine_tall_indekser:
    mine_tall[index] *= 10
print(mine_tall)

print('---------------------------------------------------------')

# a) jeg la for-løkken gå gjennom de gyldige indeksene for 
# listen mine_tall, fordi for å endre elementer i listen
# må vi iterere over indeksene til elementene ellers kan
# vi endre bare kopier av elementene 

# b) i tilfelle feilstrategi vil man endre bare en lokal 
# kopi av elementer istedenfor elementer i listen 

    




