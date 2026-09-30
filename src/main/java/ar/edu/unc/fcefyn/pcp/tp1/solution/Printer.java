package ar.edu.unc.fcefyn.pcp.tp1.solution;

import ar.edu.unc.fcefyn.pcp.tp1.api.PrinterState;

public class Printer {
    private Integer id;
    private Integer x;
    private Integer y;
    private PrinterState state;
    private Integer usages;
    private Order order;

    //The printer init without a order
    public Printer(Integer id, Integer x, Integer y) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.state = AVAILABLE;
        this.usages = 0;
        this.order = null;

    }

    public void assingOrder(Order order) {
        this.order = order;
        this.state = RESERVED;


    }



}