
package entender_conceitos;

import java.util.Scanner;
import java.util.Random;


public class Luta_Saint_Valley {

 static int playerATKflash(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("ESCOLHA SEU ATAQUE");
        System.out.println("(1)Soco");
        System.out.println("(2)Chute");
        return input.nextInt();
    }
    static int inimigoATKflash(){
        Random gerador = new Random();
        return gerador.nextInt(2)+1;
    }
    
    static void hpTelaflash( int hpPlayer,  int hpFlash){
        System.out.println("===========");
        System.out.println("HP PLayer  " + hpPlayer);
        System.out.println("HP Flash  " + hpFlash);
        System.out.println("===========");
    }
    static void batalhaflash(){
        
        int hpPlayer = 100;
        int hpFlash = 100;
        int escolhaATK ;
        while(hpPlayer >0 && hpFlash >0){
        escolhaATK = playerATKflash();
        hpTelaflash (hpPlayer, hpFlash);
        switch(escolhaATK){
            case 1:
                System.out.println("Você deu um soco!");
                hpFlash -=15;  
                break;
            case 2: 
                System.out.println("Você deu um chute!");
                hpFlash -=20;
                break;
            default:
                System.out.println("perdeu sua vez!");     
        }
        if(hpFlash>0){
            escolhaATK = inimigoATKflash();
            switch(escolhaATK){
                case 1:
                System.out.println("O Flash te deu um soco!");
                hpPlayer -=25;  
                break;
            case 2: 
                System.out.println("O Flash te deu um chute!");
                hpPlayer -=12;
                break;
                    
            } 
}
        else{
            System.out.println("Você venceu o Flash!");
        }
    }if(hpPlayer<0){
            
               System.out.println("Você morreu");
               

           
}
}

//*********************************************************

 static int playerATKrobo(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escolha seu ataque");
        System.out.println("(1)Soco");
        System.out.println("(2) Chute");
        return input.nextInt();
    }

    static int inimigoATKrobo(){
        Random gerador = new Random();
        return gerador.nextInt(2)+1;
    }
    
    static void hpTelarobo( int hpPlayer,  int hpInimigo){
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Robô" + hpInimigo);
        System.out.println("===========");
    }
    static void batalharobo(){
        
        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK ;
        while(hpPlayer >0 && hpInimigo >0){
        escolhaATK = playerATKrobo();
        hpTelarobo (hpPlayer, hpInimigo);
        switch(escolhaATK){
            case 1:
                System.out.println("Você deu um soco!");
                hpInimigo -=15;  
                break;
            case 2: 
                System.out.println("Você deu um chute!");
                hpInimigo -=20;
                break;
            default:
                System.out.println("perdeu sua vez!");     
        }
        if(hpInimigo>0){
            escolhaATK = inimigoATKrobo();
            switch(escolhaATK){
                case 1:
                System.out.println("O robô deu um soco!");
                hpPlayer -=20;  
                break;
            case 2: 
                System.out.println("O robô te deu um chute!");
                hpPlayer -=15;
                break;
                    
            } 
        }
        else{
            System.out.println("Você venceu parabéns!");
        }
    }if (hpPlayer<0){
            System.out.println("Você morreu");
}




}



    
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        
//Luta contra Flash

//inicio da luta

        int u;
        System.out.println("Flash tira sua jaqueta e com seu braço robotico te chama pra brigar \n");
    do{ System.out.println(" VOCÊ ESTÁ PRONTO PRA LUTA ?");
        System.out.println("Sim=1 || Não=0");
         u=input.nextInt();
    }while (u>1 || u<1);
  
          batalhaflash();
   

        System.out.println("\nVocê segue para lutar contra o robô");



//Luta conta Robô

        int i;
   do{  System.out.println("VOCÊ ESTÁ PRONTO PRA LUTA ?");
        System.out.println("Sim=1 || Não=0");
         i=input.nextInt();
    }while(i>1 || i<1);
   
     batalharobo();


    }
    
}
