package factory;

import item.English;
import item.Language;

// 英語教材工場クラス
public class EnglishFactory extends Factory {
    @Override
    protected Language createLanguage() {
        return new English();
    }
}
