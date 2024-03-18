import factory.ChineseFactory;
import factory.EnglishFactory;
import factory.Factory;
import item.Language;
import item.LanguageType;

public class Main {
    public static void main(String[] args) {
        Factory factory = createFactory(LanguageType.ENGLISH);
        Language english = factory.create();
        english.listening();
        english.writing();
        english.reading();
    }

    // 与えられたenumの値から生成する工場を変更する
    public static Factory createFactory(LanguageType type) {
        return switch (type) {
            case ENGLISH -> new EnglishFactory();
            case CHINESE -> new ChineseFactory();
            default -> throw new IllegalArgumentException("指定されたtypeの教材はありません");
        };
    }
}
