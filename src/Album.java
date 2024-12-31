import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Клас, що представляє альбом музичних композицій.
 * Містить список композицій та методи для виконання операцій з ними.
 */
class Album {
    private List<MusicComposition> compositions;  // Список композицій в альбомі

    /**
     * Конструктор для створення нового альбому.
     */
    public Album() {
        compositions = new ArrayList<>();
    }

    /**
     * Додає композицію до альбому.
     *
     * @param composition Музична композиція, яку потрібно додати в альбом.
     */
    public void addComposition(MusicComposition composition) {
        compositions.add(composition);
    }

    /**
     * Порахувати загальну тривалість альбому.
     *
     * @return Загальна тривалість альбому в хвилинах.
     */
    public double getTotalDuration() {
        double totalDuration = 0;
        for (MusicComposition composition : compositions) {
            totalDuration += composition.getDuration();
        }
        return totalDuration;
    }

    /**
     * Переставити композиції альбому за стилем.
     * Використовує метод compareTo для порівняння стилів композицій.
     */
    public void sortByStyle() {
        Collections.sort(compositions, new Comparator<MusicComposition>() {
            @Override
            public int compare(MusicComposition c1, MusicComposition c2) {
                return c1.getStyle().compareTo(c2.getStyle());
            }
        });
    }

    /**
     * Знайти композицію в заданому діапазоні тривалості.
     *
     * @param minDuration Мінімальна тривалість композиції.
     * @param maxDuration Максимальна тривалість композиції.
     * @return Знайдена композиція, що потрапляє в заданий діапазон, або null, якщо не знайдено.
     */
    public MusicComposition findByDurationRange(double minDuration, double maxDuration) {
        for (MusicComposition composition : compositions) {
            if (composition.getDuration() >= minDuration && composition.getDuration() <= maxDuration) {
                return composition;
            }
        }
        return null;
    }

    /**
     * Вивести всі композиції альбому.
     * Для кожної композиції виводиться її назва, стиль та тривалість.
     */
    public void printCompositions() {
        for (MusicComposition composition : compositions) {
            System.out.println("Title: " + composition.getTitle() + ", Style: " + composition.getStyle() + ", Duration: " + composition.getDuration());
        }
    }
}
