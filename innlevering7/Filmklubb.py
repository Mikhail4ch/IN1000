# Klasse Filmklubb inneholder en konstruktør med en instansvariablen som er representert 
# med en tom liste. Filmklubb importerer klasse Film og bruker metodene deres, inkludert
# magiske metoder som __eq__ og __str__. Totalt finnes det seks metoder i klassen

from film import Film
import os
# Her brukte jeg os-modulen for å få riktig katalog der skriptet ligger
# samt bygge en absolutt bane til filen, av en eller annen grunn bare på 
# denne måten fungerte det i mitt tilfelle

class Filmklubb:
    def __init__(self) -> None:
        self.filmer = []

# les_filmer_fra_fil metoden åpner filen filmer.txt og leser den. Ved å iterere gjennom 
# innholdet ved å bruke for-loop, deler koden navnene på filmene og utgivelsesårene
# deres. Deretter tildeler den navn på filmer og utgivelsesår til to forskjellige 
# variabler og bruker disse variablene som parametere for å lage filmklasseforekomster 
# eller objekter, og legger dem til i en tom liste fra Filmklubb klassekonstruktøren    
    
    def les_filmer_fra_fil(self, filnavn:str):
        script_dir = os.path.dirname(__file__)
        abs_file_path = os.path.join(script_dir, filnavn)
        fil = open(abs_file_path)
        for linje in fil:
            kolloner = linje.strip().split(';')
            self.filmer.append(Film(kolloner[0],int(kolloner[1])))
        fil.close()

# denne metoden bare skriver ut alle objektene fra self.filmer-listen ved å 
# bruke __str__ magisk metode som klassen Film inneholder 
    
    def skriv_ut_alle_filmer(self):
        for filmen in self.filmer:
            print(str(filmen))

# denne metoden ber brukeren om inndata to ganger, deretter tilordner den disse 
# dataene til to variabler og oppretter nytt objekt på samme måte som i 
# les_filmer_fra_fil-metoden. Den kjører også gjennom self.filmer listen, og ved å 
# bruke __eq__ magisk metode, sjekk om det nyopprettede objektet allerede finnes i listen. 
# I så fall returnere den feilmelding og objekter ikke mot self.filmer-listen 
        
    def register_film(self):
        print()
        navn = str(input('skriv et filmnavn:\n< '))
        år = int(input('skriv et filmår:\n< '))
        print()
        nyFilm = Film(navn,år)
        for film in self.filmer:
            if nyFilm == film:
                return 'Denne filmen er allerede registrert'
        self.filmer.append(nyFilm)
        return 'Filmen ble registrert'
    
# finn_film_tittel får én parameter og ved å bruke film.sjekk_tittel-metoden 
# fra Film-klassen sjekker om parameteren sammenfaller med navnet eller første 
# bokstaven i navnet på en film fra self.filmer-listen
    
    def finn_film_tittel(self,tittel:str):
        for film in self.filmer:
            if film.sjekk_tittel(tittel):
                return film
        return None

# legg_til_skuespiller metoden får navnet på filmen som en parameter for 
# å finne filmen fra listen self.filmer ved å bruke finn_film_tittel metoden.
# Deretter starter den en while-loop til brukeren går inn i 1. Hvis brukeren 
# velger å fortsette ved å skrive inn 0, spør den brukeren om skuespillerens 
# navn og rolle. Etterpå lastes disse dataene inn i skuespillire-ordboken (til Film-klassen)
# ved å bruke ny_skuespiller metoden til Film-klassen også. Til slutt, ved å 
# bruke __str__ metoden returnerer den all informasjon om valgt film
        
    def legg_til_skuespiller(self,film:str):
        movie = self.finn_film_tittel(film)
        bruker = int(input('for å fortsette skriv 0\nfor å stoppe skriv 1\n< '))
        print()
        while bruker !=1:
            navn = str(input('skriv skuespillerens navn:\n< '))
            print()
            rolle = str(input('skriv skuespillerens rolle:\n< '))
            print()
            movie.ny_skuespiller(navn,rolle)
            bruker = int(input('for å fortsette skriv 0\nfor å stoppe skriv 1\n< '))
            print()
        return str(movie)
    
# denne metoden tar som parameter to forskjellige datoer og den leter etter alle filmene 
# fra fromself.filmer-listen som ble opprettet etter år_1 og før år_2. Filmene som 
# tilfredsstiller denne betingelsen lastes inn i listen.

    def finn_filmer_periode(self, år_1:int, år_2:int) -> list:
        liste1 = []
        for film in self.filmer:
            if film.sjekk_periode(int(år_1), int(år_2)):
                liste1.append(film)
        #return liste1
# Siden jeg ønsker å returnere listen med filmer på en lesbar måte, har jeg laget en liste 
# til som ikke inneholder lenker (adresse) til FIlm-objekter, men strengrepresentasjon av disse objektene
        liste2 = []
        for i in liste1:
            liste2.append(str(i))
        return liste2


        



        




                
            
                



        

        
