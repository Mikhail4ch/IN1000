#teste funksjoner til hovedprogram
from verden import Verden

def test_konstruktoer():
    verden = Verden(5,5)
#test_konstruktoer()

def test_tegn():
    verden = Verden(5,5)
    verden.tegn()
#test_tegn()

def test_oppdatering():
    verden = Verden(5,5)
    verden.tegn()
    verden.oppdatering()
    verden.tegn()
#test_oppdatering()

def hovedprogram():
    rader = int(input('skriv antall rader\n< '))
    kolonner = int(input('skriv antall kolonner\n< '))
    verden = Verden(rader,kolonner)
    verden.tegn()
    print()
    nextRound = str(input('trykk enter hvis du vil fortsette!\neller skriv "q" hvis du vil stoppe spillet\n> '))
    while nextRound !='q':
        verden.oppdatering()
        verden.tegn()
        nextRound = str(input('trykk enter hvis du vil fortsette!\neller skriv "q" hvis du vil stoppe spillet\n> '))
hovedprogram()
 