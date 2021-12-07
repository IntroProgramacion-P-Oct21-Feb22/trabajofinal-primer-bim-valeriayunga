import lista as lista

suma=float(0)
acumulador=float(0)
acMedia=float(0)
bandera=True
salida=str("")
suma1 = 0
columana=0
while bandera ==True:
    dato=float(input("Ingrese los datos que desee"))

    suma = suma + dato
    acumulador = acumulador +1


    salida = input("Si desea salir del ciclo, ingrese si")

    if salida == "si":

        break


media=float(suma/ acumulador)


media=("%.2f" % media)

print(f" La media es: {media}")


