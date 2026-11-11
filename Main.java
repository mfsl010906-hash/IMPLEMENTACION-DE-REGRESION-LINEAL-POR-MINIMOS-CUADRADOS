public static void main(String[] args) {
    // Datos de prueba de ejemplo
    double[] xValores = {1.0, 2.0, 3.0, 4.0, 5.0};
    double[] yValores = {2.0, 4.0, 5.0, 4.0, 5.0};

    double[] resultados = RegresionLineal.calcularMinimosCuadrados(xValores, yValores);

    // Prueba de predicción
    double xPrueba = 6.0;
    double prediccion = RegresionLineal.predecir(resultados[0], resultados[1], xPrueba);
    System.out.printf("Predicción para X = %.1f -> Y = %.4f%n", xPrueba, prediccion);
}
