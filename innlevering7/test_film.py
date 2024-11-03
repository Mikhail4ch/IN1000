from film import Film

def hoveprogram():
    film1 = Film('Cars', 2006)
    print(film1.hent_tittel())
    print('---------------------------------------------------------------------')
    print()
# lasting av skuespiller/rolle par i objektordbok
    film1.ny_skuespiller('Owen Wilson','McQueen')
    film1.ny_skuespiller('Paul Newman','Doc Hudson')
    film1.ny_skuespiller('Bonnie Hunt','Sally Carrera')
    film1.ny_skuespiller('Paul Newman','Ramone')
    film1.ny_skuespiller('Tony Shalhoud','Luigi')
    print('---------------------------------------------------------------------')
    print()
  
    print(film1.hent_skuespiller_navn())
    print('---------------------------------------------------------------------')
    print()

    film1.skriv_ut_film()
    print('---------------------------------------------------------------------')
    print()

    print(film1.sjekk_periode(2000,2024))
    assert film1.sjekk_periode(2000,2024) == True, "Feil: resultaten må være True"
    print(film1.sjekk_periode(2010,2013))
    assert film1.sjekk_periode(2010,2013) == False, "Feil: resultaten må være False"
    print(film1.sjekk_periode(1999,2006))
    assert film1.sjekk_periode(1999,2006) == False, "Feil: resultaten må være False"
    print('---------------------------------------------------------------------')
    print()

    print(film1.sjekk_tittel('Cars'))
    assert film1.sjekk_tittel('Cars') == True, "Feil: resultaten må være True"
    print(film1.sjekk_tittel('Ca'))
    assert film1.sjekk_tittel('Ca') == True, "Feil: resultaten må være True"
    print(film1.sjekk_tittel(''))
    print(film1.sjekk_tittel('Carss'))
    assert film1.sjekk_tittel('Carss') == False, "Feil: resultaten må være False"
    print(film1.sjekk_tittel('Biler'))
    assert film1.sjekk_tittel('Biler') == False, "Feil: resultaten må være False"
    print('---------------------------------------------------------------------')
    print()

    print(str(film1))
    print('---------------------------------------------------------------------')
    print()

# her har jeg nettopp laget to nye objekter og sammenlignet dem, 
# inkludert det første, med hverandre
    film2 = Film('Hancock', 2008)
    film3 = Film('Cars', 2006)
    print(film1 == film2)
    print(film2 == film3)
    print(film1 == film3)
    print('---------------------------------------------------------------------')

hoveprogram()