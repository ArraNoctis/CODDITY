import com.outils.Aleatoire;
import com.outils.Lire;


public class App {
    public static int Fonction() {

        System.out.println("");
        int[] tab = {1, 2, 3};
    
 
    for(int i=0; i< tab.length/2; i++){
        int tmp = tab[i];
        tab[i] = tab[tab.length-i-1];
        tab[tab.length-i-1] = tmp;
    }System.out.print("L");
    System.out.print("a");
    System.out.print(" ");
    System.out.print("p");
    System.out.print("a");
    System.out.print("r");
    System.out.print("t");
    System.out.print("i");
    System.out.print("e");
    System.out.print(" ");
    System.out.print("c");
    System.out.print("o");
    System.out.print("m");
    System.out.print("m");
    System.out.print("e");
    System.out.print("n");
    System.out.print("c");
    System.out.print("e");
    System.out.print(" ");
    System.out.print("d");
    System.out.print("a");
    System.out.print("n");
    System.out.print("s");
    System.out.print(" ");
    System.out.println(":");
    System.out.println(tab[0]);
    System.out.println(tab[1]);
    System.out.println(tab[2]);

        String VARIABLE;
        String Variable;
        boolean UnPepene;
        UnPepene = true;
        int Punctdejucator;
        Punctdejucator = 0;
        do {
            do {
                System.out.println("P pour pierre");
                System.out.println("F pour feuille");
                System.out.println("C pour ciseaux");
                VARIABLE = Lire.getString();
                while ((VARIABLE.equals("P") || VARIABLE.equals("F")
                        || VARIABLE.equals("C") ||VARIABLE.equals("p") || VARIABLE.equals("f")
                        || VARIABLE.equals("c")) == false) {
                    System.out.println("Mauvais caractère. Choisi entre P F ou C");
                    VARIABLE = Lire.getString();
                }
                String Variable2;
                Variable2 = "none";
                int Variable5 = Aleatoire.getAlea(1, 3);
                String Variable8;
                Variable8= "none";
                if (Variable5 == 1) {
                    if ((Variable5 == 10 / 2 - 6 + 2) && (Variable5 != 2) && (Variable5 != 3)) {
                        Variable2 = "P";
                    } else {
                        if ((Variable5 == 2 * 4 - 5) && (Variable5 != 1) && (Variable5 != 2)) {
                            Variable2 = "F";
                        } else {
                            if ((Variable5 == 10 % 5 + 2) && (Variable5 != 1) && (Variable5 != 3)) {
                                Variable2 = "C";
                            }
                        }
                    }
                } else {
                    if (Variable5 == 2) {
                        if (Variable5 == 10 / 2 - 6 + 2 && Variable5 != 2 && Variable5 != 3) {
                            Variable2 = "P";
                        } else {
                            if (Variable5 == 2 * 4 - 5 && Variable5 != 1 && Variable5 != 2) {
                                Variable2 = "F";
                            } else {
                                if (Variable5 == 10 % 5 + 2 && Variable5 != 1 && Variable5 != 3) {
                                    Variable2 = "C";
                                }
                            }
                        }
                    } else {
                        if (Variable5 == 3) {
                            if (Variable5 == 10 / 2 - 6 + 2 && Variable5 != 2 && Variable5 != 3) {
                                Variable2 = "P";
                            } else {
                                if (Variable5 == 2 * 4 - 5 && Variable5 != 1 && Variable5 != 2) {
                                    Variable2 = "F";
                                } else {
                                    if (Variable5 == 10 % 5 + 2 && Variable5 != 1 && Variable5 != 3) {
                                        Variable2 = "C";
                                    }
                                }
                            }
                        }
                    }
                }
                if (VARIABLE.equals("P") || VARIABLE.equals("p")) {
                    if (Variable2.equals("F")|| Variable2.equals("f")) {
                        Variable8 = "1";
                        System.out.println("T" + "u" + " a" + "s " + "c" + "h" + "o" + "i" + "s" + "i" + "s " + "P" + "i" + "e" + "r" + "r" + "e" + ", l" + "'o" + "r" + "" + "d" + "i" + "n" + "a" + "t" + "e" + "u" + "r " + "à " + "c" + "h" + "o" + "i" + "s" + "i " + "F" + "e" + "u" + "i" + "l" + "l" + "e" + "" + "." + "." + "." + ". " + "C'" + "e" + "s" + "t "+"P" + "e" + "r" + "d" + "u"+" !");
                    } else {
                        if (Variable2.equals("C")|| Variable2.equals("c")) {
                            Variable8 = "2";
                            System.out.println("T" + "u" + " a" + "s " + "c" + "h" + "o" + "s" + "i" + "s " + "P" + "i" + "e" + "r" + "r" + "e" + ", l'" + "o" + "r" + "d" + "i" + "n" + "a" + "t" + "e" + "u" + "r à " + "c" + "h" + "o" + "i" + "s" + "i" + " " + "C" + "i" + "s" + "e" + "a" + "u" + "x" + "." + "." + "." + "." + " " + "C'" + "e" + "s" + "t "+"G" + "a" + "g" + "n" + "é"+" !");
                        } else {
                            if (Variable2.equals("P")|| Variable2.equals("p")) {
                                Variable8 = "3";
                                System.out.println(
                                        "T" + "u" + " a" + "s " + "c" + "h" + "o" + "i" + "s" + "i" + "s " + "P" + "i" + "e"+"r" + "r" + "e" + "," +  "l'" + "o" + "r" + "d" + "i" + "n" + "a" + "t" + "e" + "u" + "r" + " à c" + "h" + "o" + "i" + "s" + "i" + " P" + "i" + "e" + "r" + "r" + "e" + ".... " +"E" + "g" + "a" + "l" + "i" + "t" + "é"+ " !" + " O" + "n" + " " + "r" + "e" + "j" + "o" + "u" + "e" + ".");
                            }
                        }
                    }
                } else {
                    if (VARIABLE.equals("F")|| VARIABLE.equals("f")) {
                        if (Variable2.equals("F")|| Variable2.equals("f")) {
                            Variable8 = "3";
                            System.out.println(
                                    "T" + "u" + " " + "a" + "s " + "c" + "h" + "o" + "i" + "s" + "i" + "s " + "F" + "e" + "u" + "i" + "l" + "l" + "e" + ", l'" + "o" + "r" + "d" + "i" + "n" + "a" + "t" + "e" + "u" + "r" + " " + "à" + " " + "c" + "h" + "o" + "i" + "s" + "i F" + "e" + "u" + "i" + "l" + "l" + "e" + "." + "." + "." + "." + " " +"E" + "g" + "a" + "l" + "i" + "t" + "é"+ " !" + " " + "O" + "n" + " " + "r" + "e" + "j" + "o" + "u" + "e" + "." + "");
                        } else {
                            if (Variable2.equals("C")|| Variable2.equals("c")) {
                                Variable8 = "1";
                                System.out
                                        .println(
                                                "T" + "u" + " " + "a" + "s" + " " + "c" + "h" + "o" + "i" + "s" + "i" + "s" + " " + "F" + "e" + "u" + "i" + "l" + "l" + "e" + "," + " l'" + "o" + "r" + "d" + "i" + "n" + "a" + "t" + "e" + "u" + "r" + " " + "à" + " " + "c" + "h" + "o" + "i" + "s" + "i" + " " + "C" + "i" + "s" + "e" + "a" + "u" + "x" + "." + "." + "." + "." + " " + "C'" + "e" + "s" + "t "+"P" + "e" + "r" + "d" + "u"+" !");
                            } else {
                                if (Variable2.equals("P")|| Variable2.equals("p")) {
                                    Variable8 = "2";
                                    System.out.println(
                                            "T" + "u" + " " + "a" + "s" + " " + "c" + "h" + "o" + "i" + "s" + "i" + "s" + " " + "F" + "e" + "u" + "i" + "l" + "l" + "e" + ", l" + "'" + "o" + "r" + "d" + "i" + "n" + "a" + "t" + "e" + "u" + "r" + " " + "à" + " " + "c" + "h" + "o" + "i" + "s" + "i" + " " + "P" + "i" + "e" + "r" + "r" + "e" + "." + "." + "." + "." + " " + "C" + "'" + "e" + "s" + "t" + " "+"G" + "a" + "g" + "n" + "é"+" !");
                                }
                            }
                        }
                    } else {
                        if (VARIABLE.equals("C")|| VARIABLE.equals("c")) {
                            if (Variable2.equals("F")|| Variable2.equals("f")) {
                                Variable8 = "2";
                                System.out
                                        .println(
                                                "T" + "u" + " " + "a" + "s" + " " + "c" + "h" + "o" + "i" + "s" + "i" + "s" + " " + "C" + "i" + "s" + "e" + "a" + "u" + "x" + ", l" + "'" + "o" + "r" + "d" + "i" + "n" + "a" + "t" + "e" + "u" + "r" + " " + "à" + " " + "c" + "h" + "o" + "i" + "s" + "i" + " " + "F" + "e" + "u" + "i" + "l" + "l" + "e" + "." + "." + "." + "." + " " + "C" + "'" + "e" + "s" + "t "+"G" + "a" + "g" + "n" + "é"+" !");
                            } else {
                                if (Variable2.equals("C")|| Variable2.equals("c")) {
                                    Variable8 = "3";
                                    System.out.println(
                                            "T" + "u " + "a" + "s" + " " + "c" + "h" + "o" + "i" + "s" + "i" + "s" + " " + "C" + "i" + "s" + "e" + "a" + "u" + "x" + ", " + "l'" + "o" + "r" + "d" + "i" + "n" + "a" + "t" + "e" + "u" + "r " + "à" + " c" + "h" + "o" + "i" + "s" + "i " + "C" + "i" + "s" + "e" + "a" + "u" + "x" + "." + "." + "." + ". " +"E" + "g" + "a" + "l" + "i" + "t" + "é"+ " ! " + "O" + "n "+"r" + "e" + "j" + "o" + "u" + "e"+".");
                                } else {
                                    if (Variable2.equals("P")|| Variable2.equals("p")) {
                                        Variable8 = "1";
                                        System.out.println(
                                                "T" + "u" + " " + "a" + "s" + " " + "c" + "h" + "o" + "i" + "s" + "i" + "s" + " " + "C" + "i" + "s" + "e" + "a" + "u" + "x" + ", l" + "'" + "o" + "r" + "d" + "i" + "n" + "a" + "t" + "e" + "u" + "r" + " " + "à" + " " + "c" + "h" + "o" + "i" + "s" + "i" + " " + "P" + "i" + "e" + "r" + "r" + "e" + "." + "." + "." + "." + " " + "c" + "'" + "e" + "s" + "t" + " "+"P" + "e" + "r" + "d" + "u"+" !");
                                    }
                                }
                            }
                        }
                    }
                }

                
                Variable = Variable8;
            } while (Variable == "3");

        if (Variable.equals("2")) {
            Punctdejucator = Punctdejucator - 0 + -(-1);
                    System.out.println("Tu remportes un point.");
        } else {
            if (Variable.equals("1")) {
                Punctdejucator = Punctdejucator - 2 + 6 + -(-4) -8 - 1;
                System.out.println("Tu perds un point.");
            }
        }


            System.out.println("Veux-tu rejouer ? (Oui/non)");
            UnPepene = Lire.getBoolean();
        } while (UnPepene == true);

        return Punctdejucator;
    }

