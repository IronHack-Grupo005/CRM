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
* 3. Cancelar  LEad
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

            /* Las que o necesitan de accion */
            if(accion != 21 || accion != 41) {
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

                    break;
                case 23:

                    String tecla = Pantalla.menuPideA_Convertir(this.leads);
                    Lead lead = Pantalla.menuMuestraLeadAconvertir(this.getLead(returnLast(tecla) - 1));

                    Pantalla.menuMuestra_Convertir(lead);

                    Opportunity oppor = (Opportunity) lead.clone();
                    oppor.setStatus(Status.OPEN);

                    opors.add(oppor);

                    break;
                case 4:
                    accion = Pantalla.menuCancelLead();
                    break;

                case 41 :
                    String tecla1 = Pantalla.menuPideA_Cancelar(this.opors);
                    Lead lead1 = Pantalla.menuMuestraLeadAconvertir(this.getLead(returnLast(tecla1) - 1));

                    // TODO: Seguir aqui

                    Pantalla.menuMuestra_Convertir(lead1);

                    Opportunity oppor1 = (Opportunity) lead1.clone();
                    oppor1.setStatus(Status.CLOSED_LOST);

                    opors.add(oppor1);
                    break;
            }

        }

        return true;

    }

    public Lead getLead (int id){
        return this.leads.get(id);
    }

    public static int returnLast(String s){
        String search = s.substring(s.lastIndexOf(" ") + 1);
        int number = 0;
        number = Integer.parseInt(search);
        return number;
    }
}

