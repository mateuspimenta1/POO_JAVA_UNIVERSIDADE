public class ProvaEstacio extends ProvaUniversidade{

     
    public ProvaEstacio(double notaAv1, double notaAv2, double notaAv3, double peso1, double peso2, double peso3, double mediaAprovacao, double provaFinalUniversidade){
        super(notaAv1, notaAv2, notaAv3, peso1, peso2, peso3, mediaAprovacao, provaFinalUniversidade);

    }
    
    
    public double calcularMedia() {
        double media = (((this.notaAv1 * this.peso1) + (this.notaAv2 * this.peso2) + (this.notaAv3 * this.peso3)) / (this.peso1 + this.peso2 + this.peso3));
        System.out.printf( "O aluno teve a média: %.2f  \n", media);
        return media;

    }

   public boolean aprovado(){
        if (this.calcularMedia() >= this.mediaAprovacao ){
            System.out.println("Aprovado na Estácio!! Parabéns =) \n");
            System.out.println("---------------------------------- ");
            return true;

        }

        else{
            System.out.println("Reprovado na Estácio! Não desanime x( \n");
            System.out.println("---------------------------------- ");
            return false;
            
        }      
    }     
}
