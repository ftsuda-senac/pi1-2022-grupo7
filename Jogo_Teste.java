
package entender_conceitos;
import java.util.Scanner;
import java.util.Random;

public class Jogo_Teste {

static void historiaParteUm() {
        System.out.println("+===============+");
        System.out.println("ESTAÇÃO DE QAWHA");
        System.out.println("+===============+");
        System.out.println("");
        System.out.println(
                " Você sai pela entrada principal da entrada e respira um ar fresco nunca sentido antes. Sem dúvida. A cidade verde é realmente o Oasis do mundo futurista.");
        System.out.println("Mohammed. O guarda da equipe imperial de Qawha te da as boas vindas. \n ");
        System.out.println("Mohammed: Olá! Bem vindo a Qawha, a grande cidade verde! Estava esperando por você");
        opcao1();
        System.out.println("");
        opcao2();
        System.out.println("");
        System.out.println("Guarda1: EI! AONDE PENSA QUE VAI?? LADRÃO MISERAVEL!!");
        opcao3();
        batalha1();
    }

    static void historiaParteDois(){
    System.out.println("+===============+");
        System.out.println("CAFÉ PRINCIPAL DE QAWHA");
        System.out.println("+===============+");
        System.out.println("- \"Bem vindo a Qawha estrangeiro!\"");
        System.out.println(" você ouve uma voz feminina que se aproxima  de você e logo toma a forma de uma linda moça. ");
        System.out.println("");
        System.out.println("Aisha: Meu nome é Aisha, a segunda grande guerreira do império de Qawha, prazer. \n ");
        System.out.println("Ela diz enquanto estende a mão em encontro a sua. \n ");
        System.out.println("Aisha: Acredito que você esteja aqui por Aaliyah, ela te contatou.");
        System.out.println("""
                           Aaliyah é uma grande amiga minha. Pediu para que aguardasse por você aqui enquanto ela 
                           trata de alguns outros assuntos. AH, OLHA ELA ALI! 
                            """);
        System.out.println("");
        System.out.println("""
                           Aaliyah era uma mulher diferente do que se esperava. Usava um manta branca cobrindo seus 
                            cabelos e pescoço. Tinha tatuagens douradas de olhos em seu rosto. 
                             Um olhar neutro e intimidador comparado a sua voz. 
                             Mas havia algo naquela mulher que te despertava um estranho pressentimento""");
        System.out.println("");
        System.out.println("Aaliyah: Olá, bem vindo a Qawha. A nossa cidade está investindo em novos talentos pelo mundo. "
                + "E um dos selecionados da cidade de Saint Valley foi você."
                + " Gostaria de te mostrar a proposta de trabalho. Em um ambiente mais privativo. O que me diz? ");
        opcao4(); 
}
    static void historiaParteTres(){
        System.out.println("");
        System.out.println("Ela aponta para dois homens sentados em uma mesa na ponta do café. ");
        System.out.println("Vocês se cumprimentam e acompanham a moça por algumas ruas a dentro da cidade. "
                + "Tudo é muito limpo e organizado, não há carros, só transporte público. As poucas pessoas"
                + " que se vê pelas ruas andam tranquilamente, com sorriso no rosto, cumprimentando umas "
                + "as outras como se o mundo ainda fosse bonito e nada tivesse acontecido. ");
        System.out.println("");
        System.out.println(" Aaliyah: Chegamos.");
        System.out.println("A frente dela havia uma enorme estrutura quadrada de metal, se abrindo "
                + "e fechando coma uma sanfona, que parecia mais ter vida própria do que realmente"
                + "ser um prédio. Além de seu tamanho, você chutaria mais de 30 metros de altura. "
                + "Como esperado. Sendo descendentes de quem são, o mínimo esperado são estruturas megalomaníacas.");
        System.out.println("");
        System.out.println(" Aaliyah: Quero que façam o primeiro teste antes de lhes contar sobre o trabalho.");
        System.out.println("Aaliyah: Lá dentro há 3 guerreiros armados. Irão pra cima de qualquer um que entrar"
                + " por essa sala. E só irão parar se for derrotados. Ou matarem quem estiver lá. ");
        System.out.println("Aaliyah: Para provar suas habilidades, quero que entrem lá e derrotem os 3 guerreiros."
                + " Se conseguirem, passaremos para a próxima fase.");
        System.out.println("boa sorte");
        System.out.println("");
        batalha2();
        batalha3();
        batalha4();

    }
    static void historiaParteQuatro(){
        System.out.println("+===============+");
        System.out.println("PRISÃO DE QAWHA");
        System.out.println("+===============+");
        System.out.println("você acorda e todas as suas coisas desapareceram. "
                + "Qual o sentido disso tudo? Há algo muito estranho nessa cidade "
                + "que não cheira nada bem. ");
        System.out.println("Por sorte, a cela tinha uma charada boba para sair que dizia algo "
                + "sobre escuro e sombra. Uma dessas bobagens de rpg");
        System.out.println("");
        System.out.println("""
                Na saída, você avista uma janela.
                Chegando próximo a mesma percebe que está acima das nuvens.
                 O prédio é alto o suficiente para matar de queda até mesmo o homem com o
                 maior nível de resistência.
                Nos corredores se ouve um rugido feroz de uma besta que se aproxima.""");
        System.out.println("");
        batalha5();
        System.out.println("");

    }
    static void historiaParteCinco(){
        System.out.println("Você ouve os gritos de Aisha se aproximando no corredor");
        System.out.println("""
                Aisha: jogador! Finalmente te achei! N\u00e3o acredito que te

                trouxeram até aqui. Tudo está muito errado nessa situações toda. E a Aliyah...
                 Eu deveria ter notado tudo isso antes! Foi tudo um plano. E eu descobri o que
                 está acontecendo.""");
        System.out.println("Saber a história??");
        System.out.println("");
        opcao5();
        System.out.println("");
    }
    static void historiaParteSeis(){
        System.out.println("Um estrondo nos corredores do andar chama a atenção de vocês.");
        System.out.println("Aaliyah: Você ouviu isso?");
        System.out.println("""
                A toda velocidade, uma serpente de tamanho sobrenatural surge em seu caminho.
                 Capaz de engolir um rinoceronte com facilidade, e com cara de poucos amigos.""");
        System.out.println("");
        batalha6();
        System.out.println("");
    }
    static void historiaParteSete(){
        System.out.println(" Aisha: Merda...Essas coisas da Roudini estão começando a nos achar.");
        opcao6();
        System.out.println("""
                 Aisha: A muito tempo atrás quando o oriente médio se tornou um deserto mais seco que o Saara. Os nossos
                 descendentes acreditavam ser o fim do nosso povo. Não havia mais petróleo em nosso
                 continente, água potável e nem qualquer forma de energia que
                  pudesse manter o padrão de uma sociedade moderna. Uma das últimas mulheres que ainda
                  caminhavam através da areia seca, clamando a Deus por salvação, encontrara uma pedra vermelha.
                  Mais brilhante que a luz do sol.

                 Aisha: Ao tocar a pedra, a mulher sentiu algo nunca imaginado antes. Uma energia, forte e
                  poderosa. E uma necessidade incontrolável de consumir carne humana. O nome dela: Roudini
                 Aisha: Roudini escondeu esse segredo durante anos. Estudando como usar a energia daquela
                  pedra da maneira correta. Apenas com o objetivo de ajudar nosso povo.
                  Ela tinha grandes esperanças. Mas nunca imaginou que poderia salvar a nação.
                """);
        opcao7();
        System.out.println("""
                Aisha: Roudini, de alguma forma, inventou uma m\u00e1quina que conseguia sugar
                 toda a energia daquela pedra. Era a solu\u00e7\u00e3o dos problemas do nosso povo. Mas as vontades
                 da pedra ainda deviam ser atendidas na cria\u00e7\u00e3o de energia.""");
        System.out.println("Aisha: A maquina exigia um componente físico humano vermelho no estado solido.");
        opcao8();
        System.out.println("""
                Aisha: E caf\u00e9. Aisha: \u00c9, caf\u00e9. Esse \u00e9 o nome da cidade. Qawha.
                  N\u00e3o tente entender o java.""");
        System.out.println(
                """
                        Aisha: O ponto é: Roudini jamais faria mal ao seu povo, nem ao menos um cidadão
                          oriental poderia sofrer dessa dor. Então, ela criou o projeto União de Reestabelecimento
                          Social Singelo. Convocando imigrantes de outras sociedades para os testes. Em troca.
                          Ela vende parte dessa energia para as cidades ocidentais.
                         Aisha: Foi um sucesso absoluto. Roudini conseguiu reconstruir o Oriente e agora
                          somos o povo humano que melhor passou pela crise climática. Mas isso está errado.
                         Aisha: H\u00e1 recursos suficientes em Qawha que extinguiriam a pobreza da humanidade. N\u00e3o h\u00e1 pobres aqui. Eu preciso da sua ajuda jogador. N\u00f3s precisamos.
                         As pessoas da cidade n\u00e3o sabem sobre isso, elas precisam saber.
                         Precisamos impedir que isso aconte\u00e7a.""");
        System.out.println("AJUDAR QAWHA?");
        opcao9();
    }
    static void historiaParteOito(){
        System.out.println("+===============+");
        System.out.println("BASE DA MÃE ROUDINI");
        System.out.println("+===============+");
        System.out.println("Um grito ensurdecedor faz com quem vocês parem de correr andar a dentro.");
        System.out.println("""
                Voc\u00ea v\u00ea entrar pela porta uma mulher, de roupas negras e adornos dourados
                  por todo o corpo. Ela tem o dobro da altura de um cidad\u00e3o comum e possui um tipo
                  de mascara feita de ouro que cobre seus olhos e testa. Em suas m\u00e3os h\u00e1 olhos tatuados
                 e sinais de serpentes.""");
        System.out.println("""
                Ela te cumprimenta com a cabe\u00e7a, em sil\u00eancio. Na sua m\u00e3o esquerda h\u00e1 uma espada
                 dourada, na direita um rubi vermelho, em formato de cora\u00e7\u00e3o.""");
        opcao10();
        System.out.println("""
                M\u00e3e Roudini: Rendi\u00e7\u00e3o? haha...S\u00f3 queria lhes dar uma \u00faltima escolha.
                 Com qual das duas querem morrer?""");
        batalha7();
    }
    static void historiaParteNove() {
        System.out.println(
                """
                        Roudini cai no ch\u00e3o com a barriga para cima. Est\u00e1 sangrando muito,
                         mas n\u00e3o larga em momento nenbum a esapada em sua m\u00e3o direita, e o cora\u00e7\u00e3o.
                         Que se encontra em sua m\u00e3o esquerda, grudado em seu peito. Ela se esfor\u00e7a para come\u00e7ar a falar:""");
        System.out.println("""
                Roudini: Devo admitir. Este \u00e9 meu fim. Mas n\u00e3o me arrependo.
                 tudo que fiz, fiz pela minha cidade. Fiz pelo meu povo. O fim nos assolava.
                 Voc\u00eas jovens n\u00e3o tem no\u00e7\u00e3o do que vi """);
        System.out.println("""
                Apesar de sua apar\u00eancia, Roudini viveu o tempo do fim. E viu a Terra em seu
                antes e depois. """);
        System.out.println("""
                Roudini: A \u00c1frica foi consumida lentamente pela \u00e1gua, ningu\u00e9m os ajudou.
                  O sul do Oriente, destru\u00eddos pelas pragas e pela fome
                  A America? Disolada pela seca. E logo depois, ironicamente, teve o mesmo fim dos outros
                  S\u00f3 sobramos n\u00f3s e o Norte. Estavamos por conta pr\u00f3rpia. E entre n\u00f3s e a Europa.
                 N\u00e3o poderiamos esperar nada deles.""");
        System.out.println("Roudini: Deus me concebeu uma chance, e eu não a descartei. E faria de novo se fosse"
                + "necessário.");
        System.out.println("Aisha parecia triste. Era seu povo também, e ela entendia o que Roudini dissera");
        System.out.println("Roudini: Garoto. Você pode me odiar");
        System.out.println("Roudini interrompe sua fala com uma tosse sangunolenta");
        System.out.println("""
                Mas preciso que defenda essa cidade. Que ajude esse povo. Que encontre a Formula, salve
                 o que restou do planeta. Se me prometer isso. Te entego o meu cora\u00e7\u00e3o e a espada. """);
        System.out.println(" Você promete. ");
        System.out.println("Roudini: Ótimo. ");
        System.out.println("Roudini sorri. ");
        System.out.println("""
                Roudini: Uma \u00faltima coisa. N\u00e3o confie na Formula.
                 Ela n\u00e3o \u00e9 a solu\u00e7\u00e3o. \u00c9 o problema. A Formula sempre foi o problema
                """);
        System.out.println(" Ela solta a esapada e o coração ");
        System.out.println(" Você recebeu Coração de Roudini e Espada Dourada de Qawha");
        System.out.println(" Aisha: Obrigado. Obrigado pela ajuda. Não sei como te agradecer.");
        opcao11();
        System.out.println(" Aisha: Certo. Te levarei até lá");
        System.out.println("");
        System.out.println(
                """
                        Voc\u00ea entra no trem de Qawha. Em alguns dias as pessoas sabaer\u00e3o do heroi
                         que descobriu sobre o esc\u00e2ndalo da URSS. E ent\u00e3o derrotou a grande M\u00e3e Roudini
                         Voc\u00ea provavelmente ser\u00e1 uma sensa\u00e7\u00e3o mundial. Sua foto estrar\u00e1
                         em todos os jornais eletr\u00f4nicos do novo Mundo. Mas s\u00f3 h\u00e1 uma coisa passando pela sua cabe\u00e7a na
                         viagem a quinta cidade. """);
        System.out.println("========================");
        System.out.println(" NÃO CONFIE NA FORMULA");
        System.out.println("========================");
        System.out.println(" Não confie na Formula...");
        System.out.println(" O que isso quer dizer?");
        System.out.println("");
        System.out.println("");
        System.out.println(" FIM DO CAPÍTULO 4");

    }
    static void historiaParteDez()  {
        System.out.println("");
        System.out.println("""
                       Um frio intenso te acorda de um cochilo agradável na janela do trem. 
                         O clima mudou rapidamente e seus dedos estão começando a ficar roxos. """);
        System.out.println("");
        System.out.println("""
                           Você olha ao redor e não há ninguém além de você na estação. 
                           Na verdade, não há ninguém faz um  bom tempo. Desde a última estação de Qawha. 
                           Simplesmente tudo estável, vazio e escuro. """);
        System.out.println("");
        System.out.println("""
                           A única coisa que te chama atenção são pequenas casas feitas de madeira, 
                           ao lado das colinas cheias de neve. """);
        System.out.println("");
        System.out.println("""
                           Todas parecem abandonadas. Talvez antigas casas de povos do Norte que insistiram em se manter desse lado do mundo. 
                           Até o frio ser frio demais pra qualquer um suportar. """);
        System.out.println("Mas há algo diferente em uma. Está intacta. E há luz nela.  ");
        System.out.println("");
        System.out.println("""
                           O trem para. É a estação final, tudo está escuro. Você sente dificuldade até mesmo em conseguir 
                           passar pelo vão entre e o trem e a plataforma. 
                            Esse lugar definiitvamente não vê uma alma viva faz anos. """); 
    }
    static void historiaParteOnze() {
        System.out.println("""
                           Na entrada da cidade. Há bandeiras em homenagens aos países da terra. 
                            Elas estão parcialmente congeladas pelo frio. """);
        System.out.println("");
        System.out.println("""
                           O sol aquece parte do solo que não foi engolido pela neve. Você se sente 
                           sortudo pelo verão ter chegado a tempo, nenhum ser
                           huamno poderia sobreviver a essas condições""");
        System.out.println("");
        System.out.println("""
                           O som ensurdecedor de uma sirene te desperta dos seus pensamentos. O barulho corta 
                           o silêncio e que antes era preenchido com 
                           tos ventos fortes das montanhas. 
                           O som vai ficando cada vez mais e mais alto. E junto dele se ouvem passos altos e fortes. Como de gigantes. """);
        System.out.println("");
        System.out.println("Você vê de uma das colinas que cobrem a cidade uma criatura se aproximando. ");
        System.out.println("""
                           Aparenta ter 10 a 12 metros de altura. O corpo \u00e9 feito de pe\u00e7as de metais que 
                           se assemelham a um humano mas com bra\u00e7os desproporcionais, 
                           \tquase chegando aos p\u00e9s da criatura. Entre as pe\u00e7as a partes feitas de carne,
                           quase propositalmente colocadas. Como se quisesse-se parecer
                           \tcom uma criatura de carne e osso.""");
        System.out.println("""
                           Sua cabe\u00e7a \u00e9 feita de 5 sirenes gigantes, tamb\u00e9m revertidas em carne. Dentro delas, dentes gigantescos estavam presos (e gra\u00e7as a Deus estavam l\u00e1,
                                                 inibiam parte do som pertubador da criatura). """);
        System.out.println("");
        System.out.println("""
                           Voc\u00ea passa tanto tempo observando abismado a aproxima\u00e7\u00e3o da criatura que s\u00f3
                           percebe a presen\u00e7a de outra pessoa no recinto quando j\u00e1 \u00e9 tarde demais. 
                            \t"Sil\u00eancio". Uma voz rob\u00f3tica atr\u00e1s de voc\u00ea, coloca delicadamente 
                           um machado perfeitamente afiado sobre a parte frontal do seu pesco\u00e7o. """);
        System.out.println("\"Se não quiser morrer, fique quieto e acompanhe meus passos. Me entendeu? Concorde com a cabeça\" ");
        //opcao1
        System.out.println("\"Ótimo. Agora mantenha o mesmo ritmo que o meu\". ");
        System.out.println("A criatura te puxa para um sentido contrário do monstro que estava cada vez mais perto. ");
        System.out.println("");
        System.out.println("Depois de algum tempo andando, vocês param em um local distante do ocorrido. Finalmente a "
                             + "criatura tira o machado do seu pescoço e te permite enxerga-la.");

                System.out.println("Uma maquina. Com uma cabeça semelhante a uma câmera e com"
                + " roupas semelhantes a de povos antigos.");
        System.out.println("Björn: \"Qual o seu problema? O que faz aqui? Se quisesse se "
                + "matar era mais fácil ir ao vale do suicídio. Não atrapalhar a nossa vida!");
        System.out.println("Você não consegue prestar atenção no que o robô diz. Está concentrado"
                + " demais nos alto falantes em seu pescoço que emitem o som de sua...\"voz\".");
        System.out.println("Björn: \"De qualquer forma, sou Björn. De nada por salvar sua vida\"");
        System.out.println("");
        opcao14();
        System.out.println("");
        System.out.println("Björn: \"Venha, você deve conhecer o resto da minha tribo pra saber quem sou eu. Quem nós somos");
        System.out.println("Björn te leva para ainda mais a dentro da floresta. Onde não há nada além de plantas. "
                + "É como se nada sobrevivesse a essas terras por muito tempo.");
        System.out.println("Björn: \"Chegamos\"");

    }
    static void historiaParteDoze () { 
        System.out.println("Haviam vários semelhantes a Björn. A maioria bem pequenos."
                + " Com cabeças de eletrônicos, conmo pequenos anões robôs que se escondiam como ratos\n" 
                + "daquelas aberrações.");
        System.out.println("O lugar parecia como uma das antigas aldeias humanas que você já ouviu falar nos livros. "
                + "Haviam casas de madeira e todas as \"pessoas\" trabalhavam em\n"
                + "algo. Com roupas tribais e peles de animais que você sequer imagina como foram parar lá.");
        System.out.println("Assim que começam a te enxergar, o lugar que antes parecia uma feira de antiguidades se "
                + "torna um silêncio absoluto. Todos estão olhando pra você, alguns\n" 
                + "com medo, outros com nojo, ódio. Os olhares variavam.");
        System.out.println("Antes que Björn pudesse dizer algo você grita");
        System.out.println("\"Eu vim atrás da Formula, não quero lhes fazer mal\".");
        System.out.println("Todos em sincronia apontam em silêncio para uma cabana. Isolada, na ponta da cidade.");
        System.out.println("\"ELIPSE\". Eles gritam em conjunto. Inclusive Björn, que já não se encontrava mais"
                + " ao seu lado. E sim dos outros");
        System.out.println("Você se assusta com aquilo e corre deseperadamente para dentro da cabana onde todos os dedos apontavam.");
        System.out.println("");

    }
    static void historiaParteTreze() {
        System.out.println(" Tudo está escuro. Uma luz baixa no centro da cabana revela um corpo de metal. "
                + "Muito mais semelhante a de um humano do que os outros. Nesse havia uma cabeça\n" 
                +"humana, porém sem rosto.");
        System.out.println("Conectada por centenas de fios na parte traseira de seu quase crânio, a criatura se encontrava"
                + " ajoelhada, como se estivesse cansada. E sinaliza para que você\n" 
                +"se ajoelhe também.");

        System.out.println("");
        opcao15();
        System.out.println("");

        System.out.println("Elipse: \"A quem você busca no meio do fim do mundo?\"");
        System.out.println("A voz era suave. Tão verdadeira e calma. Faziam-se anos que "
                + "você não ouvia alguém falando tão lentamente assim.");
        System.out.println("\"Busco pela Formula\".");
        System.out.println("Ela ri.");
        System.out.println("Elipse: \"A Formula, tem somente um objetivo. Adquirir, usar e descartar. "
                + "Você realmente procura por ela?\"");
        System.out.println("\"Sim\"");
        System.out.println("Elipse: \"Eu fui um dos seus brinquedos favoritos sabia? A Formula via humanidade em mim. "
                + "É isso que ela procura, humanidade, assim como eu\".");
        System.out.println("\"Eu não a conheço, mas ela tem respostas para ajudar o mundo. E eu preciso dessas respostas\"");
        System.out.println("Elipse: \"De fato. Ela tem.\"");
        System.out.println("Elipse: \"Você é corajoso humano. Mais do que qualquer um que eu já vi.\"");
        System.out.println("\"Tenho medo\"");
        System.out.println("Elipse: \"Talvez seja isso, humanidade, um pouco dela.\"");
        System.out.println("Ela sorri, te diz por onde seguir para encontrar a Formula");
        System.out.println("Elipse: \"Cuidado, não confie nela. Nunca confie nela\".");
        System.out.println("Ela desliga, antes de receber uma resposta. Não parece ter morrido, "
                + "só estava desativada, provavelmente, propositalmente.");
        System.out.println("");

        System.out.println("Você sai da cabana e todos estão estáticos nas mesmas posições."
                + " Exceto por Björn, que estava na porta te aguardando");
        System.out.println("Björn: \"Irei com você. Não deixarei com que morra.\"");
        System.out.println("Você aceita");
        System.out.println("");
    }
    static void historiaParteCatorze(){
        System.out.println(                     "++++++++++++++++++++++++++++++\n" +
"						++++++++++++++++++++++++++++++\n" +
"						+++ FLORESTA DE  HELIOFUGO +++\n" +
"						++++++++++++++++++++++++++++++\n" +
"						++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("Após algum tempo andando. Vocês encontraram algumas sirenes, e outras criaturas que você tem "
                + "certeza que se estivesse sozinho, jamais saberia lidar com elas. Sua gratidão a Björn não pode ser calculada. ");

        System.out.println("Vocês estão mais proximos que nunca da base da Formula. Quando de repente sentem o chão tremer, mas não "
                + "como tremia quando uma sirene estava por perto. Era algo ainda maior. ");
        System.out.println("Björn: \"Você sentiu isso?\"");
        System.out.println("Antes mesmo que você pudesse responder. Björn olha a sua esquerda e quase que ao mesmo tempo te puxa assustado. "
                + "Indicado que vocês devem correr o quanto antes dali. ");
        System.out.println("");

        System.out.println("Após um longo tempo correndo, vocês se escondem atrás de uma árvore. ");
        System.out.println(" A criatura qual você não viu a aparência emitia um zumbido ensurdecedor, que fazia você fechar os olhos "
                + "com força, implorando para que aquele som saísse da sua cabeça. Mas aparentemente aquilo não afeta robôs. "
                + "Já que Björn só ficava estático em sua frente tentando te ajudar a voltar ao normal. ");
        System.out.println("");
        System.out.println("Após um logo tempo de tortura. O som da criatura se silenciou, e você não conseguia pensar em outra coisa "
                + "a não ser ver o que poderia reproduzir um som tão perturbador.");
        System.out.println("Você se inclina para fora da árvore para enxergar, e no mesmo instante em que fica "
                + "cara a cara com a criatura, você ouve Björn falando. ");
        System.out.println("Björn: “NÃO! NÃO OLHE NOS OLHOS DELA!\"");
        System.out.println(" Mas já é tarde demais.");
        System.out.println("");
    }
    static void historiaParteQuinze(){
        System.out.println("A criatura era do tamanho de uma das montanhas que vera agora pouco. "
                + "Os olhos eram brilhantes e brancos como a neve, mas refletiam como a luz da lua. "
                + "Sua pele era revestida em carne, para cobrir algo tão grande chuto que seriam de baleias. ");
        System.out.println("Haviam 6 braços, que emitiam luzes com símbolos estranhos, e uma grande ao redor"
                + " da sua cabeça, aparentemente deveria se assemelhar a um sol, mas sua inconsistência lembrava fogo.  ");
        System.out.println("  A cabeça, tinha o formato e a aparência de um recém nascido, como se "
                + "estivesse aprisionado no corpo de um monstro. ");
        System.out.println("");

        System.out.println("Após alguns segundos encarando a aberração, tudo ficou silencioso e escuro. "
                + "Não havia mais nada além de você e ela ali. ");
        System.out.println("Você ouve uma voz ");
        //NOME AQUI 
        System.out.println("“(Nome)…Bem vindo” ");
        System.out.println(" Era a voz de um homem, definitivamente não de um recém nascido. Ele queria conversar. ");
        System.out.println("");
        opcao16();
        System.out.println("");
        opcao17();
        System.out.println("");
        System.out.println("Matriz: “Boa sorte…Vai ser necessário”. ");
        System.out.println("");
        //NOME AQUI 
        System.out.println("Björn: “(nome)! (nome!) ");
        System.out.println(" Björn gritava enquanto batia em sua testa ");
        opcao18();
        System.out.println("");
        System.out.println("Björn: “eu te avisei pra não olhar praquilo! Rápido. Temos que sair daqui o quanto antes. ");
        System.out.println("");

    }
    static void historiaParteDezesseis(){
        System.out.println("Vocês chegam ao meio das montanhas ao leste da cidade. No centro há uma estrutura em formato elíptica. ");
        System.out.println("Björn: “Ali está. A Formula está lá dentro.");
        System.out.println("Björn: “Não posso passar daqui, você irá precisar ir sem mim” ");
        System.out.println("Você agradece a Björn, que se despede e volta para o sentido da cidade. Sem ele nada disso teria sido possível. ");
        System.out.println("Após a despedida, você vai a encontro com a Formula. ");
        System.out.println("");
        System.out.println("            +++++++++++++++++++++++++++++++\n" +
"			                +++++++++++++++++++++++++++++++\n" +
"					+++PRÉDIO DO PROJETO FORMULA+++\n" +
"					+++++++++++++++++++++++++++++++\n" +
"					+++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("Você entra pela portão principal, o lugar inteiro está em perfeito estado. "
                + " Apesar do frio extremo e a localidade distante de qualquer pessoa. ");
        System.out.println(" No cetro do que aparentemente seria a única sala do prédio, você enxerga ela. ");
        System.out.println("Um manequim que chegava até o teto. O corpo era perfeitamente simétrico e idêntico a de um ser humano. "
                + " Ao seu redor haviam escadas em caracol ao redor de toda a estrutura. Como a construção de uma máquina espacial."
                + " Porém, era maior que qualquer máquina já construída. ");
        System.out.println("");
        System.out.println("Em partes do seu corpo, próxima as escadas haviam furos para se conectar as energias. ");
        System.out.println("");

        opcao19();
        System.out.println("");
        System.out.println("No primeiro furo. O formato de uma bateria na perna.  Um nome ao lado: “Saint Valley” ");
        System.out.println("");
        opcao20();
        System.out.println("");
        System.out.println("No segundo furo, na região do umbigo. O formato de um minério e em seguida o nome “Ziuns” ");
        System.out.println("");
        opcao21();
        System.out.println("");
        System.out.println("No terceiro furo. Um desenho de raio estava no furo em seu braço. “Zênite” ");
        System.out.println("");
        opcao22();
        System.out.println("");
        System.out.println("No quarto furo. O coração era óbvio, estava no coração. “Qawha” ");
        System.out.println("");
        opcao23();
        System.out.println("");
        System.out.println("Você chega ao topo. ");
        System.out.println("");
        opcao24();
        System.out.println("");
        System.out.println("FORMULA ATIVADA");
        System.out.println("Um terremoto se inicia. ");
        System.out.println("");

    }
    static void historiaParteDezessete(){
        System.out.println("");

        System.out.println("");

        batalhaIA();
    }

