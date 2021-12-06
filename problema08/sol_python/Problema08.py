cadena=str("")
contador=int(1)

limite=int(input("Ingrese el límite de la tabla"))

tarta = float(12) #pulgadas
yarda=float(3) #tartas
pulgada=float(2.54) #cm
metro=(100) #cm


while contador <= limite:
    pulgada1 = float(pulgada / metro)
    tarta1 = float((pulgada / metro) / tarta)
    yarda1 =float(((pulgada / metro) / tarta) / yarda)

    cadena=("%s Metro: %d m  Yarda: %.5f m  Pulgada: %.5f m  Tarta: %.5f m\n" %
            (cadena,contador,yarda1,pulgada1,tarta1))

    contador = contador + 1
    metro = metro + 100



print(cadena)