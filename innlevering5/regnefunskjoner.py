# Dette programmet inkluderer beregningsfunksjoner så vel som deres 
# verifisering ved å bruke 'hevde'. Hovedfunksjonen inkluderer alle
# funksjonene beskrevet ovenfor, ber om data fra brukeren og sender
# disse dataene som parametere til beregningsfunksjoner. Hovedfunksjonen 
# gir også en feil hvis brukeren skrev inn et tall mindre enn eller 
# lik null som argument for den siste funksjonen

def adisjon(tall1, tall2):
    return tall1 + tall2

adisjonKall = adisjon(80,9)
print(f'summen er: {adisjonKall}')
print()
assert adisjon(80, 9) == 89, "Feil: resultaten må være 89"
# hvis jeg hadde skrevet at assert disjoin(80, 9) == 85, 
# for eksempel (istedet for 89), ville følgende melding blitt vist i 
# terminalen: 'Feil: resultaten må være 89'
assert adisjon(-10, -25) == -35, "Feil: resultaten må være -35"
assert adisjon(43, -45) == -2, "Feil: resultaten må være -2"


def subtraksjon(tall1, tall2):
    return tall1 - tall2

subtraksjonKall = subtraksjon(80,9)
print(f'forskjellen er: {subtraksjonKall}')
print()
assert subtraksjon(80, 9) == 71, "Feil: resultaten må være 71"
assert subtraksjon(-10, -25) == 15, "Feil: resultaten må være 15"
assert subtraksjon(43, -45) == 88, "Feil: resultaten må være 88"

def divisjon(tall1, tall2):
    return round(tall1 / tall2, 2)

divisjonKall = divisjon(80,9)
print(f'kvotienten er: {divisjonKall}')
print()
assert divisjon(80, 9) == 8.89, "Feil: resultaten må være 8.89"
assert divisjon(80, 2) == 40, "Feil: resultaten må være 40"
assert divisjon(80, 8) == 10, "Feil: resultaten må være 10"

def tommer_til_cm(antall_tommer):
    assert antall_tommer > 0, "Feil: antall_tommer må være større en null"
    return antall_tommer * 2.54

antall_centimeter = tommer_til_cm(4)
print(f'antall centimeter er lik: {antall_centimeter}')
print()

def skriv_beregninger():
    print('Utregninger:')
    tall1 = int(input('Skriv inn tall 1: '))
    tall2 = int(input('Skriv inn tall 2: '))
    print()
    adisjonResult = adisjon(tall1, tall2)
    subtraksjonResult = subtraksjon(tall1, tall2)
    divisjonResult = divisjon(tall1, tall2)
    print(f'Resultat av summering: {adisjonResult}')
    print(f'Resultat av subtraksjon: {subtraksjonResult}')
    print(f'Resultat av divisjon: {divisjonResult}')
    print()
    print('Konvertering fra tommer til cm:')
    antall_tommer = int(input('Skriv inn et tall: '))
    centimeterResult = tommer_til_cm(antall_tommer)
    print(f'Resultat: {centimeterResult}')

skriv_beregninger()





    






