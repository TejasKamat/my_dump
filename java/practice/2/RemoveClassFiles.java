import java.io.File;

public class RemoveClassFiles {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "D:\\DATA\\Downloads\\drive-download-20240512T161846Z-001\\trash";

        // Create a File object for the directory
        File directory = new File(directoryPath);

        // Check if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            // Get all files in the directory
            File[] files = directory.listFiles();

            // Iterate through each file
            if (files != null) {
                for (File file : files) {
                    // Check if the file ends with ".class" extension
                    if (file.isFile() && file.getName().endsWith(".html")) {
                        // Delete the file
                        if (file.delete()) {
                            System.out.println("Deleted: " + file.getName());
                        } else {
                            System.out.println("Failed to delete: " + file.getName());
                        }
                    }
                }
            }
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
}