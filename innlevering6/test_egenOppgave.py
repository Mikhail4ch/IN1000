# den første delen av funksjonen sjekker om klassemetoder returnerer 
# de riktige verdiene, i den andre delen av funksjonen blir brukeren 
# spurt om navn, alder og hobby. Det lages også en while-løkke der brukeren 
# kan liste opp hobbyer så mange ganger han vil, atskilt med et mellomrom. 
# Programmet stopper og terminalen viser brukerens navn, alder og hobbyer 
# atskilt med kommaer hvis brukeren skriver inn 0

from egen_Oppgave import Person 

def hovedprogram():
    print('tester')
    print()
    personTest = Person('Mikhail', 21)
    print(personTest.legg_til_hobby('crypto gym football anime poetry'))
    print()
    personTest.skriv_hobbyer()
    print()
    personTest.skriv_ut()
    print('-------------------------------------')
    print('actual program')
    print()
    name = str(input('hva heter du?\n< '))
    print()
    alder = int(input('hvor gammel er du?\n< '))
    print()
    person = Person(name, alder)
    brukerInput = str(input('Skriv inn hobbyene dine atskilt med et mellomrom\neller skriv 0 for å slutte programmet\n< '))
    print()
    
    while brukerInput != '0':
        person.legg_til_hobby(brukerInput)
        brukerInput = str(input('Skriv inn hobbyene dine atskilt med et mellomrom\neller skriv 0 for å slutte programmet\n< '))
        print()
    person.skriv_ut()


hovedprogram()


