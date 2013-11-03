/**
 * User: rafael
 * Date: 11/2/13
 * Time: 10:49 PM
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class USPresident implements Serializable{
    private static final long serialVersionUID = 1L;
    @Override
    public String toString() {
        return "US President [name=" + name + ", period=" + period + ", term=" + term + "]";
    }
    public USPresident(String name, String period, String term) {
        this.name = name;
        this.period = period;
        this.term = term;
    }
    private String name;
    private String period;
    private transient String term;
}
class TransientSerialization {
    public static void main(String []args) {
        USPresident usPresident = new USPresident("Barack Obama", "2009 to --", "56th term");
        System.out.println(usPresident);

        //Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("USPresident.data"))){
            oos.writeObject(usPresident);
        }
        catch(FileNotFoundException fnfe) {
            System.err.println("cannot create a file with the given file name ");
        } catch(IOException ioe) {
            System.err.println("an I/O error occurred while processing the file");
        } // the ObjectOutputStream will auto-close, so don't have to worry about it

        //De-serialize the object
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("USPresident.data"))){
            Object obj = ois.readObject();
            if(obj != null && obj instanceof USPresident){
                USPresident presidentOfUS = (USPresident)obj;
                System.out.println(presidentOfUS);
            }
        }catch(FileNotFoundException fnfe) {
            System.err.println("cannot create a file with the given file name ");
        } catch(IOException ioe) {
            System.err.println("an I/O error occurred while processing the file");
        } catch(ClassNotFoundException cnfe) {
            System.err.println("cannot recognize the class of the object - is the file corrupted?");
        }
    }
}

