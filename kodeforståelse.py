# 1. Nei, programmet vil ikke kjøre fordi b er en heltal og vi prøver
#    å slå det sammen med streng, i stedet måtte vi bruke komma her   
# 2. Det skal være en TypeError

a = input("Tast inn et heltall! ")
b = int(a)
if b < 10:
    print (b + "Hei!")
