# Klasse Rutenett inneholder konstruktør med tre instansvariabler, hvor to av disse ble
# initialisert med verdier fra init-metodens parametere og siste ved hjelpmetoden self._lag_tomt_rutenett()
# Det finnes totalt ti metoder og i tilleg importerer og bruker klassen metoder av Cell-klassen
from celle import Celle
from random import randint

class Rutenett:
    def __init__(self, rader, kolonner):
        self._ant_rader = rader
        self._ant_kolonner = kolonner
        self._rutenett = self._lag_tomt_rutenett()
#metoden lager antall kolonner eller lengden på listen 'liste' ved å bruke
#instansvariablen self._ant_kolonner og returnere 'liste' til slutt
    def _lag_tom_rad (self):
        liste = []
        for i in range(self._ant_kolonner):
            liste.append(None)
        return liste
#metoden bruker instansvariablen self._ant_rader for å lage listen med
#antall lister som passer til antall rader av rutenett, også for å lage
#tomt rutenett kaller det _lag_tom_rad metoden for å 'fylle hver nyopprettede liste
#med liste som returnere _lag_tom_rad metoden' som passer til antall kolonner av tomt rutenett
    def _lag_tomt_rutenett(self):
        rutenett = []
        for i in range(self._ant_rader):
            rutenett.append(self._lag_tom_rad())
        return rutenett
#metoden bare oppretter forekomst av Cell-klassen og returnere det
    def lag_celle(self):
         celle = Celle()
         return celle
#denne metoden fyller lister 'med None inne' med representasjoner av celler på formen
#'O' eller '.' og det gjøre det ved å bruke 'randint' motoden for å opprette 
#'levende' celle med sannsynlighet 1/3
    def fyll_med_tilfeldige_celler(self):
         for raden_index in range(self._ant_rader):
              for kolonnen_index in range(self._ant_kolonner):
                   celle = self.lag_celle()
                   tall = randint(0,5)
                   if tall ==0:
                         celle.sett_levende()
                   self._rutenett[raden_index][kolonnen_index] = celle
#det returnere spesifikke cellen basert på verdien til parameter 'kolonne'
#også returnere den None hvis denne cellen eksistere ikke i rutenett 
    def hent_celle(self, rad, kolonne):
         if 0 <= rad < self._ant_rader and 0 <= kolonne < self._ant_kolonner:
            return self._rutenett[rad][kolonne]
         else:
            return None
#denne metoden skrives ut representasjon av rutunett i terminalen ved å bruke rutenett 
#listen og ved å kalle klassen-Celle metoden hent_status_tegn for hver element i nøstet listen
    def tegn_rutenett(self):
        print("\n" * 2)
        for raden in self._rutenett:
             for kollonen in raden:
                  tegn = kollonen.hent_status_tegn()
                  print(tegn, end="")
             print()
        print("\n" * 2)
#det fyller listen 'self._naboer' av klassen-Celle med naboceller, og det gjøre det
#for spesifikke cellen basert på rad og kolonne parameter
    def _sett_naboer(self, rad:int, kolonne:int):
        if self.hent_celle(rad, kolonne) is not None:
            celle = self.hent_celle(rad, kolonne)
#jeg opprettet 'liste' med lister som inneholder koordinater for naboceller
            liste = [[rad-1,kolonne-1],[rad-1,kolonne],[rad-1,kolonne+1],
                  [rad,kolonne-1],[rad,kolonne+1],[rad+1,kolonne-1],
                  [rad+1,kolonne],[rad+1,kolonne+1]]
#her bruker jeg 'liste' med koordinater for å returnere denne celler ved av kalle 
#hent_celle metoden og lage dem i legg_til_nabo listen til av klasse-Celle
            for nabo_rad, nabo_kolonne in liste:
              nabo_celle = self.hent_celle(nabo_rad, nabo_kolonne)
              if nabo_celle != None:
                   celle.legg_til_nabo(nabo_celle)
        else:
            print('det finnes ikke denne cellen')
#denne metoden setter naboer ved å kalle _sett_naboer metoden for alle celler i rutenett
    def koble_celler(self):
        for rad_index in range(self._ant_rader):
            for kol_index in range(self._ant_kolonner):
                self._sett_naboer(rad_index,kol_index)
#metoden henter alle celler fra rutenett og setter dem i liste, returnere liste til slutt
    def hent_alle_celler(self):
        listeMedCeller = []
        for rad_index in range(self._ant_rader):
            for kol_index in range(self._ant_kolonner):
                listeMedCeller.append(self._rutenett[rad_index][kol_index])
        return listeMedCeller
#det antaller alle levende celler i rutennet og returnere resultaten
    def antall_levende(self):
        antall_levende = 0
        for rad in self._rutenett:
            for celle in rad:
                if celle.er_levende():
                    antall_levende+=1
        return antall_levende

     
            

             

        
        
    
         
         
      
        
                   
             
              
        
            
    
    
    
    

         
    


    
                    
                
                  
                   
                   
         
         
         


    

    
    