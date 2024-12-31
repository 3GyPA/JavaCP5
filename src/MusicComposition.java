abstract class MusicComposition {
    private String title;
    private double duration;  // тривалість композиції в хвилинах

    public MusicComposition(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public abstract String getStyle();  // метод, який повертає стиль композиції
}
class RockComposition extends MusicComposition {
    public RockComposition(String title, double duration) {
        super(title, duration);
    }

    @Override
    public String getStyle() {
        return "Rock";
    }
}

class ClassicalComposition extends MusicComposition {
    public ClassicalComposition(String title, double duration) {
        super(title, duration);
    }

    @Override
    public String getStyle() {
        return "Classical";
    }
}

class JazzComposition extends MusicComposition {
    public JazzComposition(String title, double duration) {
        super(title, duration);
    }

    @Override
    public String getStyle() {
        return "Jazz";
    }
}
