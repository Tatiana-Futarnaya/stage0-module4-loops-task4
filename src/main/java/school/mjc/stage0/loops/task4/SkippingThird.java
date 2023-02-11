package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int i=0; i<lastPrinted;i=i+3){
            for(int j=i; j<i+3; j++){
                if(j!=i && j<=lastPrinted){
                    System.out.println(j);
                }
            }
        }
    }
}
