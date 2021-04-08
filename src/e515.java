import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e515 {
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        do {
            int numeroCopas = Integer.parseInt(teclado.readLine());

            if (numeroCopas == 0)
                break;

            int viajes = 0;

            while (numeroCopas > 0) {
                viajes++;
                numeroCopas--;
                if (numeroCopas % 2 == 0)
                    numeroCopas -= 2;
                else
                    numeroCopas--;
            }

            System.out.println(viajes);
        }
        while (true);
    }
}
