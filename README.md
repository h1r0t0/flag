# Flag Game

シモンとアリスは、旅上げゲームで遊んでいます。アリスは赤と白旗を持っており、それぞれの放は上がっているか下がっているかの2つの状態を持ちます。はじめ、アリスが持っている両方の旅は下がっています。

シモンは、アリスに
* 「赤を上げて」
* 「赤を下げて」
* 「白を上げて」
* 「白を下げて」

の4パターンの指示を出します。アリスは非常に優秀なので、この度の指示に対して常に正しく行動します。
逆にシモンは、以下のような間違った指示を出してしまうことがあります。
* 既に上がっている度に対して、間違えて「上げて」という指示を出す
* 既に下がっている旅に対して、間違えて 「下げて」 という指示を出す


このような間違った指示をしてしまうと、シモンはルール違反で敗北し、アリスが勝利します。
もし、全割合を通して、間違った報を出さなければシモンの勝ちです。

あなたは、シモンが出した全てのログを持っています。全ての指示を終えた後、勝つのはシモンでしょうか、アリスでしょうか?
もしシモンが勝ったのであれば、後のアリスの旅の状態を出力してください。



## The Mission  

指示の記録から、どちらが勝ったかを判定し、シモンが勝ったのであれば最後のアリスの取の状服を出力するプログラムを作成してください。


## 実装の詳細

### CLI 

入力値が標準入力からされて、答えを出力に表示するCLIアプリケーションをしてください。
詳細は 「CLIアプリ作成テンプレート」を用ください。


### 入力ルール

以下のフォーマットに入力が与えられます。

```  
s[1] s[2] ... s[q]
```

制約は以下です。

* $1\leq q\leq 50$ ,　整数
* $s[i]$ は　**RU**, **RD**, **MU**, **MD** のいずれか
 * $s[i]$ の1文字目は、旗の色を示しています。1文字目が**R**の場合は赤（Red）、**W**の場合は白（White）の旗に対する指示であることを示しています
 * $s[i]$ の2文字目は、上げるか下げるかを表しています。2文字目が**U**の場合は上げる（Up）、**D**の場合は下げる指示（Down）であることしています



### 出カルール
以下のフォーマットを満たす標準出力を出力してください。

```
Winner
[FengState]
```

* 1行目に、シモンが勝利した場合はSmon、 アリスが勝利した場合は ALice と出力してください。
* もしシモンが勝利した場合、2文字の旗の状態 XYを表示してください
    * **X**には、赤の旗が上がっているならば **U**、 下がっているならば **D**を記入してください。
    * **Y**には、白の旗が上がっているならば **U**、 下がっているならば **D**を記入してください。

## 入出力例

### 入出力例1

標準入力

```
RU WU WD
```

標準出力

```
Simon
UD
```

間違った指示はなく、以下のようにゲームが進行します。

* 始め、アリスのは赤も白も下がっている。
* 1個目の指示で、赤が上がる。アリスの旗は赤が上がっており、白は下がっている。
* 2個目の指示で、白が上がる。アリスの旗は赤も白も上がっている。
* 3個目の指示で、白が下がる。アリスの旗は赤が上がっており、白は下がっている。

よって、最終的に赤が上がっており、白が下がっている。答えとしては、シモンが勝ち、その時の最終状態は **UD**であると答えるのが正解になります。

### 入出力例2

標準入力

```
RD RU WU RD
```

標準出力

```
Alice
```

1回目の指示の時点で、シモンが間違った指示を出しているので、アリスの勝利となります。 
シモンは、敗北したことに気づかず、この例のように更に指示を何個か送ってしまうこともあります。

なお、期待する入出力は [basic_testcases.json](https://github.com/h1r0t0/flag/blob/master/basic_testcases.json)にいくつか定されています。
実装する際の参考にしてください。

## コマンドラインアプリケーション(CLI アプリ)作成用テンプレート(Java)

[App.java](https://github.com/h1r0t0/flag/blob/master/App.java)を編集して、CLIアプリを実装してください。
チャレンジ内でファイルの作成が許可されていれば、可読性等のためにファイルを分割する事も可能です。

### 標準入力の取得方法

標準入力の内容は **getstdin()** 関数を使用して配列として取得可能です

```
public static void main(String[] args){
    String Lines = getStain();
}
```
    _// cade to run_

### コマンド実行結果の標準出力への出力

標準の **System.out.printin**メソッド等を使用してください。

```
System.out.println(args);
```

### 外部ライブラリの追加方法

外部ライブラリを使用する場合は以下の手順で実施してください。

* [pom.xml](https://github.com/h1r0t0/flag/blob/master/pom.xml) に依存ライブラリの追加

