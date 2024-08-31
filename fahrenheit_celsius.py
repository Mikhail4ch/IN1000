# Dette programmet mottar input fra brukeren, lagrer disse dataene i 
# variabler, viser dem og til slutt, ved å bruke formelen, vises nye utdata

print('----------------------------------------------')

tempInFahrenheit = int(input('skriv en temperatur i fahrenheit: '))
print(f'Temperatur er: {tempInFahrenheit} °F')
print('----------------------------------------------')

tempinCelsius = ((tempInFahrenheit) -32) * 5/9
print(f'Temperatur er: {round(tempinCelsius,2)} °C')
print('----------------------------------------------')



