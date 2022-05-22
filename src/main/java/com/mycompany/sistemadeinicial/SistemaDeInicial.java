
// luta 1

    static int playerATKAdiversario1() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)estocada com a espada");
        System.out.println("(2)golpe diagonal com espada");
        System.out.println("(3)Soco com a manopla");
        return input.nextInt();
    }

    static int inimigoATKAdiversario1() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;
    }

    static void hpTelaAdiversario1(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Adiversario1" + hpInimigo);
        System.out.println("===========");
    }

    static void batalhaAdiversario1() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATKAdiversario1();
            hpTelaAdiversario1(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com a espada!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 55;
                    break;
                case 3:
                    System.out.println("Você deu um soco com a manopla!");
                    hpInimigo -= 30;
                default:
                    System.out.println("Perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATKAdiversario1();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O Adiversario deu um soco!");
                        hpPlayer -= 25;
                        break;
                    case 2:
                        System.out.println("O Adiversario te deu um chute!");
                        hpPlayer -= 30;
                        break;
                    case 3:
                        System.out.println("O Adiversario te deu um golpe com o bastão");
                        hpPlayer -= 40;

                }
            } else {
                System.out.println("Você venceu parabéns!");
            }
        }
    }

    // luta 2

    static int playerATKAdiversario2() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)estocada com a espada");
        System.out.println("(2)golpe diagonal com espada");
        System.out.println("(3)Soco com a manopla");
        return input.nextInt();
    }

    static int inimigoATKAdiversario2() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;
    }

    static void hpTelaAdiversario2(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Adiversario1" + hpInimigo);
        System.out.println("===========");
    }

    static void batalhaAdiversario2() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATKAdiversario2();
            hpTelaAdiversario2(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com a espada!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 55;
                    break;
                case 3:
                    System.out.println("Você deu um soco com a manopla!");
                    hpInimigo -= 30;
                default:
                    System.out.println("Perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATKAdiversario2();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O Adiversario deu um soco!");
                        hpPlayer -= 30;
                        break;
                    case 2:
                        System.out.println("O Adiversario te deu um chute!");
                        hpPlayer -= 35;
                        break;
                    case 3:
                        System.out.println("O Adiversario te deu um golpe com a kusarigama");

                }
            } else {
                System.out.println("Você venceu parabéns!");
            }
        }
    }

    // LUTA 3

    static int playerATKAdiversario3() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)estocada com a espada");
        System.out.println("(2)golpe diagonal com espada");
        System.out.println("(3)Soco com a manopla");
        return input.nextInt();
    }

    static int inimigoATKAdiversario3() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;
    }

    static void hpTelaAdiversario3(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Adiversario3" + hpInimigo);
        System.out.println("===========");
    }

    static void batalhaAdiversario3() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATKAdiversario3();
            hpTelaAdiversario3(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com a espada!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 55;
                    break;
                case 3:
                    System.out.println("Você deu um soco com a manopla!");
                    hpInimigo -= 30;
                default:
                    System.out.println("Perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATKAdiversario3();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O Adiversario deu um soco!");
                        hpPlayer -= 30;
                        break;
                    case 2:
                        System.out.println("O Adiversario te deu um chute!");
                        hpPlayer -= 35;
                        break;
                    case 3:
                        System.out.println("O Adiversario te deu um golpe com a lança");
                        hpPlayer -= 40;

                }
            } else {
                System.out.println("Você venceu parabéns!");
            }
        }
    }

    //latu 

    static int playerATKAdiversario4() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)estocada com a espada");
        System.out.println("(2)golpe diagonal com espada");
        System.out.println("(3)Soco com a manopla");
        return input.nextInt();
    }

    static int inimigoATKAdiversario4() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;
    }

    static void hpTelaAdiversario4(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Adiversario3" + hpInimigo);
        System.out.println("===========");
    }

    static void batalhaAdiversario4() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATKAdiversario4();
            hpTelaAdiversario4(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com a espada!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 55;
                    break;
                case 3:
                    System.out.println("Você deu um soco com a manopla!");
                    hpInimigo -= 30;
                default:
                    System.out.println("Perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATKAdiversario4();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O Adiversario deu um soco!");
                        hpPlayer -= 30;
                        break;
                    case 2:
                        System.out.println("O Adiversario te deu um chute!");
                        hpPlayer -= 35;
                        break;
                    case 3:
                        System.out.println("O Adiversario atirou uma flecha contrra você!");
                        hpPlayer -= 40;

                }
            } else {
                System.out.println("Você venceu parabéns!");
            }
        }
    }

    static int playerATKAdiversario5() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)estocada com a espada");
        System.out.println("(2)golpe diagonal com espada");
        System.out.println("(3)Soco com a manopla");
        return input.nextInt();
    }

    static int inimigoATKAdiversario5() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;
    }

    static void hpTelaAdiversario5(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Adiversario3" + hpInimigo);
        System.out.println("===========");
    }

    static void batalhaAdiversario5() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATKAdiversario5();
            hpTelaAdiversario5(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com a espada!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 55;
                    break;
                case 3:
                    System.out.println("Você deu um soco com a manopla!");
                    hpInimigo -= 30;
                default:
                    System.out.println("Perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATKAdiversario5();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O Adiversario deu um soco!");
                        hpPlayer -= 30;
                        break;
                    case 2:
                        System.out.println("O Adiversario te deu um chute!");
                        hpPlayer -= 35;
                        break;
                    case 3:
                        System.out.println("O Adiversario atirou uma flecha contrra você!");
                        hpPlayer -= 40;

                }
            } else {
                System.out.println("Você venceu parabéns!");
            }
        }
    }

    // luta 6

    static int playerATKAdiversario6() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)estocada com a espada");
        System.out.println("(2)golpe diagonal com espada");
        System.out.println("(3)Soco com a manopla");
        return input.nextInt();
    }

    static int inimigoATKAdiversario6() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;
    }

    static void hpTelaAdiversario6(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Adiversario3" + hpInimigo);
        System.out.println("===========");
    }

    static void batalhaAdiversario6() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATKAdiversario6();
            hpTelaAdiversario6(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com a espada!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 55;
                    break;
                case 3:
                    System.out.println("Você deu um soco com a manopla!");
                    hpInimigo -= 30;
                default:
                    System.out.println("Perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATKAdiversario6();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O Adiversario deu um soco!");
                        hpPlayer -= 30;
                        break;
                    case 2:
                        System.out.println("O Adiversario te deu um chute!");
                        hpPlayer -= 35;
                        break;
                    case 3:
                        System.out.println("O Adiversario atirou uma flecha contrra você!");
                        hpPlayer -= 40;

                }
            } else {
                System.out.println("Você venceu parabéns!");
            }
        }
    }

    //luta 7

    static int playerATKAdiversario7() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)estocada com a espada");
        System.out.println("(2)golpe diagonal com espada");
        System.out.println("(3)Soco com a manopla");
        return input.nextInt();
    }

    static int inimigoATKAdiversario7() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;
    }

    static void hpTelaAdiversario7(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Adiversario3" + hpInimigo);
        System.out.println("===========");
    }

    static void batalhaAdiversario7() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATKAdiversario7();
            hpTelaAdiversario7(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com a espada!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 55;
                    break;
                case 3:
                    System.out.println("Você deu um soco com a manopla!");
                    hpInimigo -= 30;
                default:
                    System.out.println("Perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATKAdiversario7();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O Adiversario deu um soco!");
                        hpPlayer -= 30;
                        break;
                    case 2:
                        System.out.println("O Adiversario te deu um chute!");
                        hpPlayer -= 35;
                        break;
                    case 3:
                        System.out.println("O Adiversario atirou uma flecha contrra você!");
                        hpPlayer -= 40;

                }
            } else {
                System.out.println("Você venceu parabéns!");
            }
        }
    }









 // luta 1

    static int playerATKAdiversario1() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)estocada com a espada");
        System.out.println("(2)golpe diagonal com espada");
        System.out.println("(3)Soco com a manopla");
        return input.nextInt();
    }

    static int inimigoATKAdiversario1() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;
    }

    static void hpTelaAdiversario1(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Adiversario1" + hpInimigo);
        System.out.println("===========");
    }

    static void batalhaAdiversario1() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATKAdiversario1();
            hpTelaAdiversario1(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com a espada!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 55;
                    break;
                case 3:
                    System.out.println("Você deu um soco com a manopla!");
                    hpInimigo -= 30;
                default:
                    System.out.println("Perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATKAdiversario1();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O Adiversario deu um soco!");
                        hpPlayer -= 25;
                        break;
                    case 2:
                        System.out.println("O Adiversario te deu um chute!");
                        hpPlayer -= 30;
                        break;
                    case 3:
                        System.out.println("O Adiversario te deu um golpe com o bastão");
                        hpPlayer -= 40;

                }
            } else {
                System.out.println("Você venceu parabéns!");
            }
        }
    }

    // luta 2

    static int playerATKAdiversario2() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)estocada com a espada");
        System.out.println("(2)golpe diagonal com espada");
        System.out.println("(3)Soco com a manopla");
        return input.nextInt();
    }

    static int inimigoATKAdiversario2() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;
    }

    static void hpTelaAdiversario2(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Adiversario1" + hpInimigo);
        System.out.println("===========");
    }

    static void batalhaAdiversario2() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATKAdiversario2();
            hpTelaAdiversario2(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com a espada!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 55;
                    break;
                case 3:
                    System.out.println("Você deu um soco com a manopla!");
                    hpInimigo -= 30;
                default:
                    System.out.println("Perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATKAdiversario2();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O Adiversario deu um soco!");
                        hpPlayer -= 30;
                        break;
                    case 2:
                        System.out.println("O Adiversario te deu um chute!");
                        hpPlayer -= 35;
                        break;
                    case 3:
                        System.out.println("O Adiversario te deu um golpe com a kusarigama");

                }
            } else {
                System.out.println("Você venceu parabéns!");
            }
        }
    }

    // LUTA 3

    static int playerATKAdiversario3() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)estocada com a espada");
        System.out.println("(2)golpe diagonal com espada");
        System.out.println("(3)Soco com a manopla");
        return input.nextInt();
    }

    static int inimigoATKAdiversario3() {
        Random gerador = new Random();
        return gerador.nextInt(3) + 1;
    }

    static void hpTelaAdiversario3(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Adiversario3" + hpInimigo);
        System.out.println("===========");
    }

    static void batalhaAdiversario3() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATKAdiversario3();
            hpTelaAdiversario3(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com a espada!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 55;
                    break;
                case 3:
                    System.out.println("Você deu um soco com a manopla!");
                    hpInimigo -= 30;
                default:
                    System.out.println("Perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATKAdiversario3();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O Adiversario deu um soco!");
                        hpPlayer -= 30;
                        break;
                    case 2:
                        System.out.println("O Adiversario te deu um chute!");
                        hpPlayer -= 35;
                        break;
                    case 3:
                        System.out.println("O Adiversario te deu um golpe com a lança");
                        hpPlayer -= 40;

                }
            } else {
                System.out.println("Você venceu parabéns!");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Você está no trem indo para cyber city");
        System.out.println("");
        System.out.println("Você começa a escutar ");
    }








