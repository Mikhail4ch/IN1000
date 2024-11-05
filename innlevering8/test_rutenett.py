#teste funksjoner til klasse-Celle
#alle testfunksjonene er på en måte deaktivert og for å teste hver funksjon kan du bare slette # 
#Jeg gjorde det slik fordi disse funksjonene ble kalt samtidig sammen kan gi uforutsigbar utgang
from rutenett import Rutenett

def test_konstruktoen():
    rutenett = Rutenett(6,6)
#test_konstruktoen()

def test_fyll_med_tilfeldige_celler():
    rutenett = Rutenett(6,6)
    rutenett.fyll_med_tilfeldige_celler()
#test_fyll_med_tilfeldige_celler()

def test_hent_celle():
    rutenett = Rutenett(6,6)
    rutenett.fyll_med_tilfeldige_celler()
    assert rutenett.hent_celle(-1,2) == None, "Feil: resultaten må være None"
    print(rutenett.hent_celle(-1,2))
    print()
    print(rutenett.hent_celle(2,2))
#test_hent_celle()

def test_tegn_rutenett():
    rutenett = Rutenett(6,6)
    rutenett.fyll_med_tilfeldige_celler()
    rutenett.tegn_rutenett()
#test_tegn_rutenett()

def test_naboer():
    rutenett = Rutenett(6,6)
    rutenett.fyll_med_tilfeldige_celler()
    rutenett.tegn_rutenett()
    rutenett._sett_naboer(3,3)
    celle = rutenett.hent_celle(3,3)
    print(celle.tell_levende_naboer())
#test_naboer()

def test_koble_celler():
    rutenett = Rutenett(6,6)
    rutenett.fyll_med_tilfeldige_celler()
    rutenett.tegn_rutenett()
    rutenett.koble_celler()
    celle1 = rutenett.hent_celle(3,3)
    print(celle1.tell_levende_naboer())
    print()
    celle2 = rutenett.hent_celle(5,4)
    print(celle2.tell_levende_naboer())
    print()
#test_koble_celler()

def test_antall_levende():
    rutenett = Rutenett(6,6)
    rutenett.fyll_med_tilfeldige_celler()
    rutenett.tegn_rutenett()
    rutenett.koble_celler()
    print()
    print(rutenett.antall_levende())
    print()
    print(rutenett.hent_alle_celler())
#test_antall_levende()

    






