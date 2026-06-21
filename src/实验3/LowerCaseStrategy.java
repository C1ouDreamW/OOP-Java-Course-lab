package 实验3;

class LowerCaseStrategy implements OutputStrategy {
    public void printLetters() {
        System.out.print("小写字母: ");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}