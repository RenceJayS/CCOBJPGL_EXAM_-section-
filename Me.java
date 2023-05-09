public class Me implements Tourist {
    
    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
        checkBudget(); 
    }

    public void visit(Palawan palawan) {
        
        if (budget >=1000){
            budget = budget - palawan.airFare;
        System.out.println("It felt peaceful and very relaxing");
        }else {
        System.out.println("Ipon muna");
    }
    checkBudget(); 
}
    public void visit(Hawaii hawaii) {
       
        if (budget >=100){
            budget = budget - hawaii.airFare;
        System.out.println("It was fun");
        }else {
        System.out.println("Ipon muna");
    }
    checkBudget();
}
    public void visit(Japan japan) {
        
        if (budget >=100){
            budget = budget - japan.airFare;
        System.out.println("It was thrilling");
        }else {
        System.out.println("Ipon muna");
    }
    checkBudget();
}
    public void visit(Australia australia) {
        
        if (budget >=100){
            budget = budget - australia.airFare;
        System.out.println("It was like living the life to the fullest");
        }else {
        System.out.println("Ipon muna");
    }
    checkBudget(); 
}
    public void visit(Boracay boracay) {

        if (budget >=100){
        budget = budget - boracay.airFare;
        System.out.println("It felt like I am dreaming");
        }else {
        System.out.println("Ipon muna");
    }
    checkBudget(); 
}
    public void visit(Italy italy) {
        if (budget >=100){
        budget = budget - italy.airFare;
        System.out.println("The foods are delicious");
        }else {
        System.out.println("Ipon muna");
    }
            checkBudget(); 
}
    public void checkBudget() {
        System.out.println("my budget is " + budget);
        
    }

}


