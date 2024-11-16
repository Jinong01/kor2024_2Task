import java.util.Scanner;

public class BoardService1Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String content1 = ""; String writer1 = "";
        String content2 = ""; String writer2 = "";
        String content3 = ""; String writer3 = "";

        while (true) {
            System.out.println("1.게시글 입력 2.작성자 입력 / 선택");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("게시글 : "); String content = scan.next();
                System.out.println("작성자 : "); String writer = scan.next();
                if (content1 == "") {
                    content1 = content; writer1 = writer;
                } else if (content2 == "") {
                    content2 = content; writer2 = writer;
                } else if (content3 == "") {
                    content3 = content; writer3 = writer;
                } else{
                    System.out.println("빈공간이 없어 저장 실패");
                }
            }
            if (choose == 2) {
                if (content1 != ""){
                    System.out.printf("게시글1 : %s , 작성자1 : %s\n", content1, writer1);
                }
                if (content2 != ""){
                    System.out.printf("게시글2 : %s , 작성자2 : %s\n", content2, writer3);
                }
                if (content3 != ""){
                    System.out.printf("게시글3 : %s , 작성자3 : %s\n", content3, writer3);
                }
            }
        }
    }
}
