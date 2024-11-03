from rutenett import Rutenett

class Verden:
    def __init__(self, antall_rader, antall_kolonner):
        self._rutenett = Rutenett(antall_rader,antall_kolonner)
        self._generasjonsnummer = 0
        self._rutenett.fyll_med_tilfeldige_celler()
        self._rutenett.koble_celler()
    def tegn(self):
        self._rutenett.tegn_rutenett()
        print(f'generasjonsnummer er {self._generasjonsnummer}\nog {self._rutenett.antall_levende()} levende celler igjen')
    def oppdatering(self):
        listeMedCeller = self._rutenett.hent_alle_celler()
        for celle in listeMedCeller:
            celle.tell_levende_naboer()
        for celle in listeMedCeller:
            celle.oppdater_status()  
        self._generasjonsnummer += 1

    

    