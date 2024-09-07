# dette programmet basert på innspill fra brukeren viser bussbillettprisen. 
# Jeg har spesifikt plassert hvis/annet i en slik rekkefølge slik at, med 
# forbehold om at alderen er over 63 år, koden ikke går gjennom resten av 
# betingelsene og umiddelbart viser utdataene

def alderData():
    alder = int(input('hvor gammel er du? '))
    billettpris = 0
    if alder < 63:
        if alder < 18:
            billettpris = 30
            print(f'billettprisen for deg er: {billettpris} NOK')  
        else: 
            billettpris = 50
            print(f'billettprisen for deg er: {billettpris} NOK') 
    else:
        billettpris = 35 
        print(f'billettprisen for deg er: {billettpris} NOK') 


alderData()



