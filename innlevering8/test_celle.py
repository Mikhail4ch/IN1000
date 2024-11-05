#teste funksjoner til klasse-Celle
from celle import Celle 

def test_celle():
    test_celle = Celle()
test_celle()

def test_sett_doed_levende():
    test_celle = Celle()
    test_celle.sett_doed()
test_sett_doed_levende()

def test_er_levende():
    test_celle = Celle()
    test_celle.sett_levende()
test_er_levende()

def test_hent_status_tegn():
    test_celle = Celle()
    test_celle.sett_levende()
    assert test_celle.er_levende() == True, "Feil: resultaten må være True"
    print(test_celle.er_levende())
    print()
    test_celle.sett_doed()
    assert test_celle.er_levende() == False, "Feil: resultaten må være False"
    print(test_celle.er_levende())
    print()
test_hent_status_tegn()

def test_legg_til_nabo():
    test_celle = Celle()
    nabo1 = Celle()
    test_celle.legg_til_nabo(nabo1)
    nabo1.sett_levende()
    nabo2 = Celle()
    test_celle.legg_til_nabo(nabo2)
    nabo3 = Celle()
    test_celle.legg_til_nabo(nabo3)
    nabo4 = Celle()
    test_celle.legg_til_nabo(nabo4)
    nabo5 = Celle()
    test_celle.legg_til_nabo(nabo5)
    nabo6 = Celle()
    test_celle.legg_til_nabo(nabo6)
    nabo7 = Celle()
    test_celle.legg_til_nabo(nabo7)
    nabo8 = Celle()
    test_celle.legg_til_nabo(nabo8)
test_legg_til_nabo()

def test_tell_levende_naboer():
    test_celle = Celle()
    nabo1 = Celle()
    test_celle.legg_til_nabo(nabo1)
    nabo1.sett_levende()
    nabo2 = Celle()
    test_celle.legg_til_nabo(nabo2)
    nabo3 = Celle()
    test_celle.legg_til_nabo(nabo3)
    nabo4 = Celle()
    test_celle.legg_til_nabo(nabo4)
    nabo5 = Celle()
    test_celle.legg_til_nabo(nabo5)
    nabo6 = Celle()
    test_celle.legg_til_nabo(nabo6)
    nabo7 = Celle()
    test_celle.legg_til_nabo(nabo7)
    nabo8 = Celle()
    test_celle.legg_til_nabo(nabo8)
    assert test_celle.tell_levende_naboer() == 1, "Feil: resultaten må være 1"
    print(test_celle.tell_levende_naboer())
    print()
    assert test_celle.oppdater_status() == 'doed', "Feil: resultaten må være doed"
    print(test_celle.oppdater_status())
    print()
    nabo3.sett_levende()
    assert test_celle.tell_levende_naboer() == 2, "Feil: resultaten må være 2"
    print(test_celle.tell_levende_naboer())
    print()
    assert test_celle.oppdater_status() == 'levende', "Feil: resultaten må være levende"
    print(test_celle.oppdater_status())
    print()
test_tell_levende_naboer()







