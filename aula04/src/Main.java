public class Main {
    public static void main(String[] args){
        var value1 = 6;
        var value2 = 5;
        //aqui está ocorrendo uma conversao do número 6 para binário
        var binary1 = Integer.toBinaryString(value1);
        System.out.println(binary1);

        //vai fazer uma comparação de OR de bit a bit
        // 0-> False
        // 1-> True

        // 1|1|0
        // 1|0|1
        // 1|1|1 -> True True True

        // 0|0|0
        // 1|0|0
        // 1|0|0 -> True, False, False

        var result = value1 | value2;
        //convertendo o resultado para binário
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("Result: %s; Binary Result: %s; \n", result, binaryResult);

        //vai fazer uma comparação de AND de bit a bit
        // 1|1|0
        // 1|0|1
        // 1|0|0
        //operador & (AND) só resulta em 1 quando ambos os bits comparados forem 1. Se houver pelo menos um 0, o resultado daquela coluna será 0.
        var result2 = value1 & value2;
        var binaryResult2 = Integer.toBinaryString(result2);
        System.out.printf("Result2: %s; Binary Result2: %s; \n", result2, binaryResult2);

        //vai fazer uma comparação de XOR EXCLUSIVO DE BIT A BIT (^) de byte a byte
        // 1|1|0
        // 1|0|1
        // 1|0|0
        // O XOR ve se os números sao iguais = 0 (False), se os números são diferentes = 1 (True)
        var result3 = value1 ^ value2;
        var binaryResult3 = Integer.toBinaryString(result3);
        System.out.printf("Result3: %s; Binary Result3: %s; \n", result3, binaryResult3);

        // 1|1|0
        // -----
        // 0|0|1
        // O operador NOT ele é do contra, se ele é True vira False, se é False vira True
        // Se é negativo vira positivo, se é positivo vira negativo
        var result4 = ~value1;
        var binaryResult4 = Integer.toBinaryString(result4);
        System.out.printf("Result4: %s; Binary Result4: %s; \n", result4, binaryResult4);

        // 1|1|0 -> 6
        // 1|0|1 -> 5
        // aqui ele vai empurrar 5 bits para a esquerda
        // 1|1|0|||0|0|0|0|0 -> 192
        // O SHIFT operator vai empurrar uma quantidade determinada de bits, seja para a esquerda, seja para direita
        var result5 = value1 << value2;
        var binaryResult5 = Integer.toBinaryString(result5);
        System.out.printf("Result5: %s; Binary Result5: %s; \n", result5, binaryResult5);

        //se o número for negativo ele vai começar com o 1, se ele for positivo ele vai começar com o 0


    }
}