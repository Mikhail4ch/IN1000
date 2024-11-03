from verden import Verden

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
    