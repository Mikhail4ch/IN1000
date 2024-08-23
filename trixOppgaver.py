a = input("Første tall: ")
b = input("Andre tall: ")
c = input("Tredje tall: ")


print("Største verdien er: ")

if a >= b and a >= c:
    print(a)
    stoerst = a
elif b >= a and b >= c:
    print(b)
    stoerst = b
else:
    print(c)
    stoerst = c


teller = 0

if a == stoerst:
    teller = teller + 1

if b == stoerst:
    teller = teller + 1

if c == stoerst:
    teller = teller + 1

if teller == 1:
    print("1 verdi er lik den største verdi.")
else:
    print(teller, "verdier er lik den største verdi.")
