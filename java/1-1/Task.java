public class Task {

    public static void main(String[] args) {

        // ①int型の hogeInt という名前の変数を宣言し、値「50」で初期化
        int hogeInt = 50;
        // ②Stringクラスの hogeString という名前の変数を宣言、値「テスト」で初期化
        String hogeString = "テスト";
        // ③下記の処理について、何をしているのかコメントを記入してください
        // 小数点の数字を表示
        double hogeDouble = 0.2;

        // ④変数 hogeInt を値「100」で上書き
        hogeInt = 100;
        // ⑤変数 hogeString を値「合格」で上書き
        hogeString = "合格";
        // ⑥変数 hogeInt の値を表示
        System.out.print(hogeInt);
        // ⑦下記の処理について、何をしているのかコメントを記入してください
        // コンソールへの出力時に、出力内容の末尾に 改行文字が入るか入らないか
        System.out.println(hogeString);

        // ⑧変数 hogeDouble の値を表示
        System.out.print(hogeDouble);
    }
}