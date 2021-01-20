import java.util.HashMap;
import java.util.Set;

public class HashMapProj {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
    
        trackList.put("Urantia", "A picture perfect strange.");
        trackList.put("Cherry Waves", "Is that what you want?");
        trackList.put("Headless", "Your attempt is useless.");
        trackList.put("Mascera", "I'm sorry you're married... To me.");
        
        System.out.println(trackList.get("Cherry Waves"));

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }

    }
}