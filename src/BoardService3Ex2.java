import java.util.Scanner;

public class BoardService3Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Board[] boardList = new Board[100];

        while (true) {
            System.out.println("1.게시물쓰기 2.게시물출력");
            int choose = scan.nextInt();

            if (choose == 1) {
                scan.nextLine();
                System.out.println("내용 : "); String content = scan.nextLine();
                System.out.println("작성자 : "); String writer = scan.next();
                System.out.println("비밀번호 : "); int pwd = scan.nextInt();

                for (int index = 0; index <= boardList.length-1; index++) {
                    if (boardList[index] == null) {
                        Board board = new Board();
                        board.content = content; board.writer = writer; board.pwd = pwd;

                        boardList[index] = board;
                        break;
                    }
                }
            } else if (choose == 2) {
                for (int index = 0; index <= boardList.length-1; index++) {
                    System.out.printf("작성자 : %s , 내용 : %s\n",
                            boardList[index].writer, boardList[index].content);
                }
            }
        }
    }
}
