package 实验3;

// WoodWindow.java (具体的窗户实现类)
class WoodWindow extends Window {
    double height, width;
    void setHeight(double h) { height = h; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    double getWidth() { return width; }
    String getMaterial() { return "木头"; }
}
