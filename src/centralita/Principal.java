package centralita;

public class Principal {
    public static void main(String[] args) {

        Llamadas[] llamadas = new Llamadas[7];

        llamadas[0] = new LlamadasLocales(912123123, 911487667, 12);
        llamadas[1] = new LlamadasLocales(910136543, 911487698, 6);
        llamadas[2] = new LlamadasLocales(912122221, 911487609, 32);
        llamadas[3] = new LlamadasProvinciales(600123123,612543209, 12, 2);
        llamadas[4] = new LlamadasProvinciales(623123042,612563201, 32, 1);
        llamadas[5] = new LlamadasProvinciales(600123654,612093208, 7, 3);
        llamadas[6] = new LlamadasProvinciales(800123654,712093208, 43, 1);

        Centralita c1 = new Centralita();

        c1.totalLlamadas();

        for (Llamadas a : llamadas)
            c1.registroLlamadas(a);

        System.out.println(c1);

        c1.costeTotal();

    }
}
