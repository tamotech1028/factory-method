package item;

public class English implements Language {
    @Override
    public void listening () {
        System.out.println("Let's start listening");
        // 英語のリスニングを構成するの処理を書く
    }

    @Override
    public void writing () {
        System.out.println("Let's start writing");
        // 英語のライティングを構成するための処理を書く
    }

    @Override
    public void reading () {
        System.out.println("Let's start reading");
        // 英語のリーディングを構成するための処理を書く
    }
}
