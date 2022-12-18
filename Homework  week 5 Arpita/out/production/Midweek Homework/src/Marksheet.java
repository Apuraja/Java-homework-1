public class Marksheet {
    public static void main(String[] args) {
        int t = 100;
        int guj = 79;
        int eng = 89;
        int san = 98;
        int sci = 90;
        int math = 95;
        int soc = 68;
        int swa = 70;
        double per = ((guj+eng+san+sci+math+soc+swa)*100)/700;

        System.out.println("------------------Gujarat Secondary  Higher Secondary Education Board----------------");
        System.out.println();
        System.out.println("Seat No : B 123456       Candidate Name : Vyas Drashti Chhotabhai     Sr No. 762715");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("NAME OF THE SUBJECT     TOTAL MARKS       MARKS OBTAINED   MARKS OBTAINED IN WORDS");
        System.out.println("GUJARATI                 "+t+"                "+guj+"                SEVENTY NINE");
        System.out.println("ENGLISH                  "+t+"                "+eng+"                EIGHTY NINE");
        System.out.println("SANSKRIT                 "+t+"                "+san+"                NINETY ONE");
        System.out.println("SCIENCE                  "+t+"                "+san+"                NINETY ");
        System.out.println("MATHAMATICS              "+t+"                "+math+"                NINETY FIVE");
        System.out.println("SOCIAL SCIENCE           "+t+"                "+soc+"                SIXTY");
        System.out.println("SWASTHYA & SHA SHIK      "+t+"                "+swa+"                SEVENTY");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("TOTAL MARKS OBTAINED IN WORDS        FIVE HUNDRED EIGHTY TWO ONLY");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("SCHOOL INDEX NO.     MONTH&YEAR       TOTAL SUBJECTS       RESULTS     PERCENTAGE");
        System.out.println("     63              MARCH - 2009           7                PASS          "+per+"%");
        System.out.println("-------------------------------------------------------------------------------------");
    }
}
