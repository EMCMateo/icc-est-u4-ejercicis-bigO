package main.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(n)";
    public static boolean tieneDuplicadosOpt(int[] arr) {
    Set<Integer> vistos = new HashSet<>();
    for (int n : arr) {
        if (vistos.contains(n)) {
            return true;
        }
        vistos.add(n);
    }
    return false;
    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = ""; // Ej: "O(n)"

    public static int contarMayoresOpt(int[] arr, int x) {
        int count = 0;
        int maxSoFar = Integer.MIN_VALUE;   

        for (int value : arr) {
            if (value > x && value >= maxSoFar) {
            count++;
            }
            if (value > maxSoFar) {
            maxSoFar = value;
            }
        }

    return count;
    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = ""; // Ej: "O(n)"

    public static int encontrarMaximoOpt(int[] arr) {
         int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i])
                    esMaximo = false;
            }
            if (esMaximo)
                max = arr[i];
        }
        return max;
    }
}
