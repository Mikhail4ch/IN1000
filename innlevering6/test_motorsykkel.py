# assert-setninger brukes til å sjekke om 
# instansvariabelen kilometerstand er riktig etter endringen

from motorsykkel import Motorsykkel

def hovedprogram():
    object1 = Motorsykkel('Yamaha', '228')
    assert object1.hent_kilometerstand() == 0, "Feil: resultaten må være 0"
    object2 = Motorsykkel('Honda', '322')
    assert object2.hent_kilometerstand() == 0, "Feil: resultaten må være 0"
    object3 = Motorsykkel('BMW', '051')
    assert object3.hent_kilometerstand() == 0, "Feil: resultaten må være 0"

    object3.kjor(10)
    print(object3.hent_kilometerstand())
    assert object3.hent_kilometerstand() == 10, "Feil: resultaten må være 10"
    print()
    object3.skriv_ut()
    
    
hovedprogram()