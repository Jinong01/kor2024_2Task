import java.util.Scanner;

public class BoardService1Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String content1 = null; String writer1 = null;
        String content2 = null; String writer2 = null;
        String content3 = null; String writer3 = null;

        while (true) {
            System.out.println("1.내용 입력 2.내용 출력 / 선택");
            int choose = scan.nextInt();
            if (choose == 1){
                System.out.println("내용 : "); String content = scan.next();
                System.out.println("작성자 : "); String writer = scan.next();

                if (content1 == null) {
                    content1 = content; writer1 = writer;
                } else if (content2 == null) {
                    content2 = content; writer2 = writer;
                } else if (content3 == null) {
                    content3 = content; writer3 = writer;
                } else{
                    System.out.println("작성 실패. 빈 공간이 없습니다.");
                }
            }
            if (choose == 2) {
                if (content1 != null) {
                    System.out.printf("작성자1:%s , 내용1:%s\n", writer1, content1);
                } if (content2 != null) {
                    System.out.printf("작성자2:%s , 내용2:%s\n", writer2, content2);
                } if (content3 != null) {
                    System.out.printf("작성자3:%s , 내용3:%s\n", writer3, content3);
                }
            }
        }


    }
}
