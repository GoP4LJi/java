public class gla_java {
    String model;
    int rc;

    gla_java(String s, int r) {
        model = s;
        rc = r;
    }

    gla_java() {
        model = "Unknown";
        rc = 0000;
    }

    gla_java(String s) {
        // this(s:"Maruti",74);
        model = s;
    }

    public static void main(String[] args) {

        gla_java c1 = new gla_java("Honda", 12344);
        gla_java c2 = new gla_java("BMW", 4456);
        gla_java c3 = new gla_java();
        gla_java c4 = new gla_java("Maruti");

        System.out.println(c1.model + "-" + c1.rc);
        System.out.println(c2.model + "-" + c2.rc);
        System.out.println(c3.model + "-" + c3.rc);
        System.out.println(c4.model + "-" + c4.rc);

    }

} {
    
}
