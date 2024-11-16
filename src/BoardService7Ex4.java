import java.util.ArrayList;
import java.util.Scanner;

public class BoardService7Ex4 {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<NewBoard> newBoardArrayList = new ArrayList<>();

    static void boardWrite(){
        System.out.println("작성자 : "); String writer = scan.next();
        System.out.println("내용 : "); String content = scan.next();
        System.out.println("비밀번호 : "); int pwd = scan.nextInt();

        NewBoard newBoard = new NewBoard(content, pwd, writer);
        newBoardArrayList.add(newBoard);
    }

    static void boardPrint(){
        for (int index = 0; index <= newBoardArrayList.size()-1; index++) {
            System.out.printf("작성자 : %s , 내용 : %s\n",
                    newBoardArrayList.get(index).getWriter(),
                    newBoardArrayList.get(index).getContent());
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.쓰기 2.출력");
            int choose = scan.nextInt();

            if (choose == 1) {
                boardWrite();
            } else if (choose == 2) {
                boardPrint();
            }
        }
    }
}
