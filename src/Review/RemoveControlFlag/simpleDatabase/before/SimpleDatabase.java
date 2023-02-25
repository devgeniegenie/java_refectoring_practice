package Review.RemoveControlFlag.simpleDatabase.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabase {
    private Map<String, String> _map = new HashMap<>();
    public SimpleDatabase(Reader r1) throws IOException {
        BufferedReader r2 = new BufferedReader(r1);
        boolean flag = false;
        String temp;
        while (!flag) {
            temp = r2.readLine();
            if(temp == null) {
                flag = true;
            } else {
                boolean flag2 = true;
                StringBuffer s1 = new StringBuffer();
                StringBuffer s2 = new StringBuffer();
                for(int i = 0; i < temp.length(); i++) {
                    char temp2 = temp.charAt(i);
                    if(flag2) {
                        if(temp2 == '=') {
                            flag2 = false;
                        } else {
                            s1.append(temp2);
                        }
                    } else {
                        s2.append(temp2);
                    }
                }
                String ss1 = s1.toString();
                String ss2 = s2.toString();
                _map.put(ss1, ss2);
            }
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
