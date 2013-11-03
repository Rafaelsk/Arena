/**
 * User: rafael
 * Date: 10/21/13
 * Time: 8:38 PM
 */
public enum PrinterType {
    DOTMATRIX(5), INKJET(10), LASER(50);

    private int pagePrintCapacity;

    private PrinterType(int pagePrintCapacity) {
        this.pagePrintCapacity = pagePrintCapacity;
    }

    public int getPrintPageCapacity() {
        return pagePrintCapacity;
    }
}

