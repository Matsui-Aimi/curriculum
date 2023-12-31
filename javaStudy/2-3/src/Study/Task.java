package Study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator {

	public Task() {
		super();

	}

	/**
	     * タスクの実行
	     */
	    public void doTask() {

	    	int a = 10;
	    	int b = 20;
	    	int c = 70;
	    	
	    	int res = this.plus(a, b, c);

	    	System.out.println("plusメソッドの引数が1つの場合" + this.plus(a));
	    	System.out.println("plusメソッドの引数が2つの場合" + this.plus(a,b));
	    	System.out.println("plusメソッドの引数が3つの場合" + this.plus(a,b,c));

	    }

}

// ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
// 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。

