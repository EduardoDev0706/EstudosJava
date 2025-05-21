public class MyApp
{
    public static void main(String[] args)
    {
        /*
        // Estudo de arrays

        // Tipo 'reference' } / Tipo 'object'
        int [] idades = new int[3];

        // posições das arrays, sempre começa em 0
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        System.out.println(idades[3]);

        // Como cada tipo é imprimido em uma array 'vazia'
        // byte, short, int, long, float e double = 0
        // char '\u0000' = ' '
        // boolean = false
        // String = null (tipos 'reference' no geral)

         */
        
        // Iterar arrays (verificar valores)

        /* 
        String[] nomes = new String[3];

        nomes[0] = "Goku";
        nomes[1] = "Ichigo";
        nomes[2] = "Luffy";

        // .length imprime diretamente todos os espacos da array
        for (int i = 0; i < nomes.length; i++)
        {
            System.out.println(nomes[i]);
            
        }

        */
        
        /*
        // Utilizando foreach

        int[] numeros = {1, 2, 3, 4, 5};

        for(int num:numeros)
        {
            System.out.println(num);
        }
        */

        // Arrays Multidimensionais

        int[][] dias = new int[3][3];
        dias[0][0] = 32;
        dias[0][1] = 33;
        dias[0][2] = 34;

        dias[1][0] = 35;
        dias[1][1] = 36;
        dias[1][2] = 37;
        
        for (int i = 0; i < dias.length; i++)
        {
            for (int j = 0; j < dias[i].length; j++)
            {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("----------------------");
        for (int[] arrBase: dias) {
            for (int num: arrBase) {
                System.out.println(num);
            }
            
        }


    }
}
