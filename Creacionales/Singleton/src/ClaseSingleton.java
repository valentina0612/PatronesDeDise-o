import java.util.List;
import java.util.Arrays;

public class ClaseSingleton {
    private List<String> documentosId;
    private static ClaseSingleton claseSingleton;

    public static ClaseSingleton getClaseSingleton(){
        if(claseSingleton == null){
            claseSingleton = new ClaseSingleton();
        }
        return claseSingleton;
    }

    private ClaseSingleton(){
        this.documentosId = Arrays.asList(new String[] {"Documento nacional de identidad", "Licencia de conducir", "Pasaporte","Tarjeta de identificación estatal","Tarjeta de identificación tribal","Permisos de residencia"});
    }

    public List<String> getDocumentosId(){
        return documentosId;
    }

}
