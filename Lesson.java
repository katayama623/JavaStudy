class Student{
    String name;

    public double calculateAve(double[] date){
        double sum = 0;
        for(int i = 0; i < date.length; i++){
            sum += date[i];
        }
        double avg = sum / date.length;
        return avg;
    }

    public String judge(double avg){
        String result;
        if(avg >= 60){
            result = "passed";
        }else{
            result = "falide";
        }
        return result;
    }
}

public class Lesson{
    public static void main(String[] args) {
        Student a001 = new Student();
        a001.name = "sato";
        double[] date = {34,45,55,32,90};

        double avg = a001.calculateAve(date);
        String result = a001.judge(avg);
        System.out.println(avg);
        System.out.println(a001.name + " " + result);
    }   
}