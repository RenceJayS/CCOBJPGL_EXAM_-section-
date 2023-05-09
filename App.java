public class App {
    public static void main(String[] args) throws Exception {
       
        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Me myself  = new Me();

        Locations australia = new Australia ();
        Locations japan = new Japan();
        Locations boracay = new Boracay();
        Locations hawaii = new Hawaii ();
        Locations italy = new Italy ();
        Locations palawan = new Palawan ();

        australia.accept(myself);
        boracay.accept(myself);
        hawaii.accept(myself);
        italy.accept(myself);
        japan.accept(myself);
        palawan.accept(myself);


    }
}


    

