package homework_12;

import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> filesMap;

    public FileNavigator() {
        filesMap = new HashMap<>();
    }

    public void add(String path, FileData fileData) {
        // Перевірка консистентності шляху
        if (!path.equals(fileData.getPath())) {
            System.out.println("Error: Шлях-ключ і шлях до файлу не співпадають");
            return;
        }

        filesMap.computeIfAbsent(path, k -> new ArrayList<>()).add(fileData);
    }

    public List<FileData> find(String path) {
        return filesMap.getOrDefault(path, Collections.emptyList());
    }
    public List<FileData> filterBySize(long maxSize) {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> fileList : filesMap.values()) {
            for (FileData file : fileList) {
                if (file.getSize() <= maxSize) {
                    result.add(file);
                }
            }
        }
        return result;
    }
    public void remove(String path) {
        filesMap.remove(path);
    }
    public List<FileData> sortBySize() {
        List<FileData> allFiles = new ArrayList<>();
        for (List<FileData> fileList : filesMap.values()) {
            allFiles.addAll(fileList);
        }
        allFiles.sort(Comparator.comparingLong(FileData::getSize));
        return allFiles;
    }
}
