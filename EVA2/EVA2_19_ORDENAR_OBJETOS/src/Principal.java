
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Persona> llPersonas = new LinkedList();
        llPersonas.add(new Persona("Ruben", "Hernandez", 35, false, 12345.6));
        llPersonas.add(new Persona("Arturo", "Hernan", 31, false, 2345.0));
        llPersonas.add(new Persona("Alejandra", "Jimenez", 38, true, 800.34));
        llPersonas.add(new Persona("Carlos", "Peña", 80, false, 900.5));
        llPersonas.add(new Persona("Ruth", "Ortiz", 45, true, 13000.0));
        for (Persona llPersona : llPersonas) {
            System.out.println("Nombre: " + llPersona.getNombre() + "\n" + "Apellido: " + llPersona.getApellido() + "\n" + "Edad: " + llPersona.getEdad() + "\n" + "Sexo: " + llPersona.isSexo() + "\n" + "Salario: " + llPersona.getSalario() + "\n");
        }
  Comparator cmALPL = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                char c1, c2;
                c1 = p1.getApellido().charAt(0);
                c2 = p2.getApellido().charAt(0);
                int Da = c1-c2;
                if (Da >= 0) {
                    int i = 1;
                   while(Da ==0){
                        c1 = p1.getApellido().charAt(i);
                        c2 = p2.getApellido().charAt(i-1);
                        i++;
                        Da = c1-c2;
                    }
                    return Da;
                     }else{
                    return Da;
                }
            
            }
           
        }; 
        
        System.out.println("");
        System.out.println("LISTA ORDENADA APELLIDO L-L ");
        Collections.sort(llPersonas, cmALPL); 
        for (Persona llPersona : llPersonas) {
            System.out.println("Nombre: " + llPersona.getNombre() + "\n" + "Apellido: " + llPersona.getApellido() + "\n" + "Edad: " + llPersona.getEdad() + "\n" + "Sexo: " + llPersona.isSexo() + "\n" + "Salario: " + llPersona.getSalario() + "\n");
            
        }
        /*  Comparator cmCriterioOrden = new Comparator() {// clase anónima

            @Override
            public int compare(Object o1, Object o2) { // si -  obj 1 es mas pequeño que el onj 2 0 son iguales positivo el 2 es mas grande que el 1 // clase object clase base para objetos es la clase mas baja de todas
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                String sApe1, sApe2;
                sApe1 = p1.getApellido();
                sApe2 = p2.getApellido();
                char c1, c2;
                c1 = sApe1.charAt(0);// Arreglo = cadenas
                c2 = sApe2.charAt(0); // se almacena el código ASCI de cada caracter
                return c1 - c2;// regresa -,0 o +
            }
        };

        System.out.println("");
        System.out.println("LISTA ORDENADA (APELLIDO)");
        Collections.sort(llPersonas, cmCriterioOrden);
        for (Persona llPersona : llPersonas) {
            System.out.println("Nombre: " + llPersona.getNombre() + "\n" + "Apellido: " + llPersona.getApellido() + "\n" + "Edad: " + llPersona.getEdad() + "\n" + "Sexo: " + llPersona.isSexo() + "\n" + "Salario: " + llPersona.getSalario() + "\n");
        }
       /* Comparator cmC = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                int E1, E2;
                E1 = p1.getEdad();
                E2 = p2.getEdad();

                return E1 - E2;
            }
        };
        System.out.println("");
        System.out.println("LISTA ORDENADA (EDAD)");
        Collections.sort(llPersonas, cmC);
        for (Persona llPersona : llPersonas) {
            System.out.println("Nombre: " + llPersona.getNombre() + "\n" + "Apellido: " + llPersona.getApellido() + "\n" + "Edad: " + llPersona.getEdad() + "\n" + "Sexo: " + llPersona.isSexo() + "\n" + "Salario: " + llPersona.getSalario() + "\n");

        }
        Comparator cmC1 = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                double sal1, sal2;
                sal1 = p1.getSalario();
                sal2 = p2.getSalario();

                return (int) (sal1 - sal2);
            }
        };
        System.out.println("");
        System.out.println("LISTA ORDENADA (SALARIO)");
        Collections.sort(llPersonas, cmC1);
        for (Persona llPersona : llPersonas) {
            System.out.println("Nombre: " + llPersona.getNombre() + "\n" + "Apellido: " + llPersona.getApellido() + "\n" + "Edad: " + llPersona.getEdad() + "\n" + "Sexo: " + llPersona.isSexo() + "\n" + "Salario: " + llPersona.getSalario() + "\n");

        }
        Comparator cmCSe = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                boolean S1, S2;
                int vM = 0, vH = 0;
                S1 = p1.isSexo();
                S2 = p2.isSexo();
                if (S1 == true) {
                    vM = 1;
                } else {
                    vH = 2;

                }
                return vH - vM;
            }

        };
        System.out.println("");
        System.out.println("LISTA ORDENADA (SEXO)");
        Collections.sort(llPersonas, cmCSe);
        for (Persona llPersona : llPersonas) {
            System.out.println("Nombre: " + llPersona.getNombre() + "\n" + "Apellido: " + llPersona.getApellido() + "\n" + "Edad: " + llPersona.getEdad() + "\n" + "Sexo: " + llPersona.isSexo() + "\n" + "Salario: " + llPersona.getSalario() + "\n");
        }
        Comparator cmCAE = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona) o1;
                Persona p2 = (Persona) o2;
                String A1, A2;
                A1 = p1.getApellido();
                A2 = p2.getApellido();
                char c1, c2;
                c1 = A1.charAt(0);
                c2 = A2.charAt(0);
                int Ed1, Ed2;
                Ed1 = p1.getEdad();
                Ed2 = p2.getEdad();
                int r = Ed1 - Ed2;
                int rA = c1 - c2;
                return r - (-rA);
            }

        };
        System.out.println("");
        System.out.println("LISTA ORDENADA (APELLIDO-EDAD)");
        Collections.sort(llPersonas, cmCAE);
        for (Persona llPersona : llPersonas) {
            System.out.println("Nombre: " + llPersona.getNombre() + "\n" + "Apellido: " + llPersona.getApellido() + "\n" + "Edad: " + llPersona.getEdad() + "\n" + "Sexo: " + llPersona.isSexo() + "\n" + "Salario: " + llPersona.getSalario() + "\n");

        }*/
     
      

    }

}

class Persona {

    private String Nombre;
    private String Apellido;
    private int Edad;
    private boolean Sexo;
    private double Salario;

    public Persona(String Nombre, String Apellido, int Edad, boolean Sexo, double Salario) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public boolean isSexo() {
        return Sexo;
    }

    public void setSexo(boolean Sexo) {
        this.Sexo = Sexo;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

}
//  ORDEN POR: EDAD,SALARIO,SEXO,APELLIDO-EDAD: HERNANDEZ 15, HERNANDEZ 30 APELLIDO: HERNAN HERNANDEZ
