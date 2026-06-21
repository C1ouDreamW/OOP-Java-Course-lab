package 实验3;

public class BuildingTest {
    public static void main(String[] args) {
        Window[] windowsToInstall = new Window[2];

        windowsToInstall[0] = new WoodWindow();
        windowsToInstall[0].setHeight(2.0);
        windowsToInstall[0].setWidth(1.5);

        windowsToInstall[1] = new WoodWindow();
        windowsToInstall[1].setHeight(1.0); // 尺寸不合格
        windowsToInstall[1].setWidth(0.8);

        Building building = new Building();
        building.use(windowsToInstall);
    }
}