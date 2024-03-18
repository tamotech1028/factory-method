package factory;

import item.Language;

// Factoryのインターフェース
public abstract class Factory {
    public final Language create() {
        return createLanguage();
    }
    protected abstract Language createLanguage();
}
