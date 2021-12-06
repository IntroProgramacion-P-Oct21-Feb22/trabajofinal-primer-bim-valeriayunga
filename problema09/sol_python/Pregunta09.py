limite=int(44)
numero1=int(12)
numero2=int(11)

cadena=str("S1 = ")
while numero2 <= limite:
        cadena = ("%s  %d - %d +" % (cadena, numero1, numero2))

        suma = int(numero1 + numero2)

        numero1=numero1 + 12
        numero2=numero2 + 11



print(cadena)
print(suma)