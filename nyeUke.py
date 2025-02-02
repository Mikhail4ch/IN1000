'''
tall1 = 15.7
tall2 = 9.4
sum1 = tall1 + tall2
tall3 = 37
tall4 = 11
sum2 = tall3 + tall4

if sum1 > sum2:
    print(f'den støreste summen er: {sum1}')
else:
    print(f'den støreste summen er: {sum2}')



balance = 500

def deposit():
    global balance 
    deposit = int(input('the size of deposit: '))
    balance += deposit
    print('---------------')
    print(balance)
    return balance



def withdrawal():
    global balance 
    withdrawal = int(input('the size of withdrawal: '))
    balance-= withdrawal
    print(balance)
    return balance

def check(balance):
    print(balance) 

check(balance)
deposit()
withdrawal()
check(balance)


balance = 500

def deposit(balance: int): 
    deposit = int(input('the size of deposit: '))
    balance += deposit
    print('---------------')
    print(balance)
    return balance



def withdrawal(balance: int):
    withdrawal = int(input('the size of withdrawal: '))
    if balance > withdrawal:
            balance-= withdrawal
            return balance
    else:
         print('har ikke nok penger')

def check(balance):
    print(balance)
    return balance

def userInterface(balance):
     print('press 1 is you want to check balance\npress 2 to deposit\npress 3 to withdraw')
     choice = int(input('make a choice: '))
     if choice == 1:
          balance = check(balance)
          return balance
     elif choice == 2:
          balance = deposit(balance)
          return balance
     elif choice == 3:
          balance = withdrawal(balance)
          return balance
     else:
          print('cant do this')


balance = userInterface(balance)
balance = userInterface(balance)
balance = userInterface(balance)
balance = userInterface(balance)

digits =[]
points = 0

i = 0
while i < 5:
    digit = int(input('digit: '))
    digits.append(digit)
    i += 1
    if digit == 4:
        points += 4

unlike_digits = set(digits)
if len(unlike_digits) == 1:
    print()
    print('!!!!yatsy!!!!')
    print() 
elif len(unlike_digits) == 2:
            print()
            print('you got smth and house')
            print()
elif len(unlike_digits) == 3:
        print()
        print('you got just a house')
        print()

print(digits)
print(f'points: {points}')
d = {
    'first': 1,
    'second': 2,
     1: 50,
    'bot': False,
    'greek': True,
}

for key in d:
    print(key, d[key])

d = {
    'Norge': 'Oslo',
    'Svergie': 'Stockholm',
}
land = str(input('land: '))
print(d[land])

person = str(input('Konge: '))
etterkomme = {
    'Oskar': 'Haakon',
    'Haakon': 'Olav',
    'Olav': 'Harald',
}
barn = etterkomme[person]
barnebarn = etterkomme[barn]

print('Barnebarn ' + barnebarn)

tab = [[5,3], [3,5]]
rad1 = tab[0][0] + tab[0][1]
rad2 = tab[1][0] + tab[1][1]
col1 = tab[0][0] + tab[1][0]
col2 = tab[0][1] + tab[1][1]
alle_like = rad1 == rad2 ==col1 == col2
print(alle_like)

navn = ['Ola', 'Martin', 'Selma']
navn.append('Kari') 
print(navn)
print(navn[1])
navn.insert(0,'Misha')
navn.insert(0,'Jasha')
navn.remove('Martin')
print(navn)
navn[3] = 'Victoria'
print(navn)

brukere = {
    'hanjo': 'Hanne Johnsen',
    'karsi': 'Kari Sirisen',
    'olha': 'Ole Hansen'
}
brukere['karsi'] = 'Kari Marie Sirisen'
brukere['onetap'] = 'Mikhail Makarevich'
print(brukere['hanjo'])
brukere.pop('hanjo')
print(brukere)
names = list(brukere.values())
print(names)

ordliste = ["I", "dag", "er", "jeg", "så", "lykkelig", "så", "lykkelig", "så", "lykkelig", "det", "hele", "endte", "dejligt", "jeg", "synger", "og", "er", "glad", "Ja", "alting", "endte", "lykkeligt", "så", "lykkeligt", "så", "lykkeligt", "i", "dag", "er", "jeg", "så", "lykkelig", "som", "dagen", "den", "er", "lang"]
print(len(ordliste))

print(len(set(ordliste)))
print('-----------------------')
print(ordliste.count('lykkelig'))
print(ordliste.count('så'))
print(ordliste.count('dag'))
print('-----------------------')

dictionary = {
    'lykkelig': 4,
    'så': 6,
    'dag': 2,
}
print(list(dictionary.values()))

months = ['January', 'February', 'March',
           'April', 'May', 'June',
             'July', 'August', 'September'
         , 'October', 'November', 'December']

numberOfMonth = int(input('enther a number: '))
print(months[numberOfMonth-1])

ord = str(input('skriv et ord: '))
print(ord.upper())
print(len(ord))
foerste = ord[0]
print(foerste)
print(ord.count(foerste))

hovedstadene = {
'Norge': 'Oslo',
'Nederland': 'Amsterdam',
'Spania': 'Madrid',
}
språk = {
'Norge': 'norsk',
'Nederland': 'nederlandsk',
'Spania': 'spansk',
}
innbyggere = {
'Norge': '5391369',
'Nederland': '17282163',
'Spania': '46733038',
}

land = str(input('hvilken land? '))
if land in hovedstadene:
    print(f'{hovedstadene[land]}\n'
      f'{språk[land]}\n'
      f'{innbyggere[land]}')
else:
    print('jeg vet ikke dette landet')

telefonbok = {
 "Arne"     : 22334455,
 "Lisa"    : 95959595,
 "Jonas"   : 97959795, 
 "Peder"  : 12345678 
}
print(telefonbok)
navn = str(input('skriv navnet: '))
if navn in telefonbok:
    print(telefonbok[navn])
else:
    nummer = int(input('skriv nummer til denne personen: '))
    telefonbok[navn] = nummer
    print(telefonbok)

flaggOrdbok = {"norge" : ["rødt", "hvitt", "blått"], 
               "sverige" : ["blått", "gult"],
               "danmark" : ["rødt", "hvitt"],
               "finland" : ["hvitt", "blått"],
               "japan" : ["rødt", "hvitt"],
               "gabon" : ["grønt", "gult", "blått"],
               "storbritannia" : ["rødt", "blått", "hvitt"],
               "chile" : ["blått", "hvitt", "rødt"]}


flaggOrdbok['ukraine'] = ['blue','yellow']
print(flaggOrdbok)
land = str(input('skriv et land: '))
land = land.lower()
farge = str(input('skriv en farge: '))
farge = farge.lower()
if land in flaggOrdbok:
    print(flaggOrdbok[land])
    if farge in flaggOrdbok[land]:
        print('fargen forekommer i landets flagg')
    else:
        print('fargen forekommer ikke i landets flagg')
else:
    print('det finnes ikke dette landet')


colours = {
   'svart': [0, 0, 0],
   'hvit': [255, 255, 255],
   'rød': [255, 0, 0],
   'gull': [255, 255, 0],

}

def check():
    colour = input('enter a RGB digit: ')
    colour_list = colour.split()
    if len(colour_list) == 3:
        print('it contains 3 digits')
        first = int(colour_list[0])
        second = int(colour_list[0])
        third = int(colour_list[0])
    else:
        print('error')
    if 0 < first and second and third < 256 :
        print('all right')
    else:
        print('failure')

check()

navn = input("Hva heter du? ") 
alder = int(input("Hva er ditt alder? "))

print("Hei, ", navn, ", fint navn!") 

foerste_bokstav = navn[0] 
    
if foerste_bokstav == "P": 
    print("Navnet ditt starter med P, som Python!") 
else: 
    print("Jeg kjenner ingen ord som starter med ", foerste_bokstav)
 
alder_i_fem_aar = alder + 5 

print("i fem år skal du være", alder_i_fem_aar) 

if alder >= 18: 
    if alder < 100: 
        drikke = "øl" 
    else: 
        drikke = "livets eliksir" 
else: 
    drikke = 'brus'

print("Hei ", navn, ", har du lyst på ", drikke, "?") 



random_list = ['A', 'A', 'B', 'C', 'B', 'D', 'D', 'A', 'B']
frequency = {}

for item in random_list:
   if item in frequency:
      frequency[item] += 1
   else:
      frequency[item] = 1

print(frequency)

highestFrequency = 0 

for i in frequency:
   if frequency[i] > highestFrequency:
      highestFrequency = frequency[i]
      wordWithHighetFrequency = i

print(f'the most frequently used word: {wordWithHighetFrequency}')

a = [1, 2, 3]
b = [4, 5, 6]

for i1, i2 in zip(a,b):
    print(i1, i2)

a = input("Tast inn et heltall! ")
b = int(a)
if b < 10:
    print(b + "Hei!")

snacks = ['snickers', 'mars', 'milkyway', 'twix', 'smash', 'lion']
input = str(input('enter your favorite snack: ')).lower()

if input in snacks:
    print(f'recognized {input}')
else:
    print('I didnt get it :(')
    

digitale_enheter = ["MacBook Pro 2021", "Samsung Galaxy 23", "MacBook Pro 2021", "iPhone 13", "Samsung Galaxy 23", "MacBook Pro 2021", "iPhone 15",  "Samsung Galaxy 23", "Samsung Galaxy 22", "MacBook Pro 2024"]

digitale_enheter_2 = set(digitale_enheter)
print(digitale_enheter_2)

taco = {
    'vegetables': ['salad', 'cucumber', 'tomato', 'paprika', 'jalapeno', 'corn', 'carrot', 'onion'],
    'sauces': ['salsa', 'sour cream'],
    'other ingredients': ['guacamole', 'beans', 'minced meat', 'tortilla']
}

user_input = str(input('five elements for your taco: ')).lower()
user_input_list = user_input.split()
vegetables = []
sauces = []
other_ingredients = []

for item in user_input_list:
    if item in taco['vegetables']:
        vegetables.append(item)
    elif item in taco['sauces']:
        sauces.append(item)
    else:
        other_ingredients.append(item) 

print(f'vegetables: {vegetables}, sauces: {sauces}, other ingredients: {other_ingredients}')



persons = {
}
def registration():
    ID = str(input('your ID please: '))
    persons[ID] = str(input('enter your address/telefnumber/destination: ')).split()

registration()
registration()
registration()
registration()
registration()

print(persons)

i = 1
while i <= 10:
   if i % 2 == 1:
       i += 1
       continue
   print(f'{i} Hello world!')
   i += 1

for i in range(7):
   print(i)

counter = 0 
sum = 0
a = 1

while counter < 100:
    sum += a 
    a += 1
    counter += 1 

print(sum)

counter = 0 
sum = 0

while counter < 100:
    counter += 1 
    sum += counter 

print(sum)

counter = 0 
sum = 0
for i in range(100):
    counter += 1 
    sum += counter 

print(sum)

from random import randint

digit = 0
moreThan10 = 0
while digit < 1000:
    one = randint(1,6)
    two = randint(1,6)
    if one + two >= 10:
        moreThan10 += 1
    digit += 1

print(f'{moreThan10 / 1000 * 100}')

list = [12 , 16 , 5 , 16]

for i in list:
    
    if i > 10 or i < 20:
        innenfor = False

assert innenfor == False
print (innenfor)


liste = ["Sauer", "er", "myke", "dyr."]
i = 0
while i < len(liste):
    print(liste[i])
    i += 1

amountOfStars = 1

for i in range(9):
    print('*' * amountOfStars)
    amountOfStars += 1

o_liste = []

for i in range(5):
    o_liste.append('o')

stjerneliste = []

for i in range(5):
    stjerneliste.append('*')

rutenett = [o_liste, stjerneliste]
rutenett.append(o_liste)

for i in range(3):
    print(rutenett[i])

eksempel_3d_matrise = [
    [[0, 1, 2], [3, 2, 1]], 
    [[1, 1, 0], [4, 2, 3], [2, 1, 0]]
    ]

newList = []

for i1 in eksempel_3d_matrise:
    for i2 in i1:
        for i3 in i2:
            newList.append(i3)
        
print(newList)

list = [6, -4, 7, -2, 8, -3, 9, -11]

def minst():
    smallest = 100
    for i in list:
        if i < smallest:
            smallest = i
    print(smallest)
    

def max():
    biggest = 0
    for i in list:
        if i > biggest:
            biggest = i
    print(biggest)

minst()
max()

list = [1, 2, 3, 4, 5]

for i in range(len(list)):
    list[i] = i ** 2
    
print(list)


beholdning = {

}

fortsett = input("Ønsker du å fortsette (ja/nei)\n> ")
while fortsett == "ja":
    groennsak = input("Skriv inn en grønnsak:\n> ")
    pris = input("Hvor mye koster " + "'" + groennsak + "'?\n> ")
    if pris.isdigit():
        beholdning[groennsak] = int(pris)
        fortsett = input("Ønsker du å fortsette (ja/nei)\n> ")
    else:
        print("Ugyldig input: prisen må være et tall!")

print("\nBeholdning:")
for gs in beholdning:
    print(gs, ":", beholdning[gs], "NOK")


tall = int(input('skriv en tall: '))
binærtall = []

while tall >= 1:
    firstAction = tall % 2 
    if firstAction != 0:
        binærtall.append(1)
    else:
        binærtall.append(0)
    tall = tall // 2

print(binærtall)

i = int(input("Tast inn et tall: "))

while i != 0:
    print(i%2)
    i = i//2  

personer = {

}

fortsett = input("Ønsker du å fortsette? (j/n)\n> ")

while fortsett == 'j':
    navn = str(input('skriv navnet ditt: \n> '))
    alder = int(input('skriv alder din: \n> '))
    personer[navn] = alder
    fortsett = input("Ønsker du å fortsette? (j/n)\n> ")

print(personer)

letter = str(input('skriv en bokstav: \n> '))

while len(letter) == 1:
    for i in personer:
        if i[0] == letter:
            print(f'name: {i} \nage: {personer[i]}')
    letter = str(input('skriv en bokstav: \n> '))


tegnliste = ['h', 'e', 'i', ',', ' ', 'd', 'u', '!',]

setningen = ''
for i in tegnliste:
    setningen+=i
print(setningen)

tegnliste = {'h', 'e', 'i', ',', ' ', 'd', 'u', '!',}

setningen = ''
for i in tegnliste:
    setningen+=i
print(setningen)

maks_alder = 0
my_file = open("alder.csv")
for person in my_file:
    splitted = person.split(":")
    navn = splitted[0]
    alder = int(splitted[1])
    if alder > maks_alder:
        maks_alder = alder 
print(maks_alder)

def pris(gratis, alder):
    if gratis == True:
        return 0 
    else:
        if alder < 18:
            return 100
        else:
            return 200
    
result = pris(False, 19)
print(result)

new_file = open("navn.txt", "r")

name_list = []

for line in new_file:
    line = line.strip()
    name_list.append(line)
new_file.close()

print(name_list)

def les_bil(new_file):
    resultatet = {}

    for line in open(new_file):
        line = line.strip()
        splited = line.split(":")
        key = splited[0]
        value = splited[1]
        resultatet[key] = value
    return resultatet

print(les_bil("bil.txt"))

def les_song_contest(filnavn):
    årene = []
    landene = []
    song_contest = {}

    for line in open(filnavn):
        line = line.strip()
        splited = line.split()
        årene.append(splited[0])
        landene.append(splited[1])
    
    song_contest = {
        'år' : årene,
        'land' : landene
    }
    return song_contest

print(les_song_contest("song.txt"))

def les_poeng(filnavn):
    resultatet = {}

    for linje in open(filnavn):
        linje = linje.strip()
        kolonner = linje.split(":")
        navn = kolonner[0]
        poeng = kolonner[1].split(",")

        total = 0
        for p in poeng:
            total += int(p)

        resultatet[navn] = p

    return resultatet

print(les_poeng("poeng.txt"))

def skriv_dna(filenavn):
    file = open(filenavn, "a")
    file.write('O---o\n O-o\n  O\n o-O\no---O\n')
    file.close()



skriv_dna("prints.csv")
skriv_dna("prints.csv")
skriv_dna("prints.csv")

def double(tall):
    return tall * 2

result = double(49)
print(result)

def challenge(Bool, tall):
    if len(Bool) > tall:
        return True 
    else:
        return False 

result = challenge(Bool = str('sonic'), tall = int(6))
print(result)

def antall(tall):
    return len(str(tall))

result = antall(99966)
print(result)

def format_text(tekst, filnavn, maksord):
        fileContent = tekst.split()
        print(fileContent)
        file = open(filnavn, "w")
        counter = 0
        for item in fileContent:
                counter+= 1
                file.write(item)
                file.write(" ")
                if counter == maksord:
                        counter = 0
                        file.write("\n")               
        file.close()
        
tekst = 'I denne oppgave skal du lage et program som tar inn en tekst og skriver den ut til en fil. I utdatafilen er det maksimalt antall ord som er tillatt per linje.'

format_text(tekst, "random.txt", 5)

def fil_na_filter(input_filnavn, output_filnavn):
    input_fil = open(input_filnavn, "r")
    output_fil = open(output_filnavn, "w")

    for linje in input_fil:
        if "NA" not in linje:
            output_fil.write(linje)

    input_fil.close()
    output_fil.close()

fil_na_filter("input_med_na.csv", "output_uten_na.csv")

def opprett_filen(test):
    file = open(test, "w")
    
    for i in range(10):
        line = 'line' + ' ' + str(i+1)
        file.write(line)
        file.write('\n')

    file.close()
opprett_filen('test.txt')

def skriv_ut_foerste_linjer(filnavn, antall_linjer):
    file = open(filnavn)
    counter = 0
    for line in file:
        if counter != antall_linjer:
            counter+=1
            print(line)

    file.close()

# or
# def skriv_ut_siste_linjer(filnavn, antall_linjer):
#   fil = open(filnavn, "r")
#    linjene = []
#
#    for linje in fil:
#        linjene.append(linje.strip())
#
#    fil.close()
#
#    indeks = len(linjene) - antall_linjer
#   for linje in linjene[indeks:]:
#        print(linje)


def skriv_ut_siste_linjer(filnavn, antall_linjer):
    file = open(filnavn)
    counter = 0
    for line in file:
        counter+=1
        if counter >= antall_linjer:
            print(line)
    file.close()

skriv_ut_foerste_linjer("test.txt", 5)
print()
skriv_ut_siste_linjer("test.txt", 10)

a = ["a", "b", "c"]
b = [1, 2, 3]

def vanlig_konkat(a, b):
    return a + b

result = vanlig_konkat(a, b)
print(result)

a = ["a", "b", "c"]
b = [1, 2, 3]

def annenhver_konkat(a, b):
    final = []
    for i in range(3):
        final.append(a[i])
        final.append(b[i])
    return final
        
result_2 = annenhver_konkat(a,b)
print(result_2)

def tall_til_liste(helltall):
    liste = []
    for i in str(helltall):
        liste.append(int(i))
    return liste 

result_3 = tall_til_liste(878)
print(result_3)

def oppskrift_fra_sukker(tall):
    dictionary = {
        'sukker': tall,
        'mel': tall*2,
        'smør': tall*3,
    }
    return dictionary


def skriv_oppskrift(sukker,mel,smør):
    print("Oppskrift på kaker")
    print("Du trenger:")
    return f'mengden av sukker er:\n< {sukker}\nmengden av mel er:\n< {mel}\nmengden av smør er:\n< {smør}'


def bak_kaker():
    sukker = int(input('hvor mye sukker har du?\n< '))
    result = oppskrift_fra_sukker(sukker)
    result_2 = skriv_oppskrift(result['sukker'],result['mel'],result['smør'])
    return result_2

final = bak_kaker()
print(final)

list = [2,5,3,44]
integer = 8

def function(list, integer):
    newList = []
    for i in range(len(list)):
        newList.append(list[i] + integer)
    return newList 

result = function(list,integer)
print(result)

eksempel_matrise = [[0, 1, 2], [3, 2, 1], [1, 1, 0]]

def matrix(list):
    matrix1 = []
    matrix2 = []
    matrix3 = []
    for i in range(3):
        matrix1.append(list[0][i] + 1)
    for i in range(3):
        matrix2.append(list[1][i] + 2)
    for i in range(3):
        matrix3.append(list[2][i] + 3)
    newMatrix = [matrix1, matrix2, matrix3]
    return newMatrix

# ------------another way to do-------------------
# eksempel_matrise = [[0, 1, 2], [3, 2, 1], [1, 1, 0]]

# def matrix(lst):
#    return [[lst[i][j] + i + 1 for j in range(3)] for i in range(3)]

# result = matrix(eksempel_matrise)
# print(result)
#-------------------------------------------------

def skriv_ut(result):
    return f'{result[0]}\n{result[1]}\n{result[2]}'

result_2 = skriv_ut(eksempel_matrise)
print(result_2)
print()
result = matrix(eksempel_matrise)
print(result)
print()
result_2 = skriv_ut(result)
print(result_2)

import math 

def oppskrift_fra_sukker(sukker):
    dictionary = {
    'sukker': sukker,
    'mel': sukker*2,
    'smør': sukker*3,
}
    return dictionary
    
def oppskrift_fra_mel(mel):
    dictionary = {
    'sukker': math.trunc(mel/2),
    'mel': mel,
    'smør': math.trunc(mel*1.5),
}
    return dictionary

def oppskrift_fra_smør(smør):
    dictionary = {
    'sukker': math.trunc(smør/3),
    'mel': math.trunc(smør/1.5),
    'smør': smør,
}
    return dictionary
    

def skriv_oppskrift(sukker,mel,smør):
    print("Oppskrift på kaker")
    print("Du trenger:")
    return f'mengden av sukker er:\n< {sukker}\nmengden av mel er:\n< {mel}\nmengden av smør er:\n< {smør}'


def bak_kaker():
    
    valg = int(input('vil du basere oppskriften på:\nhvis sukker velg 1\nhvis mel velg 2\nhvis smør velg 3\nditt valg: '))
    if valg == 1:
        sukker = int(input('hvor mye sukker har du?\n< '))
        result = oppskrift_fra_sukker(sukker)
    elif valg == 2:
        mel = int(input('hvor mye mel har du?\n< '))
        result = oppskrift_fra_mel(mel)
    elif valg == 3:
        smør = int(input('hvor mye smør har du?\n< '))
        result = oppskrift_fra_smør(smør)
    else:
        print('du har valgt feil, det står ikke noe slikt i oppskriften')

    result_2 = skriv_oppskrift(result['sukker'],
                    result['mel'],
                    result['smør'])
    return result_2

final = bak_kaker()
print(final)

def sorting(navn):
    personer = []
    hunder = []
    file = open(navn)
    for line in file:
        splitted = line.split()
        if splitted[0] == 'P':
            personer.append(splitted[1])
        elif splitted[0] == 'H':
            hunder.append(splitted[1])
    print(f'personner:\n{personer}\nhunder:\n{hunder}')
    file.close()

sorting('navn.txt')


def sorter_etter_karakter(filnavn):
    ordbok = {}
    fil = open(filnavn)
    for linje in fil:
        navn, karakter = linje.strip().split(',')
        if karakter in ordbok:
            ordbok[karakter].append(navn)
        else:
            ordbok[karakter] = [navn]
    fil.close()
    return ordbok
        

def skriv_ut_sortert(ordbok):
    for karakter in sorted(ordbok.keys()):
        print(karakter, ": ", ordbok[karakter])

def hent_vanligste_karakter(ordbok):
    karakteren = ""
    max_student = 0
    for i in sorted(ordbok.keys()):
        if len(ordbok[i]) > max_student:
            max_student = len(ordbok[i])
            karakteren = i
    return f'de fleste studenter fikk: {karakteren}'

result = sorter_etter_karakter('karakter.csv')
skriv_ut_sortert(result)
print()
print(hent_vanligste_karakter(result))

def format_text(tekst, filnavn, maksTegn):
        fileContent = tekst.split()
        file = open(filnavn, "w")
        counter = 0
        for item in fileContent:
                length = len(item) 
                if counter + length <= maksTegn:
                        counter += length
                        file.write(item)
                        if counter + 1 <= maksTegn:
                            counter += 1
                            file.write(' ')      
                else:
                        counter = 0
                        length = len(item) + 1
                        counter += length
                        file.write("\n")
                        file.write(item)
                        file.write(" ")
                 
        file.close()
        
tekst = 'I denne oppgave skal du lage et program som tar inn en tekst og skriver den ut til en fil. I utdatafilen er det maksimalt antall tegn som er tillatt per linje.'

format_text(tekst, "random.txt", 21)

# sophisticatd version of code
# def format_text(tekst, filnavn, maks_tegn):
#    ordene = tekst.split()
#    fil = open(filnavn, "w")
#    teller = 0
#
#    for min_ord in ordene:
#        if teller + len(min_ord) > maks_tegn:
#            # Må starte ny linje
#            fil.write("\n")
#            teller = len(min_ord) + 1
#        else:
#           # Husk at mellomrom også er et tegn
#            teller += len(min_ord) + 1
#
#        fil.write(min_ord)
#        fil.write(" ")
#
    # Husk å lukke filen!
#    fil.close()

def maks_besoek(pasienter):
    counter = 0
    maxItemLength = 0
    for item in pasienter:
        counter +=1 
        if len(item) > maxItemLength:
            maxItemLength = len(item)
            pasientnummeret = counter
    return pasientnummeret

result = maks_besoek([[1,2,3], [2, 3, 4], [28, 31], [14, 15, 16, 17, 18]])
print(result)
print()

def faerrest_besoek(pasienter):
    counter = 0
    minItemLength = 1000
    for item in pasienter:
        counter +=1 
        if len(item) < minItemLength:
            minItemLength = len(item)
            pasientnummeret = counter
    return pasientnummeret

result = faerrest_besoek([[1,2,3], [2, 3, 4], [28, 31], [14, 15, 16, 17, 18]])
print(result)
print()

def alle_besoek(pasienter):
    counter = 0
    for item in pasienter:
        counter += len(item)
    return counter

result = alle_besoek([[1,2,3], [2, 3, 4], [28, 31], [14, 15, 16, 17, 18]])
print(result)
print()

def hvem_var_paa_dato(pasienter, dato):
    pasientnumrer = []
    pasientnumre = 0
    for item in pasienter:
        pasientnumre += 1
        for i in item:
            if dato == i:
                pasientnumrer.append(pasientnumre)
    return pasientnumrer

result = hvem_var_paa_dato([[1,2,3], [2, 3, 4], [28, 31], [14, 15, 16, 17, 18, 31]], 31)
print(result)


def reversedListen(listen):
    newList = []
    maxIndex = len(listen) - 1
    for i in range(len(listen)):
        newList.append(listen[maxIndex])
        maxIndex -= 1
    return newList


result = reversedListen(["en", "pluss", "to", "pluss", "tre", "er", "seks"])
print(result)

#sophisticated version 
#liste = ["en", "pluss", "to", "pluss", "tre", "er", "seks"]
#
#nyliste = []
#for i in range(len(liste), 0, -1):
#    nyliste.append(liste[i-1])
#
#print(nyliste)


password = input("Please input your new password.\nRememeber that a valid password should be at least 6 characters long, it should contain one uppercase alphabetic character (A-Z), and it should include one non-alphabetic character:\n< ")
print()

alphabetUpper = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
alphabetLower = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
upperCases = 0
symbols = 0
valid = False

while valid == False:
    for item in password:
        if item in alphabetUpper:
                upperCases+=1
        if item not in alphabetUpper + alphabetLower:
             symbols+=1
    if len(password) >= 6 and symbols > 0 and upperCases > 0:
            valid = True
            print('Password is valid')
            print()
    else:
            print('Password is invalid')
            print()
            upperCases = 0
            symbols = 0
            password = input("Please input your new password.\nRememeber that a valid password should be at least 6 characters long, it should contain one uppercase alphabetic character (A-Z), and it should include one non-alphabetic character:\n< ")
               
    print()

from random import randint

guess = input("We will roll a normal, fair die with six faces. Guess which number will come up.\n Please insert a number from 1 to 6:\n< ")
loop = True

while loop:
    roll = randint(1, 6)
    if str(roll) == guess:
        print(f"The result was {roll}. Your guess was correct. Congratulations, you have won the game!")
        loop = False
    else:
        print(f"The result was {roll}. Your guess was not correct.")
        print()
        guess = input("We will roll a normal, fair die with six faces. Guess which number will come up.\n Please insert a number from 1 to 6:\n< ")

import matplotlib.pyplot as plt 
from scipy.stats import pearsonr

crimes = [23, 38, 48, 67, 117, 71, 49, 91, 68, 44, 98, 74, 41, 114, 48, 103, 88, 81, 65, 82, 64, 51, 91, 88, 92, 56, 77, 61, 46, 91, 96, 107, 35, 84, 92, 101, 69, 46, 27, 48, 109, 63, 77, 53, 61, 50, 74, 95, 114, 50, 89, 103, 73, 93, 103, 35, 108, 34, 64, 51, 95, 52, 97, 55, 96, 104, 96, 92, 86, 83, 51, 58, 33, 33, 65, 82, 48, 32, 108, 94, 100, 97, 34, 92, 80, 67, 60, 34, 114, 70, 52, 101, 80, 29, 48, 101, 35, 119, 86, 107, 44, 108, 94, 111, 39, 38, 81, 33, 111, 60, 75, 40, 100, 62, 55, 81, 51, 41, 76, 50, 77, 106, 105, 76, 50, 52, 80, 110, 101, 59, 39, 60, 67, 79, 31, 44, 28, 26, 71, 104, 99, 51, 34, 85, 92, 47, 110, 81, 69, 36, 64, 123, 114, 42, 125, 57, 94, 65, 41, 38, 32, 84, 80, 119, 51, 97, 61, 86, 112, 96, 78, 64, 69, 66, 90, 97, 93, 53, 60, 117, 84, 77, 100, 97, 94, 97, 45, 97, 33, 63, 32, 98, 91, 95, 107, 111, 89, 101, 84, 54, 81, 35, 36, 112, 74, 72, 64, 74, 81, 78, 47, 105, 57, 114, 75, 48, 36, 38, 34, 121, 76, 30, 51, 84, 116, 53, 33, 103, 96, 54, 98, 46, 88, 59, 100, 111, 79, 61, 70, 105, 97, 46, 99, 118, 39, 118, 62, 71, 31, 33, 35, 67, 77, 52, 55, 78, 88, 108, 34, 60]
iceCreamSales = [6.9, 11.7, 11.9, 13.0, 26.6, 22.2, 17.1, 25.9, 17.4, 12.0, 24.4, 23.1, 13.2, 34.7, 9.3, 32.4, 32.6, 25.4, 22.0, 24.0, 19.1, 13.1, 32.3, 25.7, 31.4, 20.7, 27.0, 15.3, 16.8, 31.1, 27.2, 38.2, 13.5, 24.2, 26.2, 31.1, 23.3, 16.4, 11.0, 15.2, 31.1, 15.8, 24.9, 18.8, 21.0, 13.3, 26.9, 25.4, 35.0, 22.0, 19.9, 33.0, 24.0, 29.7, 32.6, 13.2, 41.3, 14.1, 22.6, 14.5, 28.0, 16.3, 32.9, 12.6, 32.6, 32.0, 27.4, 31.0, 32.8, 27.4, 14.8, 26.4, 11.7, 10.7, 17.1, 26.1, 11.5, 12.8, 34.9, 32.4, 35.0, 31.4, 8.7, 31.8, 21.9, 24.1, 19.2, 7.5, 35.0, 23.4, 14.3, 27.4, 28.3, 11.5, 13.0, 30.5, 12.1, 32.7, 24.5, 30.0, 22.2, 33.8, 35.1, 29.5, 12.9, 15.5, 26.0, 14.1, 30.6, 17.7, 29.6, 5.0, 38.0, 20.1, 14.1, 23.1, 10.6, 7.0, 27.5, 17.3, 19.9, 30.8, 39.2, 32.7, 17.9, 10.5, 22.2, 39.6, 29.4, 22.1, 16.3, 25.1, 13.4, 23.3, 11.2, 12.1, 10.1, 8.6, 19.2, 33.4, 28.6, 16.8, 6.1, 27.5, 32.1, 14.3, 38.5, 23.2, 22.2, 7.9, 20.3, 41.5, 35.5, 11.9, 29.0, 16.2, 27.3, 21.0, 6.5, 10.7, 7.9, 29.2, 22.4, 30.8, 15.1, 30.8, 15.3, 21.8, 41.1, 31.5, 22.9, 20.1, 21.7, 21.3, 27.9, 28.8, 30.5, 11.3, 18.7, 34.1, 23.2, 23.8, 28.7, 28.2, 30.8, 29.1, 18.8, 30.5, 10.8, 19.3, 12.7, 33.1, 28.4, 29.5, 32.5, 34.7, 25.8, 30.5, 22.2, 17.4, 23.9, 7.5, 13.0, 44.7, 21.1, 27.2, 13.7, 23.4, 23.3, 32.5, 7.8, 35.4, 18.0, 36.7, 23.3, 13.6, 7.4, 8.7, 8.1, 39.2, 24.1, 12.8, 18.3, 19.7, 35.6, 19.2, 12.3, 34.1, 30.7, 13.6, 29.1, 9.4, 30.0, 15.5, 40.4, 33.6, 18.5, 21.3, 21.4, 37.2, 29.4, 16.1, 28.1, 38.1, 7.4, 38.2, 22.6, 15.4, 6.9, 10.1, 14.1, 17.7, 20.8, 15.7, 13.2, 19.4, 20.8, 35.2, 9.4, 22.8]
temperature = [-4, -7, 0, 3, 12, 14, -1, 17, 6, -3, 13, 9, 0, 10, 0, 20, 15, 10, 5, 11, 4, 0, 12, 9, 17, 3, 11, -2, 0, 12, 15, 20, -5, 10, 15, 15, 10, 0, -5, 0, 20, 5, 10, 0, 5, 0, 10, 10, 20, 0, 10, 20, 5, 15, 20, -5, 20, -5, 5, 0, 15, 0, 15, 0, 15, 15, 15, 15, 15, 11, 0, 4, -3, -2, 5, 10, 0, -5, 20, 15, 15, 15, -5, 15, 10, 5, 5, -5, 20, 5, 0, 15, 10, -5, 0, 15, -5, 20, 10, 20, 0, 10, 15, 20, -5, 0, 10, -5, 20, 0, 10, -5, 20, 5, 5, 10, 0, -5, 10, 0, 10, 20, 20, 10, 0, 0, 10, 20, 15, 5, -5, 5, 5, 5, -5, 0, -5, -5, 5, 20, 15, 0, -5, 10, 15, 0, 20, 10, 5, -5, 5, 20, 10, 0, 20, 0, 15, 5, -5, -5, -5, 10, 10, 20, 0, 15, 5, 10, 20, 15, 10, 5, 5, 5, 15, 15, 15, 0, 5, 20, 10, 10, 15, 15, 15, 15, 0, 15, -5, 5, -5, 10, 10, 15, 20, 20, 15, 15, 10, 5, 10, -5, -5, 20, 5, 10, 5, 10, 5, 10, 0, 20, 5, 20, 10, 0, -5, -5, -5, 20, 10, -5, 0, 10, 20, 5, -5, 20, 15, 0, 15, 0, 15, 0, 20, 20, 10, 5, 5, 20, 15, 0, 15, 20, -5, 20, 5, 5, -5, -5, -5, 5, 10, 0, 0, 10, 10, 20, -5, 5]
temperatures = [-5, 0, 5, 15, 20 ]

crimes_at_temp = { -5: [], 0: [], 5: [], 15: [], 20: [] }

sales_at_temp = { -5: [], 0: [], 5: [], 15: [], 20: [] }
for i in range(len(temperature)):
    for item in temperatures:
        if temperature[i] == item:
                crimes_at_temp[item].append(crimes[i])
                sales_at_temp[item].append(iceCreamSales[i])

for i in crimes_at_temp:
    plt.scatter(crimes_at_temp[i], sales_at_temp[i])
    plt.xlabel(f'Ice cream sold (in hundreds) at {i} degrees average weekly temp.')
    plt.ylabel(f'Crimes commited at {i} degrees awt.')
    plt.title(f'Data about the ice cream sales and the crimes committed the corresponding week when the average temperature was {i} degrees')
    plt.show()
    from scipy.stats import pearsonr
    pcc = pearsonr(crimes_at_temp[i], sales_at_temp[i])[0]
    print(f'The pearson coefficient between the ice cream sales and the crimes committed the corresponding week when the average temperature was {i} degrees is {pcc}')

import random

class Human:
    def __init__(self, name: str, age: int):
        self.name = name
        self.age = age
        self.height = random.randint(150, 200)

    def show_info(self):
        print(f"name: {self.name}; age: {self.age}; height: {self.height}")


john = Human(name='John', age=29)
bob = Human(name='Bob', age=40)
alice = Human(name='Alice', age=22)

# alex.show_info()  # name: John; age: 29; height: 173
alice.show_info()  # name: Alice; age: 22; height: 191

class Weapon:
    def fire(self):
        pass

class Pistol(Weapon):
    def fire(self):
        print("Pistol fires a bullet")

class Bazooka(Weapon):
    def fire(self):
        print("Bazooka fires a rocket")

class Human:
    def shoot(self, weapon):
        weapon.fire()

# Создаем экземпляры классов
pistol = Pistol()
bazooka = Bazooka()
human = Human()

# Вызываем метод shoot() объекта human, передавая ему объекты разных классов Weapon
human.shoot(pistol)   # Выведет: Pistol fires a bullet
human.shoot(bazooka)  # Выведет: Bazooka fires a rocket


class Student:

    def __init__(self, navn : str):
        self.poeng = 0
        self.antall = 0
        self.navn = navn

    def hent_poeng(self):
        return f'{self.poeng}, {self.navn}'
    
    def register_poengt(self, antall : int):
        self.poeng += antall
        
        
me = Student(navn = 'Dodik')
meWithPoints = Student(navn = 'Dodik')
print(me.hent_poeng())
meWithPoints.register_poengt(antall = 30)
print(meWithPoints.hent_poeng())

class Bil():

    def __init__(self, eier : str) :
        self.eier = eier 

    def skriv_ut(self) :
        print(self.eier)

eier1 = Bil('Mikhail')
eier1.skriv_ut()
eier2 = Bil('Nikita')
eier2.skriv_ut()


class Rektangel():
    def __init__(self, bredde : int, lengde : int) -> None :
        self.bredde = bredde 
        self.lendge = lengde 

    def oekLengde(self, oekning:int) -> None :
        self.lendge += oekning

    def oekBredde(self, oekning:int) -> None :
        self.bredde += oekning

    def reduLengde(self, reduksjon:int) -> None :
        if self.lendge > reduksjon:
            self.lendge -= reduksjon
        else:
            print('det er umulig å redusere den til denne størrelsen')

    def reduBredde(self, reduksjon:int) -> None :
        if self.bredde > reduksjon:
            self.bredde -= reduksjon
        else:
            print('det er umulig å redusere den til denne størrelsen')
        
    def areal(self) -> int :
        return self.bredde * self.lendge
    
    def omkrets(self) -> int :
        return (self.bredde * 2) + (self.lendge * 2) 
    
firstExample = Rektangel(4,5)
print(firstExample.areal())
print(firstExample.omkrets())
print()
firstExample.oekBredde(3)
firstExample.oekLengde(1)
print(firstExample.areal())
print(firstExample.omkrets())
print()
firstExample.reduBredde(3)
firstExample.reduLengde(1)
print(firstExample.areal())
print(firstExample.omkrets())


class EspressoMaskin():

    def __init__(self, makskapasitet : int) -> None:
        self.makskapasitet = makskapasitet

    def lagEspresso(self):
        quantitet = 40 
        if self.makskapasitet >= quantitet:
            self.makskapasitet -= quantitet
        else:
            print('det er ikke nok vann for å lage Espresso')

    def lagLungo(self):
        quantitet = 110
        if self.makskapasitet >= quantitet:
            self.makskapasitet -= quantitet
        else:
            print('det er ikke nok vann for å lage Lungo')

    def fyllVann(self, ml : int):
        if self.makskapasitet + ml <= 1000:
            self.makskapasitet += ml
        else:
            print('for mye vann')
    
    def hentVannMengde(self) -> int: 
        print(f'Det er mengden vann som er igjen i tanken: {self.makskapasitet}')

input1 = int(input('1 for making Espresso\n2 for making Lungo\n3 for checking water\n4 for fylling watter\n5 for stopping machine\n< '))
kaffe = EspressoMaskin(1000)
while input1 !=5:
    if input1 == 1:
        kaffe.lagEspresso()
    elif input1 == 2:
        kaffe.lagLungo()
        print()
    elif input1 == 3:
        kaffe.hentVannMengde()
        print()
    elif input1 == 4:
        mendge = int(input('hvor mye vann vil du fylle på'))
        print()
        kaffe.fyllVann(mendge)
        print()
    input1 = int(input('1 for making Espresso\n2 for making Lungo\n3 for checking water\n4 for fylling watter\n5 for stopping machine\n< '))


class Student():
    def __init__(self, navn:str) -> None:
        self.navn = navn
        self.quizScore = 0
        self.antallQuiz = 0
    
    def leggTilQuizScore(self, newPoints):
        self.quizScore += newPoints
        self.antallQuiz += 1
    
    def gjennomsnittligScore(self) -> int:
        print(round(self.quizScore / self.antallQuiz, 2))
    
    def skrivUt(self):
        print(f'navn: {self.navn}\nquiz score is: {self.quizScore}\nantall quiz er: {self.antallQuiz}')


Joakim = Student('Joakim')
Joakim.leggTilQuizScore(40)
Joakim.leggTilQuizScore(60)
Joakim.leggTilQuizScore(33)
Kristin = Student('Kristin')
Kristin.leggTilQuizScore(80)
Kristin.leggTilQuizScore(75)
Kristin.leggTilQuizScore(64)
Joakim.gjennomsnittligScore()
print()
Joakim.skrivUt()
print()
Kristin.gjennomsnittligScore()
print()
Kristin.skrivUt()

class Ekorn:
    def __init__(self, pelsfarge:str, bosted:str) -> str:
        self._pelsfarge = pelsfarge
        self._bosted = bosted
    
    def hentPelsfarge(self)-> str:
        return self._pelsfarge
    
    def hentBosted(self)-> str:
        return self._bosted

print(Ekorn("brunt","Drammen").hentPelsfarge())
print(Ekorn("grått","Tjøme").hentBosted())

class Buss():
    def __init__(self, makskapsitet:int) -> None:
        self.makskapsitet = makskapsitet
        self.ledigPlass = makskapsitet
    
    def er_tom(self)-> bool:
        if self.makskapsitet == self.ledigPlass:
            return True
        else:
            return False

    def er_full(self)-> bool:
        if self.makskapsitet - self.ledigPlass == self.makskapsitet:
            return True
        else:
            return False

    def plukk_opp(self, antall:int)-> str:
        if self.ledigPlass >= antall:
            self.ledigPlass -= antall
        else:
            print('det finnes ikke nok plass')

    def slipp_av(self, antall:int)-> str:
        if antall <= self.makskapsitet - self.ledigPlass:
            self.ledigPlass += antall
        else:
            print('det finnes ikke nok passasjerer på bussen')
    
    def hent_antall_passasjerer(self)-> int:
        return self.makskapsitet - self.ledigPlass

bus = Buss(20)
bus.plukk_opp(10)
print(bus.hent_antall_passasjerer())
print()
bus.plukk_opp(12)
print(bus.hent_antall_passasjerer())
print()
bus.slipp_av(18)
print(bus.hent_antall_passasjerer())
print()
bus.slipp_av(3)
print(bus.hent_antall_passasjerer())


class Temperatur():
    def __init__(self, temperatur:float, streng:str) -> None:
        self.streng = streng
        self.temperatur = temperatur

    def hent_celsius(self) -> float:
        if self.streng == 'Celsius':
            return self.temperatur
        elif self.streng == 'Fahrenheit':
            return self.temperatur / 2 - 30
        elif self.streng == 'Kelvin':
            return self.temperatur - 273.15
        
    def hent_fahrenheit(self) -> float:
        if self.streng == 'Fahrenheit':
            return self.temperatur
        elif self.streng == 'Celsius':
            return self.temperatur * 2 + 30
        elif self.streng == 'Kelvin':
            return (self.temperatur - 273.15) * 2 + 30 

    def hent_kelvin(self) -> float:
        if self.streng == 'Kelvin':
            return self.temperatur
        elif self.streng == 'Celsius':
            return self.temperatur + 273.15
        elif self.streng == 'Fahrenheit':
            return self.temperatur / 2 - 30 + 273.15

temperature = Temperatur(100,'Celsius')
print(temperature.hent_celsius())
print()
print(temperature.hent_kelvin())
print()
print(temperature.hent_fahrenheit())
print()

import random

class MasterMind():
    def __init__(self) -> None:
        self.kode = []
        for i in range(4):
            self.kode.append(random.randint(0, 9))
    
    def spill(self):
        victory = False
        times = 0
        while victory == False:
            times +=1
            guess_list = self.hent_bruker_gjett()
            check_guess_list = self.sjekk_gjett(guess_list)

            if not 'X' in check_guess_list:
                print(f'You have won! You tried {times} times')
                victory = True 
            else:
                print(check_guess_list)
           
    
    def hent_bruker_gjett(self) -> list:
        userInput = input("Gjett kode: ")
        liste = []
        for nummer in userInput:
            liste.append(int(nummer))
        return liste
    
    def sjekk_gjett(self, guess_list) -> list:
        newList = []
        for i in range(4):
            if self.kode[i] == guess_list[i]:
                newList.append(self.kode[i])
            else:
                newList.append('X')
        return newList

game = MasterMind()
game.spill()
  
class Frukt:
    def __init__(self, navn:str, mendgeVann, spiselige) -> None:
        self.navn = navn
        self.mendgeVann = mendgeVann
        self.spiselige = spiselige
    
    def hentNavn(self):
        return self.navn

    def hentVannPr100(self):
        return self.mendgeVann

    def erSpiselig(self):
    
        return self.spiselige

groentEple = Frukt("Grønt Eple", 86, True)
roedtEple = Frukt("Rødt Eple", 89, True)
hasselNoett = Frukt("Hasselnøtt", 12, True)
sukkerert = Frukt("Sukkerert", 89, True)
trollhegg = Frukt("Trollhegg", 90, False) 

liste = [groentEple, roedtEple, hasselNoett, sukkerert, trollhegg]

spiseligeVannFrukter = []

for i in liste:
    if i.hentVannPr100() > 85 and i.erSpiselig():
        spiseligeVannFrukter.append(i)

print("Spiselige Vannfrukter:")
for item in spiseligeVannFrukter:
    print(item.hentNavn())
 
#mitt versonen
class blåbær:
    def __init__(self, størrelse, blåbærMengde) -> None:
        self.størrelse = størrelse
        self.blåbærMengde = blåbærMengde
        self.blåbærVekt = 0.3
    
    def henteInformasjon(self) :
        return f'størrelsen er: {self.størrelse}\nmengde av blåbær er: {self.blåbærMengde}'
    
    def vannBlåbær(self) -> None:
        self.størrelse += 3
    
    def gjødsleBlåbær(self) -> None:
        self.blåbærMengde += 5
    
blåbær1 = blåbær(7,14)
blåbær1.gjødsleBlåbær()
blåbær1.vannBlåbær()
print(blåbær1.henteInformasjon())

#deres versonen  

class Blaabaer:
    def __init__(self):
        self._vekt = 0.3

class Blaabaerplante:
    def __init__(self, stoerrelse):
        self._stoerrelse = stoerrelse
        self._baer = []

    def motta_vann(self):
        self._stoerrelse += 3

    def motta_gjoedsel(self):
        for i in range(5):
            self._baer.append(Blaabaer())

    def plukk_baer(self):
        return self._baer.pop()

    def hent_antall_baer(self):
        return len(self._baer)

    def hent_stoerrelse(self):
        return self._stoerrelse


plante = Blaabaerplante(10)
plante.motta_vann()
plante.motta_gjoedsel()
plante.motta_gjoedsel()


plukkede_baer = []
for i in range(3):
    plukkede_baer.append(plante.plukk_baer())
 

print("Stoerrelse: ", plante.hent_stoerrelse())
print("Antall baer: ", plante.hent_antall_baer())
print("Antall plukkede baer: ", len(plukkede_baer)) 

from random import randint

class Vare():
    def __init__(self, beskrivelse:str) -> None:
        self.beskrivelse = beskrivelse
        self.høyesteBud = None

    #def by(self, bud):
        #if bud < 0:
            #print("lureri")
            #return
        #if  self._hoyesteBud is None or self._hoyesteBud < bud:
            #self._hoyesteBud = bud

    def by(self, bud:int) -> None:
        teller = 0
        if teller == 0 and bud >= 0:
            self.høyesteBud = bud
            teller += 1
        elif teller > 0 and bud > self.høyesteBud:
            self.høyesteBud = bud
        else:
            print('lureri')
            return
        
    def seBud(self) -> int:
        if self.høyesteBud != None:
            return f'det høyest bud er: {self.høyesteBud}'
        else:
            return 'Ingen har budd paa denne varen enda'

Vare1 = Vare('memecoin')
for i in range(5):
    Vare1.by(randint(1,100))
print(Vare1.seBud())


class RaskBil:
    def __init__(self, merke:str,bilnummer:str,navn:str, motortype:str,topphastighet) -> None:
        self.merke = merke 
        self.bilnummer = bilnummer
        self.navn = navn
        self.typpen = motortype
        self.topphastighet = topphastighet

        
    def skrivInfo(self):
        return f'Bil info\nMerke av bilen er: {self.merke}\nnummer av bilen er: {self.bilnummer}\nog bilen navnet er: {self.navn}\nbilen typpen er: {self.typpen}\ntopphastighet er: {self.topphastighet}'

    def hentMotortype(self) -> str:
        return self.typpen

    def ELbiler(self, liste:list) -> str:
        for bil in liste:
            if (bil.hentMotortype() == 'EL'):
                print(bil.skrivInfo())
                print()
        

min_bil = RaskBil('Mercedes','AMG','MM0301B','Bensin-bil',300)
bil1=RaskBil('Audi','A5','MM0301B','Bensin-bil',250)
bil2=RaskBil('Dodge','RAM','MM0301B','Bensin-bil',200)
bil3=RaskBil('Subaru','Impreza','MM0301B','Bensin-bil',240)
minTelsa = RaskBil("Tesla", "EL99999", "Teslaen min..", "EL", 345)

Liste = [min_bil, bil1, bil2, bil3, minTelsa]

minTelsa.ELbiler(Liste)


class NorskOrd:
    def __init__(self, ord:str) -> None:
        self.ord = ord

    def sjekk_norske(self) -> bool:
        return "æ" in self.ord.lower() \
            or "ø" in self.ord.lower() \
            or "å" in self.ord.lower()
        
    def skriv_ord(self) :
        return self.ord

    def endreTegn(self, liste:list):
        for i in range(len(liste)):
            ord = liste[i].skriv_ord()
            nyttOrd =''
            for tegn in ord:
                if tegn == "æ":
                    nyttOrd+='ae'
                elif tegn == "ø":
                    nyttOrd+='oe'
                elif tegn == "å":
                    nyttOrd+='aa'
                else:
                    nyttOrd+=tegn
            liste[i] = NorskOrd(nyttOrd)
        return Liste
        
ord1 = NorskOrd('høst')
ord2 = NorskOrd('vinter')
ord3 = NorskOrd('vår')
ord4 = NorskOrd('sommer')
Liste = [ord1,ord2,ord3,ord4]

for ord in Liste:
    print(ord.skriv_ord())

ord4.endreTegn(Liste)
print()    
print('endret ord')
print()

for ord in Liste:
    print(ord.skriv_ord())

class Station:
    def __init__(self, name) :
        self.name = name
        self.next = None

    def set_next(self, next):
        self.next = next

    def hent_next(self):
        return self.next

    def hent_navn(self):
        return self.name

def bygg_trase():
    trikestall = Station('stallen')
    previous = trikestall
    with open('stops.txt') as file:
        for station_name in file:
            station_name = station_name.strip()
            this = Station(station_name)
            previous.set_next(this)
            previous = this 
        return trikestall

def hoveprogram():
    this = bygg_trase()
    goal = input('Where are you going?\n< ')
    while this is not None:  # Loop until there are no more stations
        if this.hent_navn() == goal:
            print(f"Arrived at {goal}!")
            break
        print('Reiser gjennom:', this.hent_navn())
        this = this.hent_next()
    else:
        print(f"Sorry, {goal} not found in the route.")
                

hoveprogram()

import random

class Station:
    def __init__(self, name) :
        self.name = name
        self.naboer = []

    def legg_till_nabo(self, nabo):
        self.nabo.append(nabo) 

    def hent_next(self):
        return self.naboer[randint(0,len(self.naboer)-1)]

    def hent_navn(self):
        return self.name

def bygg_trase():
    stasjonbok = {} 
    with open('stops.txt') as file:
        for station_name in file:
            biter = station_name.strip().split()
            fra_navn = biter[0]
            til_navn = biter[1]
            if not fra_navn in stasjonbok:
                stasjonbok[fra_navn] = Station(fra_navn)
            fra_stasjon = stasjonbok[fra_navn]

            if not til_navn in stasjonbok:
                stasjonbok[til_navn] = Station(til_navn)
            fra_stasjon = stasjonbok[til_navn]

            til_stasjon = Station(til_navn)
            fra_stasjon.legg_till_nabo(til_stasjon)
            til_stasjon.legg_till_nabo(fra_stasjon)

        return stasjonbok

def hoveprogram():
    this = bygg_trase()
    goal = input('Where are you going?\n< ')
    while this is not None:  # Loop until there are no more stations
        if this.hent_navn() == goal:
            print(f"Arrived at {goal}!")
            break
        print('Reiser gjennom:', this.hent_navn())
        this = this.hent_next()
    else:
        print(f"Sorry, {goal} not found in the route.")
                

hoveprogram()

class Person:
    def __init__(self, navn:str) -> None:
        self._navn = navn
        self._ektefelle = None
    
    def status(self):
        if self._ektefelle != None:
            print(f'skal være gift med {self._ektefelle}')
        else:
            print('personen er singel')
    
    def gift_seg(self, annenPerson):
        self._ektefelle = annenPerson._navn

mr_smith = Person("Brad Pitt")
mrs_smith = Person("Angelina Jolie")

# Skal være singel
mr_smith.status()
print()
mrs_smith.status()
print()
mr_smith.gift_seg(mrs_smith)
mrs_smith.gift_seg(mr_smith)

# Skal være gift med Angeline Jolie
mr_smith.status()
print()
mrs_smith.status()

class Menneske:
    def __init__(self, navn:str, alder:int) -> None:
        self._navn = navn
        self._alder = alder
        self._er_forelder = False
        self._barn = []

    def har_fodselsdag(self):
        self._alder +=1
        print(f'HB {self._navn}! You are {self._alder} now :)')

    def bytt_navn(self, nytt_navn:str):
        self._navn = nytt_navn
    
    def faar_barn(self, navn:str):
        barn = Menneske(navn,0)
        self._barn.append(barn)
        self._er_forelder = True
        print(f'{self._navn} har fått barn')
    
    def hent_navn(self):
        return self._navn
    def hent_barn(self):
        return self._barn
    def hent_alder(self):
        return self._alder

Kozar = Menneske('Kozar',19)
print(Kozar.hent_navn())
print(Kozar.hent_alder())
print()
Kozar.bytt_navn('Elia')
Kozar.har_fodselsdag()
print()
Kozar.faar_barn('firstOne')
print()
Kozar.faar_barn('secondOne')
print()
Kozar.faar_barn('thirdOne')
print()
for barn in Kozar.hent_barn():
    print(f'Barn:\n{barn.hent_navn()}')
    print()

class Bok:
    def __init__(self, titel:str, forfatter:str, år:int) -> None:
        self._titel = titel
        self._forfatter = forfatter
        self._år = år
    def hent_tittel(self):
        return self._titel
    def hent_år(self):
        return self._år 
    def __str__(self) -> str:
        return f'{self._titel} by {self._forfatter} in {self._år}'

class Bokhylle:
    def __init__(self, maksAntall) -> None:
        self._boker = []
        self._maksAntall = maksAntall
    def _er_ledig_plass(self):
        if self._maksAntall > 0:
            return True
        else:
            return False
    def legg_til_bok(self, bok):
        if self._er_ledig_plass():
            self._boker.append(bok)
            self._maksAntall -=1
            return True
        else:
            return False
    def finn_bok(self,titel:str,år:int):
        for bok in self._boker:
            if bok.hent_tittel() == titel and bok.hent_år () == år:
                return bok
            else:
                return'det finnes ikke denne boken på hylla'
        

bok1 = Bok('adventures of Tom Sawyer', 'Mark Twen',1876)
print(bok1.hent_tittel())
print()
print(bok1.hent_år())
print()
print(bok1)
print()
bok2 = Bok('hahah', 'Mihaaa',2003)
bok3 = Bok('hohoho', 'Nikita',1900)
bookShelf = Bokhylle(2)
print(bookShelf._er_ledig_plass())
print()
print(bookShelf.legg_til_bok(bok1))
print()
print(bookShelf.legg_til_bok(bok2))
print()
print(bookShelf._er_ledig_plass())
print()
print(bookShelf.legg_til_bok(bok3))
print()
print(bookShelf.finn_bok('adventures of Tom Sawyer',1876))
print()
print(bookShelf.finn_bok('adventures of junkies',2024))
print()

class Side:
    def __init__(self, lengde:int,farge:str) -> None:
        self._lengde = lengde
        self._farge = farge
    
    def hent_lengde(self):
        return self._lengde

    def hent_farge(self):
        return self._farge
    
class Firkant:
    def __init__(self) -> None:
        self._venstre = None
        self._høyre = None
        self._topp = None
        self._bunn = None
    
    def legg_til_side(self, Side, beskrivelse:str):
        if beskrivelse.lower() == 'venstre' and self._venstre == None:
           self._venstre = Side
           return f'{beskrivelse} er lagt til'
        elif beskrivelse.lower() == 'høyre' and self._høyre == None:
           self._høyre = Side
           return f'{beskrivelse} er lagt til'
        elif beskrivelse.lower() == 'topp' and self._topp == None:
           self._topp = Side
           return f'{beskrivelse} er lagt til'
        elif beskrivelse.lower() == 'bunn' and self._bunn == None:
           self._bunn = Side
           return f'{beskrivelse} er lagt til'
        else:
            print('det finnes ikke denne siden')
    
    def fjern_side(self, posisjon:str):
        if posisjon.lower() == 'venstre' and self._venstre != None:
            self._venstre = None
            return f'{posisjon} er fjernet'
        elif posisjon.lower() == 'høyre' and self._høyre != None:
           self._høyre = None
           return f'{posisjon} er fjernet'
        elif posisjon.lower() == 'topp' and self._topp != None:
           self._topp = None
           return f'{posisjon} er fjernet'
        elif posisjon.lower() == 'bunn' and self._bunn != None:
           self._bunn = None
           return f'{posisjon} er fjernet'
        else:
            print('det finnes ikke denne siden')
    
    def er_fullstendig(self) -> bool:
        return all(attr is not None for attr in [self._venstre, self._høyre, self._topp, self._bunn])
    
    def __str__(self) -> str:
        if self.er_fullstendig() == True:
            omkretsen = self._venstre.hent_lengde() + self._høyre.hent_lengde() + self._topp.hent_lengde() + self._bunn.hent_lengde()
            return f'omkretsen til firkant er: {omkretsen}\nfarger til firkant er: {self._venstre.hent_farge()}, {self._høyre.hent_farge()}, {self._topp.hent_farge()}, {self._bunn.hent_farge()}'

    
        

def test_firkanter():
    firkant1 = Firkant()
    assert firkant1.er_fullstendig() == False, 'det er false'
    print(firkant1.er_fullstendig())
    print()

    side1 = Side(7,'rosa')
    side2 = Side(7,'blå')
    side3 = Side(7,'svart')
    side4 = Side(7,'grønn')
    print(firkant1.legg_til_side(side1,'venstre'))
    print(firkant1.legg_til_side(side2,'topp'))
    print(firkant1.legg_til_side(side3,'bunn'))
    print(firkant1.legg_til_side(side4,'høyre'))
    print()

    assert firkant1.er_fullstendig() == True, 'det er false'
    print(firkant1.er_fullstendig())
    print()

    firkant2 = Firkant()
    side1 = Side(9,'rosa')
    side2 = Side(9,'blå')
    firkant2.legg_til_side(side1,'venstre')
    firkant2.legg_til_side(side2,'topp')

    # firkant.fjern_side('venstre')
    # assert firkant.er_fullstendig() == False, 'det er false'
    # print(firkant.er_fullstendig())
    # print()
    liste = [firkant1, firkant2]


    def sjekk_firkanter(liste):
        for i in liste:
            if i.er_fullstendig() == False:
                return False
        return True 
    print(sjekk_firkanter(liste))

    print()

    print(firkant1)

test_firkanter()

class DVD:
    def __init__(self, titel:str, produsent:str, utgavenummer:str ) -> None:
        self._titel = titel
        self._produsent = produsent
        self._utgavenummer = utgavenummer
        
    def __str__(self) -> str:
        return self._titel
    
    def __eq__(self, other: object) -> bool:
        if isinstance(other, DVD):
            return self._titel == other._titel and self._produsent == other._produsent and self._utgavenummer == other._utgavenummer
        return False

ny_dvd = DVD("Min Super Duper Film", "Meg", "#12345")
print(ny_dvd)
print()
ny_dvd2 = DVD("Min Super Duper Film", "Deg", "#42344")
print(ny_dvd == ny_dvd2)

class Kube():
    def __init__(self, lengde, bredde, dybde):
        self._lengde = lengde
        self._bredde = bredde
        self._dybde = dybde

    def __repr__(self):
        return f"Kube:{self._lengde}*{self._bredde}*{self._dybde}"

    def __gt__(self, other):
        return (self._lengde * self._bredde * self._dybde) > (other._lengde * other._bredde * other._dybde)

    def __eq__(self, other):
        return (self._lengde * self._bredde * self._dybde) == (other._lengde * other._bredde * other._dybde)

    def __lt__(self, other):
        return (self._lengde * self._bredde * self._dybde) < (other._lengde * other._bredde * other._dybde)

    def __le__(self, other):
        return self < other or self == other

    def __ge__(self, other):
        return self > other or self == other

kubeliste = [Kube(1,2,3), Kube(4,5,6), Kube(1,1,1)]
print("usortert: ", kubeliste)
print("sortert:  ", sorted(kubeliste))
print()
kube1 = Kube(1,2,3)
kube2 = Kube(2,3,1)
kube3 = Kube(1,1,1)
print(f"Kube1: {kube1}")
print(f"Kube2: {kube2}")
print(f"Kube3: {kube3}")
print()
print(f"Kube1 == Kube2: {kube1 == kube2}")
print(f"Kube1 == Kube3: {kube1 == kube3}")
print(f"Kube1 >= Kube3: {kube1 >= kube3}")
print(f"Kube1 <= Kube3: {kube1 <= kube3}")

class Station:
    def __init__(self, name) :
        self.name = name
        self.next = None

    def set_next(self, next):
        self.next = next

    def hent_next(self):
        return self.next

    def hent_navn(self):
        return self.name

def bygg_trase():
    trikestall = Station('stallen')
    previous = trikestall
    with open('stops.txt') as file:
        for station_name in file:
            station_name = station_name.strip().split(' ')
            this = Station(station_name[1])
            previous.set_next(this)
            previous = this
        return trikestall


def hoveprogram():
    this = bygg_trase()
    goal = input('Where are you going?\n< ')
    while this is not None:  # Loop until there are no more stations
        if this.hent_navn() == goal:
            print(f"Arrived at {goal}!")
            break
        print('Reiser gjennom:', this.hent_navn())
        this = this.hent_next()
    else:
        print(f"Sorry, {goal} not found in the route.")
                

hoveprogram()
    

from random import randint

class Stasjon:
    def __init__(self, navn):
        self._navn = navn
        self._naboer = []

    def hent_navn(self):
        return self._navn
    
    def legg_til_nabo(self, nabo):
        self._naboer.append(nabo)

    def hent_neste(self):
        return self._naboer[randint(0,len(self._naboer)-1)]

def bygg_trase():
    stasjonsbok = {}

    for fil_linje in open("ruter.txt"):
        biter = fil_linje.strip().split()
        fra_navn = biter[0]
        til_navn = biter[1]
        
        if not fra_navn in stasjonsbok:
            stasjonsbok[fra_navn] = Stasjon(fra_navn)        
        fra_stasjon = stasjonsbok[fra_navn]

        if not til_navn in stasjonsbok:
            stasjonsbok[til_navn] = Stasjon(til_navn)
        til_stasjon = stasjonsbok[til_navn]

        fra_stasjon.legg_til_nabo(til_stasjon)
        til_stasjon.legg_til_nabo(fra_stasjon)

    return stasjonsbok

def hovedprogram():
    stasjonsbok = bygg_trase()
    fra = stasjonsbok[input("Hvor reise fra?: ")]
    maal = stasjonsbok[input("Hvor vil du reise til (alle reiser starter paa rikshospitalet): ")]
    denne = fra
    while denne != maal:
        print("Reiser gjennom: ", denne.hent_navn())
        denne = denne.hent_neste()
        

hovedprogram()
 
import math
class Punkt:
    def __init__(self, x:int, y:int, z:int) -> None:
        self._x = x       
        self._y = y      
        self._z = z

    def __str__(self) -> str:
        return f'det er punkt som har coordinater x-{self._x } y-{self._y} z-{self._z}'  

    def få_avstand(self, andrePunkt):
        avstand = math.sqrt((andrePunkt._x - self._x)**2 + (andrePunkt._y - self._y)**2 + (andrePunkt._z - self._z)**2)
        return avstand
    
    def få_nærmeste_punkt(self, liste):
        min_avstand = self.få_avstand(liste[0])
        punkt_min = ' '
        for punkt in liste:
            if self.få_avstand(punkt) < min_avstand:
                punkt_min = punkt
        return punkt_min
    
def hoveprogram():
    punkt1 = Punkt(2,1,3)
    punkt2 = Punkt(1,5,1)
    print(punkt1.få_avstand(punkt2))
    print()
    punkt3 = Punkt(3,2,1)
    punkt4 = Punkt(1,1,2)
    liste = [ punkt2, punkt3, punkt4]
    print(punkt1.få_nærmeste_punkt(liste))

hoveprogram()
 
import math

class Punkt:
    def __init__(self, x: int, y: int, z: int) -> None:
        self._x = x       
        self._y = y      
        self._z = z

    def __str__(self) -> str:
        return f'som har koordinater x-{self._x} y-{self._y} z-{self._z}'  

    def få_avstand(self, andrePunkt):
        avstand = math.sqrt((andrePunkt._x - self._x)**2 + (andrePunkt._y - self._y)**2 + (andrePunkt._z - self._z)**2)
        return avstand
    
    def få_nærmeste_punkt(self, liste):
        min_avstand = float('inf')  # Start with an infinitely large value
        punkt_min = None  # Initialize with None for the nearest point
        for punkt in liste:
            avstand = self.få_avstand(punkt)
            if avstand < min_avstand:
                min_avstand = avstand
                punkt_min = punkt  # Update the closest point
        return punkt_min

def objectOppretelse():
    x = int(input('skriv coordinaten x: '))
    y = int(input('skriv coordinaten y: '))
    z = int(input('skriv coordinaten z: '))
    punkt1 = Punkt(x, y, z)
    return punkt1

def les_punkter_fra_fil(filnavn):
    punkter1 = []
    with open(filnavn, "r") as fil:  # Use 'with' to handle file closing automatically
        for linje in fil:
            linje = linje.strip()  # Remove any extra whitespace or newline characters
            tall = linje.split(",")
            x = float(tall[0])
            y = float(tall[1])
            z = float(tall[2])
            punkt = Punkt(x, y, z)
            punkter1.append(punkt)
    return punkter1

def hovedprogram():
    gruppe_1 = les_punkter_fra_fil("gruppe1.csv")
    gruppe_2 = les_punkter_fra_fil("gruppe2.csv")

    punkt = objectOppretelse()

    nærmest_gruppe_1 = punkt.få_nærmeste_punkt(gruppe_1)
    nærmest_gruppe_2 = punkt.få_nærmeste_punkt(gruppe_2)

    avstand_gruppe_1 = punkt.få_avstand(nærmest_gruppe_1)
    avstand_gruppe_2 = punkt.få_avstand(nærmest_gruppe_2)

    if avstand_gruppe_1 < avstand_gruppe_2:
        gruppe = 1
        avstand = avstand_gruppe_1
    else:
        gruppe = 2
        avstand = avstand_gruppe_2

    print("Punktet", punkt, "er nærmere gruppe", gruppe)
    print("Avstanden til nærmeste punkt i gruppe", gruppe, "er", avstand)

hovedprogram()

class Sykdom():
    def __init__(self, navn:str) -> None:
        self._navn = navn
        self._positions = []
        self._antall_treff = 0

    def legg_til_position(self, position):
        self._positions.append(position)

    def er_assosiert(self,position):
        return position in self._positions
    
    def sjekk_mutasjon(self, posisjon):
        if self.er_assosiert(posisjon):
            self._antall_treff += 1

    def hent_navn(self):
        return self._navn

    def hent_antall_treff(self):
        return self._antall_treff

class SykdomsKatalog:
    def __init__(self, filnavn) -> None:
        self._sykdommer = {}
        self._les_fil(filnavn)

    def _les_fil(self, filnavn):
        for line in open(filnavn):
            biter = line.strip().split(',')
            position = int(biter[0])
            sykdomsnavn = biter[1]
            if not sykdomsnavn in self._sykdommer:
                self._sykdommer[sykdomsnavn] = Sykdom(sykdomsnavn)
            sykdom = self._sykdommer[sykdomsnavn]
            sykdom.legg_til_position(position)


    def sjekk_mutation(self, position):
        for sykdomsnavn, sykdom in self._sykdommer.items():
            if sykdom.er_assosiert(position):
                sykdom.sjekk_mutasjon(position)
                return sykdomsnavn  # Return the name of the disease if associated
        return "ingen"  # Return "ingen" if no disease is associated with the position

    
    def skriv_sykdoms_treff(self):
        for sykdomsnavn in self._sykdommer:
            sykdom = self._sykdommer[sykdomsnavn]
            print(sykdomsnavn, sykdom.hent_antall_treff())

            


s = Sykdom('Diabetes')
s.legg_til_position(10)
s.legg_til_position(20)
assert s.er_assosiert(10)
assert not s.er_assosiert(15)
print('aight')


katalog = SykdomsKatalog("sykdomer.txt")
assert katalog.sjekk_mutation(14) == "kolera"
assert katalog.sjekk_mutation(28) == "pest"
assert katalog.sjekk_mutation(17) == "pest"
assert katalog.sjekk_mutation(16) == "ingen"
print("Alt bra!")
print()
katalog.skriv_sykdoms_treff()



class TreNode:
    def __init__(self,heltall:int) -> None:
        self._verdi = heltall
        self._venstre = None
        self._høyre = None
    
    def hent_verdi(self):
        return self._verdi
    def har_venstre_barn(self):
        return self._venstre is not None
    def har_høyre_barn(self):
        return self._høyre is not None
    def legg_til_barn(self, verdi):
            if verdi <= self._verdi:
                if self._venstre is None:
                    self._venstre = TreNode(verdi)
                else:
                    self._venstre.legg_til_barn(verdi)
            # Place greater values on the right side
            else:
                if self._høyre is None:
                    self._høyre = TreNode(verdi)
                else:
                    self._høyre.legg_til_barn(verdi)            
    def skriv_ut_sortert(self):
            if self.har_venstre_barn():
                self._venstre.skriv_ut_sortert()

            print(self.hent_verdi())
                
            if self.har_høyre_barn():
                self._høyre.skriv_ut_sortert()
    def søk_verdi(self, verdi):
        if verdi == self._verdi:
            return True
        elif verdi < self._verdi:
            return self._venstre.søk_verdi(verdi) if self._venstre else False
        else:
            return self._høyre.søk_verdi(verdi) if self._høyre else False

  

        
        
object1 = TreNode(8)
object1.legg_til_barn(3)
object1.legg_til_barn(10)
object1.legg_til_barn(4)
object1.legg_til_barn(1)
object1.legg_til_barn(6)
object1.legg_til_barn(15)
object1.legg_til_barn(27)
object1.legg_til_barn(7)

# Check if the structure matches your example
print("Har venstre barn etter:", object1.har_venstre_barn())
print("Har høyre barn etter:", object1.har_høyre_barn())

# Print the sorted values in the tree
print("Treet i sortert rekkefølge:")
object1.skriv_ut_sortert()
print()
print(object1.søk_verdi(15))


class Brev:
    def __init__(self, avsender, mottaker) -> None:
        self._avsender = avsender
        self._mottaker = mottaker
        self._innhold = []
    def skriv_linje(self, tekststreng ):
        self._innhold.append(tekststreng)
    def les_brev(self):
        innhold = "\n".join(self._innhold)  # Join all lines in _innhold with newlines
        brev_tekst = f"Hei, {self._mottaker}\n\n{innhold}\n\nHilsen fra\n{self._avsender}"
        print(brev_tekst)
        
    
object1 = Brev('Mikhail','Lihail')
object1.skriv_linje('eth to the moon')
object1.skriv_linje('bull run very soon')
object1.les_brev()


class Bil:
    def __init__(self, farge, merke):
        self._farge = farge
        self._merke = merke
        self._eier = None

    def sett_eier(self,eier):
        self._eier = eier

    # Magiske metoder for Person.biler()
    def __repr__(self):
        return self._farge + ": " + self._merke


class Person:
    def __init__(self, navn):
        self._mine_biler = [] # Bilene personen eier
        self._leide_biler = [] # Bilene personen ikke eier
        self._navn = navn

    def biler(self):
        print(self._navn)
        print("Biler:", str(self._mine_biler))
        print("Leide biler:", str(self._leide_biler))
        print()        

    def hent_mine_biler(self):
        return self._mine_biler

    def kjop_bil(self, bil):
        self._mine_biler.append(bil)
        bil.sett_eier(self)

    def lei_ut_bil(self):
        return self._mine_biler.pop()

    def lei_bil(self, utlaaner):
        if len(utlaaner.hent_mine_biler()) == 0:
            print("Personen har ingen biler å leie ut.")
        else:
            bil = utlaaner.lei_ut_bil()
            self._leide_biler.append(bil)


bmw = Bil("Gul", "BMW")
vw = Bil("Grønn", "Volkswagen")
kia = Bil("Rod", "Kia")

gunnar = Person("Gunnar")
ivar = Person("Ivar")
levi = Person("Levi")

gunnar.kjop_bil(bmw)
gunnar.kjop_bil(vw)
ivar.kjop_bil(kia)

levi.lei_bil(gunnar)

gunnar.biler()
ivar.biler()
levi.biler()

class Gruppe:
    def __init__(self, kraver:list) -> None:
        self._kraver = kraver
        self._gruppe = []
    def legg_til_personer(self, personer:list):
        self._gruppe.extend(personer)
    def hent_personer(self):
        return self._gruppe
    def hent_krav(self):
        return self._kraver

class Rom:
    def __init__(self, romnummer:int, antallSenger:int,fasiliteter:list) -> None:
        self._romnummer = romnummer
        self._antallSenger = antallSenger
        self._fasiliteter = fasiliteter
        self._rommetLegig = True
        self._gjesterNavner = []
    def reserver(self, navner:list):
        if self._rommetLegig == True:
            self._rommetLegig = False
            self._gjesterNavner = navner
        else:
            print('rommet er opptat')
    def hent_ant_senger(self):
        return self._antallSenger
    def passer(self, kraver:list):
        if self._rommetLegig == True:
            for krav in kraver:
                if krav not in self._fasiliteter:
                    return False
            return True
    def __str__(self) -> str:
        fasiliteter_str = ", ".join(self._fasiliteter)
        return f"Rom {self._romnummer} har {self._antallSenger} senger og fasiliteter: {fasiliteter_str}"
    
class Hotell:
    def __init__(self, hotellnavn):
        self._hotellnavn = hotellnavn
        self._rommene = self.les_rom_informasjon(self._hotellnavn)
    def les_rom_informasjon(self, hotellnavn):
        rom_ordbok = {}
        fil = open(hotellnavn + '.txt')
        for linje in fil:
            deler = linje.strip().split()
            romnr = int(deler.pop(0))
            ant_senger = int(deler.pop(0))
            fasiliteter = deler
            rom_ordbok[romnr] = Rom(romnr, ant_senger, fasiliteter)
        fil.close()
        return rom_ordbok
    def reserver_rom(self, romnummer:int, navner:list):
        self._rommene[romnummer].reserver(navner) 
    def finn_passende_rom(self,kraver:list):
        passende_rom = []
        for rom in self._rommene.values():
            if rom.passer(kraver) == True:
                passende_rom.append(rom)
        return passende_rom

class Reservasjonsystem():
    def __init__(self, hotelnavner:list):
        self._hoteller = self.ordbok_oppretelse(hotelnavner)
    def ordbok_oppretelse(self, hotelnavner):
        ordbok = {}
        for hotelnavn in hotelnavner:
            ordbok[hotelnavn] = Hotell(hotelnavn)
        return ordbok
    def reserver_rom_i_hotell(self,hotelnavn,romnr,gjester):
        self._hoteller[hotelnavn].reserver_rom(romnr,gjester)
    def _finn_alle_passende_rom(self,krav):
        passende_rom = {}
        for hotelnavn in self._hoteller:
            rom_liste = self._hoteller[hotelnavn].finn_passende_rom(krav)
            if len(rom_liste) > 0:
                passende_rom[hotelnavn] = rom_liste
        return passende_rom
    def gruppe_reservasjon(self, gruppe):
        personer = gruppe.hent_personer()
        krav = gruppe.hent_krav()
        passende_rom = self._finn_alle_passende_rom(krav)

        if len(passende_rom) == 0:
            return ['Ingen passende rom']
        
        bekreftelse = ["Bekreftelse på bestilling", "Reserverte rom:"]

        for hotellnavn in passende_rom:
            for rom in passende_rom[hotellnavn]:
                gjester = []
                while len(personer) > 0 and len(gjester) < rom.hent_ant_senger():
                    gjester.append(personer.pop(0))
                rom.reserver(gjester)
                bekreftelse.append(f'{hotellnavn}: {rom}\nGjester: {gjester} \n')

                if len(personer) == 0:
                    return bekreftelse
                
        ant_mangler = len(personer)
        bekreftelse.append(f'NB: Mangler rom til {ant_mangler} personer: {personer}')
        return bekreftelse
    
# Grensesnittet til klassen reservasjon bestar av to metoder:
#   reserver_rom_i_hotell() med parameter krav (liste av strenger)
#   gruppe_reservasjon() med parameter gruppe (referanse til Gruppe-objekt)
#                        som returnerer en bekreftelse (liste av strenger)

class Node :
    def __init__(self, nytt) :
        self._innhold = nytt
        self._neste = None

    def ny_etterfølger (self, ny) :
        self._neste = ny

    def hent_neste (self) :
        return self._neste

    def hent_innhold(self):
        return self._innhold
    
# legger inn noder i listen
startnode = Node("0")
tmp = startnode # "temporary", nåværende Node
for tall in range(1,5):
    tmp.ny_etterfølger(Node(str(tall)))
    tmp = tmp.hent_neste()

# skriver ut innholdet i alle nodene  
tmp = startnode
while tmp is not None:
    print(tmp.hent_innhold())
    tmp = tmp.hent_neste()

tmp = startnode                      # Vi antar minst en node
if tmp.hent_neste() is not None:     # sjekker om kun én
    while tmp.hent_neste().hent_neste() is not None:
       tmp = tmp.hent_neste()
tmp.ny_etterfølger(Node("Ny sistenode"))

def sjekk_om_fyord(setning, fyord, synonym_liste):
    for ord in setning.split():
        if ord == fyord:
            return True
        for liste in synonym_liste:
            if ord in liste and fyord in liste:
                return True
    return False

print(sjekk_om_fyord("spis masse godsaker", "snop",
[["saft","lemonade"],["snacks","snop","godsaker"],["mye","masse"]]))
print()
print(sjekk_om_fyord("spis masse godsaker", "lemonade", [["saft","lemonade"],
["snacks","snop","godsaker"],["mye","masse"]]))


class Emne:
    def __init__(self,emnekode:str, studenter:dict, rettere:list):
        self._emnekode = emnekode
        self._studenter = studenter
        self._rettere = rettere
        self._obliger = {}
    def administrer(self):
        print ("Behandler emnet " + self._emnekode + ". Lovlige kommandoer:")
        print('O: Ny oblig\nF: Frist ute, start retting\nL: Lag eksamenliste\nA: Avslutt')
        print()
        brukerInput = str(input('Gi kommando\n< ')).strip().upper()
        while brukerInput != 'A':
            if brukerInput.strip().upper() == 'O':
                self._opprettOblig()
            elif brukerInput.strip().upper() == 'F':
                self._startRetting()
            elif brukerInput.strip().upper() == 'L':
                self._skrivEksamensListe()
            else:
                print("Ukjent kommando.")
                print()
                print("Behandler emnet " + self._emnekode + ". Lovlige kommandoer:")
                print('O: Ny oblig\nF: Frist ute, start retting\nL: Lag eksamenliste\nA: Avslutt')
                print()
                brukerInput = str(input('Gi kommando\n< ')).strip().upper()
    def _opprettOblig(self):
        obligId = "oblig" + str(len(self._obliger)+1)
        frist = str(input('oppgi frist for oblig\n< '))
        self._obliger[obligId] = Oblig(obligId, frist)
    def _startRetting(self):
        dato = str(input('hva er idags datoen?\n< '))
        for obligId in self._obliger:
            oblig = self._obliger[obligId]
            if oblig.klarForRetting(dato) == True:
                besvarelser = oblig.hentBesvarelser()
                resultater = oblig.fordelRetting(besvarelser,self._rettere)
                for sBruker in resultater:
                    stud = self._studenter[sBruker]
                    res = resultater[sBruker]
                    stud.registrer(obligId, res)
    def _skrivEksamensListe(self):
        liste = []
        for studentId in self._studenter:
            student = self._studenter[studentId]
            if student.altGodkjent(len(self._obliger)):
                liste.append(studentId)
        print("Eksamensliste for emnet "+self._emnekode+":")
        for sBruker in liste:
            print(sBruker)
        
class Student:
    def __init__(self, brukernavn:str, fulltnavn:str):
        self._brukernavn = brukernavn
        self._fulltnavn = fulltnavn
        self._resultater = {}
    def registrer (self,obligId:str,resultat:int):
        self._resultater[obligId] = resultat
    def altGodkjent(self, antOblig:int):
        if antOblig > len(self._resultater):
            return False
        for obl in self._resultater:
            if self._resultater[obl] != 1:
                return False
        return True

class Retter:
    def __init__(self, rett_brukernavn):
        self._rettbrukernavn = rett_brukernavn
    def vurder(self, filnavn):
        return 1

class Oblig:
    def __init__(self, obligenId, leveringsfrist):
        self._obligId = obligenId
        self._leveringsfrist = leveringsfrist
        self._rettetStatus = False
    def klarForRetting(self, dato):
        #return dagensDato > self._frist and not self._rettet
        if self._leveringsfrist < dato and self._rettetStatus == False:
            return True
        else:
            return False
    def hentBesvarelser(self):
        ordbok = {}
        filnavn = self._obligId + ".txt"
        fil = open(filnavn)
        for linje in fil:
            biter = linje.strip().split()
            if len(biter > 1):
                ordbok[biter[0]] = biter[1]
        fil.close()
        return ordbok
    def fordelRetting(self, ordbok, rettere):
        resultater = {} 
        antR = len(rettere)
        rNr = 0
        for sBruker in ordbok:
            retter = Retter(rettere[rNr])
            res = retter.vurder(ordbok[sBruker])
            resultater[sBruker] = res
            rNr += 1
            if rNr == antR:
                rNr = 0

        self._rettetStatus = True
        return resultater


def badmington(per_vil, palle_vil, espen_vil):
    return per_vil and palle_vil and not espen_vil or per_vil and espen_vil and not palle_vil or palle_vil and espen_vil and not per_vil

print(badmington(True,True,False))


def heie(tabellplass_ordbok):
    if tabellplass_ordbok['Brann'] <= 3:
        return 'Brann'
    else:
        for key in tabellplass_ordbok:
            if tabellplass_ordbok[key] == 1:
                return key 


def bordsetting(introverte, ekstroverte):
    liste = []
    index = 0
    for i in range(len(introverte)):
        liste.append(introverte[index])
        liste.append(ekstroverte[index])
        index+=1
    return liste

print(bordsetting(["Per","Palle","Espen"], ["Putti", "Plutti", "Pott"]))


def lag_interessegrupper(personers_interesse):
    tom_ordbok = {}
    for persjon in personers_interesse:
        if personers_interesse[persjon] in tom_ordbok:
            tom_ordbok[personers_interesse[persjon]].append(persjon)
        else:
            tom_ordbok[personers_interesse[persjon]] = [persjon]
    return tom_ordbok


print(lag_interessegrupper({"Per":"Mat","Palle":"Film","Espen":"Mat","Misha":"Film" }))

def stigespill(terningkast:list, stiger:dict):
    position = 0
    for i in terningkast:
        position += i
        if position in stiger:
            position = stiger[position]
    return position

print(stigespill([5,4,2,2],{5:12,18:7}))

def hvilke_tre_kast(slutt_rute, stiger):
    muligheter = []
    for t1 in range(1,7):
        for t2 in range(1,7):
            for t3 in range(1,7):
                mulighet = [t1,t2,t3]
                if stigespill(mulighet, stiger) == slutt_rute:
                    muligheter.append(mulighet)
    return muligheter

print(hvilke_tre_kast(5, {3:15, 17:4}))


class Gruppe:
    def __init__(self, kraver:list):
        self._kraver = kraver
        self._gruppe = []
    def legg_til_personer(self,personner:list):
        for person in personner:
            self._gruppe.append(person)
    def hent_personer(self):
        return self._gruppe
    def hent_krav(self):
        return self._kraver

class Rom:
    def __init__(self, romnummer, antall_senger, fasiliteter):
        self._romnummer = romnummer
        self._antall_senger = antall_senger
        self._fasiliteter = fasiliteter
        self._gjester = []
    def reserver(self, gjester:list):
        self._gjester = gjester
    def hent_ant_senger(self):
        return self._antall_senger
    def passer(self, kraver):
        if len(self._gjester) > 0: 
            return False
        for krav in kraver:
            if krav not in self._fasiliteter:
                return False  
        return True
    def __str__(self):
        return f'Hotell rommet nummer {self._romnummer} består av {self._antall_senger} senger og {self._fasiliteter}'

class Hotell:
    def __init__(self, hotellnavnet):
        self._hotellnavnet = hotellnavnet
        self._hotellrom = self.lesinformasjon(hotellnavnet)
    
    def lesinformasjon(hotellnavnet):
        ordbok = {}
        fil = open(hotellnavnet + ".txt")
        for linje in fil:
            biter = linje.strip().split()
            romnr = int(biter.pop(0))                                   # Bruker pop() som fjerner og returnerer element på gitt indeks (her første element)
            ant_senger = int(biter.pop(0))                              # Samme som over, igjen første element siden romnr ble fjernet
            fasiliteter = biter                                         # Resten av deler-listen vil være eventuelle fasiliteter
            ordbok[romnr] = Rom(romnr, ant_senger, fasiliteter)
        fil.close()                                                     # Husk å lukke fil:)
        return ordbok
    def reserver_rom(self, romnummer, navner):
        self._hotellrom[romnummer].reserver(navner)
    def finn_passende_rom(self,krav):
        passende_rommer = []
        for rom in self._hotellrom.values():
            if rom.passer(krav):
                passende_rommer.append(self._hotellrom[rom])
        return passende_rommer
class Reservasjonssystem:
    def __init__(self, hotellnavner:list):
        self._hoteller = {}
        for hotellnavn in hotellnavner:
            self._hoteller[hotellnavn] = Hotell(hotellnavn)
    def reserver_rom_i_hotell(self, hotellnavn, romnummer, gjester):
        self._hoteller[hotellnavn].reserver_rom(romnummer, gjester)
    def _finn_alle_passende_rom(self, fasiliteter):
        ordbok = {}
        for key,value in self._hoteller.items():
            rom_liste = value.finn_passende_rom(fasiliteter)
            if len(rom_liste) > 0:
                ordbok[key] = rom_liste
        return ordbok
    def gruppe_reservasjon(self, Gruppe):
        personner = Gruppe.hent_personer()
        kraver = Gruppe.hent_krav()
        passende_rom = self._finn_alle_passende_rom(kraver)
        if len(passende_rom) == 0:
            return ["Ingen passende rom"]

        bekreftelse = ["Bekreftelse på bestilling", "Reserverte rom:"]

        for hotellnavn,rommeListe in passende_rom.items():
            for rom in rommeListe:
                gjester = []
                while len(personner) > 0 and len(gjester) < rom.hent_ant_senger():
                    gjester.append(personner.pop(0))
                rom.reserver(gjester)
                bekreftelse.append(f"{hotellnavn}: {rom} \nGjester: {gjester} \n")

                if len(personner) == 0:
                    return bekreftelse

            ant_mangler = len(personner)
            bekreftelse.append(f"NB: Mangler rom til {ant_mangler} personer: {personner}")
            return bekreftelse

# Grensesnittet til klassen reservasjon bestar av to metoder:
#   reserver_rom_i_hotell() med parameter krav (liste av strenger)
#   gruppe_reservasjon() med parameter gruppe (referanse til Gruppe-objekt)
#                        som returnerer en bekreftelse (liste av strenger)


def karantene(vaksinert, farge):
    if not vaksinert:
        if farge == 'groenn':
            return 3
        elif farge == 'roed' or 'oransje':
            return 10 
    else:
        return 0

assert karantene(True, "roed") == 0
assert karantene(False, "oransje") == 10


def tell_grader(fag, bsc, msc):
    if fag != bsc and fag != msc:
        return 0
    elif fag == bsc and fag == msc:
        return 2 
    else:
        return 1

assert tell_grader("informatikk", "informatikk", "informatikk") == 2
assert tell_grader("historie", "informatikk", "informatikk") == 0
assert tell_grader("historie", "historie", "informatikk") == 1


def fjern_vokaler(setning, vokal_liste):
    ny_setning = ''
    for bokstav in setning:
        if bokstav not in vokal_liste:
            ny_setning += bokstav
    return ny_setning

print(fjern_vokaler("ha det fint", ["a", "e", "i", "o", "u"]))
assert fjern_vokaler("ha det fint", ["a", "e", "i", "o", "u"]) == 'h dt fnt'

def summer_rabatt(vareliste:list, forpris:dict, nypris:dict):
    rabbaten = 0
    for varen in forpris:
        rabbaten += forpris[varen]
    for varen in nypris:
        rabbaten -= nypris[varen]
    return rabbaten
    
print(summer_rabatt(["laptop", "ryggsekk"], {"laptop":5000, "ryggsekk":900},
{"laptop":4000, "ryggsekk":600}))
assert summer_rabatt(["laptop", "ryggsekk"], {"laptop":5000, "ryggsekk":900}, {"laptop":4000, "ryggsekk":600}) == 1300


def sjekk_reise(reise: list) -> bool:
    # Iterate through consecutive pairs of journeys in reise
    for i in range(len(reise) - 1):
        # Check if the destination of the current journey matches the origin of the next
        if reise[i][1] != reise[i + 1][0]:
            return False
    return True

# Example usage
print(sjekk_reise([["Spania", "Frankrike"], ["Frankrike", "Norge"]]))  # Should return True
print(sjekk_reise([["Spania", "Frankrike"], ["Norge", "Sverige"]]))  # Should return False


class Onske:
    def __init__(self, beskrivelse, antall, minimumspris):
        self._beskrivelse = beskrivelse
        self._antall = antall
        self._minimumspris = minimumspris
    def passer(self, maksimumspris): 
        if self._minimumspris > maksimumspris or self._antall == 0:
            return False
        return True
    def valgt(self):
        self._antall - 1
        return self._beskrivelse
    def __str__(self):
        return f'onske beskrivelse er: {self._beskrivelse} og minimumspris er: {self._minimumspris}'

class Onskeliste:
    def __init__(self):
        self._onskelisten = []
    def nytt_onske(self, beskrivelse, antall, minimumspris):
        nytt = Onske(beskrivelse, antall, minimumspris)
        self._onskelisten.append(nytt)
    def hent_onsker(self,maksimumspris):
        liste = []
        for onske in self._onskelisten:
            if onske.passer(maksimumspris):
                liste.append(str(onske))
            else:
                liste.append('Ikke valgbart onske')
        return liste
    def onske_oppfylles(self, onske:int):
        return self._onskelisten[onske].valgt()

class Gave:
    def __init__(self, beskrivelse, giver):
        self._beskrivelse = beskrivelse
        self._giver = giver
    def __str__(self):
        return f'denne gaven er {self._beskrivelse} fra {self._giver}'
    
class Juleferiekalender:
    def __init__(self, antall_dager):
        self._ordbok = {}
        dag_nr = 25
        for teller in range(antall_dager):
            self._ordbok[dag_nr] = None
            dag_nr += 1
            if dag_nr == 32:
                dag_nr = 1
    def ny_gave(self, beskrivelse, giver, dagen):
        self._ordbok[dagen] = Gave(beskrivelse, giver)
    def hent_dagens_gave(self, dagnummer):
        teksten = ". desember: "
        if dagnummer < 25:
            teksten = ". januar: "
        if dagnummer in self._ordbok:
            teksten += str(self._ordbok[dagnummer])
            return str(dagnummer) + teksten
        else:
            return 'det ikke ligger noen gave i kalenderen for denne dagen'
    def hent_ant_dager(self):
        return len(self._ordbok)

class Julegavefikser:
    def __init__(self, antall_dager):
        self._juleferiekalender = Juleferiekalender(antall_dager)
        self._onskeliste = Onskeliste()
        self._neste_dag = 25
    def les_onsker_fra_fil(self, filnavn):
        fil = open(filnavn)
        for linje in fil:
            deler = linje.strip().split(';')
            self._onskeliste.nytt_onske(deler[0],deler[1],deler[2])
        fil.close()
    def velg_gave(self, giver):
        max_pris = int(input("\nHva er hoyeste pris du vil betale? "))
        meny = self._onskeliste.hent_onsker(max_pris)
        onske_nr = 0
        for onske in meny:
            print ("Onske nr " + str(onske_nr) + ": " + onske)
            onske_nr += 1
        valgt_nr = int(input("Hvilken gave vil du gi? "))
        beskrivelse = self._onskeliste.onske_oppfylles(valgt_nr)

        ant_dager = self._juleferiekalender.hent_ant_dager()
        slutt_dag = (24+ant_dager)
        slutt_dato = str(slutt_dag) + ". desember"
        if slutt_dag > 31:
            slutt_dato = str(slutt_dag-31) + ". januar"

        print("Juleferiekalenderen starter 25. desember og slutter " + slutt_dato)
        foretrukket_dag = int(input("Oppgi dato (kun dag) du helst vil gi gaven: "))

        self._juleferiekalender.ny_gave(beskrivelse, giver, foretrukket_dag)
    def ny_dag(self):
        if self._neste_dag < 31:
            self._neste_dag += 1
        else:
            self._neste_dag = 1  
        return self._juleferiekalender.hent_dagens_gave(self._neste_dag)



def penger(fremkroninger,kronestykker):
    return fremkroninger * 5 + kronestykker

print(penger(2,3))

def barnMedVoksen(alder1,alder2):
    if alder1 < 18 and alder2 >= 18:
        return True
    elif alder1 >= 18 and alder2 < 18:
        return True
    else:
        return False

print(barnMedVoksen(18,5))
print(barnMedVoksen(10,20))
print(barnMedVoksen(20,30))

def fyllTilTi(tallene:list):
    if len(tallene) == 10:
        return tallene
    else:
        difference = 10 - len(tallene)
        for i in range(difference):
            tallene.append(0)
    return tallene

print(fyllTilTi([1,5,3]))


def nodeOppretelse():
    listeStart = Node('c')
    andreNode = Node('a')
    tredjeNode = Node('b')
    listeStart.settInn(andreNode)
    andreNode.settInn(tredjeNode)
    
nodeOppretelse()

def distribute_money(money, children):
    # Check if it's impossible to give at least 1 dollar to each child
    if money < children:
        return -1

    # Start by giving each child 1 dollar (minimum required)
    remaining_money = money - children

    # Calculate the maximum number of children who can receive exactly 8 dollars
    max_eight_dollars = min(remaining_money // 7, children)  # Giving 7 more (8 total) to some children
    remaining_money -= max_eight_dollars * 7
    children -= max_eight_dollars

    # Handle the case where remaining children must avoid receiving 4 dollars
    if children == 0:
        return max_eight_dollars
    if remaining_money == 4 and children == 1:
        return max_eight_dollars - 1  # Adjust to avoid exactly 4 for one child

    return max_eight_dollars

# Test cases
print(distribute_money(20, 3))  # Output: 1
print(distribute_money(25, 5))  # Output: 0
print(distribute_money(30, 4))  # Output: 2

class Hytte:
    def __init__(self, navn, antallSenger, pris):
        self._navn = navn
        self._antallSenger = antallSenger
        self._pris = pris
    def hentNavn(self):
        return self._navn
    def totPris(self, antallPersoner):
        return self._pris * antallPersoner
    def sjekkPlass(self, antallPersoner):
        return self._antallSenger >= antallPersoner
    def __str__(self):
        return f'Hei!\nHytta "{self._navn}" består av {self._antallSenger}\nog det koster {self._pris} per seng'
    def __eq__(self, value):
        return self._navn == value._navn 
    
class Tur:
    def __init__(self, listerMedHytter, beskrivelse):
        self._listerMedHytter = listerMedHytter
        self._beskrivelse = beskrivelse
    def skrivTur(self):
        print(self._beskrivelse)
        print()
        print('informasjon om hver hytte på denne turen:')
        print()
        for hytta in self._listerMedHytter:
            print(str(hytta))
            print()
    def sjekkPrissPlass(self, antallPersonner, maskbeløp):
        turenPrisen = 0
        for hytta in self._listerMedHytter:
            turenPrisen += hytta.totPris(antallPersonner)
            if not hytta.sjekkPlass(antallPersonner):
                return False
        return maskbeløp > turenPrisen
    def hentAntallHyterr(self):
        return len(self._listerMedHytter)
    
class Turplanlegger:
    def __init__(self, dataForHytter, dataforTuren):
        self._ordbokHytter = self._hytterFrafil(dataForHytter)
        self._turerListen = self._turerFraFil(dataforTuren)
    def _hytterFrafil(self, filnavn):
        ordbok = {}
        fil = open(filnavn)
        for linje in fil:
            delene = linje.strip().split()
            ordbok[delene[0]] = Hytte(delene[0], delene[1], delene[2])
        fil.close()
        return ordbok

    def _turerFraFil(self, filnavn):
        fil = open(filnavn)
        turer = []
        linje = fil.readline().strip()
        while linje != "" :
            linje2 = fil.readline()
            hyttenavn = linje2.split()
            hytteliste = []	
            for ettNavn in hyttenavn :	
                hytteliste.append(self._hytter[ettNavn])
            turer.append(Tur(hytteliste, linje))	
            linje = fil.readline().strip()
        fil.close()
        return turer			

    def finnTurer(self, antallPersoner, maskBeløp, maksAntallDger):
        liste = []
        for turen in self._turerListen:
            if turen.sjekkPrissPlass(antallPersoner, maskBeløp):
                if maksAntallDger >= len(turen.hentAntallHyterr()):
                    liste.append(turen)
        for tur in liste:
            tur.skrivtur()
            
            
turen = Turplanlegger('hytter.txt', 'turer.txt')
turen.finnTurer(7, 7000, 5)
'''
def ring(i, list):
    while list[i] != -1:
        i = list[i]
    return i

def gyldig(liste):
    for start in range(len(liste)):
        i = start
        while liste[i] != -1:
            i = liste[i]
            if i == start:
                return False
    return True



















    








            
        





       

    








    




    

    



    




    


    
    

      





    





    
            









            


    




          








           




             
         









        
    
    
    






        




        




    






    
    
        
   

	


    
        
                
    





        

        

        
        


    
                
            
            
            





        





















    


    



    






    








    
        
        

            


        

    

    

    










    
    













    


      


       




           

           


            

        
        

    
        

    


        




    









    











    
      










    
        
        
        
        



    
    











    















        

    



    





        

            


                
       





    
    












    





    
    













 

















    





