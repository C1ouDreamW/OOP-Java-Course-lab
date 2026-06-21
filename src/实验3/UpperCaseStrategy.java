package 实验3;

class UpperCaseStrategy implements OutputStrategy {
    public void printLetters() {
        System.out.print("大写字母: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}