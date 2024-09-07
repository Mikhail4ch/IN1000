# Dette enkle programmet skriver bare ut en ordbok som 
# er opprettet på forhånd og inneholder mat som nøkkel og pris som verdi.
# I tillegg ber det brukere to ganger om inndataene for å lage
# nye to nøkkel/verdi-par i ordboken. Til slutt skriver den ut ordboken igjen

varer = {
'melk': 14.90,
'brød': 24.90,
'yoghurt': 12.90,
'pizza': 39.90
}
print(varer)
print('-------------------------------------')

varenavnet1 = str(input('varenavnet: '))
varer[varenavnet1] = float(input('prisen: '))
varenavnet2 = str(input('varenavnet: '))
varer[varenavnet2] = float(input('prisen: '))
print(varer)
print('-------------------------------------')