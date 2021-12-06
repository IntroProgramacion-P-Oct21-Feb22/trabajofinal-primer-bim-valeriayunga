x = float(input("Ingresar el punto x"))
y = float(input("Ingresar el punto y"))


if x >=0 and y >=0:
    cuadrante = str("1er Cuadrante")

elif (x <=0 and y >=0):
    cuadrante = str("2do Cuadrante")

elif x <=0 and y <=0:
    cuadrante = str("3er Cuadrante")

elif x >=0 and y <=0:
    cuadrante = str("4to Cuadrante")

elif x ==0 and y ==0:
    cuadrante = str("no pertenece a ningún cuadrante")


print(f"La coordenada ({x};{y}) está ubicada en el {cuadrante}")