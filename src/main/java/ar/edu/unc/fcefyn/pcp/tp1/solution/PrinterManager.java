package ar.edu.unc.fcefyn.pcp.tp1.solution;

import java.util.ArrayList;
import java.util.HashMap;

//monolithic architecture printerManger gets the events
public class PrinterManager {
Integer numberOfOrders;
Integer rows;
Integer columns;

//Threads
Integer assignmentThreads;
Integer validationThreads;
Integer printingThreads;

HashMap<Integer,AsignProcess> asignProcesses;


hashMap<Printer> printers;

public PrinterManager(Integer numberOfOrders, Integer rows, Integer columns) {
    //The ids 0 to rows*columns-1
    Integer id=0;

    this.numberOfOrders = numberOfOrders;
    this.rows = rows;
    this.columns = columns;

    //Init rows*columns printers
    // 0->1->2->3->4
    // 5->6->7->8->9....
    //...

    for(int i=0;i<rows;i++){
    for(int j=0;j<columns;j++){
        printers.put(new Printer(id,i,j));
    id++;
    }
    }

//Prepare Threads;


    //Asing Threads
    for(int i=0;i<assignmentThreads;i++){
        AsignProcess p = new AsignProcess(this,0);
        asignProcesses.put(i,p);
        Thread t = new Thread(p);
        t.start();
    }

}

public Printer getPrinter(int id){
return this.printers.get(id);
}




}
