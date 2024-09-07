# dette programmet vil sjekke brukerens geografiske
# kunnskap og vil gi en vurdering basert på ti svar.
# Til syvende og sist vil det gi en premie for quizen 
# i form av en trekant, hvis høyde avhenger av 
# karakteren som er mottatt.

# denne gangen endret jeg arkitekturen til programmet mitt og det ser ut til
#  at jeg har oppnådd ønsket resultat. For det første, ved å bruke listene for 
# spørsmål og svar samt for-løkken, klarte jeg å oppnå kodereduksjon, som jeg 
# strebet etter sist gang. Ved å bruke ordboken basert på resultatet av quizen 
# sørget jeg også for at en bestemt kommentar ble vist. Til slutt, ved å bruke 
# kapitalisere()-metoden, utjevnet jeg feilen i det riktige svaret, avhengig av 
# hvilken bokstav svaret begynner med.

print('-------------------------------------------')
print('Velkommen til den korte geografiske quizen!')
print('-------------------------------------------')
print('')


spørsmål = ['hva er hovedstaden i Storbritannia?', 'hva er hovedstaden i Australia?', 
            'Hvor mange kontinenter er det totalt?', 'ved hvilken pol ligger Antarktis?', 
            'ligger Mexico i Nord- eller Sør-Amerika?', 'Hva er den største elven i Europa?']
riktigSvarer = ['London', 'Canberra', '4', 'Sørpol', 'Nord', 'Volga']
kommentarer = {
    1 : 'you need more practice :(',
    2 : 'could be better',
    3 : 'not bad, but there is still room for improvement!',
    4 : 'good job, but still not MVP',
    5 : 'Bravo ! Thats truely impressive!!',
    6 : 'man of the match and man of the day :)'
}
riktigSvarCount = 0
def quiz():
    global riktigSvarCount
    for i in spørsmål:
            print(i)
            svaret = str(input('svaret ditt: '))
            svaret = svaret.capitalize()
            if svaret in riktigSvarer:
                riktigSvarCount += 1
    print('-------------------------------------------')
    print(kommentarer[riktigSvarCount])
    print('-------------------------------------------')
      
quiz()
print()
print('premien din er nedenfor :)')
print()

i = 0
amountOfStars = 1
spaces = ' '
amountOfSpaces = riktigSvarCount - 1
while i < riktigSvarCount:
   print(spaces * amountOfSpaces, '*' * amountOfStars )
   i += 1
   amountOfStars += 2
   amountOfSpaces -= 1


   
   


            

        


        

    








