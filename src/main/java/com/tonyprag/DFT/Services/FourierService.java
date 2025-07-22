package com.tonyprag.DFT.Services;

import java.util.ArrayList;
import java.util.List;

public class FourierService {
    public static List<Double> transform(List<Double> signal){
        int N = signal.size(); //Size of signal arraylist
        List<Double> magnitudes = new ArrayList<>();

        for(int k = 0; k < N; k++){
            double real = 0;
            double imag = 0;

            for(int n = 0; n < N; n++){
                double angle = 2 * Math.PI * k * n / N;
                real += signal.get(n) * Math.cos(angle);
                imag -= signal.get(n) * Math.sin(angle);
            }

            double magnitude = Math.sqrt(real * real + imag * imag);
            magnitudes.add(magnitude);
        }

        return magnitudes;
    }
}
