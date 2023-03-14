abstract class ProvaUniversidade {
    protected double notaAv1;
    protected double notaAv2;
    protected double notaAv3;
    protected double peso1;
    protected double peso2;
    protected double peso3;
    protected double mediaAprovacao;

    
    protected ProvaFinalUniversidade provaFinalUniversidade;
    protected abstract double calcularMedia();
    protected abstract boolean aprovado();
    
   


   public  ProvaUniversidade(double notaAv1, double notaAv2, double notaAv3, double peso1, double peso2, double peso3, double mediaAprovacao, double provaFinalUniversidade) {
       this.notaAv1 = notaAv1;
       this.notaAv2 = notaAv2;
       this.notaAv3 = notaAv3;
       this.peso1 = peso1;
       this.peso2 = peso2;
       this.peso3 = peso3;
       this.mediaAprovacao = mediaAprovacao;
       
   }
 
}   