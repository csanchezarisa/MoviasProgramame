import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e512 {
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        int vueltas = Integer.parseInt(teclado.readLine());

        for (int i = 0; i < vueltas; i++) {
            String[] valoresStr = teclado.readLine().split(" ");
            int conejo = Integer.parseInt(valoresStr[0]);
            int caballo = Integer.parseInt(valoresStr[1]);
            System.out.println((int) (conejo * 100 / (conejo + caballo)));
        }
    }
}
