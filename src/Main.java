import java.io.File;

public class Main {

    public static void main(String[] args) {

        File dir1 = new File("D://Games");
        if (dir1.mkdir())
            System.out.println("Каталог создан");

        File dir2 = new File("D://Games\\src");
        if (dir2.mkdir())
            System.out.println("Каталог src создан");

//        File dir3 = new File("D://Games\src");
//        if (dir3.mkdir())
//            System.out.println("Каталог src создан");
    }


}
