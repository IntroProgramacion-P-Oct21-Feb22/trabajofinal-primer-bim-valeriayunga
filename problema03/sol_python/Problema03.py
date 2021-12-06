nombre = str(input("Ingrese el nombre del cliente"))
tipo = int(input("Ingrese el tipo de cliente"))
hora = float(input("Ingrese las horas trabajadas"))
cuota = float(input("Ingrese la cuota que se le paga por hora"))
horas_extra = float(input("Ingrese las horas extra"))

subtotal = float(hora*cuota)

if tipo == 1:
    cuota= cuota * 1.5
    extra =cuota * horas_extra
    valorTotal = subtotal+extra

elif tipo == 2:
    cuota= cuota * 2
    extra =cuota * horas_extra
    valorTotal = subtotal+extra

elif tipo == 3:
    cuota = cuota * 2.5
    extra = cuota * horas_extra
    valorTotal = subtotal + extra

elif tipo==4:
    cuota= cuota * 3
    extra =cuota * horas_extra
    valorTotal = subtotal+extra
else:
    valorTotal = subtotal

print(f"Al empleado {nombre} de tipo {tipo} se le debe pagar {valorTotal}")