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
'''









 

















    





