# i dette programmet inkluderer hovedfunksjonen to tidligere funksjoner, hvorav den første 
# returnerer antall bokstaver i et ord som et resultat, og den andre returnerer en ordbok (i tillegg antallet på alle ord)
#  der nøkkelen er et unikt ord og verdien er antall repetisjoner av disse ordene i en brukerdefinert setning

def antallBokstaver (ordet):
    antall = 0
    for i in ordet:
        antall += 1
    return antall


def antallOrd(setningen):
    ordbok = {}
    ordKvantiten = 0
    liste = setningen.split()
    for element in liste:
        ordKvantiten += 1
        if element in ordbok:
            ordbok[element] += 1
        else:
            ordbok[element] = 1  
    return ordbok, ordKvantiten

# hovedfunksjonen, når den kalles, kaller den andre funksjonen én gang og kaller den første
# funksjon nøyaktig så mange ganger som ordboken fra den andre funksjonen inneholder 
# nøkler. Hovedfunksjonen viser også en melding om det totale antallet ord i 
# den mottatte teksten, antall repetisjoner av hver tast og antall bokstaver i disse tastene

def hoveprogram(setningen):
    ordbok, ordKvantiten = antallOrd(setningen)
    print(f'det er {ordKvantiten} ord i setningen din.')
    for i in ordbok:
        resultOne = antallBokstaver(i)
        ganger = 'gang' if ordbok[i] == 1 else 'ganger'
        bokstaver = 'bokstav' if resultOne == 1 else 'bokstaver'
        print(f'Ordet \'{i}\' forekommer {ordbok[i]} {ganger} og har {resultOne} {bokstaver}')
    

hoveprogram(input('skriv en setning\n< '))


    




