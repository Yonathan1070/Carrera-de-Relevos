package Logica;

import carrera.Equipo;
import carrera.Persona;

/**
 * Clase principal donde se inicializan los hilos y se muestra en pantalla el
 * ganador de la competencia
 *
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 */
public class Principal {
    Equipo e1 = new Equipo("COL");
    Equipo e2 = new Equipo("VEN");
    Equipo e3 = new Equipo("ECU");
    
    Persona p1 = new Persona("Persona1", 0, 30, e1);
    Persona p2 = new Persona("Persona2", 30, 60, e1);
    Persona p3 = new Persona("Persona3", 60, 100, e1);
    Persona p4 = new Persona("Persona4", 0, 30, e2);
    Persona p5 = new Persona("Persona5", 30, 60, e2);
    Persona p6 = new Persona("Persona6", 60, 100, e2);
    Persona p7 = new Persona("Persona7", 0, 30, e3);
    Persona p8 = new Persona("Persona8", 30, 60, e3);
    Persona p9 = new Persona("Persona9", 60, 100, e3);
    
    /**
     * Metodo que inicializa los hilos competidores
     */
    public void iniciaCarrera(){
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
    }
    
    /**
     * Metodo que muestra en pantalla el equipo ganador y como parametro recibe
     * el nombre del equipo
     * @param equipo variable que captura el nombre del equipo ganador
     */
    public void mostrarMedalla(String equipo){
        System.out.println("\\\\     \\\\            \\\\      \\\\        //      //            //     //\n" +
            " \\\\     \\\\            \\\\      \\\\      //      //            //     //\n" +
            "  \\\\     \\\\            \\\\      \\\\    //      //            //     //\n" +
            "   \\\\     \\\\            \\\\      \\\\  //      //            //     //\n" +
            "    \\\\     \\\\            \\\\      \\\\//      //            //     //\n" +
            "     \\\\     \\\\            \\\\      //      //            //     //\n" +
            "      \\\\     \\\\            \\\\    //      //            //     //\n" +
            "       \\\\     \\\\            \\\\  //      //            //     //\n" +
            "        \\\\     \\\\            \\\\//      //            //     //\n" +
            "         \\\\     \\\\            X/      //            //     //\n" +
            "          \\\\     \\\\          //      //            //     //\n" +
            "           \\\\     \\\\        //     WWWWWW         //     //\n" +
            "            \\\\     \\\\  WX0ko           clodk0XW  //     //\n" +
            "             \\\\     lxoc                      coxc     //\n" +
            "              \\\\                                      //\n" +
            "              Wk           coxkO000000Okxoc           xW\n" +
            "            W0l        lk0NW              WN0kl        l0W\n" +
            "           Xd       ckXW                      WXkc       dX\n" +
            "         WKc      lON                            NOl      cKW\n" +
            "        W0       kN             X0OOOOXW           Nk       0W\n" +
            "        K      c0W             Xl     dW            W0c      K\n" +
            "       Xl     cK            WXOc      oW              Kc     lX\n" +
            "      Wk      0          WOlc         oW               0      kW\n" +
            "      Xl     dN          Nl           oN               Nd     lX\n" +
            "      0      O           WKkkkx       oW                O      0\n" +
            "      O      0                No      oW                0      O\n" +
            "      0      0                No      oW                0      0\n" +
            "      K      k                Wo      oW                k      K\n" +
            "      No     oN               Wo      oW               No     oN\n" +
            "       O      kW              Wo      oW              Wk      O\n" +
            "       No      0W             Wo      oW             W0      oN\n" +
            "        Xl      OW            Wx      xW            WO      lX\n" +
            "         Kl      dX            NKKKKKKN            Xd      lK\n" +
            "          Xo       xXW                          WXx       oX\n" +
            "           Nk        d0NW      "+equipo+"     WN0d        kN\n" +
            "             Xx         okKNW            WNKko         xX\n" +
            "              WXx           codxxkkkkxxdoc           xXW\n" +
            "                 N0d                              d0N\n" +
            "                    NKkoc                    cokKN\n" +
            "                        NKkoc____________cokKN");
        System.exit(0);
    }
    
}
