# Klasse Hund inneholder en konstruktør med tre instansvariabler 
# hvor to av disse ble initialisert med verdier fra init-metodens parametere.
# I tilleg inneholder den fire metoder hvorav to endrer instansvariabelen ved 
# å bruke 'if/else statements', og de to andre bare returnerer instansvariablene.

class Hund:
    def __init__(self, alder:int, vekt:float) -> None:
        self.alder = alder
        self.vekt = vekt
        self.metthet = 10
    
    def hent_alder(self)-> int:
        return self.alder
    
    def hent_vekt(self)-> float:
        return self.vekt
    
    def spring(self) -> None:
        if self.metthet - 1 >= 5:
            self.metthet -= 1
        else:
            self.vekt -= 1
            self.metthet -= 1
    
    def spis(self, mat:int) -> None:
        if self.metthet + mat > 7:
            self.vekt += 1
            self.metthet += mat
        else:
            self.metthet += mat





        
    

        
    