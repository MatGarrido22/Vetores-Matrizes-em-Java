// Author: Matheus Garrido
// Aula de vetores e matrizes, ex 01
import javax.swing.JOptionPane;
public class Vetores_ex1
{
    public static void main(String args[])
    {
        int vetor[] = new int[50];
        vetor = coleta_vetor(vetor);
        soma_impares (vetor);
        calcula_media(vetor);
//        mostra_vetor(vetor);
        
    }
    public static int[] coleta_vetor(int vet[])
    {
        int cont = 0;
        for (cont = 0; cont<50; cont++)
        {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(cont+1)+" ° numero do vetor: "));            
            vet[cont]= num;
        }
        return vet;
    }
//    public static void mostra_vetor(int vet[])
//    {
//        int size = vet.length;
//        int i = 0;
//        for(i=0; i<size ;i++)
//        {
//            System.out.print(vet[i]+" ");
//        }
//    }
    public static void soma_impares(int vet[])
    {
        int size = vet.length;
        int i,soma = 0;
        for (i=0;i<size;i++)
        {
            if (vet[i]%2==1)
            {
                soma+=vet[i];
            }
        }
        System.out.println("Soma dos impares: "+soma);
    }
    public static void calcula_media(int vet[])
    {
        int size = vet.length;
        int cont,cont2 = 0,soma = 0;
        double media = 0;
        for (cont=0;cont<size;cont++)
            if (vet[cont]>10 && vet[cont]<200)
            {
                soma+=vet[cont];
                cont2 += 1;
            }
        if (cont2 ==0)
        {
            System.out.print("Media: 0");
        }
        else
            media = soma/cont2;
        System.out.println("Media dos numeros entre 10 e 200: "+media);
    }
}
