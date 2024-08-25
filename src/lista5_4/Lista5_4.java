package lista5_4;

import java.util.Arrays;
import javax.swing.JOptionPane;



public class Lista5_4 {
    public static void main(String[] args) {
        final int TAM = 10;
        final int LIMITE = 50;
        int vet[] = new int [TAM];
        int maior=0, menor=0;
        for(int x=0; x < TAM; x++){
            do{
                vet[x] = (int) (Math.random() * (LIMITE+1));
            }while(vet[x] % 2 != 0);
            if(x == 0){
                maior = vet[x];
                menor = vet[x];
            }
            if(vet[x] > maior){
                maior = vet[x];
            }
            if(vet[x] < menor){
                menor = vet[x];
            }
        }
        JOptionPane.showMessageDialog( null, "Vetor: "+Arrays.toString(vet)+ "\nMaior valor: "+maior+"\nMenor valor: "+menor);
    }    
}
