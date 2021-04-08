import java.util.Scanner;

public class e118 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            int cubileteConBola = Integer.parseInt(teclado.nextLine().split(" ")[1]);

            if (cubileteConBola == 0)
                break;

            String valores = teclado.nextLine();

            for (int i = 0; i < valores.split(" ").length; i += 2) {
                if (Integer.valueOf(valores.split(" ")[i]) == cubileteConBola)
                    cubileteConBola = Integer.valueOf(valores.split(" ")[i + 1]);
                else if (Integer.valueOf(valores.split(" ")[i + 1]) == cubileteConBola)
                    cubileteConBola = Integer.valueOf(valores.split(" ")[i]);
            }

            System.out.println(cubileteConBola);
        }
    }
}
