
package Exception;

public class CampoVazioException extends RuntimeException{
    
      @Override
      public String getMessage()
    {
        return ("O campo está vazio, por favor re-insira o código");
    }
}
