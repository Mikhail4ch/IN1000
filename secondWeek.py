
password = int(input('What is the password? '))

if password == 1234:
    print('welcome to the club')
    print('')
else:
    print('you have no access, sorry, bye')
    exit('')

npcQuestion = input('water or soda or something else? ')

if npcQuestion == 'water' or npcQuestion == 'soda':
    print('you are a good actor dude')
    print('')
elif npcQuestion == 'something else':
    print('atta boy !')
    print('')
else:
    print('we gonna kick you from here on out')
    print('')

heightOfTriangle = int(input('What will be the height of triangle? '))
print('')
i = 0
amountOfStars = 1
spaces = ' '
amountOfSpaces = heightOfTriangle
while i < heightOfTriangle:
   x = amountOfSpaces  - 1
   print(spaces * x, '*' * amountOfStars )
   i += 1
   amountOfStars += 2
   amountOfSpaces -= 1

x += 1
amountOfStars -= 4
while i < heightOfTriangle * 2:
   print(spaces * x, '*' * amountOfStars)
   i += 1
   amountOfStars -= 2
   x += 1 
    





