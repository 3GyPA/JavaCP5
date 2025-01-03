/**
 * Головний клас для тестування альбому та музичних композицій.
 * У цьому класі створюється альбом, додаються композиції, виконується маніпуляція ними.
 */
public class Main {
    /**
     * Головний метод для тестування функціональності альбому та композицій.
     *
     * @param args Параметри командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        // Створюємо новий альбом
        Album album = new Album();

        // Додаємо композиції до альбому
        album.addComposition(new RockComposition("We Will Rock You", 3.5));
        album.addComposition(new ClassicalComposition("Für Elise", 2.5));
        album.addComposition(new JazzComposition("Take Five", 5.5));
        album.addComposition(new RockComposition("Bohemian Rhapsody", 5.9));
        album.addComposition(new ClassicalComposition("Symphony No. 5", 8.0));

        // Вивести всі композиції
        album.printCompositions();

        // Порахувати загальну тривалість альбому
        System.out.println("Total Album Duration: " + album.getTotalDuration() + " minutes");

        // Переставити композиції по стилю
        album.sortByStyle();
        System.out.println("\nCompositions sorted by style:");
        album.printCompositions();

        // Знайти композицію в заданому діапазоні тривалості
        MusicComposition found = album.findByDurationRange(4.0, 6.0);
        if (found != null) {
            System.out.println("\nFound composition within range: " + found.getTitle());
        } else {
            System.out.println("\nNo composition found in this duration range.");
        }
    }
}
