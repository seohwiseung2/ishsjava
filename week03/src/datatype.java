public class datatype {
    public static void main(String[] args) {
        int score = 87;
        float gpa = 4.13F;  //float는 4바이트, double은 8바이트 둘다 실수임
        System.out.println(score);
        //score = 99.9;
        score = (int)99.9;
        System.out.println(score);
        System.out.println(gpa);
        //score = gpa 안됌
        score = (int)gpa; //명시적 현변환
        System.out.println(score);
        //gpa = score;//국시적 형변황
        System.out.println(gpa);
        gpa = (float)score; // 명시적 형변환
        System.out.println(gpa);




    }
}
