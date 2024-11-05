#Klasse Verden inneholder konstruktør med fire instansvariabler, hvor to av disse ble
#initialisert med hjelpmetoder for klasse-Rutenett, en som settes lik 0 og en som 
#oppretter klasse-Rutenett ved å bruke to parametere. Det finnes totalt to metoder som
#som er ansvarlige for visning av 0 generasjon av rutenettet og det oppdateringer (overgang til neste generasjoner)
from rutenett import Rutenett

class Verden:
    def __init__(self, antall_rader, antall_kolonner):
        self._rutenett = Rutenett(antall_rader,antall_kolonner)
        self._generasjonsnummer = 0
        self._rutenett.fyll_med_tilfeldige_celler()
        self._rutenett.koble_celler()
#viser nåværende generasjon av rutenettet i terminalen til brukeren ved å kalle klasse-Rutenett
#metoden tegn_rutenett() og utskrift av ekstra output
    def tegn(self):
        self._rutenett.tegn_rutenett()
        print(f'generasjonsnummer er {self._generasjonsnummer}\nog {self._rutenett.antall_levende()} levende celler igjen')
#ved å iterere over listen 'listeNed Celle' metoden oppdaterer instansvariablen 'self._generasjonsnummer' 
#og hver celle i rutenett basert på status til naboceller 
    def oppdatering(self):
        listeMedCeller = self._rutenett.hent_alle_celler()
        for celle in listeMedCeller:
            celle.tell_levende_naboer()
        for celle in listeMedCeller:
            celle.oppdater_status()  
        self._generasjonsnummer += 1

    

    