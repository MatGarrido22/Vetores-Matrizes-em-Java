//Author: Matheus Garrido
// Aula de vetores e matrizes ex 02
import javax.swing.JOptionPane;
public class Vetores_ex2 
{
    public static void main(String args[])
    {
        int vetor[] = new int[100];
        vetor = coleta_vetor(vetor);
        verifica_maiormenor(vetor);
        calcula_media(vetor);
    }
    public static int[] coleta_vetor(int vet[])
    {
        int cont = 0;
        for (cont=0;cont<100;cont++)
        {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(cont+1)+"° valor do seu vetor"));
            vet[cont]= num;
        }
        return vet;
    }
    public static void verifica_maiormenor(int vet[])
    {
        int cont = 0;
        int maior=0,menor=0;
        int size = vet.length;
        for(cont=0;cont<size;cont++)
        {
            if (cont==0)
            {
                maior=vet[cont];
                menor=vet[cont];
            }
            else
            {
                if(vet[cont]<menor)
                {
                    menor = vet[cont];
                }
                if(vet[cont]>maior)
                {
                    maior = vet[cont];
                }
            }
        }
        System.out.println("Maior valor: "+maior+" e menor valor: "+menor);
    }
    public static void calcula_media(int vet[])
    {
        int cont = 0,soma =0,media=0;
        int size = vet.length;
        for (cont=0;cont<size;cont++)
        {
            soma+=vet[cont];
        }
        media = soma/size;
        System.out.print("Media: "+media);
    }
}
