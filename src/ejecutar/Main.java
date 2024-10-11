package ejecutar;
import objeto.Medicamento;
import objeto.Medicamento.Posologia;

public class Main {
    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento("Aspirina", "Bayer", "oral");
        Posologia posologia = medicamento.new Posologia("Adultos y mayores de 16"
                + " años", 500, "6 horas", "No debe tomar este medicamento con "
                        + "el estomago vacío.");
        
        // metodo
        posologia.imprimir();
        
        
        
    }
//   
    
}
