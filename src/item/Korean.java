package item;

public class Korean implements Language {
    @Override
    public void listening () {
        System.out.println("듣기 시작.");
        // 韓国語のリスニングを構成するの処理を書く
    }

    @Override
    public void writing () {
        System.out.println("조명을 시작합시다.（ライティングを始めましょう）");
        // 韓国語のライティングを構成するための処理を書く
    }

    @Override
    public void reading () {
        System.out.println("리딩을 시작합시다.（リーディングを始めましょう）");
        // 韓国語のリーディングを構成するための処理を書く
    }
}