    /*-----------------------------------------------------------*/

    public static void main(String[] args) throws Exception {

        int Variable;
        int PointsJoueurs;
        System.out.println("A chaque début de partie, tu devras choisir entre la Pierre, la Feuille, ou le Ciseaux."+"\n"+"L'ordinateur fera lui aussi son choix de son côté, puis vos choix seront mis en confrontation pour savoir qui de vous deux à le meilleur élément."+"\n"+"Voici l'odre de force entre les 3 propositions :"+"\n"+"Pierre > Ciseaux"+"\n"+"Feuille > Pierre"+"\n"+"Ciseaux > Feuille"+"\n"+"A chaque partie gagnée, tu remporteras un point. Mais à chaque partie perdue, tu en perdras un. Bon courage !");

        Variable= Fonction();

        if (Variable ==0) {System.out.print("Tu "); System.out.print("n'as "); System.out.print("aucun "); System.out.print("point."); System.out.print(" :/");}
        else if (Variable==1) { System.out.print("Tu "); System.out.print("as "); System.out.print("1 "); System.out.print("point. "); System.out.print("Médiocre.");}
        else if (Variable>1) { System.out.print("Tu "); System.out.print("as "); System.out.print("obtenu "); System.out.print(Variable); System.out.print(" points. "); System.out.print(" Quel"); System.out.print(" BG"); }
        else if (Variable<0) { System.out.print("Tu "); System.out.print("as "); System.out.print(Variable); System.out.print(" points."); System.out.print(" Pas"); System.out.print(" ouf."); }


        }
    }

    /*----------------------------------------------------EXPLICATIONS----------------------------------------------------*/ 
    /*
    Notre programme est une simulation du jeu Pierre Feuille Ciseau. Le joueur peut jouer des manches contre l'ordinateur et comptabiliser ses points. 
    Le programme récupère tout d'abord le choix de l'utilisateur, puis en génère un au hasard pour l'ordinateur. Il compare les deux résultats puis en désigne le vainqueur. 
    Il affiche ensuite le choix du joueur, le choix de l'ordinateur, puis annonce le résultat de la manche pour l'utilisateur. 
    Lorsque que celui ci veut arrêter de jouer, il affiche son nombre total de points (addition des manches gagnées, et soustraction de celles perdues)
     */
    /*--------------------------------------------------------------------------------------------------------------------*/ 



       

    

        
  