/**
 * User: rafael
 * Date: 10/21/13
 * Time: 8:18 PM
 */
class StatusReporter {
    // important to note that the argument "color" is declared final
    // otherwise, the local inner class DescriptiveColor will not be able to use it!!
    static Shape2.Color getDesciptiveColor(final Shape2.Color color) {
        // note the use of anonymous inner classes here -- specifically, there is no name
        // for the class and we construct and use the class "on the fly" in the return
        // statement!

        return new Shape2.Color(){
            public String toString() {
                return "You selected a color with RGB values " + color;
            }
        };
    }

    public static void main(String []args) {
        Shape2.Color descriptiveColor = StatusReporter.getDesciptiveColor(new Shape2.Color(0, 0, 0));
        System.out.println(descriptiveColor);
    }
}

