numero1 = int(input("Ingresar el primer número"))
numero2 = int(input("Ingresar el segundo número"))
numero3 = int(input("Ingresar el tercer número"))



if (numero1 == numero2) or (numero1 == numero3) or (numero2 == numero3):
    print("Valores incorrectos")

elif (numero1 > numero2) and (numero1>numero3):
    mayor = int(numero1)

elif (numero2 > numero1) and (numero2>numero3):
    mayor = int(numero2)

elif (numero3 > numero1) and (numero3 >numero1):
    mayor = int(numero3)


print(f"El número mayor es: {mayor}")