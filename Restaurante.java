
package restaurante;

import java.util.*;

public class Restaurante {
    
    public static void main(String[] args) {
    
    
        int billete_5=5;
        int billete_10=10;
        int billete_20=20;
        int billete_50=50;
        int billete_100=100;
        int billete_200=200;
        int billete_500=500;
        int precio_total;
        
        Scanner teclado = new Scanner(System.in);
        
        String [] menu = new String [5];
        
        int x=0;
        
        for(int i=0; i==menu.length; i++) {
            
            x ++;
            System.out.print("introduce el nombre del plato "+ x+" :");
            menu[i]=teclado.nextLine();
           
        }
        
        
        String [] precio = new String [5];
        
        int y=0;
        
        for( int i=0; i==precio.length; i++) {
        
            y ++;
            System.out.print("Introduce el precio del plato"+ menu[i]+ " :");
            precio[i]=teclado.nextLine();
          
        }
        
        System.out.println("Los productos en la carta y sus precios son:"+menu[0]+precio[0]);
        System.out.println(menu[1]+precio[1]);
        System.out.println(menu[2]+precio[2]);
        System.out.println(menu[3]+precio[3]);
        System.out.println(menu[4]+precio[4]);
        
        
        
        
        ArrayList pedido = new ArrayList();
        int finalizado=1;
        int z=0;
        
         
        while (finalizado==0) {
        
            z++;
         
            System.out.println("¿Qué plato desea pedir?");
            pedido.add(teclado.nextLine());
         
         
         
            System.out.print("Desea pedir otro plato? 0=NO 1=SI");
            finalizado=Integer.parseInt(teclado.nextLine());       
        }
        
        //System.out.println("Muchas gracias. Su pedido es:");
        //System.out.println(pedido);
        //System.out.println("Tiene un total de "+z+" platos");
    }
    
}
