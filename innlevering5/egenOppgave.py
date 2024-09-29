# denne gangen bestemte jeg meg for å følge den 
# foreslåtte versjonen av den uavhengige oppgaven og løse den

def tommer_til_cm(antall_tommer):
    assert antall_tommer > 0, "Feil: antall_tommer må være større en null"
    return round(antall_tommer * 2.54, 2)

def leggeIOrdbok(filnavn):
    print('målene i tommer')
    ordbok = {}
    fil = open(filnavn)
    for linje in fil:
        koloner = linje.split()
        ordbok[koloner[0]] = koloner[1]
    return ordbok

def måleneICentimeter(ordbok):
    print('målene i centimeter')
    for i in ordbok:
        cm = tommer_til_cm(float(ordbok[i]))
        ordbok[i] = cm
    return ordbok

# i hovedfunksjonen kalles først en funksjon som leser all data fra 
# en tekstfil og deretter skriver den som et nøkkel/verdi-par til 
# en tom ordbok. Deretter kalles en annen funksjon som tar inn denne 
# ordboken og endrer verdiene til denne ordboken ved å kalle den 
# nestede funksjonen. til slutt vises ordboken med de endrede verdiene
# i terminalen og brukeren kan tydelig se forskjellen mellom tommer og centimeter

def hovedfunsjon():
    ordbok = leggeIOrdbok('skreddere.txt')
    print(ordbok)
    print()
    cm = måleneICentimeter(ordbok)
    print(cm)

hovedfunsjon()