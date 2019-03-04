package reto6;

public class Reto6 {

    public static void main(String[] args) {
        //int[][] datos = new int[3][3];
        int[][] datos = {{111,192,289,415},{483,500,470,114},{471,355,474,161},{427,158,160,308}};
        int[][] valoresMasAltos = {{0,0,0,0},{0,0,0,0}}; //LA PRIMER DIMENSIÓN ALMACENA LOS VALORES DE LOS DATOS MÁS ALTOS,
                                                         //LA SEGUNDA DIMENSIÓN ALMACENA LAS POSICIONES DE ESOS VALORES
        String[] trimestres = {"Ene-Mar","Abr-Jun","Jul-Sep","Oct-Dic"};
        
        for(int n = 0; n<datos.length; n++){
            for(int i = 0; i<datos.length; i++){
                if(datos[i][n]>valoresMasAltos[0][n]){
                    valoresMasAltos[0][n] = datos[i][n];
                    valoresMasAltos[1][n] = i;
                }
            }
        }
        
        System.out.println("El semestre en que más se vende el sabor chocolate es: "+trimestres[valoresMasAltos[1][0]]);
        System.out.println("El semestre en que más se vende el sabor vainilla es: "+trimestres[valoresMasAltos[1][1]]);
        System.out.println("El semestre en que más se vende el sabor fresa es: "+trimestres[valoresMasAltos[1][2]]);
        System.out.println("El semestre en que más se vende el sabor oreo es: "+trimestres[valoresMasAltos[1][3]]);
        
    }
    
}
