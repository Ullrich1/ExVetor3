import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vet[] = new int[5];

        for (int i=0; i<5; i++) {

            System.out.println("Digite o " +(i+1)+"º número inteiro: ");
            vet[i] = ler.nextByte();
        }
        for(int i=0; i<5;i++){
            if(vet[i]>0){
                System.out.print(vet[i]+"\t");
            }
        }
    }
}