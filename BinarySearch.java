//二分探索法のプログラム
public class BinarySearch{
    //テーブルのエントリ
    static private class Entry{
        int key; // 比較の対象となるキー
        Object data; // それ以外の情報
        
        //エントリを生成する
        private Entry(int key, Object data){
            this.key = key;
            this.data = data;
        }
    }
    
    final static int MAX = 100; // データの最大個数
    Entry[] table = new Entry[MAX]; // データを格納する配列
    int n = 0; // table に登録されているデータの個数

    //データを登録する
    //key: キー、data: キーkey に対応するデータ
    public void add(int key, Object data){
        if (n >= MAX) {
            throw new IllegalStateException("データの個数が多すぎます");
        }
        table[n++] = new Entry(key, data);
    }
    
    //キーkey に対応するデータを探す
    //key: キー
    public Object search(int key){ 
    	int low = 0;                            //(1)
	    int high = n - 1;                       //(2)
	
	    while(low <= high){                     //(3)
		    int middle = (low + high) / 2;      //(4)
		    if(key == table[middle].key)        //(5)
			    return table[middle].data;	    //(6) 見つかった
		    else if(key < table[middle].key)    //(7)
		    	high = middle - 1;              //(8)
		    else //key > table[middle].keyである
		    low = middle + 1;                   //(9)
	    }
	    return null;						    //(10) 見つからなかった
    }
    
    //テスト用メインルーチン
    public static void main(String[] args){
        BinarySearch table = new BinarySearch(); //テーブルを登録する
        //データを登録する
        //二分探索法ではkeyが昇順もしくは降順に並んでいる必要がある
        table.add(1,  "one"); 
        table.add(2,  "two");
        table.add(3,  "three");
        table.add(4,  "four");
        table.add(5,  "five");
        table.add(6,  "six");
        table.add(7,  "seven");
        table.add(8,  "eight");
        table.add(9,  "nine");
        table.add(10, "ten");
        /*第2回演習課題の確認用データ列
        table.add(1,  "A"); 
        table.add(5,  "E");
        table.add(6,  "F");
        table.add(8,  "H");
        table.add(13, "M");
        table.add(16, "P");
        table.add(18, "R");
        table.add(19, "S");
        table.add(23, "W");
        table.add(26, "Z");
        */
        
        String x;
        x = (String)table.search(2); //キーが「2」であるデータを探索する
        if (x != null){
	        System.out.println("data=" + x);
        }else{
	        System.out.println("Not found");
        }
    }
}

