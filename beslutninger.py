'''
Dette programmet mottar data fra brukeren og ved å 
kjøre gjennom "hvis" uttrykk viser det visse meldinger.
'''

print('---------------------------------------')

svaret = input('har du lyst på en brus? ')

print('---------------------------------------')

if svaret == 'ja':
    print('Her har du en brus!')
elif svaret == 'nei':
    print('Den er grei.')
else:
    print('Det forsto jeg ikke helt.')
    
print('---------------------------------------')
