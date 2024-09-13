# essensen av dette programmet er å finne det mest brukte ordet i den medfølgende teksten.

# Jeg tildeler tekstvariabelen verdien til teksten der jeg skal søke etter det mest brukte ordet

text = 'Lorem Ipsum comes from a latin text written in 45BC by Roman statesman, lawyer, scholar, and philosopher, Marcus Tullius Cicero. The text is titled "de Finibus Bonorum et Malorum" which means "The Extremes of Good and Evil". The most common form of Lorem ipsum is the following: Lorem ipsum is widely in use since the 14th century and up to today as the default dummy "random" text of the typesetting and web development industry. In fact not only it has survived the test of time but it thrived and can be found in many software products, from Microsoft Word to WordPress.'
text = (text.lower()
        .replace(':', '')
        .replace('?', '')
        .replace(',', '')
        .replace('"', '')
        .replace('.', '')
        )

# ved å bruke den nedre metoden ble jeg kvitt de store bokstavene og ved å bruke 
# erstatningsmetoden ble jeg kvitt alle tegnene i teksten slik at bare ordene gjenstår.

wordsList = text.split()

# ved å bruke split-metoden lager jeg en wordsList (liste) som inneholder ord som elementer

wordsD = {}
for word in wordsList:
    if word not in wordsD:
        wordsD[word] = 1
    else:
        wordsD[word] += 1

# så lager jeg en tom ordbok og fyller den med elementer fra en tidligere opprettet liste. 
# Nøklene til ordboken er elementene fra forrige liste, og verdiene er antall repetisjoner 
# av disse elementene

highestFrequency = 0 

for element in wordsD:
   if wordsD[element] > highestFrequency:
      highestFrequency = wordsD[element]
      wordWithHighetFrequency = element

# til slutt, med en ordbok med ord og antall repetisjoner, bruker jeg for-løkken for å finne 
# nøkkelen med den største verdien, på samme måte som jeg gjorde det i oppgaven der jeg måtte
# finne maksimums / minimums tallet fra listen

print('---------------------------------------------------------')
print(f'the most frequently used word is: <{wordWithHighetFrequency}>\nand it is used {highestFrequency} times')
print('---------------------------------------------------------')





