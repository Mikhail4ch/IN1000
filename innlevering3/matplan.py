# Dette programmet presenterer en måltidsplan for beboere som bruker en ordbok,
# der navnet betyr nøkkelen og listen over retter betyr kostnaden. Ved mottak 
# av navn fra bruker sjekker programmet også om dette navnet er i ordboken, og 
# basert på resultatet, om det oppfyller betingelsen, gir det ut en liste med
# måltidsplaner, ellers viser det en feilmelding.


måltidene = {
    'Erik': ['pålegg', 'tomatsuppe', 'vårruller med ris'],
    'Ahmed': ['smørbrød', 'caesar', 'pizza'],
    'Pavel': ['egg med bacon', 'nudler', 'pasta bolognese'],
    'Krisitan': ['egg med bacon', 'couscous salat', 'biff'],
    'Ryan': ['grøt', 'cream soup', 'Kylling karri'],
}

def dataforespørsel ():
    print('--------------------------------------------')
    print(list(måltidene))
    print('--------------------------------------------')

    navnet = str(input('skriv et navn til en beboer: '))
    navnet = navnet.capitalize()
    # Jeg brukte denne metoden til å skrive den første bokstaven i 'navnet'-variabelen med stor bokstav, uavhengig av den faktiske inngangen 
    if navnet in måltidene:
        print(måltidene[navnet])
    else:
        print('beboeren ikke er registrert')

dataforespørsel()

# a) Jeg vil bruke en mendge fordi vi ikke vil ha duplikater og rekkefølgen er ikke viktig
# b) Jeg vil bruke en ordbok med brukernavner som nøkler og studiepoeng som verdi fordi vi har en nøkkel:par relasjon
# c) Jeg vile bruke en mengde med fordi rekkefølgen ikke er viktig og vi vil ikke tillate duplikater
# d) Også en mengde siden rekkefølgen ikke er viktig og vi ikke vil ha duplikater
