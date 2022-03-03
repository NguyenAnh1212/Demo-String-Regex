import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        boolean a = "Java is fun".matches("Java.*");
        boolean b = "Java is cool".matches("Java.*");
        boolean c = "Java is powerful".matches("Java.*");

        System.out.println("a:" +  a);
        System.out.println("b:" +  b);
        System.out.println("c:" +  c);
        System.out.println("Java Java Java".replaceAll("v\\w", "wi"));
//        System.out.println("Java Java Java".split("va"));

        String tokens[];
        String s = "I love you so much! But I cannot marry you.";
        System.out.println(s);
        tokens = s.split("[ ]");
        for (String token : tokens) {
            System.out.println(token);
        }

        String str = "Welcome   to gpcoder";// thông thường String là một chuỗi các kí tự,
        // Nhưng trong java String là một đối tượng biểu diễn một nối tiếp các kí tự.
// Ký tự bất kỳ xuất hiện nhiều lần lần và kết thúc là r
        String regex = ".*r$";
// Tạo đối tượng Pattern thông qua method tĩnh.
        Pattern pattern = Pattern.compile(regex); // so sánh xem đối tượng được so sánh có kết thúc bằng r
// Lấy ra đối tượng Matcher
        Matcher matcher = pattern.matcher(str); // lấy ra đối tượng so sánh là str
// Kiểm tra có khơp với regex không
        boolean match = matcher.matches();
        System.out.println("Match = " + match); // Match = true


        String tr1 = "abc";
        String tr2 = "abc";
        String tr3 = new String("abc");
        String tr4 = new String("abc");

        // So sánh == So sánh các tham chiếu của chúng, tức là địa chỉ bộ nhớ
        System.out.println(tr1 == tr2);// true
        System.out.println(tr1 == tr3);// flase
        System.out.println(tr3 == tr4);//flase

        // So sánh equal là so sánh đối tượng về mặt ngữ nghĩa, nếu 2 đối tượng bằng nhau thì hashcode bằng nhau
        System.out.println(tr1.equals(tr2));// true
        System.out.println(tr1.equals(tr3));// true
        System.out.println(tr3.equals(tr4));// true

        System.out.println(tr1.hashCode()); // tất cả hashcode đều bằng nhau 96534
        System.out.println(tr2.hashCode());
        System.out.println(tr3.hashCode());
        System.out.println(tr4.hashCode());

        String a1 = "KA";
        System.out.println(a1 == "KA");
        System.out.println("a".hashCode());



    }

}