package com.mycompany.sistemadeinicial;
import java.util.Scanner;
import java.util.Random;

public class SistemaDeInicial {
    static int playerATK(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escolha seu ataque");
        System.out.println("(1)Soco");
        System.out.println("(2)Especial");
        return input.nextInt();
    }
    static int inimigoATK(){
        Random gerador = new Random();
        return gerador.nextInt(2)+1;
    }
    
    static void hpTela( int hpPlayer,  int hpInimigo){
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Inimigo" + hpInimigo);
        System.out.println("===========");
    }
    static void batalha(){
        
        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK ;
        while(hpPlayer >0 && hpInimigo >0){
        escolhaATK = playerATK();
        hpTela (hpPlayer, hpInimigo);
        switch(escolhaATK){
            case 1:
                System.out.println("Você deu um soco!");
                hpInimigo -=10;  
                break;
            case 2: 
                System.out.println("Você deu um chute!");
                hpInimigo -=15;
                break;
            default:
                System.out.println("perdeu sua vez!");     
        }
        if(hpInimigo>0){
            escolhaATK = inimigoATK();
            switch(escolhaATK){
                case 1:
                System.out.println("O inimigo deu um soco!");
                hpPlayer -=8;  
                break;
            case 2: 
                System.out.println("Você deu um chute!");
                hpPlayer -=12;
                break;
                    
            } 
        }
        else{
            System.out.println("Você venceu parabéns!");
        }
    }
}

