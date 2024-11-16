import java.util.Scanner;

public class BoardService2Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] contents = new String[100];
        String[] writers = new String[100];
        boolean save = false;

        while (true) {
            System.out.println("1.게시글 작성 2.게시글 출력 / 선택");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("내용 입력 : "); String content = scan.next();
                System.out.println("작성자 입력 : "); String writer = scan.next();


                for (int index = 0; index <= contents.length-1; index++) {
                    if (contents[index] == null) {
                        contents[index] = content; writers[index] = writer;
                        save = true;
                        break;
                    }
                  }
                if (save) {
                    System.out.println("게시물 쓰기 성공");
                } else {System.out.println("게시물 쓰기 실패 : 빈공간이 없습니다.");}
            }
            if (choose == 2) {
                for (int index = 0; index <= contents.length-1; index++) {
                    if (contents[index] != null){
                        System.out.printf("작성자%d : %s , 내용%d : %s\n",index, writers[index], index, contents[index]);
                    }
                }
            }
        }
    }
}
