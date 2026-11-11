# IMPLEMENTACION-DE-REGRESION-LINEAL-POR-MINIMOS-CUADRADOS
- tarea 2 unidad 5 metodos numericos
- instituto tecnologico superior de xalapa
- ingeneria en sistemas computacionales
- docente: Victor Hugo Vasquez Harrera
- alumna: Maria Fatima Sanchez Landa

## Requerimientos del Entorno
- **Lenguaje:** Java SE 8 o superior (JDK 17 recomendado).
- **IDE Sugerido:** NetBeans, Eclipse, IntelliJ IDEA o VS Code.

## Descripción del Proyecto
La regresión lineal simple es un método estadístico y numérico que permite modelar la relación funcional entre una variable independiente (X) y una variable dependiente (Y).
1. Clase Regresion Lineal: Esta clase agrupa los métodos necesarios para calcular una línea de tendencia estadística usando el método de mínimos cuadrados, así como coeficientes de correlación y capacidad de predicción.
2. Main: verifica que las fórmulas implementadas en la otra clase devuelvan los valores correctos utilizando datos conocidos de entrada.


## Instrucciones de Ejecución
1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/mfsl010906-hash/IMPLEMENTACION-DE-REGRESION-LINEAL-POR-MINIMOS-CUADRADOS.git]
   cd IMPLEMENTACION-DE-REGRESION-LINEAL-POR-MINIMOS-CUADRADOS
   ```

2. Compilar el código:
   ```bash
   javac -d bin src/AjusteDeFunciones/*.java
   ```

3. Ejecutar la clase principal:
   ```bash
   java -cp bin Main.Main
   ```

---

## Salida de Consola
--- RESULTADOSDEMINIMOSCUADRADOSYCORRELACION---
Sumatorias:n=5,X=15.0,Y=20.0,X2=55.0, Y2=86.0, XY=66.0
Pendiente(beta1): 0.6000
Ordenada alorigen(beta0): 2.2000
Modelo obtenido:Y= 2.2000+ 0.6000X
CoeficientedePearson(r): 0.7746
CoeficientedeDeterminacion(r2): 0.6000
Predicción para X = 6.0 -> Y = 5.8000

Process finished with exit code 0

## conclucion
El algoritmo cumple perfectamente su propósito matemático: las fórmulas de mínimos cuadrados funcionan de manera correcta, permitiendo trazar una línea de tendencia confiable y realizar estimaciones futuras.


