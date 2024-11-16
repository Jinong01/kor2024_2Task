import java.util.Scanner;

public class BoardService1Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String content1 = null; String writer1 = null;
        String content2 = null; String writer2 = null;
        String content3 = null; String writer3 = null;

        while (true){
            System.out.println("1. 게시판 내용 입력 2. 게시판 내용 출력 / 선택 : ");
            int choose = scan.nextInt();


            if (choose == 1) {
                scan.nextLine();
                System.out.println("내용 : "); String content = scan.nextLine();
                System.out.println("작성자 : "); String writer = scan.nextLine();
                if (content1 == null){
                    content1 = content; writer1 = writer;
                } else if (content2 == null) {
                    content2 = content; writer2 = writer;
                } else if (content3 == null) {
                    content3 = content; writer3 = writer;
                } else {
                    System.out.println("저장 실패. 빈 공간이 없습니다.");}
            } // if choose1
            if (choose == 2 ) {
                if (content1 != null) {
                    System.out.printf("작성자 :%s , 내용 : %s\n", writer1, content1);
                } if (content2 != null) {
                    System.out.printf("작성자 :%s , 내용 : %s\n", writer2, content2);
                } if (content3 != null) {
                    System.out.printf("작성자 :%s , 내용 : %s\n", writer3, content3);
                }
            }
        } // while end
    } // main end
}
