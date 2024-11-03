from rutenett import Rutenett

def hovedprogram():
    rutenett = Rutenett(6,6)
    rutenett.fyll_med_tilfeldige_celler()
    print(rutenett.hent_celle(-1,2))
    print()
    print(rutenett.hent_celle(2,2))
    rutenett.tegn_rutenett()
    rutenett._sett_naboer(3,3)
    #celle = rutenett.hent_celle(3,3)
    #print(celle.tell_levende_naboer())
    #print()
    rutenett.koble_celler()
    celle1 = rutenett.hent_celle(3,3)
    print(celle1.tell_levende_naboer())
    print()
    celle2 = rutenett.hent_celle(5,4)
    print(celle2.tell_levende_naboer())
    print()
    print(rutenett.hent_alle_celler())
    print()
    print(rutenett.antall_levende)





hovedprogram()

