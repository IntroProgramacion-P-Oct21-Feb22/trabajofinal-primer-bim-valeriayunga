
angulo_A = float(input("Ingrese el ángulo A"))
angulo_B = float(input("Ingrese el ángulo B"))
angulo_C = float(input("Ingrese el ángulo C"))

if (angulo_A==90 or angulo_B==90 or angulo_C==90) :
    print("El tipo de triángulo es retángulo")

elif (angulo_A > 90 and angulo_A < 180 or angulo_B > 90 and angulo_B < 180 or angulo_C > 90 and angulo_C < 180) :
    print("El tipo de triángulo es obtusángulo")
elif (angulo_A < 90 or angulo_B < 90 or angulo_B < 90):
    print("El tipo de triángulo es obtusángulo")

