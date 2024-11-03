# Klasse Film inneholder en konstruktør med tre instansvariabler, hvor to av disse ble
# initialisert med verdier fra init-metodens parametere og siste er en bare tom ordbok. 
# Det finnes totalt åtte metoder hvorav to er magiske metoder.
class Film:
    def __init__(self, titel:str, år:int) -> None:
        self.titel = titel
        self.år = år
        self.skuespillire ={}

# hent_tittel metoden returnerer bare self.titel instansvariabel    
    def hent_tittel(self) -> str:
        return self.titel

# ny_skuespiller metoden får to parametere som derfor lastes inn i 
# self.skuespillere-ordboken i form av nøkkel-verdi par.     
    def ny_skuespiller(self, navn:str,rolle:str) :
        if navn in self.skuespillire:
            return print('Skuespilleren har allerede en rolle i denne filmen')
        else:
            self.skuespillire[navn] = rolle

# hent_skuespiller_navn returnerer bare liste av skuespiller navner ved 
# å ta nøkkelverdier fra ordboken og laste dem inn i en tom liste som blir returnert til slutt            
    def hent_skuespiller_navn(self) -> list:
        liste = []
        for navn in self.skuespillire:
            liste.append(navn)
        return liste 

# skriv_ut_film metoden skriver ut i terminalen all informasjon om filmen (returnerer alle instansvariablene)
# Det bruker magisk metoden __str__ (som er strengrepresentasjon av klassen) fra nede for å gjøre det.
    def skriv_ut_film(self) -> str:
        print(self)

# sjekk_periode metoden returnere True hvis hvis verdien av instansvariabelen self.år er mer enn
# første og mindre enn andre parameter  
    def sjekk_periode(self, år_1:int, år_2:int) -> bool:
        if år_1 < self.år < år_2:
            return True
        else:
            return False

# check_title-metoden sjekker først om parameteren er en tom streng, og sjekker deretter om lengden 
# av paremeter er større enn self.titel-forekomstvariabelen, og kontroller først etterpå om parameteren 
# eller en del av parameteren er det samme som self.title     
    def sjekk_tittel(self, tittel_start:str) -> bool:
        if tittel_start == '':
            return True
        elif len(tittel_start) > len(self.titel):
            return False
        for letter in range(len(tittel_start)):
            if tittel_start[letter].lower() != self.titel[letter].lower():
                return False
        return True 

# denne magiske metoden returnerer en leservennlig strengrepresentasjon av et klasseobjekt. 
# For å oppnå samme utdata som i oppgavetilstanden, brukte jeg join()-metoden for å skille alle 
# aktører/rolleparene med en \n samt å kjøre gjennom ordboken og bruke dens nøkler og verdier og 
# gjøre all denne handlingen i én streng   
    def __str__(self):
        return f'{self.titel} ({self.år}). Medvirkende:\n' + '\n'.join([f'{navn} som {role}' for navn, role in self.skuespillire.items()])

# denne magiske metoden sammenligner bare forekomstvariabler tittel og år for gjeldende klasse med
# disse variablene fra en annen klasse som må fås som en parameter
    def __eq__(self, other: object) -> bool:
        if isinstance(other, Film):
            return self.titel.lower() == other.titel.lower() and self.år == other.år
        return False
        


        

        
    




        
        
        
    
