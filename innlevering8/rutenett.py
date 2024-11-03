from celle import Celle
from random import randint

class Rutenett:
    def __init__(self, rader, kolonner):
        self._ant_rader = rader
        self._ant_kolonner = kolonner
        self._rutenett = self._lag_tomt_rutenett()
    def _lag_tom_rad (self):
            liste = []
            for i in range(self._ant_kolonner):
                liste.append(None)
            return liste
    def _lag_tomt_rutenett(self):
        rutenett = []
        for i in range(self._ant_rader):
            rutenett.append(self._lag_tom_rad())
        return rutenett
    def lag_celle(self):
         celle = Celle()
         return celle
    def fyll_med_tilfeldige_celler(self):
         for raden_index in range(self._ant_rader):
              for kolonnen_index in range(self._ant_kolonner):
                   celle = self.lag_celle()
                   tall = randint(0,2)
                   if tall ==0:
                         celle.sett_levende()
                   self._rutenett[raden_index][kolonnen_index] = celle
    def hent_celle(self, rad, kolonne):
         if 0 <= rad < self._ant_rader and 0 <= kolonne < self._ant_kolonner:
            return self._rutenett[rad][kolonne]
         else:
            return None
    def tegn_rutenett(self):
        print("\n" * 2)
        for raden in self._rutenett:
             for kollonen in raden:
                  tegn = kollonen.hent_status_tegn()
                  print(tegn, end="")
             print()
        print("\n" * 2)
    def _sett_naboer(self, rad:int, kolonne:int):
        if self.hent_celle(rad, kolonne) is not None:
            celle = self.hent_celle(rad, kolonne)
            liste = [[rad-1,kolonne-1],[rad-1,kolonne],[rad-1,kolonne+1],
                  [rad,kolonne-1],[rad,kolonne+1],[rad+1,kolonne-1],
                  [rad+1,kolonne],[rad+1,kolonne+1]]
            for nabo_rad, nabo_kolonne in liste:
              nabo_celle = self.hent_celle(nabo_rad, nabo_kolonne)
              if nabo_celle != None:
                   celle.legg_til_nabo(nabo_celle)
        else:
            print('det finnes ikke denne cellen')
    def koble_celler(self):
        for rad_index in range(self._ant_rader):
            for kol_index in range(self._ant_kolonner):
                self._sett_naboer(rad_index,kol_index)
    def hent_alle_celler(self):
        listeMedCeller = []
        for rad_index in range(self._ant_rader):
            for kol_index in range(self._ant_kolonner):
                listeMedCeller.append(self._rutenett[rad_index][kol_index])
        return listeMedCeller
    def antall_levende(self):
        antall_levende = 0
        for rad in self._rutenett:
            for celle in rad:
                if celle.er_levende():
                    antall_levende+=1
        return antall_levende

     
            

             

        
        
    
         
         
      
        
                   
             
              
        
            
    
    
    
    

         
    


    
                    
                
                  
                   
                   
         
         
         


    

    
    