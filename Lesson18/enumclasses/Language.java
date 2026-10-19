package Lesson18.enumclasses;


public enum Language {
    UZ, RU, ENG;

    public static Language getByName(String languageName) {
        for (Language language : values()) {
            if (language.name().equalsIgnoreCase(languageName))
                return language;
        }
        return ENG;
    }
}
