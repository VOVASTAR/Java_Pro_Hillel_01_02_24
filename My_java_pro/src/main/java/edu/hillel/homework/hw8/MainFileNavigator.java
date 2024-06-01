package edu.hillel.homework.hw8;

public class MainFileNavigator {

    public static void main(String[] args) {

        FileNavigator fileNavigator = new FileNavigator();
        String path1 = "/path/to/file1";
        String path2 = "/path/to/fileeee2";
        String path3 = "/path/to/filee3333";

        FileData fileData1 = new FileData("test1", 512, path1);
        FileData fileData2 = new FileData("test2", 192, path1);
        FileData fileData3 = new FileData("test3", 128, path2);
        FileData fileData4 = new FileData("test4", 32, path1);
        FileData fileData5 = new FileData("test5", 256, path2);
        FileData fileData6 = new FileData("test6", 256, path2);

        fileNavigator.add(path1, fileData1);
        fileNavigator.add(path1, fileData2);
        fileNavigator.add(path2, fileData3);
        fileNavigator.add(path1, fileData4);
        fileNavigator.add(path2, fileData5);
        fileNavigator.add(path3, fileData6);

        System.out.println("Find: " + fileNavigator.find(path2));
        System.out.println("Filter: " + fileNavigator.filterBySize(300));
        System.out.println("Filter Stream: " + fileNavigator.filterBySizeByStream(300));
        System.out.println("Sorted: " + fileNavigator.sortBySize());
        System.out.println("Sorted Stream: " + fileNavigator.sortBySizeStream());
        fileNavigator.remove(path2);
        System.out.println("Map: " + fileNavigator.fileSource);

    }
}
