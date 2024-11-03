# Dette programmet inneholder funksjoner som åpner datafiler og 
# sammenligner disse dataene for å sjekke om rekorder for den 
# høyeste temperaturen i en måned ble brutt i 2018. Også, hvis 
# det var slike temperaturer, endrer ordboken med rekordtemperaturer for måneden sine verdier.

def maxPerMonth(filnavn):
    ordbok = {}
    fil = open(filnavn)
    for linje in fil:
        kolloner = linje.split()
        ordbok[kolloner[0]] = kolloner[1]
    return ordbok

def rekordTemp(ordbok, filnavn):
    fil = open(filnavn)
    for linje in fil:
        kolloner = linje.split()
        for key in ordbok:
# temperaturene fra begge filene må ha flytetypen bare da vil sammenligningen være riktig
            if kolloner[0] == key and float(ordbok[key]) < float(kolloner[2]):
                print(f'Ny varmerekord på {kolloner[1]} {kolloner[0]}: {kolloner[2]} grader celcius (gammel varmerekord var {ordbok[key]} grader celcius)')
                print()
                ordbok[key] = kolloner[2]
    return ordbok

# first, the initial list with records is displayed on the screen,
# then examples of cases when the temperature in 2018 was higher 
# and finally the final dictionary with changed record values

resultatet = maxPerMonth('maxPerMonth.csv')
print(resultatet)
print()
NyOrdbok = rekordTemp(resultatet, 'maxDailyTemp.csv')
print(NyOrdbok)





    
    