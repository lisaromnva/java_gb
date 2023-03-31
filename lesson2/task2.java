package lesson2;

//2) Создать файл с названием file.txt. Если файл уже есть, то создавать не надо
// Записать в него Слово "TEXT" 100 раз

public class task2 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("file.text"));
        int n = 100;
        String s = "TEXT";
        for (int i = 0; i < n; i++) {
            byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
            os.write(bytes);
            os.flush();
            if
        }
    }
}