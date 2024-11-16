import java.util.Scanner;

public class BoardService1Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String content1 = ""; String writer1 = "";
        String content2 = ""; String writer2 = "";
        String content3 = ""; String writer3 = "";

        while (true) {
            System.out.println("1.게시글 저장 2.게시글 출력 / 선택");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("내용 입력 : ");
                String content = scan.next();
                System.out.println("작성자 입력 : ");
                String writer = scan.next();
                if (content1 == "") {
                    content1 = content; writer1 = writer;
                } else if (content2 == "") {
                    content2 = content; writer2 = writer;
                } else if (content3 == "") {
                    content3 = content; writer3 = writer;
                } else {
                    System.out.println("빈 공간이 없어 저장 실패.");
                }
            }
            if (choose == 2) {
                if (content1 != "") {
                    System.out.printf("작성자1 :%s , 내용1 :%s\n", writer1, content1);
                } if (content2 != "") {
                    System.out.printf("작성자2 :%s , 내용2 :%s\n", writer2, content2);
                } if (content3 != "") {
                    System.out.printf("작성자2 :%s , 내용3 :%s\n", writer3, content3);
                }
            }
        }
    }
}
