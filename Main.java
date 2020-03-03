package MyAerolinea;
import java.util.GregorianCalendar;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

        private Scanner leer;
        public ArrayList<Cliente> clientes =new ArrayList<Cliente>();

        public Main() {
                //listarAviones();
                //vuelosAviones();
        	registroEmpleado();
                menuPrincipal();
                
                

        }
        public void vuelosAviones(){
        
        Vuelo v1 = new Vuelo("001", 22, "operacion1");
        Vuelo v2= new Vuelo("002", 50, "operacion2");
        Vuelo v3 = new Vuelo("004", 100, "aviesxpress");
        Vuelo v4 = new Vuelo("005", 90, "rapiavianca");
        ArrayList<Vuelo> vuelos= new ArrayList<Vuelo>();
        vuelos.add(v1);
        vuelos.add(v2);
        vuelos.add(v3);
        vuelos.add(v4);
        
        Avion avionSale = new Avion(100, "Grande"); 
        avionSale.datosAvion();
        avionSale.setVuelo(vuelos);
        for (Vuelo avionsal : vuelos) {
                
                System.out.println(avionsal.getNombre() + " " + avionsal.getnVuelo() + " " );
                }
        }
        
                
        public void clienteReserva(){
                
                Vuelo v1 = new Vuelo("001", 22, "operacion1");
                Vuelo v2= new Vuelo("002", 50, "operacion2");
                Vuelo v3 = new Vuelo("004", 100, "aviesxpress");
                Vuelo v4 = new Vuelo("005", 90, "rapiavianca");
                ArrayList<Vuelo> vuelos= new ArrayList<Vuelo>();
                vuelos.add(v1);
                vuelos.add(v2);
                vuelos.add(v3);
                vuelos.add(v4);
                
                Avion avionSale = new Avion(100, "Grande"); 
                avionSale.datosAvion();
                avionSale.setVuelo(vuelos);
                for (Vuelo avionsal : vuelos) {
                        
                        System.out.println(avionsal.getNombre() + " " + avionsal.getnVuelo() + " " );
                }
                
                        

                
        }
        //****************************************************************************************** menu principal
        public void menuPrincipal() {
                leer = new Scanner(System.in);

                System.out.println("Bienvenido a la aerolinea Avianca ");
                System.out.println("selecciones la opcion \n" + "1.Registrar \n2. Reservar \n3.Cancelar Reserva \n4 Modificar \n5 Consultar");
                int numero = leer.nextInt();

                switch (numero) {
                case 1:
                        menuCliente();
                        break;
                case 2:
                        menuReserva();
                        break;
                case 3:

                        break;
                case 4:
                        
                        break;
                case 5:
                        consultar();
                default:
                        break;
                }
        }

        private void consultar() {
                System.out.println("*** Elija la opción que necesite consultar ****");
                System.out.println("1.Clientes registrados \n2.Reservas");
                int numconsu  = leer.nextInt();
                
                if (numconsu == 1) {
                        System.out.println("**Clientes**");
                        for (Cliente customer : this.clientes) {
                         customer.datosPersonales();
                                }
                        
                        
                }else if(numconsu == 2){
                        System.out.println("**Reservas**");
                }
                
                
        }

//*******************************************************************************************menucliente
        public void menuCliente() {

                int numero = leer.nextInt();

                String nombre, correo, telefono, documento;

                Cliente cliente;

                do {

                        System.out.println("*****Ingrese su nombre****");
                        nombre = leer.next();
                        System.out.println("*****Ingrese su correo****");
                        correo = leer.next();

                        System.out.println("*****Ingrese su telefono****");
                        telefono = leer.next();

                        System.out.println("*****Ingrese su documento****");
                        documento = leer.next();

                        cliente = new Cliente(nombre, correo, telefono, documento);
                        this.clientes.add(cliente);
                        // cliente1.datosPersonales();

                        System.out.println("selecciones la opcion \n" + "1.Volver al menu \n2.Ingresar otro cliente");
                        numero = leer.nextInt();
                } while (numero == 2);

                for (Cliente customer : this.clientes) {
                        customer.datosPersonales();
                }

                if (numero == 1) {
                        menuPrincipal();
                }

        }
        
        //*********************************************************************reservas

        public void menuReserva() {
                ArrayList<Reserva> reservas = new ArrayList<Reserva>();
                
                int reserva = leer.nextInt();
                String destino, costo ="", tipoReserva = "";
                        Reserva  res;
                do {
                        System.out.println("ingrese origen de destino");
                        destino= leer.next();

                        System.out.println("Elija el tipo de reserva \n1.Ejecutivo \n2.VIP  ");
                        int resnum = leer.nextInt(); 
                        if (resnum==1) {
                                tipoReserva = "Ejecutivo";
                                costo= "250000";
                        }else if(resnum==2){
                                tipoReserva = "VIP";
                                costo="400000";
                        }
                        
                        System.out.println("**** Costo de la reserva "+costo+" ****\n**** Lugar de destino "+destino+" ****\n**** Reserva "+tipoReserva+" ****");
                        mostrarFechaActual();
                        System.out.println("\n**** La reserva se realzo con exito ****");
                        
                        
                        res = new Reserva(destino, costo, tipoReserva);
                        reservas.add(res);

                        for (Reserva reserva2 : reservas) {
                                //reserva2.registrarVuelo();
                        
                        }
                        
                        System.out.println("selecciones la opcion \n" + "1.Volver al menu \n2.Registre una nueva reserva");
                        reserva = leer.nextInt();
                } while (reserva == 2);

                if (reserva == 1) {
                        menuPrincipal();
                        
                }


        }
        //*************************fecha
        public void mostrarFechaActual(){
                Calendar fecha = new GregorianCalendar();
                 int año = fecha.get(Calendar.YEAR);
                int mes = fecha.get(Calendar.MONTH);
                int dia = fecha.get(Calendar.DAY_OF_MONTH);
                int hora = fecha.get(Calendar.HOUR_OF_DAY);
                int minuto = fecha.get(Calendar.MINUTE);
                int segundo = fecha.get(Calendar.SECOND);
                System.out.println("**** Fecha: "+ dia + "/" + (mes+1) + "/" + año+" ****");
 System.out.printf("**** Hora: %02d:%02d:%02d ****",hora, minuto, segundo);

        }
        //**************************aviones************************************************************
        
        public void listarAviones(){
                Avion avion1 = new Avion(22, "Pequeño");
                Avion avion2 = new Avion(100, "Grande");
                Avion avion3 = new Avion(50, "Mediano");
                Avion avion4 = new Avion(80, "Mediano");
                ArrayList<Avion> avion =new ArrayList<Avion>();

                avion.add(avion1);
                avion.add(avion2);
                avion.add(avion3);
                avion.add(avion4);
                Aerolinea aer = new Aerolinea("avianca", "72828333");
                aer.datosAerolinea();
                aer.setAviones(avion);
                for (Avion aviones : avion) {
                        System.out.println("**************************** La aereolinea " + aer.getNombre()+ " tiene un avion " + aviones.getTipo()+ "++++++++++++++++++++");
                }
        }
        
        
        //*******************************************registrar empleado******************************
        public void registroEmpleado(){
        Empleados emp=new Empleados();
        emp.registrarEmpleado();
        }
        
        public static void main(String[] args) {
                
               
                
       
      
      new Main();
                
        }

        
        
}
