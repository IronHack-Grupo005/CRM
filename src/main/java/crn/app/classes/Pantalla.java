package crn.app.classes;

import java.util.List;
import java.util.Scanner;

public class Pantalla {

    public static int menuPrincipal (CRM crm) throws NumberFormatException{

        Scanner key = new Scanner(System.in);

        System.out.println("\n\n\n");
        System.out.println("#################");
        System.out.println("Escoje opción:");
        System.out.println("1. Crear Lead:");
        System.out.println("2. Mostrar Leads");
        System.out.println("3. Convertir Lead");
        System.out.println("4. Cancelar Lead:");
        System.out.println("5. Salir:");
        System.out.println("O escribe un comando:");

        String tecla = key.nextLine();

        System.out.println("Has escrito: " + tecla);

        switch(tecla){
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "5":
                return 5;
        }

        if (tecla.toLowerCase().contains("show leads")) {
            return 21;
        } else if (tecla.toLowerCase().contains("lookup lead")) {
            // TODO: Este tambien sale
            menuMuestraLead(crm.getLead(returnLast(tecla) - 1));
            return 22;
        } else if (tecla.toLowerCase().contains("convert")) {
            // TODO: Lo mismo que arriba
            //returnLast(tecla)

            return 23;
        } else {
            System.out.println("No hay comando escrito");
        }
        return 0;
    }

    public static String menuPideA_Convertir(List<Lead> leads){
        Scanner key = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("#################");
        for(Lead l : leads){
            System.out.println(l.getIdentificador() + ". " +  l.getName());
        }
        System.out.println("Escoje uno:");

        String tecla = key.nextLine();

        System.out.println("Has escrito: " + tecla);

        return tecla;
    }
    public static String menuPideA_Cancelar(List<Opportunity> oppr){
        Scanner key = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("#################");
        for(Opportunity o : oppr){
            System.out.println(o.getIdentificador() + ". " +  o.getName());
        }
        System.out.println("Escoje uno:");

        String tecla = key.nextLine();

        System.out.println("Has escrito: " + tecla);

        return tecla;
    }

    public static void menuMuestra_Convertir(Lead lead){
        Scanner key = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("#################");
        System.out.println("Vamos a convertir a:");

        System.out.println(lead.getIdentificador() + ". " +  lead.getName());

    }
    public static void menuMuestra_Cancelar(Opportunity oppr){
        Scanner key = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("#################");
        System.out.println("Vamos a cancelar a:");

        System.out.println(oppr.getIdentificador() + ". " +  oppr.getName());

    }
    public static int returnLast(String s){
        String search = s.substring(s.lastIndexOf(" ") + 1);
        int number = 0;
        number = Integer.parseInt(search);
        return number;
    }
    public static Lead menuNewLead(){

        Scanner key = new Scanner(System.in);

        System.out.println("\n\n\n");
        System.out.println("############");
        System.out.println("# NEW LEAD #");
        System.out.println("############");
        System.out.println("Escribe Nombre:");
        String name = key.nextLine();
        System.out.println("Escribe Telefono:");
        String phoneNumber = key.nextLine();
        System.out.println("Escribe email:");
        String email = key.nextLine();
        System.out.println("Escribe Empresa:");
        String companyName = key.nextLine();

        Lead lead = new Lead(name, phoneNumber, email, companyName);

        Pantalla.menuLeadCreado(lead);

        return lead;
    }

    public static int menuListaLeads(List<Lead> leads){
        System.out.println("\n");
        System.out.println("#################");
        System.out.println("# Listado Leads #");
        System.out.println("#################");
        for(Lead l : leads){
            System.out.println(l.getIdentificador() + ". " +  l.getName());
        }
        return 0;
    }

    public static int menuListaOppors(List<Opportunity> oppors){
        System.out.println("\n");
        System.out.println("#########################");
        System.out.println("# Listado Oportunidades #");
        System.out.println("#########################");
        for(Lead o : oppors){
            System.out.println(o.getIdentificador() + ". " +  o.getName());
        }
        return 0;
    }

    public static int menuListaOppor(List<Opportunity> oppor){

        Scanner key = new Scanner(System.in);

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("# Listado Leads #");
        System.out.println("#################");

        for(Lead p : oppor){
            System.out.println(p.getIdentificador() + ". " +  p.getName());
        }

        System.out.println("#################");
        System.out.println("Escoje uno: ");
        String tecla = key.nextLine();



        return 0;
    }
    public static int menuCancelLead(){

        Scanner key = new Scanner(System.in);

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("CANCEL LEAD");
        System.out.println("#################");
        System.out.println("Perdido o Ganado (1,2):");

        String tecla = key.nextLine();
        return 41;
    }

    public static void menuLeadCreado(Lead lead){

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("Se ha creado el Lead");
        System.out.println("#################");
        System.out.println(lead.getIdentificador() + ". " +  lead.getName());
    }

    public static void menuMuestraLead(Lead lead){

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("El Lead mostrado desde la busueda es:");
        System.out.println(lead.getIdentificador() + ". " +  lead.getName());
    }

    public static Lead menuMuestraLeadAconvertir(Lead lead){

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("El Lead mostrado desde convertir es:");
        System.out.println(lead.getIdentificador() + ". " +  lead.getName());

        return lead;
    }
    public static Opportunity menuMuestraOpprAcancelar(Opportunity oppr){

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("El Lead mostrado desde convertir es:");
        System.out.println(oppr.getIdentificador() + ". " +  oppr.getName());

        return oppr;
    }

    public static void menuAdios(){

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("Adios");
        System.out.println("#################");
    }
}