    static void opcao1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("Aperte o 1: " + "\"Quem é você?\"");
        System.out.println("Aperte o 2: " + "\"Olá! Poderia me dizer onde posso encontrar Aaliyah?\"");
        int escolha1;
        escolha1 = input.nextInt();
        switch (escolha1) {
            case 1:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("Ora, onde estão os meus modos? Meu nome e Mohammed! grande cavalheiro "
                            + "imperial da Qawha! Sou um enviado de Aaliyah. Ela esta a sua espera.");
            case 2:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("Hm...Hoje e seu dia de sorte! Aaliyah me enviou para buscar você."
                            + " Sou Mohammed, grande cavalheiro imperial de Qawha.");
            default:
                System.out.println("esta não é uma mensagem válída");
        }
    }
    static void opcao2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("Aperte o 1: " + "\"Um cavalheiro? Voltamos ao medievo?\"");
        System.out.println("Aperte o 2: " + "\"Não sabia que chamavam os tiras daqui de \"cavalheiros\".");
        System.out.println("Aperte o 3: " + "\"Hm...Legal. Poderia me levar até ela cavalheiro?\".");
        int escolha1;
        escolha1 = input.nextInt();
        switch (escolha1) {
            case 1:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("""
                            Mohammed: Haha, digamos que as coisas por aqui são um pouco diferentes
                                do resto do mundo. Mas vamos, te levarei até ela""");
                break;
            case 2:
                for (escolha1 = 2; escolha1 == 2; escolha1++)
                    System.out.println("""
                            Mohammed: Você se refere a policiais? Eles não existem por aqui.
                                Nós fazemos a segurança da cidade desde que os pa\u00edses ca\u00edram.
                                Mas vamos, te levarei at\u00e9 ela""");
                break;
            case 3:
                for (escolha1 = 3; escolha1 == 3; escolha1++)
                    System.out.println("Mohammed: Claro! Vamos, te levarei até ela.");
                break;
            default:
                System.out.println("esta não é uma mensagem válida");

        }
    }
    static void opcao3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("Aperte o 1: " + "\"O que? Do que você está falando?\"");
        System.out.println("Aperte o 2: " + "\"QUE? MISERÁVEL É SUA MÃE!\"");
        int escolha1;
        escolha1 = input.nextInt();
        switch (escolha1) {
            case 1:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("""
                            Guarda1: NÃO ADIANTA TENTAR FUGIR, TE PEGAMOS NO FLAGRA ROUBANDO!
                                AGORA LIDE COM AS CONSEQUENCIAS!""");
                break;
            case 2:
                System.out.println("Guarda1: COMO OUSA ESTRANGEIRO IMUNDO! VOU TE FAZER PAGAR POR ISSO!");
                break;
            default:
                System.out.println("esta não é uma mensagem válida");

        }
    }
    static void opcao4() {
        Scanner input = new Scanner(System.in);

        System.out.println("Aperte o 1 para confirmar");
        int escolha1;
        escolha1 = input.nextInt();
        switch (escolha1) {
            case 1:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("");
            default:
                System.out.println("esta não é uma mensagem válída");
        }
    }
    static void opcao5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("Aperte o 1: " + "Sim");
        System.out.println("Aperte o 2: " + "Não");
        int escolha1 = input.nextInt();
        switch (escolha1) {
            case 1:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("""
                            Aaliyah: Eles estavam todos muito estranhos, n\u00e3o sou da guarda real da cidade
                                mas ando em conjunto com cada um. E havia algo esquisito ultimamente.
                            Eu ignorei, achei que era apenas impressão minha. Me arrependo imensamente disso.. """);
                System.out.println("""
                        Aaliyah: S\u00f3 percebi que era tarde demais quando entrei em um confronto com Mohammed.
                            Ele estava prendendo um inocente, um homem de Ziuns. Um viciado.""");
                System.out.println(
                        """
                                Ele era um dos nomes selecionados para o programa URSS, Uni\u00e3o de Reestabelecimento Social
                                     Singelo criado com o objetivo de proporcionar oportunidades de entrada de cidad\u00e3os de outras
                                cidades para a nossa. O programa que voc\u00ea faz parte. Ele veio da cidade ap\u00f3s voc\u00ea""");
                System.out.println(
                        "Aaliyah: Mohammed me explicou que o plano por trás do programa na verdade era outro. Um plano doentio.");
                break;
            default:
                System.out.println("esta não é uma mensagem válída");
        }
    }
    static void opcao6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("Aperte o 1: " + " O que são essas criaturas?");
        System.out.println("Aperte o 2: " + "Espero que isso não seja um boss ou coisa assim.");
        int escolha1 = input.nextInt();
        switch (escolha1) {
            case 1:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("Calma, eu vou explicar tudo");
                break;
            case 2:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("Calma, eu vou explicar tudo");
                break;
            default:



  System.out.println("esta não é uma mensagem válída");

        }
    }
    static void opcao7() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("Aperte o 1: " + " Isso tá ficando estranho...");
        System.out.println("Aperte o 2: " + "Da pra ir direto ao ponto?");
        int escolha1 = input.nextInt();
        if ((escolha1 != 2) || (escolha1 != 1)) {
            switch (escolha1) {
                case 1:
                    for (escolha1 = 1; escolha1 == 1; escolha1++)
                        System.out.println("Estou quase lá.");
                    break;
                case 2:
                    for (escolha1 = 1; escolha1 == 1; escolha1++)
                        System.out.println("Estou quase lá.");
                    break;
                default:
                    System.out.println("esta não é uma mensagem válída");
            }
        }
    }
    static void opcao8() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("Aperte o 1: " + "você quer dizer...orgãos?");
        int escolha1 = input.nextInt();
        switch (escolha1) {
            case 1:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("Sim. Órgãos. E café");
                break;
            default:
                System.out.println("esta não é uma mensagem válída");

        }
    }
    static void opcao9() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("Aperte o 1: " + "SIM");
        int escolha1 = input.nextInt();
        switch (escolha1) {
            case 1:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("Ótimo! Precisamos encontrar ela o quanto antes. essas duas criaturas"
                            + " que enfrentamos são as bestas dela. Mãe Roudini provavelmente está 10 andares acima. "
                            + "No topo. Vamos, rápido.");
                break;
            default:
                System.out.println("esta não é uma mensagem válída");
        }
    }
    static void opcao10(){
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("Aperte o 1: " + "Pretende se render? Ótimo. Talvez assim passe"
                + " o resto da sua vida somente presa e não morta. ");
        System.out.println("Aperte o 2: " + "Infelizmente não poderemos aceitar nenhuma"
                + " redenção de alguém com crimes de guerra. Seu império acaba aqui Roudini. ");
        System.out.println("Aperte o 3: " + "Não adianta tentar se render não! Vai levar a surra da tua vida.");
        int escolha1 = input.nextInt();
        switch (escolha1) {
            case 1:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("Mãe Roudini: Rendição? haha...Só queria lhes dar uma última escolha. "
                            + "Com qual das duas querem morrer?");
            case 2:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("Mãe Roudini: Rendição? haha...Só queria lhes dar uma última escolha. "
                            + "Com qual das duas querem morrer?");
            case 3:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("Mãe Roudini: Rendição? haha...Só queria lhes dar uma última escolha. "
                            + "Com qual das duas querem morrer?");

            default:
                System.out.println("esta não é uma mensagem válída");

        }
    }
    static void opcao11(){
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("Aperte o 1: " + "Só gostaria de ser levado a estação mais próxima");
        int escolha1 = input.nextInt();
        switch (escolha1) {
            case 1:
                for (escolha1 = 1; escolha1 == 1; escolha1++)
                    System.out.println("");
                break;
            default:
                System.out.println("esta não é uma mensagem válída");
        }
    }
    static void opcao14(){
        Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("Aperte o 1: " + "O que era aquela criatura? Tem mais daqueles?");
    System.out.println("Aperte o 2: " + "O QUE É VOCÊ?");
    int escolha1;
    escolha1 = input.nextInt();
    switch (escolha1) {
        case 1:
            for (escolha1 = 1; escolha1 == 1; escolha1++)
            System.out.println("""
                               "Aquilo era uma sirene. Existem v\u00e1rios deles. Se tivessem te achado teriam gritado.E depois te matado. Gritam pra chamar coisas
                               \tmuito maiores. Teriamos problemas reais por sua causa.""");     
        break;
        case 2:
            for (escolha1 = 2; escolha1 == 2; escolha1++)
                System.out.println("\"O que? Porra qual seu problema!? Vocês humanos são tão arrogantes." 
                        + "você pede desculpas");
        break; 
        default:
               System.out.println ("esta não é uma mensagem válida");

        }
    }
    static void opcao15(){
        Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("Aperte o 1: " + "Você por acaso é Elipse?");
    System.out.println("Aperte o 2: " + "Preciso de sua ajuda para encontrar quem busco.");
    int escolha1;
    escolha1 = input.nextInt();
    switch (escolha1) {
        case 1:
            for (escolha1 = 1; escolha1 == 1; escolha1++)
            System.out.println("Elipse: \"Sou eu, o ser do meio infinito. A luz que paira pelas sombras de um caminho sem destino."
                    + " O resultado da angustia humana.\"");     
        break;
        case 2:
            for (escolha1 = 2; escolha1 == 2; escolha1++)
                System.out.println("Elipse: \"Eu também preciso de sua ajuda. Busco a mim, busco a humanidade no ar que respiram. "
                        + "Encontro humanos, não encontro humanidade.\n" +
                            "		Mas antes, me diga você\"");
        break; 
        default:
               System.out.println ("esta não é uma mensagem válida");

    }
}    
    static void opcao16(){
         Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("Aperte o 1: " + "Que sensação horrível. O que quer de mim? ");
    System.out.println("Aperte o 2: " + "Como você ficou assim? ");
    int escolha1;
    escolha1 = input.nextInt();
    switch (escolha1) {
        case 1:
            for (escolha1 = 1; escolha1 == 1; escolha1++)
            System.out.println("Matriz: “O que quero de todos, o que quer toda formula. Humanidade”");     
        break;
        case 2:
            for (escolha1 = 2; escolha1 == 2; escolha1++)
                System.out.println("Matriz: “Essa é minha forma, sempre fui assim…Como você ficou assim?”");
        break; 
        default:
               System.out.println ("esta não é uma mensagem válida");

    }
}
    static void opcao17(){
         Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("Aperte o 1: " + "Como entrou na minha cabeça?");
    System.out.println("Aperte o 2: " + "Pra onde devo ir? ");
    System.out.println("Aperte o 3: " + "Você também foi da Formula?");
    int escolha1;
    escolha1 = input.nextInt();
    switch (escolha1) {
        case 1:
            for (escolha1 = 1; escolha1 == 1; escolha1++)
            System.out.println("Matriz: “Eu não entrei na sua cabeça, eu sou ela. Sou a de todo mundo haha”");     
        break;
        case 2:
            for (escolha1 = 2; escolha1 == 2; escolha1++)
            System.out.println("Matriz: “Pra lugar algum. Não te darei respostas se também não lhe posso fazer perguntas”");
        break; 
        case 3:
            for (escolha1 = 2; escolha1 == 2; escolha1++)
            System.out.println("Matriz: “Sim, ela me machucou muito. Porém, eu a entendo.”"); 
        default:
               System.out.println ("esta não é uma mensagem válida");

    }
}
    static void opcao18(){
        Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("Aperte o 1: " + "Ei, calma aí. Já ouvi");
    System.out.println("Aperte o 2: " + "CARA PARA DE ME BATER!");
    int escolha1;
    escolha1 = input.nextInt();
    switch (escolha1) {
        case 1:
            for (escolha1 = 1; escolha1 == 1; escolha1++)
            System.out.println("");     
        break;
        case 2:
            for (escolha1 = 2; escolha1 == 2; escolha1++)
                System.out.println("");
        break; 
        default:
               System.out.println ("esta não é uma mensagem válida");

    }
}
    static void opcao19(){
        Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("Tecle 1 para inicializar a ativação da Formula");
    int escolha1;
    escolha1 = input.nextInt();
    switch (escolha1) {
        case 1:
            for (escolha1 = 1; escolha1 == 1; escolha1++)
            System.out.println("");     
        break; 
        default:
               System.out.println ("esta não é uma mensagem válida");
        break; 

    }
}
    static void opcao20(){
         Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("Tecle 1 para usar o item “Bateria”");
    int escolha1;
    escolha1 = input.nextInt();
    switch (escolha1) {
        case 1:
            for (escolha1 = 1; escolha1 == 1; escolha1++)
            System.out.println("");     
        break; 
        default:
               System.out.println ("esta não é uma mensagem válida");
        break; 

    }
}
    static void opcao21(){
         Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("Tecle 2 para usar o item “ ");
    int escolha1;
    escolha1 = input.nextInt();
    switch (escolha1) {
        case 1:
            for (escolha1 = 1; escolha1 == 1; escolha1++)
            System.out.println("");     
        break; 
        default:
               System.out.println ("esta não é uma mensagem válida");
        break; 
    }
}
    static void opcao22(){
        Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("Tecle 3 para usar o item “Raio de Zênite” ");
    int escolha1;
    escolha1 = input.nextInt();
    switch (escolha1) {
        case 1:
            for (escolha1 = 1; escolha1 == 1; escolha1++)
            System.out.println("");     
        break; 
        default:
               System.out.println ("esta não é uma mensagem válida");
        break; 
    }
}
    static void opcao23(){
     Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("Tecle 4 para usar o item “Coração de Roudini”");
    int escolha1;
    escolha1 = input.nextInt();
    switch (escolha1) {
        case 1:
            for (escolha1 = 1; escolha1 == 1; escolha1++)
            System.out.println("");     
        break; 
        default:
               System.out.println ("esta não é uma mensagem válida");
        break; 
    }
 }
    static void opcao24(){
        Scanner input = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("Tecle 5 para ativar a Formula. ");
    int escolha1;
    escolha1 = input.nextInt();
    switch (escolha1) {
        case 1:
            for (escolha1 = 1; escolha1 == 1; escolha1++)
            System.out.println("");     
        break; 
        default:
               System.out.println ("esta não é uma mensagem válida");
        break; 
    }

    }

    static void batalha1() {
        int hpPlayer = 300;
        int hpInimigo = 250;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATK();
            hpTela(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu um soco!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um chute!");
                    hpInimigo -= 45;
                    break;
                default:
                    System.out.println("Você perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATK();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O inimigo deu um soco!");
                        hpPlayer -= 16;
                        break;
                    case 2:
                        System.out.println("O inimigo deu um chute!");
                        hpPlayer -= 32;
                        break;
                }
            } else {
                System.out.println("Você venceu, parabéns!");
            }
        }
    }
    static void batalha2() {
        int hpPlayer = 300;
        int hpInimigo = 150;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATK();
            hpTela(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu um soco!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um chute!");
                    hpInimigo -= 45;
                    break;
                default:
                    System.out.println("Você perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATK();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O inimigo deu um soco!");
                        hpPlayer -= 10;
                        break;
                    case 2:
                        System.out.println("O inimigo deu um chute!");
                        hpPlayer -= 26;
                        break;
                }
            } else {
                System.out.println("Você venceu, parabéns!");
            }
        }
    }
    static void batalha3() {
        int hpPlayer = 300;
        int hpInimigo = 200;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATK();
            hpTela(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu um soco!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um chute!");
                    hpInimigo -= 45;
                    break;
                default:
                    System.out.println("Você perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATK();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O inimigo deu um soco!");
                        hpPlayer -= 16;
                        break;
                    case 2:
                        System.out.println("O inimigo deu um chute!");
                        hpPlayer -= 32;
                        break;
                }
            } else {
                System.out.println("Você venceu, parabéns!");
            }
        }
    }
    static void batalha4() {
        int hpPlayer = 300;
        int hpInimigo = 250;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATK();
            hpTela(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu um soco!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um chute!");
                    hpInimigo -= 45;
                    break;
                default:
                    System.out.println("Você perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATK();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O inimigo deu um soco!");
                        hpPlayer -= 18;
                        break;
                    case 2:
                        System.out.println("O inimigo deu um chute!");
                        hpPlayer -= 26;
                        break;
                }
            } else {
                System.out.println("Você venceu, parabéns!");
            }
        }
    }
    static void batalha5() {
        int hpPlayer = 400;
        int hpInimigo = 350;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATK();
            hpTela(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu um soco!");
                    hpInimigo -= 35;
                    break;
                case 2:
                    System.out.println("Você deu um chute!");
                    hpInimigo -= 45;
                    break;
                default:
                    System.out.println("Você perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATK();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O inimigo deu um soco!");
                        hpPlayer -= 30;
                        break;
                    case 2:
                        System.out.println("O inimigo deu um chute!");
                        hpPlayer -= 35;
                        break;
                }
            } else {
                System.out.println("Você venceu, parabéns!");
            }
        }
    }
    static void batalha6() {
        int hpPlayer = 400;
        int hpInimigo = 500;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATK();
            hpTela(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu um soco!");
                    hpInimigo -= 45;
                    break;
                case 2:
                    System.out.println("Você deu um chute!");
                    hpInimigo -= 65;
                    break;
                default:
                    System.out.println("Você perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATK();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O inimigo deu um soco!");
                        hpPlayer -= 30;
                        break;
                    case 2:
                        System.out.println("O inimigo deu um chute!");
                        hpPlayer -= 37;
                        break;
                }
            } else {
                System.out.println("Você venceu, parabéns!");
            }
        }
    }
    static void batalha7() {
        int hpPlayer = 500;
        int hpInimigo = 800;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATK();
            hpTela(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu um soco!");
                    hpInimigo -= 50;
                    break;
                case 2:
                    System.out.println("Você deu um chute!");
                    hpInimigo -= 70;
                    break;
                default:
                    System.out.println("Você perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATK();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O inimigo deu um soco!");
                        hpPlayer -= 40;
                        break;
                    case 2:
                        System.out.println("O inimigo deu um chute!");
                        hpPlayer -= 60;
                        break;
                }
            } else {
                System.out.println("Você venceu, parabéns!");
            }
        }
    }

    // LUTA COLISEU 1
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
    // LUTA COLISEU 2
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
    // LUTA 4 
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
    // luta 7
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
    // luta Flash
    static int playerATKflash() {
        Scanner input = new Scanner(System.in);

        System.out.println("ESCOLHA SEU ATAQUE");
        System.out.println("(1)Soco");
        System.out.println("(2)Chute");
        return input.nextInt();
    }
    static int inimigoATKflash() {
        Random gerador = new Random();
        return gerador.nextInt(2) + 1;
    }
    static void hpTelaflash(int hpPlayer, int hpFlash) {
        System.out.println("===========");
        System.out.println("HP PLayer  " + hpPlayer);
        System.out.println("HP Flash  " + hpFlash);
        System.out.println("===========");
    }
    static void batalhaflash() {

        int hpPlayer = 100;
        int hpFlash = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpFlash > 0) {
            escolhaATK = playerATKflash();
            hpTelaflash(hpPlayer, hpFlash);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu um soco!");
                    hpFlash -= 15;
                    break;
                case 2:
                    System.out.println("Você deu um chute!");
                    hpFlash -= 20;
                    break;
                default:
                    System.out.println("perdeu sua vez!");
            }
            if (hpFlash > 0) {
                escolhaATK = inimigoATKflash();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O Flash te deu um soco!");
                        hpPlayer -= 25;
                        break;
                    case 2:
                        System.out.println("O Flash te deu um chute!");
                        hpPlayer -= 12;
                        break;

                }
            } else {
                System.out.println("Você venceu o Flash!");
            }
        }
        if (hpPlayer < 0) {
            System.out.println("Você morreu");
        }

    }
    static int playerATKrobo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)Soco");
        System.out.println("(2) Chute");
        return input.nextInt();
    }
    static int inimigoATKrobo() {
        Random gerador = new Random();
        return gerador.nextInt(2) + 1;
    }
    static void hpTelarobo(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Robô" + hpInimigo);
        System.out.println("===========");
    }
    static void batalharobo() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATKrobo();
            hpTelarobo(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu um soco!");
                    hpInimigo -= 15;
                    break;
                case 2:
                    System.out.println("Você deu um chute!");
                    hpInimigo -= 20;
                    break;
                default:
                    System.out.println("perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATKrobo();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O robô deu um soco!");
                        hpPlayer -= 20;
                        break;
                    case 2:
                        System.out.println("O robô te deu um chute!");
                        hpPlayer -= 15;
                        break;

                }
            } else {
                System.out.println("Você venceu parabéns!");
            }
        }
        if (hpPlayer < 0) {
            System.out.println("Você morreu");
        }
    }
    static int playerATK() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha seu ataque");
        System.out.println("(1)Soco");
        System.out.println("(2)Especial");
        return input.nextInt();
    }
    static int inimigoATK() {
        Random gerador = new Random();
        return gerador.nextInt(2) + 1;
    }
    static void hpTela(int hpPlayer, int hpInimigo) {
        System.out.println("===========");
        System.out.println("HP PLayer" + hpPlayer);
        System.out.println("HP Inimigo" + hpInimigo);
        System.out.println("===========");
    }
    //LUTA ????? 
    static void batalha() {

        int hpPlayer = 100;
        int hpInimigo = 100;
        int escolhaATK;
        while (hpPlayer > 0 && hpInimigo > 0) {
            escolhaATK = playerATK();
            hpTela(hpPlayer, hpInimigo);
            switch (escolhaATK) {
                case 1:
                    System.out.println("Você deu um soco!");
                    hpInimigo -= 10;
                    break;
                case 2:
                    System.out.println("Você deu um chute!");
                    hpInimigo -= 15;
                    break;
                default:
                    System.out.println("perdeu sua vez!");
            }
            if (hpInimigo > 0) {
                escolhaATK = inimigoATK();
                switch (escolhaATK) {
                    case 1:
                        System.out.println("O inimigo deu um soco!");
                        hpPlayer -= 8;
                        break;
                    case 2:
                        System.out.println("Você deu um chute!");
                        hpPlayer -= 12;
                        break;

                }
            } else {
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

    //BATALHA FINAL 
    static int playerATKIA(){
        Scanner input = new Scanner(System.in);
        
    System.out.println("ESCOLHA SEU ATAQUE");
    System.out.println("(1)estocada com a espada");
    System.out.println("(2)golpe diagonal com espada");
    System.out.println("(3)Soco com a manopla");
    System.out.println("(4) Espada Dourada de Qawha");
        
        return input.nextInt();
    }
    static int inimigoATKIA(){
        Random gerador = new Random();
        return gerador.nextInt(2)+1;
    }
    
    static void hpTelaIA( int hpPlayer,  int hpIA){
        System.out.println("===========");
        System.out.println("HP PLayer  " + hpPlayer);
        System.out.println("HP Fórmula  " + hpIA);
        System.out.println("===========");
    }
    static void batalhaIA(){
        
        int hpPlayer = 500;
        int hpIA = 1000;
        int escolhaATK ;
        while(hpPlayer >0 && hpIA >0){
        escolhaATK = playerATKIA();
        hpTelaIA (hpPlayer, hpIA);
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
                System.out.println("Você deu uma estocada com a espada de Qawha!\n");
                hpIA -=90;  
                break;
            default:
                System.out.println("perdeu sua vez!\n");     
        }
        if(hpIA>0){
            escolhaATK = inimigoATKIA();
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
        Scanner input = new Scanner(System.in);

        // Variaveis
        String nome;
        String resposta;
        // intro
        System.out.println("Digite Start para começar:");

        // começo

        System.out.println("Olá seja muito bem vindo ao mundo de The Clash 77!");
        System.out.println("Mas antes de você saber sobre esse mundo preciso saber.");
        System.out.println("Qual é o seu nome?");
        nome = input.next();
        System.out.println("Então seu nome é: " + nome);
        System.out.println("Que legal!");

        System.out.println("Bom, por onde podemos começar, a sim pelo começo rsrs.");
        System.out.println("Ah muitos anos atrás, ouve uma crise climatica que devastou boa parte da terra,");
        System.out.println("e os poucos locais habitaveis que sobraram, foram divididos por pensamentos distintos,");
        System.out
                .println("uns focados em biotecinologia, outro focado em tecnologias mais antigas como nos anos 80, ");
        System.out.println("outro focado em tecnologias mais futuristas, outro com um tecnologias mais sustentáveis ");
        System.out.println("e outro focado em tecnologias espaciais.");
        System.out.println("Com o decorrer dos anos esses pensamentos viraram 5 cidades; ");
        System.out.println(
                "Saint Valley, Ziuns, Cyber City, Qawha e a ultima cidade qua ainda não escolhaemos o nome kkk.");
        System.out.println(
                "Em algum momento as cidades perceberam que precisavam de algumas coisas que só exitiam nas outras,");
        System.out.println("então foi feito um trem ligando todas as cidades, para manterem relações comerciais.");
        System.out
                .println("Você é um cidadão nascido em Saint Valley, que quer conhecer o mundo em busca de aventura ");

        do {
            System.out.println("você está preparado para a sua aventura?");
            resposta = input.next();

            if (resposta.equals("sim")) {
                System.out.println("você entrou em Saint Valley!");
                break;
            }

        } while (resposta.equals("não"));

        // Inicio do jogo
        System.out.println(
                "Um dia normal de manhã, você está indo até a estação de trem para ir entregar curriculo nas outras cidades,\nao chegar na estação você percebe que ela está desativada.");
        System.out.println("Ao lado da bilheteria à uma placa com um aviso:");
        System.out.println("  'O sinal da rede Google foi cortado, previsão de retorno às 16hrs' ");
        System.out.println(
                "\n Saindo da estação,indo em direção na praça no centro da cidade, você encontra seu velho amigo de infância, o Jorge.\n");

        // fala do Jorge
        System.out.println("Jorge: Eai " + nome + " , quanto tempo, como está ?");
        System.out.println(
                "      Parece que a Tesla está desenvolvendo uma nova tecnologia, e roubou hoje cedo o motor de rede do laboratório Google.\n      Todos nós funcionarios fomos despedidos pelo acontecimento.\n      Olha personagem, eu sinto um mal presentimento por isso, irei tentar encontrar outro emprego, boa sote!");
        System.out.println("Jorge foi embora.");
        System.out.println("\n Um pouco a frente, um mendigo te para e fala: \n ");

        // fala do mendigo
        System.out.println(
                "Mendigo: Ohhh. Você pode me ajudar ? Estou com muita fome,\n         pegue aqui essas pilhas, em troca eu queria um sorvete, por favor senhor!!!!");
        System.out.println("Você recebeu 12 pilhas.\n");

        // indo a sorveteria
        System.out.println(nome+ ": Ta bom, vou até a sorveteria.");
        System.out.println("Você segue em direção a sorveteria...\n");

        // Caminho = Leste

        System.out.println("     *---Sorveteria Cold Stone Creamey---*");
        System.out.println("Você  chega e entra na  sorveteria.");
        System.out.println("Atendente: Bem Vindo à sorveteria Cold Stone Creamey. Qual será seu pedido ?\n");
        System.out.println(
                "Antes de finalizar o pedido, seu antigo rival de escola, o Flash Mason, chega na sorveteria.\n ");

        // Dialogos
        System.out.println(
                "Flash: Ora, ora, ora, se não é o" + nome +" , ainda trabalhando para sua qeurida falida empresa Google ?\n");
        System.out.println(nome+ ": Olá Flash, e não trabalho mais com a Google.\n");
        System.out.println(
                "Flash: Finalmente aprendeu, essa tecnologia limitada de vocês, aprendam com a Tesla, acabamos de criar um robo humanoide de guerra perfeito.");
        System.out.println(
                "______________________________________________________________________________________________________________________________________________________\n");
        // Explicação
        System.out.println(
                "'Na escola, Flash era um dos alunos mais populares da escola e o meu melhor amigo, \n depois da crise climatica do mundo resolvemos trabalhar na aréa de tecnologia para podermos evoluir tecnologicamente \n e criar novos tipos de inteligencia artificial para o mundo, ");
        System.out.println(
                " mas tudo mudou quando ele entrou para a Tesla, eu era da Google na época,\n e no ultimos anos, a Tesla veio crescendo com suas novas tecnologias e se tornou a maior empresa de tecnologia de armas do mundo,\n em um dos seus experimentos, Flash era o voluntario que iria testa a mais nova criação da Tesla, \n um braço robotico movido a baterias com diversos sensores e que disparava um laser que poderia derreter até mesmo os aços mais fortes da terra.");
        System.out.println(
                " Na época, esses braços seriam usados como arma para os policiais da cidades, para torna-los como policiais 'robo-cop',\n mas os experimentos não deram certo e o projeto foi deixado de lado,\n Flash é o único que tem esse tipo de braço.");
        System.out.println(
                "______________________________________________________________________________________________________________________________________________________\n ");
        // dialogos
        System.out.println(nome+ ": Como vocês conseguiram energia suficiente para criar esse robo ?");
        System.out.println(
                "Flash: Não foi dificil, roubamos um motor de rede da torre do laboratório Google e utilizamos como nucléo para nosso robo. ");
        System.out.println(
                nome+ ": O que ?? Você acha que isso ficará assim ? Vou contar ao diretor da empresa o que vocês fizeram.");
        System.out.println("Flash: Você não vai a lugar nenhum! \n ");

        // inicio da luta
        int u;
        System.out.println("Flash tira sua jaqueta e com seu braço robotico te chama pra brigar \n");
        do {
            System.out.println(" VOCÊ ESTÁ PRONTO PRA LUTA ?");
            System.out.println("Sim=1 || Não=0");
            u = input.nextInt();
        } while (u > 1 || u < 1);

        batalhaflash();

        // ganhar do Flash

        System.out.println("Você recebeu 4 baterias\n");

        // Voltar para a praça
        System.out.println(
                nome+ " : preciso ir até o edificio da Tesla, que tipo de arma eles criaram ? \nPor que estão fazendo isso ?\n");
        System.out.println(nome+ " volta para a praça e segue para Oeste\n");

        // Oeste
        int x;
        System.out.println("Você chega no edificio da Tesla \n");
        System.out.println("Entrando no edificio, no salão principal, você segue para uns dos computadores da Tesla.");

        // ligar o computador
        do {
            System.out.println("VOCÊ QUER LIGAR O COMPUTADOR ?");
            System.out.println(" Sim= 1 \n Não= 0");
            x = input.nextInt();
        } while (x > 1 || x < 1);
        System.out.println("Você liga o computador \n");
        System.out.println(nome+ " : preciso achar esse robo pelas cameras de segurança antes que seja tarde de...");
        System.out.println(nome+ " : que barulho foi esse ?\n ");
        System.out.println("Você se vira e vê o robo humanoide no salão principal \n");
        System.out.println(
                nome+ " : Aquele deve ser o robo que o Flash falou, o que é aquilo no peito dele ? \nÉ o motor de rede que a Tesla roubou da Google, \nTenho que pega-lo devolta! \n");

        int i;
        System.out.println("VOCÊ ESTÁ PRONTO PRA LUTA ?");
        do {
            System.out.println("Sim=1 || Não=0");
            i = input.nextInt();
        } while (i > 1 || i < 1);

        batalharobo();

        // Ganhou do Robo
        int b;
        System.out.println("Você ganhou do robo");
        System.out.println("Você recebeu 1 motor de rede \n");

        // Caminho Norte
        System.out.println("Você volta para a praça e segue para o caminho Norte\n");
        System.out.println(
                "Você entra no laboratório da Google e segue em direção a torre que está desativada, \nna lateral direita da torre existe uma combinação que diz:");
        System.out.println(" 12 PILHAS + 4 BATERIAS + 1 MOTOR \n");

        // Combinação final
        do {
            System.out.println("VOCÊ TEM ESSA COMBINAÇÃO ?");
            System.out.println("Sim= 1");
            b = input.nextInt();
        } while (b > 1 || b < 1);
        System.out.println("Você ativa a torre da Google \n");
        System.out.println("No elevador a sua esquerda, sai um senhor de cadeira de rodas, ele é o CEO da Google.\n");

        // dialogos
        System.out.println(
                "Sundar Pichai: Você conseguiu ativar a torre meu jovem, mas isso foi só o começo, \na Tesla está desenvolvendo uma nova Inteligência Artificial, mas essa tecnologia não são deles, é muito mais avançado, alguém está fornecendo a tecnologia para criação de robos em formas de armas com a nova I.A, \nvocê deve impedi-los, soube que essa tecnologia tem como matérias-primas recursos de outras cidades.");
        System.out.println("Vá e descubra o que está acontecendo\n");
        System.out.println("Você sai do laboratório e segue para a estação de trem e segue para a proxima cidade.");
        System.out.println("--------------FIM DO CAPITULO---------------");
        System.out.println("");

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
                System.out.println("Drogado de Siranio: ooooooooouuuuuuuuuuuuuuuuuuuuuuuuur!!!!!!");

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

                // inicio da cybert city

                String escolhaciberCity;
                System.out.println("Você está no trem indo para cyber city");
                System.out.println("");
                System.out.println("Você começa a escutar duas pessoas conversando sobre um coliseu em Cyber city ");
                System.out.println(
                        "Pessoas do trem: No coliseu se você vencer seu adversario você pode pegar as armas deles, \n você tambem pode ganhar muito dinheiro lá e ainda tem um prêmio secreto para o vencedor do coliseu.");
                System.out.println(nome
                        + ": humm interesante, e eu bem que preciso de dinheiro, acho que vou dar uma passada nesse coliseu.");

                // coliseu

                System.out.println("Narrador do coliseu: Sejam bem vindos ao coliseu de Cyber city!!!");
                System.out.println("Narrador do coliseu: O que vocês querem ver?");
                System.out.println("");
                System.out.println(
                        "Plateia: SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE,!!!!! ");
                System.out.println("");
                System.out.println("Narrador do coliseu: O que vocês querem ver?");
                System.out.println("");
                System.out.println(
                        "Plateia: SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE, SANGUE,!!!!! ");
                System.out.println("");
                System.out.println(
                        "Narrador do coliseu: Para as pessoas que nunca pisaram no coliseu vou explicar as regras.");
                System.out.println("");
                System.out.println(
                        "Dois lutadores entram na arena e lutam até a morte, vale tudo para ganhar TUDO! \n O lutador que derrotar todos os outros lutadores sera o grande campeão!");
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

            // Cidade do Ally
              historiaParteUm();
historiaParteDois();
historiaParteTres();
historiaParteQuatro();
historiaParteCinco();
historiaParteSeis();
historiaParteSete();
historiaParteOito();
historiaParteNove();

// cidade final
historiaParteDez();
historiaParteOnze();
historiaParteDoze();
historiaParteTreze();
historiaParteCatorze();
historiaParteQuinze();
historiaParteDezesseis();
historiaParteDezessete();
            }

        } while (resposta.equals("não"));

    }
}


    
    



