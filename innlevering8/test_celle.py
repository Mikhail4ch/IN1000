from celle import Celle 

def hovedprogram():
    test_celle = Celle()
    test_celle.sett_levende()
    print(test_celle.er_levende())
    print()
    test_celle.sett_doed()
    print(test_celle.er_levende())
    print()
    print(test_celle.hent_status_tegn())
    print()
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
    print(test_celle.tell_levende_naboer())
    print()
    print(test_celle.oppdater_status())
    print()
    nabo3.sett_levende()
    print(test_celle.tell_levende_naboer())
    print()
    print(test_celle.oppdater_status())
    print()





hovedprogram()