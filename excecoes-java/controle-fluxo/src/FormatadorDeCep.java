
public class FormatadorDeCep {

    public static void main(String[] args) {
        
        try {
            String cepFormatado = formatador("12345678");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println(("CEP inválido , tente inserir novamente"));
        }

    }


    static String formatador(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
        throw new CepInvalidoException();
      
        //simulando um cep formatado
        return "23.765-064";
    }
    

}

