/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop10;

/**
 *
 * @author rodrigoespinosa
 */
public class MPOOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SaldoInsuficienteException {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        int a = 5;
        float c = (float)a/2;
        System.out.println(c);
        
        int[] b = new int [5];
        for (int i = 0; i < 5; i++) {
            b[i] = i*10;
        }
        try{
        for (int i = 0; i <= 5; i++) {
            System.out.println(b[i]);
        }
        
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Excepcion de desbordamiento de memoria");
        }
        System.out.println("Hola he sobrevivido");
        try{
        float d = 4/0;
        System.out.println(d);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Excepcion de desbordamiento de memoria");
        }catch(ArithmeticException ex){
            System.out.println("Excepcion aritmetica segundo catch");
        }
        
        float n = miMetodoDivision(100,2);
        System.out.println(n);
        try{
        float m = miMetodoDivision(100,0);
        System.out.println(m);
        }catch(ArithmeticException ex){
            System.out.println("Excepcion aritmetica permeada");
            System.out.println(ex.getStackTrace());
            ex.printStackTrace();
        }
        System.out.println("A pesar de todo seguimos en el programa");
        float x = miMetodoDivision(20,5);
        System.out.println(x);
        try{
            int w = suma (4,7);
        }catch(UnsupportedOperationException ex){
            System.out.println("Excepcion de operacion no soportada");
            System.out.println("Atributo mensaje");
            System.out.println(ex.getMessage());
        }
        System.out.println("############ CUENTA ############");
        Cuenta cuenta = new Cuenta(100f);
        System.out.println(cuenta.consultarSaldo());
        cuenta.retirar(300);
        cuenta.depositar(5000);
        cuenta.retirar(300);
        System.out.println(cuenta.consultarSaldo());
    }
    private static float miMetodoDivision(int f, int f0){
        return f/f0;
    }

    private static int suma(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
