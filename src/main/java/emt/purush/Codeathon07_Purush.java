package src.main.java.emt.purush;
import java.io.File;
import java.util.*;
public class Codeathon07_Purush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Directory");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);
        System.out.println("Output:");
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory not Found !");
            return;
        }
        Map<String, List<String>> fileMap = new TreeMap<>();
        getFiles(directory, fileMap);
        printFileMap(fileMap);
    }
    public static void getFiles(File directory, Map<String, List<String>> fileMap) {
        File[] files = directory.listFiles();
        if (files != null) {
            List<String> txtAndExeFiles = new ArrayList<>();
            for (File file : files) {
                if (file.isDirectory()) {
                    getFiles(file, fileMap);
                } else {
                    String fileName = file.getName().toLowerCase();
                    if (fileName.endsWith(".txt") || fileName.endsWith(".exe")) {
                        txtAndExeFiles.add(file.getName());
                    }
                }
            }
            if (!txtAndExeFiles.isEmpty()) {
                fileMap.put(directory.getAbsolutePath(), txtAndExeFiles);
            } else {
                fileMap.put(directory.getAbsolutePath(), new ArrayList<>());
            }
        }
    }
    public static void printFileMap(Map<String, List<String>> fileMap) {
        for (Map.Entry<String, List<String>> entry : fileMap.entrySet()) {
            String dirName = entry.getKey();
            List<String> files = entry.getValue();
            System.out.print(dirName);
            if (!files.isEmpty()) {
                System.out.print("\t" + String.join(", ", files));
            }
            System.out.println();
        }
    }
}

