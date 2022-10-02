package crn.app.classes;

import crn.app.enums.Status;

import java.util.*;

/*
* Lista de Acciones
*
* 1. Crear Lead
* 11 . Lead Creado
* 2. Lista Leads
* 21. Resultado busqueda Lead
* 22. Resultado busqueda leadpor texto
* 3. Convertir Lead
* 23. Convertir lead
* 3. Listar Opportunidades
* 4. Cancelar  Opportunidad
* 5. Salir
* X. Pedir datos LEad
* */

public class CRM {

    List<Lead> leads = new ArrayList<>();
    List<Opportunity> opors = new ArrayList<>();

    private static int countLeads = 0;

    public boolean run() {

        int accion = 0;
        while (accion != 5) {

            /* Las que o necesitan de menu */
            if(accion != 21 || accion != 22  || accion != 23 || accion != 41) {
                accion = Pantalla.menuPrincipal(this);
            }
            //System.out.println("Accion: " + accion);

            switch(accion){
                case 1:
                    leads.add(Pantalla.menuNewLead());
                    this.countLeads += 1;
                    accion = 0 ;
                    break;
                case 2:
                    accion = Pantalla.menuListaLeads(this.leads);
                    break;
                case 21:
                    accion = Pantalla.menuListaLeads(this.leads);
                    break;
                case 22:
                    String tecla22 = Pantalla.menuPideA_Convertir(this.leads);
                    Pantalla.menuMuestraLead(this.getLead(returnLast(tecla22) - 1));
                    accion = 0 ;
                    break;
                case 23:
                    /* Devolvemos string de lo escrito */
                    String tecla23 = Pantalla.menuPideA_Convertir(this.leads);
                    /* Cogemos la ultima parte u lo guardamos en objeto */
                    Lead lead = Pantalla.menuMuestraLeadAconvertir(this.getLead(returnLast(tecla23) - 1));

                    Pantalla.menuMuestra_Convertir(lead);

                    Opportunity oppor = (Opportunity) lead.clone();
                    oppor.setStatus(Status.OPEN);

                    opors.add(oppor);
                    accion = 0 ;
                    break;
                case 4:
                    accion = Pantalla.menuCancelLead();
                    break;

                case 41 :
                    /* Devolvemos string de lo escrito */
                    String tecla1 = Pantalla.menuPideA_Cancelar(this.opors);
                    /* Cogemos la ultima parte u lo guardamos en objeto */
                    Opportunity oppr = Pantalla.menuMuestraOpprAcancelar(this.getOppr(returnLast(tecla1) - 1));
                    /* Mostraos a quien vamos a cancelar */
                    Pantalla.menuMuestra_Cancelar(oppr);
                    /* Temporal que despues añadimos */
                    Opportunity opporTemp = (Opportunity) oppr.clone();
                    opporTemp.setStatus(Status.CLOSED_LOST);
                    opors.add(opporTemp);
                    accion = 0 ;
                    break;
            }
        }
        Pantalla.menuAdios();
        return true;

    }

    public Lead getLead (int id){
        return this.leads.get(id);
    }

    public Opportunity getOppr (int id){
        return this.opors.get(id);
    }
    public static int returnLast(String s){
        String search = s.substring(s.lastIndexOf(" ") + 1);
        int number = 0;
        number = Integer.parseInt(search);
        return number;
    }
}

