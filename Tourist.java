interface Tourist {

    int budget = 0;

    void visit();

    void visit(Palawan palawan);
    void visit(Hawaii hawaii);
    void visit(Boracay boracay);
    void visit(Italy italy);
    void visit(Japan japan);
    void visit(Australia australia);


    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    
    };

    void checkBudget();
}