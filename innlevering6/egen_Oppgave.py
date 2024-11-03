# Jeg bestemte meg for å fullføre tilbudt oppgave. 
# Så, klassen Person inneholder en konstruktør med tre instansvariabler 
# hvor to av disse ble initialisert med verdier fra init-metodens parametere.
# I tilleg inneholder det tre metoder hvorav en endrer instansvariabelen ved 
# å legge til nye elementer i listen, og de to andre returnerer instansvariablene.

class Person:
    def __init__(self, navn:str, alder:int) -> None:
        self.navn = navn
        self.alder = alder
        self.hobbyer = []

    def legg_til_hobby(self, hobbyer:str) -> list:
        liste = hobbyer.split(' ')
        self.hobbyer += liste
        return self.hobbyer
    
    def skriv_hobbyer(self) -> None:
        liste = self.hobbyer
        print(*liste, sep = ", ")

    
    def skriv_ut(self) -> None:
        print(f'{self.navn}\n{self.alder}')
        self.skriv_hobbyer()
    
