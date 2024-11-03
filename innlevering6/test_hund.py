# den første delen av funksjonen sjekker om klassemetoder returnerer 
# de riktige verdiene, og den andre delen kaller metoder som endrer 
# instansvariabler og returnerer dem deretter til sine opprinnelige 
# verdier (instansvariabel vekt)

from hund import Hund

def hovedprogram():
    hund = Hund(3,5.3)
    print(hund.hent_alder())
    print()
    assert hund.hent_alder() == 3, "Feil: resultaten må være 3"
    print(hund.hent_vekt())
    assert hund.hent_vekt() == 5.3, "Feil: resultaten må være 3"
    
    print('---  --------------  ---')

    hund.spring()
    hund.spring()
    hund.spring()
    print(hund.hent_vekt())
    assert hund.hent_vekt() == 5.3, "Feil: resultaten må være 3"
    print()
    hund.spring()
    hund.spring()
    print(hund.hent_vekt())
    print()
    hund.spring()
    print(hund.hent_vekt())
    assert hund.hent_vekt() == 4.3, "Feil: resultaten må være 3"
    print()
    hund.spring()
    print(hund.hent_vekt())
    assert hund.hent_vekt() == 3.3, "Feil: resultaten må være 3"
    print()
    print('nå skal vi mate hunden')
    print()
    hund.spis(3)
    print(hund.hent_vekt())
    print()
    hund.spis(3)
    print(hund.hent_vekt())
    assert hund.hent_vekt() == 4.3, "Feil: resultaten må være 3"
    print()
    hund.spis(2)
    print(hund.hent_vekt())
    assert hund.hent_vekt() == 5.3, "Feil: resultaten må være 3"

    print('---  --------------  ---')
    
    print('hunden ble vellykket matet til sin opprinnelige vekt :)')


hovedprogram()