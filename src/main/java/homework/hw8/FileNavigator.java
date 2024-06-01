package homework.hw8;

import java.util.*;

public class FileNavigator {

    public Map<String, List<FileData>> fileSource = new HashMap<>();

    public void add(String path, FileData fileData) {
        String filePath = fileData.getFilePath();

        if (path.equals(filePath)) {
            List<FileData> strings = fileSource.computeIfAbsent(path, value -> new ArrayList<>());
            strings.add(fileData);
        } else {
            System.out.println("The path-key and path in file: " + fileData + " is different");
        }
    }

    public List<FileData> find(String path) {
        return fileSource.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(int bytes) {
        List<FileData> value = new ArrayList<>();
        for (Map.Entry<String, List<FileData>> entry : fileSource.entrySet()) {
            for (FileData file : entry.getValue()) {
                if (file.getFileSizeInBytes() <= bytes) {
                    value.add(file);
                }
            }
        }
        return value;
    }

    public void remove(String path) {
        fileSource.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortedList = new ArrayList<>();
        for (List<FileData> valueList : fileSource.values()) {
            sortedList.addAll(valueList);
        }
        sortedList.sort(Comparator.comparingInt(FileData::getFileSizeInBytes));
        return sortedList;
    }

    //stream done for experience
    public List<FileData> filterBySizeByStream(int bytes) {
        return fileSource.values().stream()
                .flatMap(Collection::stream)
                .filter(x -> x.getFileSizeInBytes() <= bytes)
                .toList();
    }

    public List<FileData> sortBySizeStream() {
        return fileSource.values().stream()
                .flatMap(Collection::stream)
                .sorted(Comparator.comparingInt(FileData::getFileSizeInBytes))
                .toList();
    }
}