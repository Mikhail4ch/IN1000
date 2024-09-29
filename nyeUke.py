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
'''


    
     




           

           


            

        
        

    
        

    


        




    









    











    
      










    
        
        
        
        



    
    











    















        

    



    





        

            


                
       





    
    












    





    
    













 

















    