    static void batalha1Ziuns() {

        int hpPlayer = 100;
        int hpInimigo = 200;
        int escolhaATK;

        while (hpPlayer > 0 && hpInimigo > 0) {

            escolhaATK = playerATK();
            hpTela(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com espada! ");
                    hpInimigo -= 30;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 45;
                    break;
                default:
                    System.out.println("perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATK();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O inimigo deu um com sua broca!");
                        hpPlayer -= 10;
                        break;
                    case 2:
                        System.out.println("O inimigo deu um golpe com sua cerra eletrica");
                        hpPlayer -= 25;
                        break;

                }
            } else {
                System.out.println("Você venceu parabéns!");

            }

        }

    }

    static void batalha1Ziuns2() {

        int hpPlayer = 100;
        int hpInimigo = 150;
        int escolhaATK;

        while (hpPlayer > 0 && hpInimigo > 0) {

            escolhaATK = playerATK();
            hpTela(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu uma estocada com espada! ");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um Golpe diagonal com a espada!");
                    hpInimigo -= 55;
                    break;
                default:
                    System.out.println("perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATK();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O inimigo deu um corte diagonal com suas lâminas!");
                        hpPlayer -= 25;
                        break;
                    case 2:
                        System.out.println("O inimigo usou sua fumaça tóxica ");
                        hpPlayer -= 25;
                        break;

                }
            } else {
                System.out.println("Você venceu parabéns!");

            }

        }

    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
      
        // Variaveis 
        String nome;
        String resposta;
        //intro
        System.out.println("Digite Start para começar:");
       
        //começo
        
        System.out.println("Olá seja muito bem vindo ao mundo de The Clash 77!");
        System.out.println("Mas antes de você saber sobre esse mundo preciso saber.");
        System.out.println("Qual é o seu nome?");
        nome = input.next();
        System.out.println("Então seu nome é: " + nome);
        System.out.println("Que legal!");
        
        System.out.println("Bom, por onde podemos começar, a sim pelo começo rsrs.");
        System.out.println("Ah muitos anos atrás, ouve uma crise climatica que devastou boa parte da terra,");
        System.out.println("e os poucos locais habitaveis que sobraram, foram divididos por pensamentos distintos,");
        System.out.println("uns focados em biotecinologia, outro focado em tecnologias mais antigas como nos anos 80, ");
        System.out.println("outro focado em tecnologias mais futuristas, outro com um tecnologias mais sustentáveis ");
        System.out.println("e outro focado em tecnologias espaciais."); 
        System.out.println("Com o decorrer dos anos esses pensamentos viraram 5 cidades; ");
        System.out.println("Saint Valley, Ziuns, Cyber City, Qawha e a ultima cidade qua ainda não escolhaemos o nome kkk.");
        System.out.println("Em algum momento as cidades perceberam que precisavam de algumas coisas que só exitiam nas outras,");
        System.out.println("então foi feito um trem ligando todas as cidades, para manterem relações comerciais.");
        System.out.println("Você é um cidadão nascido em Saint Valley, que quer conhecer o mundo em busca de aventura ");
        
        do{
            System.out.println("você está preparado para a sua aventura?");
            resposta = input.next();
         
        if (resposta.equals ("sim") ) {
            System.out.println("você entrou em Saint Valley!");
          break;
        }

        }while(resposta.equals ("não"));
        
         //Inicio do jogo
        System.out.println("Um dia normal indo para o trabalho, o personagem ao chegar na estação percebe que ela está desativada.");
        System.out.println("Ao lado da bilheteria à uma placa com um aviso:");
        System.out.println("  'O sinal da rede Google foi cortado, previsão de retorno às 16hrs' ");
        System.out.println("\n Saindo da estação,indo em direção na praça no centro da cidade, você encontra seu velho amigo de infância, o Jorge.\n");

        //fala do Jorge 
        System.out.println("Jorge: Eai personagem, quanto tempo, como está ?");    
        System.out.println("      Parece que a Tesla está desenvolvendo uma nova tecnologia, e roubou hoje cedo o motor de rede do laboratório Google.\n      Todos nós funcionarios fomos despedidos pelo acontecimento.\n      Olha personagem, eu sinto um mal presentimento por isso, irei tentar encontrar outro emprego, boa sote!");
        System.out.println("Jorge foi embora.");
        System.out.println("\n Um pouco a frente, um mendigo te para e fala: \n ");  

        //fala do mendigo
        System.out.println("Mendigo: Ohhh. Você pode me ajudar ? Estou com muita fome,\n         pegue aqui essas pilhas, em troca eu queria um sorvete, por favor senhor!!!!");
        System.out.println("Você recebeu 12 pilhas.");

        //caminhos 
        System.out.println("Você está na praça no centro da cidade e existe 3 caminhos:");
        System.out.println("Caminho Leste, que te levará a sorveteria ");
        System.out.println("Caminho Oeste, te levará ao edificio da Tesla");
        System.out.println("E por ultimo, caminho Norte, para um grande laboratório");
             
    do{ System.out.println(" PARA QUAL CAMNHO VOCÊ QUER SEGUIR ?");
        System.out.println("Leste= 1");
        System.out.println("Oeste= 2");
        System.out.println("Norte=3");
        System.out.println("DIGITE:");
            caminho= input.nextInt();
     }while (caminho>3 || caminho<=0);
        
    //Caminho = Leste
    if(caminho==1){
    int t;
        System.out.println("Você entra na  sorveteria.");
        System.out.println("   Atendente: Bem Vindo à sorveteria Cold Stone Creamey. Qual será seu pedido ?");
        System.out.println("Antes de finalizar o pedido, seu antigo rival de escola, o Flash Mason, chega na sorveteria.\n ");

       //Dialogos
        System.out.println("Flash: Ora, ora, ora, se não é o usuario, ainda trabalhando para sua falida empresa Google ?\n");
        System.out.println("Usuario: Olá Flash, e não trabalho mais com a Google.\n");
        System.out.println("Flash: Finalmente aprendeu, essa tecnologia limitada de vocês, aprendam com a Tesla, acabamos de criar um robo humanoide de guerra perfeito. \n");

        //Explicação
        System.out.println("'Na escola, Flash era um dos alunos mais populares da escola e o meu melhor amigo, \n depois da crise climatica do mundo resolvemos trabalhar na aréa de tecnologia para podermos evoluir tecnologicamente \n e criar novos tipos de inteligencia artificial para o mundo, ");
        System.out.println("mas tudo mudou quando ele entrou para a Tesla, eu era da Google na época,\n e no ultimos anos, a Tesla veio crescendo com suas novas tecnologias e se tornou a maior empresa de tecnologia de armas do mundo,\n em um dos seus experimentos, Flash era o voluntario que iria testa a mais nova criação da Tesla, \n um braço robotico movido a baterias com diversos sensores e que disparava um laser que poderia derreter até mesmo os aços mais fortes da terra.'\n");
        // falar sobre os policiais robo-cops

        //dialogos
        System.out.println("Usuario: Como vocês conseguiram energia suficiente para criar esse robo ?");
        System.out.println("Flash: Não foi dificil, roubamos um motor de rede da torre do laboratório Google e utilizamos como nucléo para nosso robo. ");
        System.out.println("Usuario: O que ?? Você acha que isso ficará assim ? Vou contar ao diretor da empresa o que vocês fizeram.");
        System.out.println("Flash: Você não vai a lugar nenhum! \n ");

        //inicio da luta
        System.out.println("Flash tira sua jaqueta e com seu braço robotico te chama pra brigar \n");
   do{  System.out.println("Você enfrenta Flash");
        System.out.println("Ganhou(1) ou perdeu (0) ?");
             t= input.nextInt();
    }while (t >1 || t <0);

    if (t==1){ //ganhar do Flash
    int o;
        System.out.println("Você ganhou do Flash");
        System.out.println("Você recebeu 4 baterias");

        //Voltar para a praça
        int caminho2;
        System.out.println("Usuario: preciso ir até o edificio da Tesla, que tipo de arma eles criaram ? \n         Por que estão fazendo isso ?");
        System.out.println("Usuario volta para a praça");
    do{ System.out.println("PARA QUAL CAMINHO DESEJA SEGUIR ?");
        System.out.println("Oeste= 1");
        System.out.println("Norte= 2");
         caminho2= input.nextInt();
    }while (caminho2 >2 || caminho2<1);
    
    // Oeste (1)
    if (caminho2== 1){
        int x;
        System.out.println("Você chega no edificio da Tesla \n");
        System.out.println("Entrando no edificio, no salão principal, você segue para uns dos computadores da Tesla.");

        //ligar o computador
    do{ System.out.println("VOCÊ QUER LIGAR O COMPUTADOR ?");
        System.out.println(" Sim= 1 \n Não= 0");
         x=input.nextInt();
    }while (x>1 || x<1);
    int a;
        System.out.println("Você liga o computador \n");
        System.out.println("Usuario: preciso achar esse robo pelas cameras de segurança antes que seja tarde de...");
        System.out.println("Usuario: que barulho foi esse ?\n ");
        System.out.println("Você se vira e vê o robo humanoide no salão principal \n");
        System.out.println("Usuario: Aquele deve ser o robo que o Flash falou, o que é aquilo no peito dele ? \n  É o motor de rede que a Tesla roubou da Google, \n Tenho que pega-lo devolta! \n");
     
        //Luta contra robo 
    do{ System.out.println("Você enfrenta o robo");
        System.out.println("Ganhou (1) ou Perdeu (0) ?");
         a= input.nextInt();
    }while(a>1 || a<0);
        
    if( a==1){ //Ganhou do Robo
      int b;
        System.out.println("Você ganhou do robo");
        System.out.println("Você recebeu 1 motor de rede \n");
        //Caminho Norte
        System.out.println("Você volta para a praça e segue para o caminho Norte");
        System.out.println("Você entra no laboratório da Google e segue em direção a torre que está desativada, \n na lateral direita da torre existe uma combinação que diz:");
        System.out.println(" 12 PILHAS + 4 BATERIAS + 1 MOTOR \n");
    
        //Combinação final 
    do{ System.out.println("VOCÊ TEM ESSA COMBINAÇÃO ?");
        System.out.println("Sim= 1 \n Não= 0");
         b=input.nextInt();
    }while (b>1 || b<1);
        System.out.println("Você ativa a torre da Google \n");
        System.out.println("No elevador a sua esquerda, sai um senhor de cadeira de rodas, ele é o CEO da Google.\n");

        //dialogos
        System.out.println("Sundar Pichai: Você conseguiu ativar a torre meu jovem, mas isso foi só o começo, \n a Tesla está desenvolvendo uma nova Inteligência Artificial, mas essa tecnologia não são deles, é muito mais avançado, alguém está fornecendo a tecnologia para criação de robos em formas de armas com a nova I.A, \n você deve impedi-los, soube que essa tecnologia tem como matérias-primas recursos de outras cidades.");
        System.out.println("Vá e descubra o que está acontecendo\n");
        System.out.println("Você sai do laboratório e segue para a estação de trem e segue para a proxima cidade.");





}else // Derrota do robo 
            System.out.println("Você morreu");
  
        


}//caminho2 Norte


}else // derrota Flash
            System.out.println("Você morreu");

   
}//Caminho 1 

        // entrada em Ziuns
        System.out.println("Saindo do trem,você sente o ar queimando pelas suas narinas e vê uma placa ");
        System.out.println("=================================");

        System.out.println("        Cuidado ar toxico        ");

        System.out.println("=================================");

        System.out.println("logo  a sua frente você vê um senhor");

        System.out.println("Você vai até ele?");
        resposta = input.next();
        do {
            if (resposta.equals("sim")) {
                System.out.println(nome + ": Olá senhor poderia me dar uma informação?");
                System.out.println("Você estuta um barulho grotesco muito alto!!!!");
                System.out.println(drogadoDeSiranio + ": ooooooooouuuuuuuuuuuuuuuuuuuuuuuuur!!!!!!");

                // apresentação de personagem
                System.out.println(
                        "Um homem misterios, pula na sua frente e dá um soco no monstro com uma manopla eletrica.");
                System.out.println(
                        "Após o homem misterioso derrotar o monstro, você percebe que no braço dele tem uma seringa, com um liquido roxo ");
                System.out.println("quando v vai pegar a seringa...");
                System.out.println("Você escuta uma voz... ");
                System.out.println("Homem misterioso: Pare, isso vai te deixar louco");
                System.out.println("você fica confuso.\n " + nome + ": Será que devo confiar nele?");
                System.out.println(
                        "Homem misterioso: Esse liquido se chama siranio 90% da população de ziuns é viciada nessa droga. ");
                System.out.println(
                        " por conta dos reis da radiação, eles acabaram com a racionalidade das pessoas para tornalos escravos e dependentes deles para sobreviver, \n meu nome é phonex e luta para livrar essa cidade. ");
                System.out.println(" e me responda porque você está sem mascara? \n Vamos pegue essa");
                System.out.println("----Você coloca a mascara!----");

                // expliação primeiro objetivo
                System.out.println(nome + ": Nossa muito melhor para respirar");
                System.out.println(nome + ": Eu posso te ajudar de alguma forma? ");
                System.out.println(
                        "Phoenix: claro que pode! \n mas isso pode custar a sua vida pois esses caras são perigosos");
                System.out.println(
                        nome + ": Você acabou de salvar a minha vida então ajudar é o minimo que posso fazer. ");
                System.out.println("Phoenix: Então pegue esse mapa e essa espada radioativa ");
                System.out.println("----Você recabeu um mapa e uma esáda radioativa---- ");
                System.out.println(
                        "Phoenix: Cuidado com essa espeda, tudo que ela corta queima mas queima muito, essas espadas são a ÚNICA forma de derrotar os reis da radiação pois eles tem partes do corpo feitas de metais e essa espada consegue atravessar o metal.  ");
                System.out.println(nome + ": Entendido! \n Phoenix eu vou para a estufa e você vai para as minas ok? ");
                System.out.println(nome + ": Ok! ");
                System.out.println("Phonex sai correndo em direção a estufa.");
                // ida até o primeiro objetivo
                System.out.println("Você abre o mapa e vai em direção as minas");
                System.out.println("Você chega até as minas ");
                System.out.println("Você vê vários viciados em siranio! ");
                System.out.println(
                        nome + ": Se eu passar correndo vou morrer com certeza! \n vou ter que passar bem na surdina ");
                System.out.println("Você passa bem devagar, para não ser percebido.");
                System.out.println("Você encontra uma entrada escondida.");
                System.out.println("---Entrando nas minas---");
                System.out.println(
                        "Você chega até uma sala, na sala você vai até uma janela e olha para baixo. \n e vê os usuarios trabalhando na extração de uranio. ");
                System.out.println(
                        nome + ": Agora eu entendo o porque o Phonex quer libertar essas pessoas, isso não é vida. ");
                System.out.println("Você começa a correr, furioso com oque viu, até achar Big Daddy ");
                System.out.println(
                        "Você chuta uma porta e encontra um homem gigante com partes do corpo de metal ao ver esse semblante, você fica aterrorizado  ");
                System.out.println(nome + ": Caralho, acho que o Phonex me mandou para a morte Rs Rs");
                System.out.println("Big Daddy: Quem é você garoto? \n Big Dabby: O que está fazendo aqui?  ");
                System.out.println(nome + ": meu nome é " + nome
                        + " e eu vim aqui para matar você e livrar essa cidade! \n Você saca a espada dada pelo Phonex ");
                System.out.println("Big Daddy: HAHAHAHAHA, ai ai, vai morer pela insolência  ");
                // luta 1
                System.out.println(" --------------------- ");

                System.out.println("  a luta vai começar!  ");
                System.out.println(" --------------------- ");
                batalha1Ziuns();
                System.out.println("Big Daddy cai gravemente ferido!");
                System.out.println("Big Daddy: Não me mate por favor!");
                System.out.println(nome + ": se eu não matar você está cidade nunca vai ser livre! ");
                System.out.println(
                        "Big Daddy: Garoto você sabe que eu não sou o único que comanda essa cidade, \n e quando ela descoobrir oq você fez, sua morte será inevitavel ");
                System.out.println(nome + ": é isso que vamos ver!");
                System.out.println("Você deapita Big Daddy, e sai das minas a procura de phonex.");
                // Objetivo 2
                System.out.println("Você abre o mapa.");
                correr = input.next();
                System.out.println("Você vai correndo até a estufa. ");
                System.out.println("Ao chegar na estufa, você escuta barulhos de vidros quebrando.");
                System.out.println(
                        "Você entra na estufa, começa a procurar Phonex, \n você encontra uma escada, quando começa a subir ela, os barulhos de vidros quebrando vão almentando. ");
                System.out.println(
                        "Ao chegar no ultimo andar da estufa, você vê Phonex sendo arremessado contra a janela da estufa.  ");
                System.out.println(nome + ": PHOENIX!!!!!!");
                System.out.println("Ele cai no chão e diz");
                System.out.println("Phoenix: " + nome + "me ajud...");
                System.out.println(
                        "Corina veraza: hahahaha, pobre garoto, porque você resolveu se rebelar contra nós, \n nós adotamos você como se fosse nosso filho e você como agradecimento nos traiu! ");
                System.out.println("Corina veraza: Esse é o fim que você merece, TRAIDOR!");
                System.out.println(
                        "Phoenix: Você escravisa as pessoas dessa cidade, você tirou tudo delas, nem o ar que eles respiravam, elas podem respirar sem as suas mascaras de oxigénio. ");
                System.out.println(
                        "Phoenix: Você tornou uma cidade que tinha tudo para ser a cidade mais avançada do mundo graças a nossa biociencia, \n porem você jogou tudo isso fora em troca de poder, eu tenho nojo de você me chamar de filho! ");
                System.out.println(
                        "Ao ouvir isso Corina usa suas laminas no braços e corta o corpo de Phoenix no meio com um golpe furioso");
                // Luta 2
                System.out.println("Você fica horrorizado com oque viu, com muita raiva no coração diz. " + nome
                        + ": CORINA PREPARE-SE, NO MOMENTO VOCÊ ESTÁ VENDO A FACE DE QUEM VAI DE QUEM VAI MATAR VOCÊ E LIVRAR ESSA CIDADE DA OPREÇÃO, ASSIM COMO O PHOENIX QUERIA, HOJE É O DIA DA SUA MORTE!!!!!");
                batalha1Ziuns2();
                System.out.println("Você vai correndo até o corpo de Phoenix.");
                System.out.println(nome + ": Eu consegui!  \n Você diz isso em quanto desce uma lagrima do seu rosto");
                System.out.println(nome + ": É uma pena que você não está mais aqui para ver isso.");
                System.out.println("Você chora copiosamente ");
                System.out.println(nome
                        + ": eu não consegui salvar você como você fez comigo, mas eu consegui realizar o seu sonho de libertar a cidade.");
                System.out.println("Você vai até o corpo de corina, recupera a seringa de sanidade.");
                System.out.println(
                        "Você vai até a maquina que deixar o ar tóxico e despejá o liquido da seringa dentro da maquina. ");
                System.out.println(
                        "Assim curando a insanidade de todos os cidadões de Ziuns, purificando o ar no processo.");
                // fim da Segunda cidade
                System.out.println(
                        "Você pega as manoplas de Phoenix e guarda com você para sempre lembra de seu amigo, \n você volta para a estação de trem e segue para seu objetivo principal  ");
                System.out.println("Seu proximo destino é Cyber City");
                System.out.println("O que será que te aguarda por lá?");
             
             //volta para o trem
             
          
        System.out.println("Você está no trem indo para cyber city");
        System.out.println("");
        System.out.println("Você começa a escutar duas pessoas conversando sobre um coliseu em Cyber city ");
        System.out.println("Pessoas do trem: No coliseu se você vencer seu adversario você pode pegar as armas deles, \n você tambem pode ganhar muito dinheiro lá e ainda tem um prêmio secreto para o vencedor do coliseu.");
        System.out.println(nome + ": humm interesante, e eu bem que preciso de dinheiro, acho que vou dar uma passada nesse coliseu.");
         
        // coliseu 
        
        System.out.println("Narrador do coliseu: Sejam bem vindos ao coliseu de Cyber city!!!");
        System.out.println("Narrador do coliseu: O que vocês querem ver?");
        System.out.println("");
        System.out.println("Plateia: SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE,!!!!! ");
        System.out.println("");
        System.out.println("Narrador do coliseu: O que vocês querem ver?");
        System.out.println("");
        System.out.println("Plateia: SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE,!!!!! ");
        System.out.println("");
        System.out.println("Narrador do coliseu: Para as pessoas que nunca pisaram no coliseu vou explicar as regras.");
        System.out.println("");
        System.out.println("Dois lutadores entram na arena e lutam até a morte, vale tudo para ganhar TUDO! \n O lutador que derrotar todos os outros lutadores sera o grande campeão!");
        System.out.println("Narrador do coliseu: HAHAHAHAHA");
        System.out.println("Narrador do coliseu: Agora chega de delongas e vamos a os combates");
        System.out.println("");
        batalhaAdiversario1();
        System.out.println("");
        System.out.println("Você está indo para a proxima batalha!");
        System.out.println("");
        batalhaAdiversario2();
        System.out.println("");
        System.out.println("Você está indo para a proxima batalha!");
        System.out.println("");
        batalhaAdiversario3();
        System.out.println("");
        System.out.println("Você está indo para a proxima batalha!");
        System.out.println("");
        batalhaAdiversario4();
        System.out.println("");
        System.out.println("Você está indo para a proxima batalha!");
        System.out.println("");
        batalhaAdiversario5();
        System.out.println("");
        System.out.println("Você está indo para a proxima batalha!");
        System.out.println("");
        batalhaAdiversario6();
        System.out.println("");
        System.out.println("Você está indo para a proxima batalha!");
        System.out.println("");
        batalhaAdiversario7();
        System.out.println("");
        System.out.println("Você está indo para a proxima batalha!");
        System.out.println("");
        System.out.println("Parabens! " + nome + " você é o grande campeão");
    }

            }

        } while (resposta.equals("não"));
    }
}

}    
        

}    

}    
