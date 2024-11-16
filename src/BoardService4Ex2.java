import java.util.Scanner;

public class BoardService4Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Board[] boardList = null;
        int count = 0;

        while (true) {
            System.out.print("1.게시물쓰기 2.게시물출력");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("내용 : "); String content = scan.next();
                System.out.println("작성자 : "); String writer = scan.next();
                System.out.println("비밀번호 : "); int pwd = scan.nextInt();

                Board board = new Board();
                board.pwd = pwd; board.content = content; board.writer = writer;

                count++;
                Board[] newBoardList = new Board[count];

                if (count != 1) {
                    for (int index = 0; index <= boardList.length-1; index++) {
                        newBoardList[index] = boardList[index];
                    }
                }

                newBoardList[newBoardList.length-1] = board;
                boardList = newBoardList;
            } else if (choose == 2) {
                for (int index = 0; index <= boardList.length-1; index++) {
                    System.out.printf("작성자 : %s , 내용 : %s\n",
                            boardList[index].writer, boardList[index].content);
                }
            }
        }
    }
}
