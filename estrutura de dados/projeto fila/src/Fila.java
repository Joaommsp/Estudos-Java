public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        refNoEntradaFila = null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null? true : false;
    }

    public void enqueue(No novoNo) {
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No first() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }
                else {
                    break;
                }
            }
            return  primeiroNo;
        }
        return  null;
    }

    public No dequeue() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }
                else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return  null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{Objeto " + noAuxiliar.getObject() + "}}---->";
                if(noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                }
                else {
                    break;
                }
            }
        }
        else {
            stringRetorno = "null";
        }
        return  stringRetorno;
    }
}
