contador = int(2)
numero=int(2)

par_ingresado=int(input("Ingrese en número par mayor a 2"))

if par_ingresado<2:
    print("Valor erroneo")
else:
    while numero<par_ingresado:
        numero = numero + contador


print("La suma impar es", numero)