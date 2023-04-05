public class Ensamble {

    public static void main(String[] args) {
        double simTime = 0.0;
        double[] ensemble = new double[11];
        for(int y = 0; y <=10;y++){
        // Ensemble averaging loop
        int numSims = 10;
        double[] ensembleAvgs = new double[11];
        

        // Ensemble averaging loop
        for (int i = 0; i < numSims; i++) {    
            Simulation simulation = new Simulation();
            simulation.simulate(simTime);
            ensembleAvgs[i] = simulation.finished;
                  
        }

        // Calculate ensemble averages
        double sum = 0;

        for (double ensembleAvg : ensembleAvgs) {
            sum += ensembleAvg;
        }

        ensemble[y] = sum / numSims;
        simTime +=1000;

        }
        // Print time step ensemble averages and standard deviations 
        for (int i=0; i<ensemble.length;i++){     
            System.out.println("Time: "+i*1000+", Ensemble Average: "+ensemble[i]  );
        }
        
    }


//    Initialization Time: X.XX (a value for the initialization time)
    //Assembled products: Y (a value for the number of assembled products)
    //Workstation 1 finished assembling product P1 at time Z.ZZ (values for Workstation 1)
    //Workstation 2 finished assembling product P2 at time Z.ZZ (values for Workstation 2)
    //Workstation 3 finished assembling product P3 at time Z.ZZ (values for Workstation 3)

    //Little's Law Results:
    //Workstation 1 - Avg time in system (W): X.XX, Avg arrival rate (λ): X.XXXX, Avg # of components in system (L): X.XX
  //  Workstation 2 - Avg time in system (W): X.XX, Avg arrival rate (λ): X.XXXX, Avg # of components in system (L): X.XX
    //Workstation 3 - Avg time in system (W): X.XX, Avg arrival rate (λ): X.XXXX, Avg # of components in system (L): X.XX
//    Facility - Avg time in system (W): X.XX, Avg arrival rate (λ): X.XXXX, Avg # of components in system (L): X.XX



}
