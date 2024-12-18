package org.example.examcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Random;

@SpringBootApplication
public class ExamCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamCoreApplication.class, args);

        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < array.length; i ++) {
            array[i] = 2 + random.nextInt(99);
            System.out.print("Массив со скидками за день" +" " + (i+1) +" ");
            System.out.println(array[i]);
        }

        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Лучший день для продажи, скидка составит: " + min);
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Лучший день для покупки, скидка составит: " + max);

    }

}





///Вам дан массив цен, где prices[i] является ценой данной акции в i-й день.
/// Ваша задача — максимизировать вашу прибыль, выбрав один день для покупки акции и другой день в будущем для ее продажи.
/// Верните максимальную прибыль, которую вы можете получить от этой операции. Если прибыль получить невозможно, верните 0.