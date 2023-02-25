package Review.RemoveControlFlag.simpleDatabase.MyCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabase {
    private Map<String, String> _map = new HashMap<>();
    public SimpleDatabase(Reader r) throws IOException {
        BufferedReader reader = new BufferedReader(r);
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                return;
            }
            String[] lineSplit = line.split("=");
            _map.put(lineSplit[0], lineSplit[1]);
        }
    }

    public void putValue(String key, String value){
        _map.put(key, value);
    }

    public String getValue(String key){
        return _map.get(key);
    }

    public Iterator<String> iterator(){
        return _map.keySet().iterator();
    }
}
