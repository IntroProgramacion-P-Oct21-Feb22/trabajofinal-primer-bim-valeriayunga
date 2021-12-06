descuento = float()
precio = 10
porcentaje1 = float(20)
porcentaje2 = float(25)
porcentaje3 = float(40)
porcentaje4 = float(50)
valorTotal = float()
cantidad = int(input("Ingrese el número de tajes que se comprarán"))
subtotal = cantidad * precio

if (cantidad == 1) :
    descuento = float((porcentaje1 * subtotal) / 100)
    valorTotal = subtotal - descuento

elif(cantidad == 2):
    descuento = float((porcentaje2 * subtotal) / 100)
    valorTotal = subtotal - descuento

elif (cantidad == 3):
    descuento = float((porcentaje3 * subtotal) / 100)
    valorTotal = subtotal - descuento

elif(cantidad > 3):
    descuento = float((porcentaje4 * subtotal) / 100)
    valorTotal =subtotal - descuento

print(f"El subtotal por pagar es:{subtotal}")
print(f"El descuento es:{descuento}")
print(f"El total a pagar es:{valorTotal}")