# Klasse Dato inneholder en konstruktør med tre instansvariabler 
# hvor alle instansvariabler er initialisert med verdier fra init-metodens parametere.
# I tilleg inneholder den fem metoder hvorav en endrer instansvariabelen, de to 
# andre returnerer instansvariablene, og de siste to returnerer boolske verdier ved
# å bruke 'if/else statements'.

class Dato:
    def __init__(self, ny_dag:int, nytt_maaned:int, nytt_aar:int) -> None:
        self.ny_dag = ny_dag
        self.nytt_maaned = nytt_maaned
        self.nytt_aar = nytt_aar
       
    def hent_aar(self) -> None:
        return self.nytt_aar
    
    def return_datos(self) -> str:
        return f'{self.ny_dag}.{self.nytt_maaned}.{self.nytt_aar}'
    
    def day_check(self, dag_nr:int) -> bool:
        if self.ny_dag == dag_nr:
            return True
        else:
            return False
    
    def nyy_dag(self) -> None:
        self.ny_dag += 1

    #først delte jeg den gamle og nye datoen i deler ved å bruke split()-metoden 
    # for å sammenligne år, måned og deretter dagen etter tur
    
    def kommer_foer(self, annen_dato:str) -> str:
        tidligere_data = self.return_datos()
        kolloner1 = annen_dato.split('.')
        kolloner2 = tidligere_data.split('.')
    
    # så, etter å ha laget en syklus med tre iterasjoner, og sammenlignet år,
    #  måned og dag etter tur, foreskrev jeg if-setninger slik at boolske 
    # verdier returneres hvis den nye datoen er tidligere enn den forrige, og 
    # hvis datoene er de samme , returneres en melding
        
        index = 2
        for i in range(3):
            if int(kolloner1[index]) < int(kolloner2[index]):
                return True
            elif int(kolloner1[index]) > int(kolloner2[index]):
                return False
            index -= 1
        return f'datoer er samme'
    
        

        
        
        
      



        
        
        


