package factory;

import item.Korean;
import item.Language;

public class KoreanFactory extends Factory {
    @Override
    protected Language createLanguage() {
        return new Korean();
    }
    
}