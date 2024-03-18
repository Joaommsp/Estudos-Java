package one.digitalnovation;

public class Pilha {

    private No refNoEntradaPIlha;

    public Pilha() {
        this.refNoEntradaPIlha = null;
    }

    public  No top() {
        return refNoEntradaPIlha;
    }

    public  void push(No novoNo) {
        No refAuxiliar = refNoEntradaPIlha; // Guardando referencia de top atual
        refNoEntradaPIlha = novoNo; // mudando referencia de top
        refNoEntradaPIlha.setRefNo(refAuxiliar); // tranformando a referencia nova na nova referencia guardada
    }

    public No pop() {
        if(!this.isEmpty()) {
            No noPoped = refNoEntradaPIlha; // guardando nó a ser removido
            refNoEntradaPIlha = refNoEntradaPIlha.getRefNo(); // pegando o nó de baixo , que será o novo topo da pilha;
            return noPoped;

        }
        return null;
    }

    public boolean isEmpty() {

        if(refNoEntradaPIlha == null) {
            return  true;
        }
        else {
            return  false;
        }

    }

    @Override
    public String toString() {
        String stringRetorn = "---------------\n";
        stringRetorn += "      Pilha\n";
        stringRetorn += "---------------\n";

        No noAuxiliar = refNoEntradaPIlha;
projeto liar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }
            else {
                break;
            }
        }

        stringRetorn += "=======================\n";
        return  stringRetorn;
    }
}
