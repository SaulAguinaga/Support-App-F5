package api.contracts;

import java.io.BufferedReader;
import java.util.List;

public interface InterfaceService {
    
    public List<Object> index();
    public Object store(BufferedReader body);
    public Object storeDelete(BufferedReader reader);

}
