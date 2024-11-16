import java.util.Scanner;

public class BoardService2Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] contents = new String[100];
        String[] writers = new String[100];

        while (true) {
            System.out.println("1.게시글 쓰기 2.게시물 출력");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("새로운 게시글 내용 : "); String content = scan.next();
                System.out.println("새로운 게시글 작성자 : "); String writer = scan.next();

                boolean save = false;
                for(int index = 0; index <= contents.length-1;index++ ) {
                    if (contents[index] == null) {
                        contents[index] = content; writers[index] = writer;
                        save = true;
                        break;
                    }
                }
                if (save) {
                    System.out.println("게시물 쓰기 성공");
                } else {System.out.println("게시물 쓰기 실패 : 빈 공간이 없습니다.");}
            }

            if (choose == 2) {
                for (int index = 0; index <= contents.length-1; index++) {
                    if (contents[index] != null) {
                        System.out.printf("작성자 : %s , 내용 : %s\n", writers[index], contents[index]);
                    }
                }
            }
        }
    }
}
