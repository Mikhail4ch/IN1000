'''
svar = input(input('sprsm: '))
print(f'du, {svar}')



tall1 = int(input('first number: '))
tall2 = int(input('second number: '))

if tall1 < tall2:
    print(f'minst er: {tall1}')
else:
    print(f'minst er: {tall2}')


tall1 = int(input('first number: '))
tall2 = int(input('second number: '))
tall3 = int(input('third number: '))

if tall1 < tall2 and tall1 < tall3:
    print(f'minst er: {tall1}')
elif tall2 < tall1 and tall2 < tall3:
    print(f'minst er: {tall2}')
else:
    print(f'minst er: {tall3}')

-----------------------------------------

alder = int(input('hvor gammel er du? '))

if alder < 3:
    print('lek i lekegrinda')

elif alder < 6:
    print('lek i skogen')


def my_sum(
        a = int | float,
        b = int | float
):
    print(a + b)


my_sum(9.5, 4.5)


#Oppgaver 

#1
heltall1 = int(input('int1: '))
heltall2 = int(input('int2: '))
flyttall1 = float(input('float1: '))
flyttall2 = float(input('float1: '))

summen1 = heltall1 + heltall2
summen2 = flyttall1 + flyttall2
produktet1 = heltall1 * heltall2
produktet2 = flyttall1 * flyttall2
print(f'summen 1: {summen1} \nsummen 2: {summen2}')
print(f'produktet 1: {produktet1} \nproduktet 2: {produktet2}')


#2

flyselskap = "Norwegian"
rutenummer = 8537
print(flyselskap + "s", "rute " + rutenummer + ".")


flyselskap = "Norwegian"
rutenummer = 8537
print(f'{flyselskap}s, rute {rutenummer}.')

flyselskap = "Norwegian"
rutenummer = 8537
print(flyselskap,"s", "rute ", rutenummer,".")

#4
def opprett_bankkonto():             #name of function 
    print("Velkommen til opprettelse av bankkonto!")  #first output line 
    saldo = float(input("Skriv inn inngående saldo: ")) # assigning value to saldo variable 
    if(saldo == 0): #first condition and its checking 
        print("Du kan ikke opprette konto med 0 kroner.") #if the condition is true it gonna be the second line of output
    elif(saldo < 0): #checkig the second condition if the firse was false 
        print("Du kan ikke opprette konto med et negativt beløp.") #if the condition is true it gonna be the second line of output
    else: # running this line of code it both conditions are false 
        print("Konto er opprettet med " + str(saldo) + " kroner.")
opprett_bankkonto() # call of function 

#Trix oppgaver 

navn = input('hva heter du? ')


def si_hei ():
    print('Hei')

si_hei()
si_hei()
si_hei()
print(navn)

streng = str(input('skriv steng: '))
heltall = int(input('skriv heltall: '))
flytall = float(input('skriv flytall: '))
print(type(streng), type(heltall), type(flytall))

print (flytall * streng)

11
4
14
23
42

a = 10
b = "hei!"
c = a + b
print(c)

def min_prosedyre ():
    print('Hei student')
    print("Velkommen til et nytt semester!")

def linjeskift():
    print('')

min_prosedyre()
linjeskift()
min_prosedyre()

def sauefakta():
    print('Sauer er dumme dyr.')
    print('Sauer er myke dyr.')
    print('Sauer kan lofte 12 ganger sin egen vekt.')
    print('Sauer lukter litt som geiter.')
    print('Sauen er din venn.')

sauefakta()
print('*** En gang til! ***')
sauefakta()

def difference():
    x = int(input('x = '))
    y = int(input('y = '))
    print(x-y)

difference()

kroppstemperaturen = int(input('hva er temp din? '))

if kroppstemperaturen >= 36.5 and kroppstemperaturen <= 37.5:
    print('you are healthy man')
elif kroppstemperaturen > 37.5:
    print('it is over normal')
else:
    print('it is under normal')

income = float(input('what is your income? '))

if income <= 10000:
    incomeAfterTax1 = income * 0.1
    print(incomeAfterTax1)
else:
    incomeWithTax30 = (income - 10000) * 0.3
    incomeAfterTax2 = 1000 + incomeWithTax30
    print(incomeAfterTax2)


def calculator():
    firstNumber = int(input('firstNum: '))
    operation = input('operation: ')
    secondNumber = int(input('secondNum: '))

    if operation == '*':
        result = firstNumber * secondNumber
    elif operation == '/':
        result = firstNumber / secondNumber
    elif operation == '+':
        result = firstNumber + secondNumber
    elif operation == '-':
        result = firstNumber - secondNumber
    else:
        print('I dont know how to do this type of operations')
    
    print(result)

calculator()

print('welcome to the store buddy')
Brød = 20 
Melk = 15 
Ost = 40 
Yoghurt = 12 
brødBeløp = int(input('hvor mye brød skal du kjøpe? '))
melkBeløp = int(input('hvor mye melk skal du kjøpe? '))
ostBeløp = int(input('hvor mye ost skal du kjøpe? '))
yoghurtBeløp = int(input('hvor mye yoghurt skal du kjøpe? '))

print(f'Du skal betale: {Brød * brødBeløp + Melk * melkBeløp + Ost * ostBeløp + Yoghurt * yoghurtBeløp}')


radius = float(input('radius: '))
diameter = 2 * radius
area = 3.14 * radius**2
circumference = 2 * 3.14 * radius

print(f'Diameter: {round(diameter,2)} \nArea: {round(area,2)} \nCircumference: {round(circumference,2)}')

bus = 0

firstStation = int(input('how many people are waiting for the bus? '))
if bus + firstStation <= 30:
    bus += firstStation
    secondStation = int(input('how many people are waiting for the bus? '))
    if bus + secondStation <= 30:
        bus += secondStation
        thirdStation = int(input('how many people are waiting for the bus? '))
        if bus + thirdStation <= 30:
            bus += secondStation
            print(f'Bussen er fremme med {bus} personer ombord!')   
        else:
            print(f'Bussen er full. {bus + thirdStation - 30} må gå til fots.')
            print(f'Bussen er fremme med 30 personer ombord!')
    else:
        print(f'Bussen er full. {bus + secondStation - 30} må gå til fots.')
        print(f'Bussen er fremme med 30 personer ombord!')
else:
    print(f'Bussen er full. {bus + firstStation - 30} må gå til fots.')
    print(f'Bussen er fremme med 30 personer ombord!')

isPrisen = 30
ostPizza = 80
vanligPizza = 100

def spoer_is():
    mengde = int(input('hvor mange is du vil ha? '))
    print(f'Total priser er: {isPrisen * mengde} NOK')

def spoer_pizza():
    pizzaTypen = str(input('Hva slags pizza vil du ha? '))
    if pizzaTypen == 'ost' or pizzaTypen == 'Ost' :
        print(f'Det er en {pizzaTypen} pizza og det koster: {ostPizza} NOK')
    else:
        print(f'Det er en {pizzaTypen} pizza og det koster: {vanligPizza} NOK')

def spoer_spise():
    måltid = str(input('hva ønsker du å spise? '))
    if måltid == 'is' or måltid == 'Is':
        spoer_is()
    elif måltid == 'pizza' or måltid == 'Pizza':
        spoer_pizza()
    else:
        print('Vi ikke selger det -_- sorry -_-')

spoer_spise()
'''
# Du skal ikke å endre disse prosedyrene
def skriv_ascii_1():
    print("   |\---/|\n   | ,_, |")

def skriv_ascii_2():
    print(" -    |``__)/\n--.'(_, |   |\, |")

def skriv_ascii_3():
    print("(__..._(_,..,_..__.'/|\n  '   __\_)/'.....+")

def skriv_ascii_4():
    print("    \_`_/-..----.\n ___/ `   ' ,""+   \\")

def skriv_ascii_5():
    print("(__...'   __\    |`.___.';\n  (_,...'(_,.`__)/'.....+")

def skriv_ascii_6():
    print("(__.._\    .(_,.`__);\n  ../'..'   _  __\_)/+")

def skriv_ascii():
    a = True
    b = int("3")
    c = 5 
     
    if a:
     skriv_ascii_1()   
    else:
         skriv_ascii_2()
    if b + 3 == c:
         skriv_ascii_3()
    elif c > b:
         skriv_ascii_4()
         
    if not a == False:
     skriv_ascii_5()    
    else:
         skriv_ascii_6()
 
skriv_ascii()

 




    

    



