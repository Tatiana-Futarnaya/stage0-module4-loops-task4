package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int i=0;
        int sum=0;
        int sumToNumber=0;

        if(numberToSkip>lastInRow){
            System.out.println("number to skip is bugger then the last");
        }else{
            if(lastInRow<0){
                System.out.println("last number in row is negative");
            }else{
                while (i<=lastInRow){
                   if(i<=numberToSkip){
                       sumToNumber=sumToNumber+i;
                   }else{
                       sum=sum+i;
                   }
                   i++;
                }
                System.out.println("skipped sum is "+sumToNumber);
                System.out.println("counted sum is "+sum);
            }
        }

    }
}
