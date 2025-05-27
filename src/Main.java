import factory.ChineseFactory;
import factory.EnglishFactory;
import factory.Factory;
import factory.KoreanFactory;
import item.Language;

public class Main {
    public static void main(String[] args) {
        // 英語教材を生成する工場を作成
        Factory englishFactory = new EnglishFactory();
        Language english = englishFactory.create();
        english.listening();
        english.writing();
        english.reading();

        // 中国語教材を生成する工場を作成
        Factory chineseFactory = new ChineseFactory();
        Language chinese = chineseFactory.create();
        chinese.listening();
        chinese.writing();
        chinese.reading();

        // 韓国語教材を生成する工場を作成
        Factory koreanFactory = new KoreanFactory();
        Language korean = koreanFactory.create();
        korean.listening();
        korean.writing();
        korean.reading();
    }
}
