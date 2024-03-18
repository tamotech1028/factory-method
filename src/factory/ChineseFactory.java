package factory;

import item.Chinese;
import item.Language;

// 中国語教材工場クラス
public class ChineseFactory extends Factory {
    @Override
    protected Language createLanguage() {
        return new Chinese();
    }
}
