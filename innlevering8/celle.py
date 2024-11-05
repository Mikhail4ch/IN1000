# Klasse Celle inneholder en konstruktør med tre instansvariabler og syv metode,
# hvor fire av dem kan endre instansvariabler verdier. 

class Celle:
#konstruktøren
    def __init__(self):
        self._status = 'doed'
        self._naboer = []
        self._ant_levende_naboer = 0
#endrer verdien til instansvariablen self._status
    def sett_doed(self):
        self._status = 'doed'
#også endrer verdien til instansvariablen self._status
    def sett_levende(self):
        self._status = 'levende'
#sjekker instansvariablen self._status og returnerer True
#hvis det lik 'levende' og False hvis det lik 'doed'
    def er_levende(self):
        return self._status != 'doed'
#kaller er_levende metoden for å sjekke hvis celle er 
#'levende' eller 'doed' og basert på resultaten returnere
#representasjon av celle på formen 'O' eller '.' (for 'doed')
    def hent_status_tegn(self):
        if self.er_levende():
            return 'O'
        else:
            return '.'
#legger til et element (nabocelle) i listen self._naboer
    def legg_til_nabo(self, nabo):
        self._naboer.append(nabo)
#telle levende naboceller ved å sjekke instansvariablen 
#self._status til deres
    def tell_levende_naboer(self):
        self._ant_levende_naboer = 0
        for nabo in self._naboer:
            if nabo.er_levende():
                self._ant_levende_naboer+=1
        return self._ant_levende_naboer
#oppdater status av celle baser på antall 'levende' naboceller
    def oppdater_status(self):
        if self._ant_levende_naboer < 2 or self._ant_levende_naboer > 3:
            self.sett_doed()
            return self._status
        else:
            self.sett_levende()
            return self._status


    
    


