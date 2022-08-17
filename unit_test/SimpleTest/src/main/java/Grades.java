public class Grades {
    public char Showgrade (int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("Number is not validate!");
        } else if (numberGrade < 50) {
            return 'F';
        } else if (numberGrade < 60) {
            return 'E';
        }else if (numberGrade < 70) {
            return 'D';
        }else if (numberGrade < 80) {
            return 'C';
        }else if (numberGrade < 90) {
            return 'B';
        }else {
            return 'A';
        }
    }
}
