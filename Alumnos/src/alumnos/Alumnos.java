public static void main(String[] args) {
       int faltas,nota1,nota2,nota3;
       Datos d=new Datos();
       d.nomeAlumno();
       d.curso();
      /*  
        Scanner obx=new Scanner(System.in);
        System.out.println("Nota 1: ");
        nota1=obx.nextInt();
        
        Scanner obx1=new Scanner(System.in);
        System.out.println("Nota 2: ");
        nota2=obx1.nextInt();
        
        Scanner obx2=new Scanner(System.in);
        System.out.println("Nota 3: ");
        nota3=obx2.nextInt();*/
       
       nota1=d.getNota();
       nota2=d.getNota();
       nota3=d.getNota();
        
        System.out.println("Nota media:"+d.notas(nota1, nota2, nota3));
        
        faltas=d.faltas();
        d.notaFinal(faltas);
    }
    
}
