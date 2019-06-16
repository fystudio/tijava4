package com.exercise.ch07.resuseclasses;

/*
 * åœ¨åŒ…ä¸­ç¼–å†™ä¸€ä¸ªç±»ï¼Œç±»åº”å…·å¤‡ä¸€ä¸ªprotectedæ–¹æ³•ã€‚åœ¨åŒ…å¤–éƒ¨ï¼Œè¯•ç�€è°ƒç”¨è¯¥protectedæ–¹æ³•å¹¶è§£é‡Šå…¶ç»“æžœã€‚ç„¶å�Žï¼Œä»Žä½ çš„ç±»ä¸­ç»§æ‰¿äº§ç”Ÿä¸€ä¸ªç±»
 * å¹¶ä»Žè¯¥å¯¼å‡ºç±»çš„æ–¹æ³•å†…éƒ¨å�Šæ¡¶protectedæ–¹æ³•
 * **/

class TT extends Exe15Test {
	public void change() {
		set();
	}

	private void set() {
		// TODO Auto-generated method stub
		
	}
}

public class Exe15 {

	public static void main(String[] args) {
		Exe15Test e15test = new Exe15Test();
		// e15test.set();

		TT tt = new TT();
		tt.change();

	}
}
