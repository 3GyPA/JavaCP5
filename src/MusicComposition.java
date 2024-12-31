/**
 * Абстрактний клас, який представляє музичну композицію.
 * Має загальні властивості та методи для всіх типів композицій.
 */
abstract class MusicComposition {
    private String title;  // Назва композиції
    private double duration;  // Тривалість композиції в хвилинах

    /**
     * Конструктор для ініціалізації музичної композиції.
     *
     * @param title Назва композиції.
     * @param duration Тривалість композиції в хвилинах.
     */
    public MusicComposition(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    /**
     * Отримати назву композиції.
     *
     * @return Назва композиції.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Отримати тривалість композиції.
     *
     * @return Тривалість композиції в хвилинах.
     */
    public double getDuration() {
        return duration;
    }

    /**
     * Отримати стиль музичної композиції.
     * Це абстрактний метод, який повинен бути реалізований в класах-нащадках.
     *
     * @return Стиль композиції.
     */
    public abstract String getStyle();
}
/**
 * Клас, що представляє рок-композицію.
 * Успадковує клас MusicComposition і реалізує метод getStyle для рок-стилю.
 */
class RockComposition extends MusicComposition {

    /**
     * Конструктор для ініціалізації рок-композиції.
     *
     * @param title Назва композиції.
     * @param duration Тривалість композиції.
     */
    public RockComposition(String title, double duration) {
        super(title, duration);
    }

    /**
     * Отримати стиль композиції. У даному випадку це рок.
     *
     * @return Стиль композиції (Rock).
     */
    @Override
    public String getStyle() {
        return "Rock";
    }
}

/**
 * Клас, що представляє класичну композицію.
 * Успадковує клас MusicComposition і реалізує метод getStyle для класичного стилю.
 */
class ClassicalComposition extends MusicComposition {

    /**
     * Конструктор для ініціалізації класичної композиції.
     *
     * @param title Назва композиції.
     * @param duration Тривалість композиції.
     */
    public ClassicalComposition(String title, double duration) {
        super(title, duration);
    }

    /**
     * Отримати стиль композиції. У даному випадку це класика.
     *
     * @return Стиль композиції (Classical).
     */
    @Override
    public String getStyle() {
        return "Classical";
    }
}

/**
 * Клас, що представляє джазову композицію.
 * Успадковує клас MusicComposition і реалізує метод getStyle для джазового стилю.
 */
class JazzComposition extends MusicComposition {

    /**
     * Конструктор для ініціалізації джазової композиції.
     *
     * @param title Назва композиції.
     * @param duration Тривалість композиції.
     */
    public JazzComposition(String title, double duration) {
        super(title, duration);
    }

    /**
     * Отримати стиль композиції. У даному випадку це джаз.
     *
     * @return Стиль композиції (Jazz).
     */
    @Override
    public String getStyle() {
        return "Jazz";
    }
}
