class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];

        for(int i=0;i<salary.length;i++){
            if(salary[i]<min){
                min = salary[i];
            }
            if(salary[i]>max){
                max = salary[i];
            }
        }
        int count = 0;
        double sum = 0;
        for(int i=0;i<salary.length;i++){
            if(salary[i] == min || salary[i] == max)
                continue;

            sum = sum + salary[i];
            count++;
        }

        return sum/count;
    }
}