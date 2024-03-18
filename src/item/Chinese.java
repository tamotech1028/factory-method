package item;

public class Chinese implements Language {
    @Override
    public void listening () {
        System.out.println("让我们开始聆听（リスニングを始めましょう）");
        // 中国語のリスニングを構成するための処理を書く
    }
    @Override
    public void writing () {
        System.out.println("让我们开始写作吧（ライティングを始めましょう）");
        // 中国語のライティングを構成するための処理を書く
    }
    @Override
    public void reading () {
        System.out.println("让我们开始阅读吧（リーディングを始めましょう）");
        // 中国語のリーディングを構成するための処理を書く
    }
}
