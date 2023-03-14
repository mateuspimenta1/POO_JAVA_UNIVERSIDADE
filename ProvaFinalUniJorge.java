public class ProvaFinalUniJorge extends ProvaFinalUniversidade {

    public ProvaFinalUniJorge(double notaProvaFinal, double pesoNotaFinal) {
        super(notaProvaFinal, pesoNotaFinal);
        
    }

    protected boolean habilitadoRealizarProva() {
        return true;

    }
}