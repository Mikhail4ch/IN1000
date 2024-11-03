from Filmklubb import Filmklubb

def hovedprogram():
    klubben1 = Filmklubb()

    klubben1.les_filmer_fra_fil('filmer.txt')
# bare filmnavn og årstall vil bli vist siden skuespillere og 
# deres roller ikke lastes inn som standard
    klubben1.skriv_ut_alle_filmer()
    print('--------------------------------------')
    
    print(klubben1.register_film())
    print(klubben1.register_film())
    print('--------------------------------------')
    print()
# Jeg sjekket bare om nye filmer ble lagt til listen    
    klubben1.skriv_ut_alle_filmer()
    print('--------------------------------------')
    print()

    print(klubben1.finn_film_tittel('Grav'))
    print(klubben1.finn_film_tittel('Batman'))
    assert klubben1.finn_film_tittel('Batman') == None, "Feil: resultaten må være None"
    print('--------------------------------------')
    print()

    print(klubben1.legg_til_skuespiller('Broker'))
# returnere informasjon om filmen Broker til slutt
    print()

    print(klubben1.finn_filmer_periode(2015,2024))



 





hovedprogram()
