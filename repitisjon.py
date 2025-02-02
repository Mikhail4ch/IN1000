'''
print('1 + 1\nhva er svaret?')
print()
svaret = int(input('svaret er: '))
if svaret == 2:
    print('riktig!')
else:
    print('det er usant')

inntekt = int(input('tast inn din inntekt\n< '))
skatt = 0
if inntekt <= 10000:
    skatt = inntekt * 0.1
else:
    skatt = 1000 + ((inntekt - 10000)*0.3)
print()
print(f'Skatt: {skatt}')

result = 0
tall1 = int(input('første tall: '))
operasjon = str(input('operasjon: '))
tall2 = int(input('andre tall: '))
if operasjon == '+':
    result = tall1 + tall2
elif operasjon == '-':
    result = tall1 - tall2
elif operasjon == '*':
    result = tall1 * tall2
elif operasjon == '/':
    result = tall1 / tall2
else:
    result = 'ulovlig operasjon'
print(f'{tall1} {operasjon} {tall2} = {result}')

def prosedyre():
    brukerInput = str(input('skriv tre tall med melomroom mellom dem\n< '))
    tallene = brukerInput.split()
    if len(tallene) != 3:
        return print('ugyldig input fra brukeren')
    for tall in tallene:
        if int(tall) < 0 or int(tall) > 255:
            return print('ugyldig input fra brukeren')
    return print('alt gikk bra!')
result = prosedyre()

personer = {

}
navnet = str(input('hva heter du?\n< '))
alder = int(input('hvor gammel er du?\n< '))
personer[navnet] = alder
brukerInput = str(input('fortsette input?\n< '))
while brukerInput == 'j':
    navnet = str(input('hva heter du?\n< '))
    alder = int(input('hvor gammel er du?\n< '))
    personer[navnet] = alder
    brukerInput = str(input('fortsette input?\n< '))
print()
bookstav = str(input('skriv en bokstav\n< '))
while len(bookstav) != 1:
    bookstav = str(input('skriv en bokstav\n< '))
print()
for navner in personer:
    if navner[0] == bookstav.capitalize():
        print(f'det er {navner} som er {personer[navner]} år')

def fil_na_filter(filenavn, nyFile):
    liste =[]
    file1 = open(filenavn, "r")
    for line in file1:
        biter = line.split(',')
        if biter[4] != 'NA':
            liste.append(line)
    file1.close()
    file2 = open(nyFile, "w")
    for item in liste:
        file2.write(item)
    file2.close()

result = fil_na_filter('input_med_na.csv', 'output_uten_na.csv')

def fil_na_filter(inputfilnavn, outputfilnavn):
    inputfil = open(inputfilnavn, "r")
    outputfil = open(outputfilnavn, "w")

    for linje in inputfil:
        if "NA" not in linje:
            outputfil.write(linje)

    # Har du husket å lukke filene?
    inputfil.close()
    outputfil.close()

fil_na_filter("input_med_na.csv", "output_uten_na.csv")

def opprett_filen():
    fil = open("test.in", "w")

    for i in range(10):
        linje = "linje " + str(i + 1)
        fil.write(linje)
        fil.write("\n")

    fil.close()

opprett_filen()


class Frukt:
    def __init__(self, navn, vann, spiselig):
        self._navn = navn
        self._vann = vann
        self._spiselig = spiselig
    def hentNavn(self):
        return self._navn
    def hentVann(self):
        return self._vann
    def erSpiselig(self):
        return self._spiselig
    def settNavn(self, navn):
        self._navn = navn
    def settvann(self, vann):
        self._vann = vann
    def settspiselig(self, spiselig):
        self._spiselig = spiselig 

roedtEple = Frukt("Rødt Eple", 89, True)
hasselNoett = Frukt("Hasselnøtt", 12, True)
sukkerert = Frukt("Sukkerert", 89, True)
trollhegg = Frukt("Trollhegg", 90, False)

fruktListe = [roedtEple, hasselNoett, sukkerert, trollhegg]

spiseligeVannFrukter = []

for frukt in fruktListe:
    if frukt.erSpiselig() and frukt.hentVann > 85:
        spiseligeVannFrukter.append(frukt)

print("Spiselige Vannfrukter:")
for frukt in spiseligeVannFrukter:
    print(frukt.hentNavn())

class blåbær :
    def __init__(self):
        self._vekt = 0.3

class blåbærplante:
    def __init__(self, størrelse):
        self._størrelse = størrelse
        self._blåbærListe = []
    def vannePlante(self):
        self._størrelse += 3
    def gjødslesPlante(self):
        for i in range(5):
            self._blåbærListe.append(blåbær())
    def plukkeBær(self):
        self._blåbærListe.pop()
    def hent_antall_baer(self):
        return len(self._blåbærListe)
    def hent_stoerrelse(self):
        return self._størrelse

plante = blåbærplante(10)
plante.vannePlante()
plante.gjødslesPlante()
plante.gjødslesPlante()

plukkede_baer = []
for i in range(3):
    plukkede_baer.append(plante.plukkeBær())

print("Stoerrelse: ", plante.hent_stoerrelse())
print("Antall baer: ", plante.hent_antall_baer())
print("Antall plukkede baer: ", len(plukkede_baer))


gammelString = "abc"
nyString = gammelString
nyString += "d"
print(gammelString)
print(nyString)

class Person:
    def __init__(self, navn):
        self._navn = navn
        self._ektefelle = None
    def gift_seg(self, annenPerson):
        self._ektefelle = annenPerson
    def status(self):
        if self._ektefelle:
            return f'{self._navn} er gift seg med {self._ektefelle.hent_navn()}'
        else:
            return 'er singel'
    def hent_navn(self):
        return self._navn

mr_smith = Person("Brad Pitt")
mrs_smith = Person("Angelina Jolie")
print(mr_smith.status())
mr_smith.gift_seg(mrs_smith)
mrs_smith.gift_seg(mr_smith)
print(mr_smith.status())

class Bok:
    def __init__(self, titel, forfatter, utgivelseår):
        self._titel = titel
        self._forfatter = forfatter
        self._utgivelseår = utgivelseår
    def hent_titel(self):
        return self._titel
    def hent_utgivelseår(self):
        return self._utgivelseår
    def __str__(self):
        return f'Denne boka heter {self._titel}\nforfatter er {self._forfatter}\nboka er skrevet i {self._utgivelseår} år'
    
class Bokhylle:
    def __init__(self, maxAntall):
        self._bøkerListe = []
        self._maxAntall = maxAntall
    def er_ledig_plass(self):
        return len(self._bøkerListe) < self._maxAntall
    def legg_til_bok(self, bok):
        if self.er_ledig_plass():
            self._bøkerListe.append(bok)
            return True
        return False 
    def finn_bok(self, titel, utgivelseår):
        for bok in self._bøkerListe:
            if bok.hent_titel() == titel and bok.hent_utgivelseår() == utgivelseår:
                return bok 
        return False 
    def __str__(self):
        string = ""
        for bok in self._bøkerListe:
            string += str(bok)
            string += "\n"
        return string


class Bibliotek:
    def __init__(self, størrelse=5):
        self._bokhylleListe = []
        self._størrelse = størrelse
    def finn_bok_i_bibliotek(self, boknavn, utgivelsesår):
        for bokhylle in self._bokhylleListe:
            if bokhylle.finn_bok(boknavn, utgivelsesår) != False:
                return bokhylle.finn_bok(boknavn, utgivelsesår)
        return False
    def utvid_bibliotek(self):
        nyBokhylle = Bokhylle(self._størrelse)
        self._bokhylleListe.append(nyBokhylle)
        return nyBokhylle
    def legg_til_bok_i_bibliotek(self, nyBok):
        for bokhylle in self._bokhylleListe:
            if bokhylle.legg_til_bok(nyBok):
                return 'boken var legget'
        nyBokhylle = self.utvid_bibliotek()
        nyBokhylle.legg_til_bok(nyBok)
        return 'boken var legget'
    def __str__(self):
        string = "-- BIBLIOTEK --"
        teller = 1
        for bokhylle in self._bokhylleListe:
            string += "\n- Bokhylle nr. " + str(teller)
            string += str(bokhylle)
            teller += 1
        return string 
'''   

        

        

    


    
    

    

    

        


    






        




        
