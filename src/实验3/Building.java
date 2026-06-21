package 实验3;

class Building {
    Window[] window;

    public void use(Window[] w) {
        // 假设楼房要求：高度大于 1.5，宽度大于 1.0 的窗户才合格
        int count = 0;
        for (int i = 0; i < w.length; i++) {
            if (w[i].getHeight() > 1.5 && w[i].getWidth() > 1.0) {
                count++;
            }
        }
        window = new Window[count];
        int index = 0;
        for (int i = 0; i < w.length; i++) {
            if (w[i].getHeight() > 1.5 && w[i].getWidth() > 1.0) {
                window[index++] = w[i];
                System.out.println("成功安装了一扇 " + w[i].getMaterial() + " 窗户");
            } else {
                System.out.println("一扇 " + w[i].getMaterial() + " 窗户尺寸不合格，拒绝安装。");
            }
        }
    }
}
