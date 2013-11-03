/**
 * User: rafael
 * Date: 11/2/13
 * Time: 12:52 PM
 */
public class ParseString2 {
    public static void main(String[] args) {
        String str = "c:\\work\\programs\\parser";
        String [] dirList = str.split("\\\\");
        for (int i=0; i<dirList.length; i++) {
            System.out.println(dirList[i]);
        }
    }
}

