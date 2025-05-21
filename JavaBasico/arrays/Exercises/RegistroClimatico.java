import java.util.Scanner;

public class RegistroClimatico {
	public static void main(String[] args) {


        // Define o Scanner
		Scanner myObj = new Scanner(System.in);
        // Define o tamanho da array-bidimensional
		LeituraClima[][] dados = new LeituraClima[2][2];

        // Recebe os valores das arrays (Lembre-se de uma matriz 2x2)
		for (int i = 0; i < dados.length; i++) {
			for (int j = 0; j < dados[i].length; j++) {
				dados[i][j] = new LeituraClima();

				System.out.println("Digite a temperatura para o dia[" + i + "][" + j + "]:");
				dados[i][j].temperatura = myObj.nextInt();
                System.out.println("Digite a umidade para o dia[" + i + "][" + j + "]:");
				dados[i][j].umidade = myObj.nextInt();
			}
		}

        System.out.println("DADOS REGISTRADOS: ");
        // Percorre as linhas da matriz dados
        for (int i = 0; i < dados.length; i++) {
            // Percorre as colunas da matriz dados
			for (int j = 0; j < dados[i].length; j++) {
                // %% => Imprimir o caracter de porcentagem para a umidade
                System.out.printf("Dia[%d][%d] => Temp: %d°C, Umid: %d%%\n", i, j, dados[i][j].temperatura, dados[i][j].umidade);
            }
        }

		myObj.close();
	}

}

class LeituraClima {
	int temperatura, umidade;
}