suma=float(0)
acumulador=float(0)
acMedia=float(0)
bandera=True

while bandera:
        resultado=float(input("Ingrese los datos que desee"))

        suma = suma + resultado
        acumulador = acumulador +1
        acMedia=acMedia+resultado *resultado

        salida = str(input("Si desea salir del ciclo, ingrese (si)"))

        if salida ==("si") :

                bandera == False



media=float(suma + acumulador)
varianza=float(acMedia/(resultado-1)-(suma*suma))

print("f La media es: %.2f",media)
print("f La varianza es : %.2f",varianza)



