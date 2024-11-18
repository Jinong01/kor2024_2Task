import java.util.ArrayList;
import java.util.Scanner;

public class BoardService5Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Board> boardArrayList = new ArrayList<>();

        while (true) {
            System.out.println("1.게시물쓰기 2.게시물출력");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("내용 : "); String content = scan.next();
                System.out.println("작성자 : "); String writer = scan.next();
                System.out.println("비밀번호 : "); int pwd = scan.nextInt();

                Board board = new Board();
                board.content = content; board.writer = writer; board.pwd = pwd;

                boardArrayList.add(board);
            } else if (choose == 2) {
                for (int index = 0; index <= boardArrayList.size()-1; index++) {
                    System.out.printf("작성자 : %s , 내용 : %s\n",
                            boardArrayList.get(index).writer, boardArrayList.get(index).content);

                }
            }
        }
    }
}
