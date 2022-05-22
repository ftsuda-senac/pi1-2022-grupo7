
package entender_conceitos;
import java.util.Random;
import java.util.Scanner;

public class Luta_ultima_cidade {
 static int playerATK(){
        Scanner input = new Scanner(System.in);
        
    System.out.println("ESCOLHA SEU ATAQUE");
    System.out.println("(1)estocada com a espada");
    System.out.println("(2)golpe diagonal com espada");
    System.out.println("(3)Soco com a manopla");
    System.out.println("(4) Coração Roudini");
    System.out.println("(5) Espada Dourada de Qawha");
        
        return input.nextInt();
    }
    static int inimigoATK(){
        Random gerador = new Random();
        return gerador.nextInt(2)+1;
    }
    
    static void hpTela( int hpPlayer,  int hpIA){
        System.out.println("===========");
        System.out.println("HP PLayer  " + hpPlayer);
        System.out.println("HP Fórmula  " + hpIA);
        System.out.println("===========");
    }
    static void batalha(){
        
        int hpPlayer = 500;
        int hpIA = 1000;
        int escolhaATK ;
        while(hpPlayer >0 && hpIA >0){
        escolhaATK = playerATK();
        hpTela (hpPlayer, hpIA);
        switch(escolhaATK){
            case 1:
                    System.out.println("Você deu uma estocada com a espada!\n");
                    hpIA -= 60;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!\n");
                    hpIA -= 100;
                    break;
                case 3:
                    System.out.println("Você deu um soco com a manopla!\n");
                    hpIA -= 50;
            case 4:
                System.out.println("Você usou o Coração Roudini!\n");
                hpIA -=70;  
                break;
            case 5:
                System.out.println("Você deu uma estocada com a espada de Qawha!\n");
                hpIA -=90;  
                break;
            default:
                System.out.println("perdeu sua vez!\n");     
        }
        if(hpIA>0){
            escolhaATK = inimigoATK();
            switch(escolhaATK){
                case 1:
                System.out.println("A Fórmula te deu um tiro a laser!\n");
                hpPlayer -=40;  
                break;
            case 2: 
                System.out.println("A Fórmula te deu uma voadora!\n");
                hpPlayer -=45;
                break;
            case 3:
                System.out.println("A Fórmula te deu um soco!\n");
                hpPlayer -=35;
                break;
            case 4:
                System.out.println("A Fórmula carregou suas energias!\n");
                hpIA +=40;
                    
            } 
}
        else{
            System.out.println("Você venceu a Fórmula!");
        }
    }if(hpPlayer<0){
            
               System.out.println("Você morreu");
               

           
}
}

    
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
   int a;
    do{ System.out.println("VOCÊ ESTÁ PREPARADO PARA A BATALHA ?");
        System.out.println("SIM (1)");
        System.out.println("NÃO (0)");
        a = input.nextInt();
    }while (a>1 || a<1);

batalha();



    }
    
}
