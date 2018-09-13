public class CompareVersions {
    public static int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int ver1Length = ver1.length;
        int ver2Length = ver2.length;
        int commonSeqLength = Math.min(ver1Length, ver2Length);
        int i = 0;
        for(; i< commonSeqLength; i++){
            if (Integer.parseInt(ver1[i]) == Integer.parseInt(ver2[i])){
                continue;
            }
            if (Integer.parseInt(ver1[i]) > Integer.parseInt(ver2[i])){
                return 1;
            }
            else{
                return -1;
            }
        }
        int sum = 0;
        if(ver1Length > ver2Length){
            while( i <  ver1Length){
                if (Integer.parseInt(ver1[i]) != 0 ){
                    return 1;
                }
                i++;
            }
        }
        if(ver1Length < ver2Length){
            while( i <  ver2Length){
                if (Integer.parseInt(ver2[i]) != 0 ){
                    return -1;
                }
                i++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.0","1"));
    }
}
