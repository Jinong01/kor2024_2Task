import java.util.Scanner;

public class BoardService2Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] content = new String[100];
        String[] writer = new String[100];
        boolean save = false;

        while (true){
            System.out.println("1.게시글 작성 2.게시글 출력 / 선택");
            int choose = scan.nextInt();

            if (choose == 1) {
                System.out.println("내용 : "); String cont = scan.next();
                System.out.println("작성자 : "); String wt = scan.next();

                for (int index = 0; index <= content.length-1; index++) {
                    if (content[index] == null) {
                        content[index] = cont;
                        writer[index] = wt;
                        save = true;


                        break;
                    }
                }
                if (save) {System.out.println("저장 성공.");}
                else {System.out.println("저장공간 없음. 저장실패.");}
            }
            if (choose == 2) {
                for (int index = 0; index <= content.length-1; index++) {
                    if (content[index] != null) {
                        System.out.printf("작성자:%s , 내용:%s\n", writer[index], content[index]);
                    }
                }
            }
        }
    }
}
