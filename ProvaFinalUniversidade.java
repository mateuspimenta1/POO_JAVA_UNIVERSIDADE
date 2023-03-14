abstract class ProvaFinalUniversidade {
    protected double notaProvaFinal;
    protected double pesoNotaFinal;
    protected abstract boolean habilitadoRealizarProva();


    public ProvaFinalUniversidade(double notaProvaFinal,double pesoNotaFinal){
        this.notaProvaFinal = notaProvaFinal;
        this.pesoNotaFinal = pesoNotaFinal;

    }  
}
