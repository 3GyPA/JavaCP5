import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Album {
    private List<MusicComposition> compositions;

    public Album() {
        compositions = new ArrayList<>();
    }

    public void addComposition(MusicComposition composition) {
        compositions.add(composition);
    }

    // Порахувати загальну тривалість альбому
    public double getTotalDuration() {
        double totalDuration = 0;
        for (MusicComposition composition : compositions) {
            totalDuration += composition.getDuration();
        }
        return totalDuration;
    }

    // Перестановка композицій по стилю
    public void sortByStyle() {
        Collections.sort(compositions, new Comparator<MusicComposition>() {
            @Override
            public int compare(MusicComposition c1, MusicComposition c2) {
                return c1.getStyle().compareTo(c2.getStyle());
            }
        });
    }

    // Знайти композицію по діапазону тривалості
    public MusicComposition findByDurationRange(double minDuration, double maxDuration) {
        for (MusicComposition composition : compositions) {
            if (composition.getDuration() >= minDuration && composition.getDuration() <= maxDuration) {
                return composition;
            }
        }
        return null;  // якщо не знайдено
    }

    // Вивести всі композиції альбому
    public void printCompositions() {
        for (MusicComposition composition : compositions) {
            System.out.println("Title: " + composition.getTitle() + ", Style: " + composition.getStyle() + ", Duration: " + composition.getDuration());
        }
    }
}
