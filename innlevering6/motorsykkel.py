# Klasse Motorsykkel inneholder en konstruktør med tre instansvariabler 
# hvor to av disse ble initialisert med verdier fra init-metodens parametere.
# I tilleg inneholder den tre metoder hvorav en endrer instansvariabelen, 
# og de to andre bare returnerer instansvariablene.

class Motorsykkel:
    def __init__(self, merke:str, registreringsnummer:str) -> None:
        self.kilometerstand = 0
        self.merke = merke
        self.registreringsnummer = registreringsnummer
    
    def kjor(self, km:int) -> None:
        self.kilometerstand += km

    def hent_kilometerstand(self) -> int:
        return self.kilometerstand
    
    def skriv_ut(self) :
        return print(f'merke er: {self.merke}\nregistreringsnummer er: {self.registreringsnummer}\nog kilometerstand er: {self.kilometerstand}')
    