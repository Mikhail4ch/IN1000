# Dette programmet består av tre funksjoner og en while-løkke til brukeren 
# skriver inn 's' fra tastaturet. Den grunnleggende logikken er skrevet
# inne i en while-løkke der funksjoner kalles opp basert på data mottatt 
# fra brukeren. Hvis brukeren skriver inn 'i', blir brukeren først bedt om
# navn og prefiks om å sende disse verdiene som argumenter til funksjonen, 
# som returnerer brukerens brukernavn som et resultat. Deretter skrives
# brukernavnet og prefikset til ordboken, der nøkkelen er brukernavnet og 
# prefikset er verdien. Hvis brukeren skriver inn 'p', kalles det en funksjon
# der det er en nestet funksjon for å lage en e-post. Som et resultat, basert 
# på størrelsen på ordboken, returneres alle opprettede e-poster til brukeren én etter én

def lag_brukernavn(navn):
    UiObrukernavn = ''
    splitted = navn.lower().split()
    liste = splitted[1].split()
    UiObrukernavn += splitted[0] + liste[0][0]
    return UiObrukernavn

def lag_epost(brukernavn, suffix):
    epost = brukernavn + '@' + suffix
    return epost

def skriv_ut_eposter(ordbok):
    for i in ordbok:
        resultatet = lag_epost(i,ordbok[i])
        print(resultatet)
        print()


brukerInput = input('skriv "i" for å lag e-post adressen\nskriv "p" for å se opprettede eposter\nskriv "s" for avslutte programmet\n< ')
print()
ordbok = {}

# så snart brukeren skriver inn 's', er det en umiddelbar utgang fra 
# while-løkken og deretter skrives ut ('program meter avsluttet')

while brukerInput != 's':
    
    if brukerInput == 'i':
        navn = input('hva heter du?\n< ')
        suffix = input('hva er suffix din?\n< ')
        brukernavn = lag_brukernavn(navn)
        ordbok[brukernavn] = suffix
        brukerInput = input('skriv "i" for å lag e-post adressen\nskriv "p" for å se opprettede eposter\nskriv "s" for avslutte programmet\n< ')
        print()
    
    elif brukerInput == 'p':
        skriv_ut_eposter(ordbok)
        brukerInput = input('skriv "i" for å lag e-post adressen\nskriv "p" for å se opprettede eposter\nskriv "s" for avslutte programmet\n< ')
        print()
    
    else:
        print('ugyldig valg, ta på nytt')
        print()
        brukerInput = input('skriv "i" for å lag e-post adressen\nskriv "p" for å se opprettede eposter\nskriv "s" for avslutte programmet\n< ')

print('programmet er avsluttet')
    



















    



