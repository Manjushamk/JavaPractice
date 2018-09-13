import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solutions {
    public static void main(String[] args) {

    }

    static String checkip(String ip, String ipv4, String ipv6){
        Pattern p;
        Matcher m;
        if(ip.indexOf(".")> 0){
            p = Pattern.compile(ipv4);
            m = p.matcher(ip);
            if(m.matches()){
                return "IPv4";
            }
            else{
                return "Neither";
            }
        }
        else if(ip.indexOf(":") > 0){
            p = Pattern.compile(ipv6);
            m = p.matcher(ip);
            if(m.matches()){
                return "IPv6";
            }
            else{
                return "Neither";
            }
        }else{
            return "Neither";
        }
    }

    static List<String> checkIPs(List<String> ip_array) {
        String ipv4 = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+ "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        String ipv6 = "^[0-9a-f]{1,4}:"+"[0-9a-f]{1,4}:"+"[0-9a-f]{1,4}:"+"[0-9a-f]{1,4}:"+"[0-9a-f]{1,4}:"+"[0-9a-f]{1,4}:"+"[0-9a-f]{1,4}:"+"[0-9a-f]{1,4}$";
        List<String> result = new ArrayList<>();
        for (int i =0; i<ip_array.size();i++){
            result.add(checkip(ip_array.get(i),ipv4,ipv6));
        }
        return null;

       // "(?=^(([ac]*[bd]){2})*[ac]*$)(([bd]*[ac]){2})*[bd]*"

    }
}
