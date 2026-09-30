package ar.edu.unc.fcefyn.pcp.tp1.solution;
public class AsignProcess implements Runnable{
PrinterManager printerCluster;
Integer delay = 100;
Integer initialId;

public AsignProcess(PrinterManager printerCluster,Integer initialId){
    this.printerCluster=printerCluster;
    this.initialId=initialId;
}
@Override
    public void run() {
Integer i=0;
        while(True) {
            //polling printing
            this.printerCluster.getPrinter(0).runPrinter();


            try {
                Thread.sleep(delay);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            i%=printerCluster.columns*printerCluster.rows;
        }



}

}
