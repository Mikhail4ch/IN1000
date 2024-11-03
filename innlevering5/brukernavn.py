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

def lag_brukernavn(navn, ordbok):
    UiObrukernavn = ''
    splitted = navn.lower().split()
    liste = splitted[1].split()
    liste2 = splitted[0].split()
    UiObrukernavn += splitted[0] + liste[0][0]
    index = -1
    print(len(liste2[0]))
    while UiObrukernavn in ordbok:
            print(index)
            if index >= len(liste2[0]) - 1:
                UiObrukernavn += f'{index}'
                index += 1
            else:
                 UiObrukernavn += liste2[0][index+1]
                 index += 1
    return UiObrukernavn

def lag_epost(brukernavn, suffix):
    epost = brukernavn + '@' + suffix
    return epost

def test_lag_brukernavn():
    assert lag_brukernavn("Kari Nordmann") == "karin", "Test feilet for 'Kari Nordmann'"
    assert lag_brukernavn("Ola Hansen") == "olah", "Test feilet for 'Ola Hansen'"
    assert lag_brukernavn("Per Olsen") == "pero", "Test feilet for 'Per Olsen'"
    print("Alle brukernavn-tester bestått.")

def test_lag_epost():
    assert lag_epost("karin", "student.matnat.uio.no") == "karin@student.matnat.uio.no", "Test feilet for 'karin@student.matnat.uio.no'"
    assert lag_epost("olah", "student.matnat.uio.no") == "olah@student.matnat.uio.no", "Test feilet for 'olah@student.matnat.uio.no'"
    print("Alle e-post-tester bestått.")

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
        brukernavn = lag_brukernavn(navn, ordbok)
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
    



















    



