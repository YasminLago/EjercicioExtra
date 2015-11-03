package alumnos;
//Yasmin

import java.util.Scanner;

public class Datos {
    int nota1,nota2,nota3;
    

    
public void nomeAlumno(){
    System.out.println("nome: Alumno 1");
}

public void curso(){
    System.out.println("Curso: 2º");
}

public int notas(int nota1,int nota2,int nota3){
    return ((this.nota1+this.nota2+this.nota3)/3);
    
}

public int faltas(){
    int faltas;
    Scanner obx2=new Scanner(System.in);
    System.out.println("Nº de faltas");
    return faltas=obx2.nextInt();
    
}
 public void notaFinal(int faltas){
     if(faltas<5)
         System.out.println("Cualificación final: "+(this.notas(nota1, nota2, nota3)+1));
     
     if(faltas>=5 && faltas<10)
         System.out.println("Cualificación final: "+(this.notas(nota1, nota2, nota3)));
     
     if(faltas>=10 && faltas<15)
         System.out.println("Cualificación final: "+(this.notas(nota1, nota2, nota3)-1));
     
     if(faltas>=15 && faltas<20)
         System.out.println("Cualificación final: "+(this.notas(nota1, nota2, nota3)-2));
     
     if(faltas>=20)
         System.out.println("Cualificación final: "+(this.notas(nota1, nota2, nota3)-3));
 
 
 
 }



}