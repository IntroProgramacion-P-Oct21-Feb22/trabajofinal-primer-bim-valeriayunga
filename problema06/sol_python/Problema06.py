limite = int(100)
numerador=int(1)
denominador=int(2)
cadena =str("")
suma=float(0)

while denominador <= limite:
    suma = suma + (numerador / denominador)
    cadena = ("%s + %d / %d" %(cadena,numerador,denominador))
    denominador = denominador + 1

suma = ("%.2f" %suma)

print(f"Cadena: {cadena}")
print(f"Suma total de la serie:",suma)
