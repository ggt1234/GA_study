package problem;

/**
 * 目的関数の指定クラス
 * @author wppie
 */
public interface IProblem {

	/**
	 * 抽象メソッド：目的関数値を返す
	 * @param array　遺伝子型を表す
	 * @return　目的関数値
	 */
	public abstract double getObjectiveFunctionValue(Number[] array);

	/**
	 * 名前を返す
	 * @return　名前
	 */
	public abstract String getName();

	/**
	 * 可変長パラメータによるデータセット
	 * @param params
	 */
	public abstract void setParameter(Object... params);

	/**
	 * パラメータの情報を返す
	 * @return　パラメータの情報文字列
	 */
	public abstract String getParameterInfo();

	/**
	 * 関数をリストに追加
	 * @param f 問題で用いる変換を表す関数
	 */
	public abstract void addFunction();//引数： IFunction f

	/**
	 * 関数リストを初期化
	 */
	public abstract void clearFunctionList();

	/**
	 * 目的関数値に関数変換を適用して適応度を表す：　適応度は大きい値ほど優れているとする
	 * @param array 遺伝子配列
	 * @return fit 適応度
	 */
	public abstract double getFitness(Number[] array);

}
